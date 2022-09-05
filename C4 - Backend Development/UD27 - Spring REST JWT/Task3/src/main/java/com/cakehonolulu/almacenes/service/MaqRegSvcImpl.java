package com.cakehonolulu.almacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakehonolulu.almacenes.dao.MaquinaRegistradoraDAO;
import com.cakehonolulu.almacenes.dto.MaquinaRegistradora;

@Service
public class MaqRegSvcImpl implements MaqRegService {

	@Autowired
	MaquinaRegistradoraDAO machineDAO;

	@Override
	public List<MaquinaRegistradora> listMachines() {
		return machineDAO.findAll();
	}

	@Override
	public MaquinaRegistradora listById(Long id) {
		return machineDAO.findById(id).get();
	}

	@Override
	public MaquinaRegistradora saveMachine(MaquinaRegistradora maquinaRegistradora) {
		return machineDAO.save(maquinaRegistradora);
	}

	@Override
	public MaquinaRegistradora editMachine(MaquinaRegistradora maquinaRegistradora) {
		return machineDAO.save(maquinaRegistradora);
	}

	@Override
	public void deleteMachine(Long id) {
		machineDAO.deleteById(id);
	}
	
}
