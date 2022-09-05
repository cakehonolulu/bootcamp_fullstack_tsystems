package com.springer.piez_prov.controller;

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

import com.springer.piez_prov.dto.Suministra;
import com.springer.piez_prov.service.SuministraSvcImpl;

@RestController
@RequestMapping("/api")
public class SuministraCtl {

	@Autowired
	SuministraSvcImpl suministraCtl;
	
	@GetMapping("/proveedores")
	public List<Suministra> listSupplies() {
		return suministraCtl.listSupplies();
	}
	
	@GetMapping("/proveedores/{id}")
	public Suministra findById(@PathVariable(name="id") Long id) {
		return suministraCtl.findById(id);
	}
	
	@PostMapping("/proveedores")
	public Suministra saveSuministra(@RequestBody Suministra proovedoresPiezas) {
		return suministraCtl.saveSupply(proovedoresPiezas);
	}
	
	@PutMapping("/proveedores/{id}")
	public Suministra editProovedoresPiezas(@PathVariable(name="id") Long id, @RequestBody Suministra proovedoresPiezas) {
		Suministra selected = new Suministra();

		selected = suministraCtl.findById(id);
		selected.setProvider(proovedoresPiezas.getProvider());
		
		suministraCtl.saveSupply(selected);
		
		return selected;
	}
	
	@DeleteMapping("/proveedores/{id}")
	public void deleteSuministra(@PathVariable(name="id") Long id) {
		suministraCtl.deleteSupply(id);
	}
}
