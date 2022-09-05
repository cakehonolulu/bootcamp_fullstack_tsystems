package com.cientificos.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cientificos.api.dto.Proyecto;
import com.cientificos.api.service.ProyectosService;

@RestController
@RequestMapping("/api")
public class ProyectosCtl {

	@Autowired
	ProyectosService projectsCtl;
	
	@GetMapping("/projects")
	public List<Proyecto> listProjects() {
		return projectsCtl.listProjects();
	}
	
	@GetMapping("/project/{id}")
	public Proyecto scientistXID(@PathVariable(name="id") Long id) {
		return projectsCtl.findById(id);
	}
	
	@PostMapping("/project")
	public Proyecto saveProyecto(@RequestBody Proyecto project) {
		return projectsCtl.saveProject(project);
	}

	@PutMapping("/project/{id}")
	public Proyecto editProyecto(@PathVariable(name="id") Long id, @RequestBody Proyecto project) {
		Proyecto newproject = new Proyecto();
		
		newproject = projectsCtl.findById(id);
		newproject.setName(project.getName());
		
		projectsCtl.editProject(newproject);
	
		return newproject;
	}
}
