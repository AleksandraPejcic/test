package com.teammanager.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author Aki
 *
 */
@Entity
@Table(name="projects")
public class Projects {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
//	@OneToMany(mappedBy="project")
//	private Set<Team> team;

	@OneToOne
	@PrimaryKeyJoinColumn
	private Team team;
	
	@Column(name="description")
	private String description;
	
	@Column(name="status")
	private String status;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Users createdByUser;
	
	@Column(name="createdDate")
	private Date createdDate;
	
	@ManyToOne(optional = false)
    @JoinColumn(name="clientId")
	private Clients client;
	
	@Column(name="time")
	private Date time;
	
	@Column(name="expences")
	private String expences;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public Set<Team> getTeams() {
//		return teams;
//	}
//
//	public void setTeams(Set<Team> teams) {
//		this.teams = teams;
//	}
	public Team getTeams() {
		return team;
	}

	public void setTeams(final Team team) {
		this.team = team;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Users getCreatedByUser() {
		return createdByUser;
	}

	public void setCreatedByUser(Users createdByUser) {
		this.createdByUser = createdByUser;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Clients getClient() {
		return client;
	}

	public void setClient(Clients client) {
		this.client = client;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getExpences() {
		return expences;
	}

	public void setExpences(String expences) {
		this.expences = expences;
	}

}
