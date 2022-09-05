package com.springer.almacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springer.almacenes.dao.CajaDAO;
import com.springer.almacenes.dto.Caja;

@Service
public class CajaSvcImpl implements CajaService {
	
	@Autowired
	CajaDAO boxDAO;
	
	@Override
	public Caja findById(Long boxId) {
		return boxDAO.findById(boxId).get();
	}

	@Override
	public List<Caja> listBoxes() {
		return boxDAO.findAll();
	}

	@Override
	public Caja saveBox(Caja box) {
		return boxDAO.save(box);
	}

	@Override
	public Caja editBox(Caja box) {
		return boxDAO.save(box);
	}

	@Override
	public void deleteBox(Long boxId) {
		boxDAO.deleteById(boxId);
	}

}
