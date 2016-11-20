package com.teammanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.teammanager.dao.ProjectsDao;
import com.teammanager.model.Projects;

public class ProjectsServiceImpl implements ProjectsService {

	@Autowired
	private ProjectsDao projectsDao;
	
	@Override
	public List<Projects> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setProjectsDao(ProjectsDao projectsDao) {
		this.projectsDao = projectsDao;
	}

}
