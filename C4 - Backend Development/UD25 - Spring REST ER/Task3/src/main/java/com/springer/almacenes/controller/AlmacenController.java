package com.springer.almacenes.controller;

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

import com.springer.almacenes.dto.Almacen;
import com.springer.almacenes.dto.Caja;
import com.springer.almacenes.service.AlmacenSvcImpl;
import com.springer.almacenes.service.CajaSvcImpl;

@RestController
@RequestMapping("/api")
public class AlmacenController {

	@Autowired
	AlmacenSvcImpl storageSvc;
	
	@Autowired
	CajaSvcImpl boxSvc;
	
	/**
	 * GET Requests
	 */	
	@GetMapping("/storages/{id}")
	public Almacen findStorageById(@PathVariable(name = "id") Long id) {
		return storageSvc.findById(id);
	}

	@GetMapping("/storages")
	public List<Almacen> listStorages() {
		return storageSvc.listStorages();
	}
	
	@GetMapping("/boxes/{id}")
	public Caja findBoxById(@PathVariable(name = "id") Long id) {
		return boxSvc.findById(id);
	}

	@GetMapping("/boxes")
	public List<Caja> listBoxes() {
		return boxSvc.listBoxes();
	}
	
	/**
	 * POST Requests
	 */
	@PostMapping("/storages")
	public Almacen saveStorage(@RequestBody Almacen maker) {
		return storageSvc.saveStorage(maker);
	}
	
	@PostMapping("/boxes")
	public Caja saveBox(@RequestBody Caja item) {
		return boxSvc.saveBox(item);
	}
	
	/**
	 * PUT Requests
	 */
	@PutMapping("/storages/{id}")
	public Almacen editStorage(@PathVariable(name = "id") Long id, @RequestBody Almacen storage) {
		Almacen updatedStorage;
		
		updatedStorage = storageSvc.findById(id);
		updatedStorage.setPlace(storage.getPlace());
		updatedStorage.setCapacity(storage.getCapacity());
		
		storageSvc.editStorage(updatedStorage);
		
		return updatedStorage;
	}

	@PutMapping("/boxes/{id}")
	public Caja editBox(@PathVariable(name = "id") Long id, @RequestBody Caja box) {
		Caja updatedBox;
		
		updatedBox = boxSvc.findById(id);
		updatedBox.setNumRef(box.getNumRef());
		updatedBox.setValue(box.getValue());
		updatedBox.setStorage(box.getStorage());
		
		boxSvc.editBox(updatedBox);
		
		return updatedBox;
	}
	
	/**
	 * DELETE Requests
	 */
	@DeleteMapping("/storages/{id}")
	public void deleteStorage(@PathVariable(name = "id") Long id) {
		storageSvc.deleteStorage(id);
	}
	
	@DeleteMapping("/boxes/{id}")
	public void deleteBox(@PathVariable(name = "id") Long id) {
		boxSvc.deleteBox(id);
	}
}
