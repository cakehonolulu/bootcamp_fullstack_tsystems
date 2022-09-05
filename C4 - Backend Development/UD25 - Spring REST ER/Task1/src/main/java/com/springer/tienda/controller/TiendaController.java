package com.springer.tienda.controller;

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

import com.springer.tienda.dto.Articulo;
import com.springer.tienda.dto.Fabricante;
import com.springer.tienda.service.ArticuloService;
import com.springer.tienda.service.FabricanteService;

@RestController
//Default endpoint
@RequestMapping("/api")
public class TiendaController {
	
	@Autowired
	FabricanteService makerCtl;
	
	@Autowired
	ArticuloService itemCtl;
	
	/**
	 * GET Requests
	 */	
	@GetMapping("/makers/{id}")
	public Fabricante findMakerById(@PathVariable(name = "id") Long id) {
		return makerCtl.findById(id);
	}

	@GetMapping("/makers")
	public List<Fabricante> listMakers() {
		return makerCtl.listMakers();
	}
	
	@GetMapping("/items/{id}")
	public Articulo findItemById(@PathVariable(name = "id") Long id) {
		return itemCtl.findById(id);
	}

	@GetMapping("/items")
	public List<Articulo> listItems() {
		return itemCtl.listItems();
	}
	
	/**
	 * POST Requests
	 */
	@PostMapping("/makers")
	public Fabricante storeMaker(@RequestBody Fabricante maker) {
		return makerCtl.storeMaker(maker);
	}
	
	@PostMapping("/items")
	public Articulo storeItem(@RequestBody Articulo item) {
		return itemCtl.storeItem(item);
	}
	
	/**
	 * PUT Requests
	 */
	@PutMapping("/makers/{id}")
	public Fabricante updateMaker(@PathVariable(name = "id") Long id, @RequestBody Fabricante maker) {
		Fabricante updatedMaker;
		
		updatedMaker = makerCtl.findById(id);
		updatedMaker.setName(maker.getName());
		
		makerCtl.updateMaker(updatedMaker);
		
		return updatedMaker;
	}

	@PutMapping("/items/{id}")
	public Articulo updateItem(@PathVariable(name = "id") Long id, @RequestBody Articulo item) {
		Articulo updatedItem;
		
		updatedItem = itemCtl.findById(id);
		updatedItem.setName(item.getName());
		updatedItem.setPrice(item.getPrice());
		updatedItem.setMaker(item.getMaker());
		
		itemCtl.updateItem(updatedItem);
		
		return updatedItem;
	}
	
	/**
	 * DELETE Requests
	 */
	@DeleteMapping("/makers/{id}")
	public void deleteMaker(@PathVariable(name = "id") Long id) {
		makerCtl.deleteMaker(id);
	}
	
	@DeleteMapping("/items/{id}")
	public void deleteItem(@PathVariable(name = "id") Long id) {
		itemCtl.deleteItem(id);
	}
}
