package com.teammanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "clients")
public class Clients {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@OneToOne(mappedBy="client")
	@Cascade(value=org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	private Projects project;
		
	public int getId() {
		return this.id;
	}
	
	public void setId(final int id) {
		this.id = id;
	}
	
	public Projects getProject() {
		return this.project;
	}
	
	public void setProject(final Projects project) {
		this.project = project;
	}

}
