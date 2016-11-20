package com.teammanager.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@OneToMany(mappedBy="id")
	private Set<Team> teams;
	
	@Column(name="description")
	private String description;
	
	@Column(name="status")
	private String status;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Users createdByUser;
	
	@Column(name="createdDate")
	private Date createdDate;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Clients client;
	
	@Column(name="time")
	private Date time;
	
	@Column(name="expences")
	private String expences;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Team> getTeams() {
		return teams;
	}

	public void setTeams(Set<Team> teams) {
		this.teams = teams;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Users getCreatedByUser() {
		return this.createdByUser;
	}

	public void setCreatedByUser(Users createdByUser) {
		this.createdByUser = createdByUser;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Clients getClient() {
		return this.client;
	}

	public void setClient(Clients client) {
		this.client = client;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getExpences() {
		return this.expences;
	}

	public void setExpences(String expences) {
		this.expences = expences;
	}

}
