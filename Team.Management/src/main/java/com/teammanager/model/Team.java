package com.teammanager.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "team")
public class Team {
	
	@Id
	@Column(name="id")
<<<<<<< origin/master
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="projectId", nullable=false)
    private Projects project;
=======
	@GeneratedValue
	private int id;
	
	@Column(name="name")
	private String name;
	
	@OneToOne(mappedBy="team")
	@Cascade(value=org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	private Users user;
	
	@OneToOne(mappedBy="team")
	@Cascade(value=org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	private Projects projects;
		
	@Column(name="memberSince")
	private Date memberSince;
>>>>>>> local
	
	public int getId() {
		return this.id;
	}
	
	public void setId(final int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Users getUser() {
		return this.user;
	}

	public void setUser(final Users user) {
		this.user = user;
	}

	public Date getMemberSince() {
		return this.memberSince;
	}

	public void setMemberSince(final Date memberSince) {
		this.memberSince = memberSince;
	}
		
}
