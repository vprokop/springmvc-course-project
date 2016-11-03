package com.infiniteskills.mvc.controllers;

//import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.infiniteskills.data.entities.Project;
import com.infiniteskills.data.services.ProjectService;

@Controller
@RequestMapping("/project")
public class ProjectController {
	final static Logger logger = Logger.getLogger(ProjectController.class);

	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(value="/{projectId}")
	public String findProject(Model model, @PathVariable("projectId") Long projectId){
		model.addAttribute("project", this.projectService.find(projectId));
		return "project";
	}
	
	@RequestMapping(value="/find")
	public String find(Model model){
		model.addAttribute("projects", this.projectService.findAll());	
		return "projects";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String addProject(HttpSession session){
		logger.debug("invoking addProject using GET method");
		
		session.setAttribute("token", "12345");

		return "project_add";
	}

	@RequestMapping(value="/add", method=RequestMethod.POST)
	//public String saveProject(HttpServletRequest request, HttpSession session){
	//public String saveProject(@RequestParam("name") String name, HttpSession session){
	public String saveProject(@ModelAttribute Project project){
		logger.debug("invoking saveProject using POST method");
		//logger.debug(String.format("%s", session.getAttribute("token")));
		//logger.debug(String.format("%s", name));
		
		logger.debug(String.format("%s", project));
		
		return "project_add";
	}

/*
	@RequestMapping(value="/add", method=RequestMethod.POST, params={"type=multi"})
	public String saveMultiYearProject(){
		logger.debug("invoking saveMultiYearProject using POST method");
		return "project_add";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST, params={"type=multi", "special"})
	public String saveSpecialProject(){
		logger.debug("invoking saveSpecialProject using POST method");
		return "project_add";
	}
*/	
}
