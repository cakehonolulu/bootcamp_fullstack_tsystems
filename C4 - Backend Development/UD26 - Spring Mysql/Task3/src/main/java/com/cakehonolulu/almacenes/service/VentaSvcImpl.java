package com.cakehonolulu.almacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakehonolulu.almacenes.dao.VentaDAO;
import com.cakehonolulu.almacenes.dto.Venta;

@Service
public class VentaSvcImpl implements VentaService {

	@Autowired
	VentaDAO salesDAO;

	@Override
	public List<Venta> listSales() {
		return salesDAO.findAll();
	}

	@Override
	public Venta listById(Long id) {
		return salesDAO.findById(id).get();
	}

	@Override
	public Venta saveSale(Venta venta) {
		return salesDAO.save(venta);
	}

	@Override
	public Venta editSale(Venta venta) {
		return salesDAO.save(venta);
	}

	@Override
	public void deleteSale(Long id) {
		salesDAO.deleteById(id);
	}
	
}
