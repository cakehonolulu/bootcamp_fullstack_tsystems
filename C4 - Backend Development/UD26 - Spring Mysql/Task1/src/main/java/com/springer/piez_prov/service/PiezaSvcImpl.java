package com.springer.piez_prov.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springer.piez_prov.dao.PiezaDAO;
import com.springer.piez_prov.dto.Pieza;

public class PiezaSvcImpl implements PiezaService {

	@Autowired
	PiezaDAO piezaSvc;
	
	@Override
	public Pieza findById(Long partId) {
		return piezaSvc.findById(partId).get();
	}

	@Override
	public List<Pieza> listParts() {
		return piezaSvc.findAll();
	}

	@Override
	public Pieza savePart(Pieza part) {
		return piezaSvc.save(part);
	}

	@Override
	public void deletePart(Long partId) {
		piezaSvc.deleteById(partId);
	}

	@Override
	public Pieza editPart(Pieza part) {
		return piezaSvc.save(part);
	}

}
