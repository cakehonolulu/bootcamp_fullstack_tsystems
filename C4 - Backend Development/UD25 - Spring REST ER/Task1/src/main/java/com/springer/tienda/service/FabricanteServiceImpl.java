package com.springer.tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springer.tienda.dao.FabricanteDAO;
import com.springer.tienda.dto.Fabricante;

@Service
public class FabricanteServiceImpl implements FabricanteService {
	
	@Autowired
	FabricanteDAO makersDAO;
	

	@Override
	public Fabricante findById(Long id) {
		return makersDAO.findById(id).get();
	}

	@Override
	public List<Fabricante> listMakers() {
		return makersDAO.findAll();
	}

	@Override
	public Fabricante storeMaker(Fabricante maker) {
		return makersDAO.save(maker);
	}

	@Override
	public void deleteMaker(Long makerId) {
		makersDAO.deleteById(makerId);
	}

	@Override
	public Fabricante updateMaker(Fabricante maker) {
		return makersDAO.save(maker);
	}

}
