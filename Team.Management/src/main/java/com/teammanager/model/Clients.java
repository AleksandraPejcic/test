package com.teammanager.model;

import java.util.Set;

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
@Table(name = "clients")
public class Clients {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
//	@OneToOne(fetch = FetchType.LAZY)
//	@PrimaryKeyJoinColumn
//	private Set<Projects> projects;
		
	public int getId() {
		return this.id;
	}
	
	public void setId(final int id) {
		this.id = id;
	}
	
//	public Set<Projects> getProjects() {
//		return this.projects;
//	}
//	
//	public void setProjects(final Set<Projects> projects) {
//		this.projects = projects;
//	}

}
