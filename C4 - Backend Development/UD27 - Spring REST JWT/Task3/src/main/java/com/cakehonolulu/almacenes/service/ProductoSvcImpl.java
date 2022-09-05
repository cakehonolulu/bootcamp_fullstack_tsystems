package com.cakehonolulu.almacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakehonolulu.almacenes.dao.ProductoDAO;
import com.cakehonolulu.almacenes.dto.Producto;

@Service
public class ProductoSvcImpl implements ProductoService {

	@Autowired
	ProductoDAO productDAO;

	@Override
	public List<Producto> listProducts() {
		return productDAO.findAll();
	}

	@Override
	public Producto listById(Long id) {
		return productDAO.findById(id).get();
	}

	@Override
	public Producto saveProduct(Producto producto) {
		return productDAO.save(producto);
	}

	@Override
	public Producto editProduct(Producto producto) {
		return productDAO.save(producto);
	}

	@Override
	public void deleteProduct(Long id) {
		productDAO.deleteById(id);
	}
	
}
