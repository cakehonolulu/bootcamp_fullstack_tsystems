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

import com.cientificos.api.dto.Asignado;
import com.cientificos.api.service.AsignadosService;

@RestController
@RequestMapping("/api")
public class AsignadosCtl {

	@Autowired
	AsignadosService assignedCtl;
	
	@GetMapping("/assigned")
	public List<Asignado> listAssignations() {
		return assignedCtl.listAssignations();
	}
	
	@GetMapping("/assigned/{id}")
	public Asignado scientistXID(@PathVariable(name="id") Long id) {
		return assignedCtl.findById(id);
	}
	
	@PostMapping("/assigned")
	public Asignado saveAsignado(@RequestBody Asignado assigned) {
		return assignedCtl.saveAssignation(assigned);
	}

	@PutMapping("/assigned/{id}")
	public Asignado editAsignado(@PathVariable(name="id") Long id, @RequestBody Asignado assigned) {
		Asignado newassignation = new Asignado();
		
		newassignation = assignedCtl.findById(id);
		
		assignedCtl.saveAssignation(newassignation);
	
		return newassignation;
	}
}
