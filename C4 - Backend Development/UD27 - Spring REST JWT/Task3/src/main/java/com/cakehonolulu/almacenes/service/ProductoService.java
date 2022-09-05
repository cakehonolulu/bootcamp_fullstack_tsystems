package com.cakehonolulu.almacenes.service;

import java.util.List;

import com.cakehonolulu.almacenes.dto.Producto;

public interface ProductoService {

	public List<Producto> listProducts();
	
	public Producto listById(Long id);
	
	public Producto saveProduct(Producto producto);
	
	public Producto editProduct(Producto producto);
	
	public void deleteProduct(Long id);
	
}
