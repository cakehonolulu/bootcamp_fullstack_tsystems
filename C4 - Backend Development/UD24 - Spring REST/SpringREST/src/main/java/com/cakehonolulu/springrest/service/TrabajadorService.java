package com.cakehonolulu.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakehonolulu.springrest.dao.TrabajadorDao;
import com.cakehonolulu.springrest.dto.Trabajador;

@Service
public class TrabajadorService implements TrabajadorImpl {

	@Autowired
	TrabajadorDao trabajadorSvc;
	
	@Override
	public List<Trabajador> findByName(String nombre) {
		return trabajadorSvc.findByName(nombre);
	}

	@Override
	public List<Trabajador> findBySurname(String surname) {
		return trabajadorSvc.findBySurname(surname);
	}

	@Override
	public List<Trabajador> findByJob(String job) {
		return trabajadorSvc.findByJob(job);
	}

	@Override
	public Trabajador findById(Long employerId) {
		return trabajadorSvc.findById(employerId).get();
	}
	
	@Override
	public List<Trabajador> listEmployers() {
		return trabajadorSvc.findAll();
	}

	@Override
	public Trabajador storeEmployer(Trabajador employer) {
		return trabajadorSvc.save(employer);
	}
	
	@Override
	public void deleteEmployer(Long employerId) {
		trabajadorSvc.deleteById(employerId);
	}
	
	@Override
	public Trabajador updateEmployer(Trabajador employer) {
		return trabajadorSvc.save(employer);
	}
	
}
