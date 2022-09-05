package com.cakehonolulu.almacenes.service;

import java.util.List;

import com.cakehonolulu.almacenes.dto.MaquinaRegistradora;

public interface MaqRegService {

	public List<MaquinaRegistradora> listMachines();
	
	public MaquinaRegistradora listById(Long id);
	
	public MaquinaRegistradora saveMachine(MaquinaRegistradora maquinaRegistradora);
	
	public MaquinaRegistradora editMachine(MaquinaRegistradora maquinaRegistradora);
	
	public void deleteMachine(Long id);
	
}
