package com.springer.piez_prov.service;

import java.util.List;

import com.springer.piez_prov.dto.Suministra;

public interface SuministraService {

	public Suministra findById(Long supplyId);
	
	public List<Suministra> listSupplies();
	
	public Suministra saveSupply(Suministra supply);
	
	public void deleteSupply(Long supplyId);

	public Suministra editSupply(Suministra supply);
}
