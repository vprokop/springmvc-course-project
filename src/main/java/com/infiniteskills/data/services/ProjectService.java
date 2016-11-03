package com.infiniteskills.data.services;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

import com.infiniteskills.data.entities.Project;

public class ProjectService {
	final static Logger logger = Logger.getLogger(ProjectService.class);

		private List<Project> projects = new LinkedList<>();
		
		public ProjectService(){
			logger.debug("Building ProjectService mockukp with LinkedList of data");
			
			Project javaProject = this.createProject("Java Project", "This is a Java Project" );
			Project javascriptProject = this.createProject("Javascript Project", "This is a Javascript Project");
			Project htmlProject = this.createProject("HTML Project", "This is an HTML project");
			
			this.projects.addAll(Arrays.asList(new Project[]{javaProject, javascriptProject, htmlProject}));
		}
		
		public List<Project> findAll(){
			if (logger.isDebugEnabled()){
				logger.debug(String.format("found %s projects", this.projects.size()));
			}
			
			return this.projects;
		}
		
		public Project find(Long projectId){
			if (logger.isDebugEnabled()){
				logger.debug(String.format("finding projectId=%d", projectId));
			}
			return this.projects.stream().filter(p -> {
				return p.getProjectId().equals(projectId);
			}).collect(Collectors.toList()).get(0);
		}

		private Project createProject(String title, String description) {
			Project project = new Project();
			project.setName(title);
			project.setAuthorizedFunds(new BigDecimal("100000"));
			project.setAuthorizedHours(new BigDecimal("1000"));
			project.setProjectId(1L);
			project.setSpecial(false);
			project.setType("multi");
			project.setYear("2015");
			project.setDescription(description);
			
			if (logger.isDebugEnabled()){
				logger.debug(String.format("created project %s", project));
			}
			
			return project;
		}
}
