package com.teammanager.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.teammanager.model.Users;

public class UsersDaoImpl implements UsersDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public UsersDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Users> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setSessionFactory(final SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
