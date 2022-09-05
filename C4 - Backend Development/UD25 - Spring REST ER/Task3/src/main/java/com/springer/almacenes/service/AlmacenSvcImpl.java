package com.springer.almacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springer.almacenes.dao.AlmacenDAO;
import com.springer.almacenes.dto.Almacen;
import com.springer.almacenes.dto.Caja;

@Service
public class AlmacenSvcImpl implements AlmacenService {
	
	@Autowired
	AlmacenDAO storageDAO;

	@Override
	public Almacen findById(Long storageId) {
		return storageDAO.findById(storageId).get();
	}

	@Override
	public List<Almacen> listStorages() {
		return storageDAO.findAll();
	}

	@Override
	public Almacen saveStorage(Almacen storage) {
		return storageDAO.save(storage);
	}

	@Override
	public Almacen editStorage(Almacen storage) {
		return storageDAO.save(storage);
	}

	@Override
	public void deleteStorage(Long storageId) {
		storageDAO.deleteById(storageId);
		
	}


}
