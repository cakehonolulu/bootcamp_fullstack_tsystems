package com.springer.piez_prov.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springer.piez_prov.dao.SuministraDAO;
import com.springer.piez_prov.dto.Suministra;

public class SuministraSvcImpl implements SuministraService {

	@Autowired
	SuministraDAO supplySvc;
	
	@Override
	public Suministra findById(Long supplyId) {
		return supplySvc.findById(supplyId).get();
	}

	@Override
	public List<Suministra> listSupplies() {
		return supplySvc.findAll();
	}

	@Override
	public Suministra saveSupply(Suministra supply) {
		return supplySvc.save(supply);
	}

	@Override
	public void deleteSupply(Long supplyId) {
		supplySvc.deleteById(supplyId);
	}

	@Override
	public Suministra editSupply(Suministra supply) {
		return supplySvc.save(supply);
	}

}
