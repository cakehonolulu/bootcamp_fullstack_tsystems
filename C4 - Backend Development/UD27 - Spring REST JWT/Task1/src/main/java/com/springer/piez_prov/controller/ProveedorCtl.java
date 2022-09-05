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

import com.springer.piez_prov.dto.Proveedor;
import com.springer.piez_prov.service.ProveedorSvcImpl;

@RestController
@RequestMapping("/api")
public class ProveedorCtl {

	@Autowired
	ProveedorSvcImpl proveedorCtl;
	
	@GetMapping("/proveedores")
	public List<Proveedor> listProveedor() {
		return proveedorCtl.listSuppliers();
	}
	
	@GetMapping("/suministracion/{id}")
	public Proveedor findById(@PathVariable(name="id") Long id) {
		return proveedorCtl.findById(id);
	}
	
	@PostMapping("/suministracion")
	public Proveedor saveProveedor(@RequestBody Proveedor proovedoresPiezas) {
		return proveedorCtl.saveSupplier(proovedoresPiezas);
	}
	
	@PutMapping("/suministracion/{id}")
	public Proveedor editProovedoresPiezas(@PathVariable(name="id") Long id, @RequestBody Proveedor proovedoresPiezas) {
		Proveedor selected = new Proveedor();

		selected = proveedorCtl.findById(id);
		selected.setProveedoresPiezas(proovedoresPiezas.getProveedoresPiezas());
		
		proveedorCtl.saveSupplier(selected);
		
		return selected;
	}
	
	@DeleteMapping("/suministracion/{id}")
	public void deleteProveedor(@PathVariable(name="id") Long id) {
		proveedorCtl.deleteSupplier(id);
	}
}
