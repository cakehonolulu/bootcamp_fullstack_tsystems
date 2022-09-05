package com.cakehonolulu.almacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakehonolulu.almacenes.dao.CajeroDAO;
import com.cakehonolulu.almacenes.dto.Cajero;

@Service
public class CajeroSvcImpl implements CajeroService {

	@Autowired
	CajeroDAO cashierDAO;
	
	@Override
	public List<Cajero> listCashiers() {
		return cashierDAO.findAll();
	}

	@Override
	public Cajero listById(Long id) {
		return cashierDAO.findById(id).get();
	}

	@Override
	public Cajero saveCashier(Cajero cajero) {
		return cashierDAO.save(cajero);
	}

	@Override
	public Cajero editCashier(Cajero cajero) {
		return cashierDAO.save(cajero);
	}

	@Override
	public void deleteCashier(Long id) {
		cashierDAO.deleteById(id);
	}

	
	
}
