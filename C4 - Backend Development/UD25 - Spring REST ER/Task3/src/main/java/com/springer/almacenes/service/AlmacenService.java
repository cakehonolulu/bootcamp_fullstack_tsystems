package com.springer.almacenes.service;

import java.util.List;

import com.springer.almacenes.dto.Almacen;

public interface AlmacenService {

	public Almacen findById(Long storageId);
	
	public List<Almacen> listStorages();
	
	public Almacen saveStorage(Almacen storage);
	
	public Almacen editStorage(Almacen storage);
	
	public void deleteStorage(Long storageId);
}
