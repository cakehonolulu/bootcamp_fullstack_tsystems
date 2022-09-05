package com.cakehonolulu.almacenes.service;

import java.util.List;

import com.cakehonolulu.almacenes.dto.Venta;

public interface VentaService {

	public List<Venta> listSales();
	
	public Venta listById(Long id);
	
	public Venta saveSale(Venta venta);
	
	public Venta editSale(Venta venta);
	
	public void deleteSale(Long id);
	
}
