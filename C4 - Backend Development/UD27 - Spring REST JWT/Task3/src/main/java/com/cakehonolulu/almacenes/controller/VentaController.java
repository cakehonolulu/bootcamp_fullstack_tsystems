package com.cakehonolulu.almacenes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cakehonolulu.almacenes.dto.Venta;
import com.cakehonolulu.almacenes.service.VentaSvcImpl;

public class VentaController {

	@Autowired
	VentaSvcImpl salesCtl;
	
	@GetMapping("/sales")
	public List<Venta> listSales() {
		return salesCtl.listSales();
	}
	
	@GetMapping("/sale/{id}")
	public Venta listById(@PathVariable(name="id") Long id) {
		return salesCtl.listById(id);
	}

	@PostMapping("/sale")
	public Venta saveSale(@RequestBody Venta venta) {
		return salesCtl.saveSale(venta);
	}
	
	@PutMapping("/sale/{id}")
	public Venta editSale(@PathVariable(name="id") Long id, @RequestBody Venta venta) {
		Venta newSale = new Venta();
		
		newSale = salesCtl.listById(id);
		newSale.setCajero(venta.getCajero());
		newSale.setMaquinaRegistradora(venta.getMaquinaRegistradora());
		newSale.setProducto(venta.getProduct());
		
		salesCtl.editSale(newSale);
		
		return newSale;
	}
	
	@DeleteMapping("/sale/{id}")
	public void deleteSale(@PathVariable(name="id") Long id) {
		salesCtl.deleteSale(id);
	}
	
}
