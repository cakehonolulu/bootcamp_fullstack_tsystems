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

import com.springer.piez_prov.dto.Pieza;
import com.springer.piez_prov.service.PiezaSvcImpl;

@RestController
@RequestMapping("/api")
public class PiezaCtl {

	@Autowired
	PiezaSvcImpl piezaCtl;
	
	@GetMapping("/piezas")
	public List<Pieza> listSupplies() {
		return piezaCtl.listParts();
	}
	
	@GetMapping("/piezas/{id}")
	public Pieza findById(@PathVariable(name="id") Long id) {
		return piezaCtl.findById(id);
	}
	
	@PostMapping("/piezas")
	public Pieza savePieza(@RequestBody Pieza proovedoresPiezas) {
		return piezaCtl.savePart(proovedoresPiezas);
	}
	
	@PutMapping("/piezas/{id}")
	public Pieza editProovedoresPiezas(@PathVariable(name="id") Long id, @RequestBody Pieza proovedoresPiezas) {
		Pieza selected = new Pieza();

		selected = piezaCtl.findById(id);
		selected.setSupply(proovedoresPiezas.getSupply());
		
		piezaCtl.savePart(selected);
		
		return selected;
	}
	
	@DeleteMapping("/piezas/{id}")
	public void deletePieza(@PathVariable(name="id") Long id) {
		piezaCtl.deletePart(id);
	}
}
