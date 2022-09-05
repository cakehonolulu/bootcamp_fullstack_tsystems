package com.cakehonolulu.almacenes.controller;

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

import com.cakehonolulu.almacenes.dto.Cajero;
import com.cakehonolulu.almacenes.service.CajeroSvcImpl;

@RestController
@RequestMapping("/api")
public class CajeroController {

	@Autowired
	CajeroSvcImpl cashierCtl;
	
	@GetMapping("/cashiers")
	public List<Cajero> listCashiers() {
		return cashierCtl.listCashiers();
	}
	
	@GetMapping("/cashier{id}")
	public Cajero listById(@PathVariable(name="id") Long id) {
		return cashierCtl.listById(id);
	}
	
	@PostMapping("/cashier")
	public Cajero saveCashier(@RequestBody Cajero cajero) {
		return cashierCtl.saveCashier(cajero);
	}
	
	@PutMapping("/cashier/{id}") 
	public Cajero editCashier(@PathVariable(name="id") Long id, @RequestBody Cajero cajero) {	
		Cajero newCashier = new Cajero();

		newCashier = cashierCtl.listById(id);
		newCashier.setNombre(cajero.getFullName());
		
		cashierCtl.editCashier(newCashier);
		
		return newCashier;
	}
	
	@DeleteMapping("/cashier/{id}")
	public void deleteCashier(@PathVariable(name="id") Long id) {
		cashierCtl.deleteCashier(id);
	}
	
}
