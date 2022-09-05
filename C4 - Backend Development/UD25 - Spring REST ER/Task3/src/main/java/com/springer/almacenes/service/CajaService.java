package com.springer.almacenes.service;

import java.util.List;

import com.springer.almacenes.dto.Caja;

public interface CajaService {

	public Caja findById(Long boxId);
	
	public List<Caja> listBoxes();
	
	public Caja saveBox(Caja box);
	
	public Caja editBox(Caja box);
	
	public void deleteBox(Long boxId);
}
