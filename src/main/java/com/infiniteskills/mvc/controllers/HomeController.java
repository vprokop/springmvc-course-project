package com.infiniteskills.mvc.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

import com.infiniteskills.data.entities.Project;
import com.infiniteskills.data.repositories.ProductRepository;

@Controller
public class HomeController {
	final static Logger logger = Logger.getLogger(HomeController.class);

	@Autowired
	ProductRepository products;
	
	@RequestMapping("/")
	public String goHome(Model model){
		if (logger.isDebugEnabled())
		{
			logger.debug("serving /home");
			logger.debug(String.format("reading %s Products", products.count()));
		}
		
		Project project = new Project();
		project.setName("First Project");
		project.setSponsor("Nasa");
		project.setDescription("This is a simple project sponsored by NASA");
		
		model.addAttribute("currentProject", project);
		model.addAttribute("products", products.findAll());
		
		return "home";
	}
}
