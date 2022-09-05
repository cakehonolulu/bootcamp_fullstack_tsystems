package com.cientificos.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cientificos.api.dao.CientificoDAO;
import com.cientificos.api.dto.Cientifico;

public class CientificosSvcImpl implements CientificosService {
	
	@Autowired
	CientificoDAO scientificSvc;
	
	@Override
	public Cientifico findById(Long id) {
		return scientificSvc.findById(id).get();
	}

	@Override
	public List<Cientifico> listScientists() {
		return scientificSvc.findAll();
	}

	@Override
	public Cientifico saveScientist(Cientifico scientist) {
		return scientificSvc.save(scientist);
	}

	@Override
	public Cientifico editScientist(Cientifico scientist) {
		return scientificSvc.save(scientist);
	}

	@Override
	public void deleteScientist(Long id) {
		scientificSvc.deleteById(id);
	}

}
