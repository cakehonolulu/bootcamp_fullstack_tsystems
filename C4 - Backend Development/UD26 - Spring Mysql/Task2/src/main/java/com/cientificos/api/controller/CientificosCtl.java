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

import com.cientificos.api.dto.Cientifico;
import com.cientificos.api.service.CientificosService;

@RestController
@RequestMapping("/api")
public class CientificosCtl {

	@Autowired
	CientificosService scientificsCtl;
	
	@GetMapping("/scientifics")
	public List<Cientifico> listScientists() {
		return scientificsCtl.listScientists();
	}
	
	@GetMapping("/scientist/{id}")
	public Cientifico scientistXID(@PathVariable(name="id") Long id) {
		return scientificsCtl.findById(id);
	}
	
	@PostMapping("/scientist")
	public Cientifico saveCientifico(@RequestBody Cientifico scientist) {
		return scientificsCtl.saveScientist(scientist);
	}

	@PutMapping("/scientist/{id}")
	public Cientifico editCientifico(@PathVariable(name="id") Long id, @RequestBody Cientifico scientist) {
		Cientifico newscientist = new Cientifico();
		
		newscientist = scientificsCtl.findById(id);
		newscientist.setDni(scientist.getDni());
		
		scientificsCtl.editScientist(newscientist);
	
		return newscientist;
	}
}
