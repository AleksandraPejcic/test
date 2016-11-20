package com.teammanager.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author Aki
 *
 */
@Table(name="Projects")
public class Projects {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String name;
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
//	private Set<Team> teams;
	@Column(name="description")
	private String description;
	@Column(name="status")
	private String status;
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "id", cascade = CascadeType.ALL)
	private Users createdByUser;
	@Column(name="createdDate")
	private Date createdDate;
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "id", cascade = CascadeType.ALL)
	private Clients client;
	
	private Date time;
	
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
