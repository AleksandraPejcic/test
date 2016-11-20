package com.teammanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
//	@OneToOne(fetch = FetchType.LAZY)
//	@PrimaryKeyJoinColumn
//	private Projects projects;
	
	public int getId() {
		return this.id;
	}
	
	public void setId(final int id) {
		this.id = id;
	}
	
//	public void setProjects(final Projects projects) {
//		this.projects = projects;
//	}
//	
//	public Projects getProjects() {
//		return this.projects;
//	}

}
