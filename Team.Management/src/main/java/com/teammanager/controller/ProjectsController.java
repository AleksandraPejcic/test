package com.teammanager.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.teammanager.model.Projects;
import com.teammanager.service.ProjectsService;

@Scope("request")
@Component
public class ProjectsController implements Serializable {

	private static final long serialVersionUID = 2614985191337857662L;

	@Autowired
	private ProjectsService projectsService;
	
	public List<Projects> projects = null;
	
	@PostConstruct
	public void init() {
		// Calling Business Service
		this.projects.add((Projects) this.projectsService.getAll());
	}
	
	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}
	
	public List<Projects> getProjects() {
		return this.projects;
	}
	
	public void setProjectsService(ProjectsService projectsService) {
		this.projectsService = projectsService;
	}

}
