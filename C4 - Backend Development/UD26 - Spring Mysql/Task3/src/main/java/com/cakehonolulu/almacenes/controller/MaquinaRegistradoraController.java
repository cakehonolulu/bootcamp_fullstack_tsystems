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

import com.cakehonolulu.almacenes.dto.MaquinaRegistradora;
import com.cakehonolulu.almacenes.service.MaqRegSvcImpl;

@RestController
@RequestMapping("/api")
public class MaquinaRegistradoraController {

	@Autowired
	MaqRegSvcImpl machineCtl;
	
	@GetMapping("/machines")
	public List<MaquinaRegistradora> listMachines() {
		return machineCtl.listMachines();
	}
	
	@GetMapping("/machine/{id}")
	public MaquinaRegistradora lostById(@PathVariable(name="id") Long id) {
		return machineCtl.listById(id);
	}
	
	@PostMapping("/machine")
	public MaquinaRegistradora saveMachine(@RequestBody MaquinaRegistradora mreg) {
		return machineCtl.saveMachine(mreg);
	}
	
	@PutMapping("/machine/{id}")
	public MaquinaRegistradora editMachine(@PathVariable(name="id") Long id, @RequestBody MaquinaRegistradora mreg) {
		MaquinaRegistradora newMachine = new MaquinaRegistradora();
		
		newMachine = machineCtl.listById(id);
		newMachine.setPiso(mreg.getPiso());
		
		machineCtl.editMachine(newMachine);
		
		return newMachine;
	}
	
	@DeleteMapping("/machine/{id}")
	public void deleteMachine(@PathVariable(name="id") Long id) {
		machineCtl.deleteMachine(id);
	}
	
}
