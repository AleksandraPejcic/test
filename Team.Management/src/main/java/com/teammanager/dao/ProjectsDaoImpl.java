package com.teammanager.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.teammanager.model.Projects;

public class ProjectsDaoImpl implements ProjectsDao {
	
	@Autowired
	private SessionFactory sessionFactory;
 
    @Override
    @Transactional
	public List<Projects> getAll() {
		 @SuppressWarnings("unchecked")
	        List<Projects> listUser = (List<Projects>) sessionFactory.getCurrentSession()
	                .createCriteria(Projects.class)
	                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	 
	        return listUser;
	}
    
    public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
