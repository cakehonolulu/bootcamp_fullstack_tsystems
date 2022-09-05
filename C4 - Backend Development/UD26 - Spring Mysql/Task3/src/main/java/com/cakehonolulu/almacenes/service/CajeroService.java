package com.cakehonolulu.almacenes.service;

import java.util.List;

import com.cakehonolulu.almacenes.dto.Cajero;

public interface CajeroService {
	
	public List<Cajero> listCashiers();
	
	public Cajero listById(Long id);
	
	public Cajero saveCashier(Cajero cajero);
	
	public Cajero editCashier(Cajero cajero);
	
	public void deleteCashier(Long id);
	
}
