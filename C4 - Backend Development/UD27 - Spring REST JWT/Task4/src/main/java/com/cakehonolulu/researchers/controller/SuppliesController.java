package com.cakehonolulu.researchers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cakehonolulu.researchers.dto.Supplies;
import com.cakehonolulu.researchers.service.SuppliesSvcImpl;

@RestController
@RequestMapping("/api")
public class SuppliesController {

	@Autowired
	SuppliesSvcImpl suppliesServiceImpl;

	@GetMapping("/supplies")
	public List<Supplies> getAllSupplies() {
		return suppliesServiceImpl.listAllSupplies();
	}

	@PostMapping("/supplies")
	public Supplies saveSupplies(@RequestBody Supplies s) {
		return suppliesServiceImpl.saveSupplies(s);
	}

	@GetMapping("/supplies/{id}")
	public Supplies getSuppliesById(@PathVariable(name = "id") Long id) {
		return suppliesServiceImpl.suppliesById(id);
	}

	@PutMapping("/supplies/{id}")
	public Supplies updateSupplies(@PathVariable(name = "id") Long id, @RequestBody Supplies s) {
		Supplies selectedSupplies;
		Supplies updatedSupplies;

		selectedSupplies = suppliesServiceImpl.suppliesById(id);

		selectedSupplies.setPrice(s.getPrice());
		selectedSupplies.setPiece(s.getPiece());
		selectedSupplies.setProvider(s.getProvider());

		updatedSupplies = suppliesServiceImpl.saveSupplies(selectedSupplies);

		return updatedSupplies;
	}

	@DeleteMapping("/supplies/{id}")
	public void deleteSupplies(@PathVariable(name = "id") Long id) {
		suppliesServiceImpl.deleteSupplies(id);
	}
}
