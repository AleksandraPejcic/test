package com.teammanager.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.teammanager.model.Projects;
import com.teammanager.service.ProjectsService;

@ManagedBean(name="projectsController")
@RequestScoped
public class ProjectsController implements Serializable {

	private static final long serialVersionUID = 2614985191337857662L;

	//Spring projects service is injected...
	@ManagedProperty(value="#{ProjectsService}")
	private ProjectsService projectsService;
	
	private List<Projects> allProjects = new ArrayList<>();
	
	public List<Projects> getProjectsList() {
		this.allProjects.add((Projects) this.projectsService.getAll());
		return this.allProjects;		
	}

	public List<Projects> getAllProjects() {
		return allProjects;
	}

	public void setAllProjects(List<Projects> allProjects) {
		this.allProjects = allProjects;
	}
	
	public void setProjectsService(ProjectsService projectsService) {
		this.projectsService = projectsService;
	}

}
