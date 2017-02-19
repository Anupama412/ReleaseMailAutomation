package org.allstate.releasemanagement.controller;

import java.util.List;

import org.allstate.releasemanagement.model.Project;
import org.allstate.releasemanagement.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

	@Autowired
	private ProjectService myProjectService;
	
	@RequestMapping("/home")
	public String home() {
        return "index";
	}

	@RequestMapping("/projects")
	public List<Project> getAllTopics() {

		return myProjectService.getAllProjects();
	}

	@RequestMapping("/projects/{id}")
	public Project getTopics(@PathVariable String id) {
		return myProjectService.getProject(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/projects")
	public void addTopic(@RequestBody Project aNewTopic){
		 myProjectService.addProject(aNewTopic);
		
	}
}
