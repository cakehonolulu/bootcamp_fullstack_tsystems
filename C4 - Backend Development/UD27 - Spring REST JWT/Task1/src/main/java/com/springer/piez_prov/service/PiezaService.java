package com.springer.piez_prov.service;

import java.util.List;

import com.springer.piez_prov.dto.Pieza;

public interface PiezaService {

	public Pieza findById(Long partId);
	
	public List<Pieza> listParts();
	
	public Pieza savePart(Pieza part);
	
	public void deletePart(Long partId);

	public Pieza editPart(Pieza part);
}
