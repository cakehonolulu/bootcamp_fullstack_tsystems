package com.cakehonolulu.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cakehonolulu.springrest.dto.Trabajador;
import com.cakehonolulu.springrest.service.TrabajadorService;

@RestController
// Default endpoint
@RequestMapping("/api")
public class TrabajoController {

	@Autowired
	TrabajadorService trabajadorCtl;
	
	/**
	 * GET Requests
	 */
	@GetMapping("/employers/name/{name}")
	public List<Trabajador> findByName(@PathVariable(name = "name") String name) {
		return trabajadorCtl.findByName(name);
	}
	
	@GetMapping("/employers/surname/{surname}")
	public List<Trabajador> findByApellido(@PathVariable(name = "surname") String surname) {
		return trabajadorCtl.findBySurname(surname);
	}
	
	@GetMapping("/employers/job/{job}")
	public List<Trabajador> findByJob(@PathVariable(name = "job") String job) {
		return trabajadorCtl.findByJob(job);
	}
	
	@GetMapping("/employers/{id}")
	public Trabajador findById(@PathVariable(name = "id") Long id) {
		return trabajadorCtl.findById(id);
	}
	
	@GetMapping("/employers")
	public List<Trabajador> listEmployers() {
		return trabajadorCtl.listEmployers();
	}
	
	@GetMapping("/jobs")
	public String listJobs() {
		return Trabajador.listJobs();
	}
	
	/**
	 * POST Requests
	 */
	@PostMapping("/employers")
	public Trabajador storeEmployer(@RequestBody Trabajador employer) {
		return trabajadorCtl.storeEmployer(employer);
	}
	
	/**
	 * PUT Requests
	 */
	@PutMapping("/employers/{id}")
	public Trabajador updateEmployer(@PathVariable(name = "id") Long id, @RequestBody Trabajador empleado) {
		Trabajador updatedEmployer;
		
		updatedEmployer = trabajadorCtl.findById(id);
		updatedEmployer.setName(empleado.getName());
		updatedEmployer.setSurname(empleado.getSurname());
		updatedEmployer.setJob(empleado.getJob());
		
		trabajadorCtl.updateEmployer(updatedEmployer);
		
		return updatedEmployer;
	}
	
	/**
	 * DELETE Requests
	 */
	@DeleteMapping("/employers/{id}")
	public void deleteEmployer(@PathVariable(name = "id") Long id) {
		trabajadorCtl.deleteEmployer(id);
	}
}
