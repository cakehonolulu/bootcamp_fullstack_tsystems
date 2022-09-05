package com.cakehonolulu.almacenes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cakehonolulu.almacenes.dto.Producto;
import com.cakehonolulu.almacenes.service.ProductoSvcImpl;

@RestController
@RequestMapping("/api")
public class ProductoController {
	
	@Autowired
	ProductoSvcImpl prodCtl;
	
	@GetMapping("/products")
	public List<Producto> listProducts() {
		return prodCtl.listProducts();
	}
	
	@GetMapping("/product/{id}")
	public Producto listById(@PathVariable(name="id") Long id) {
		return prodCtl.listById(id);
	}
	
	@PostMapping("/product")
	public Producto saveProduct(@RequestBody Producto producto) {
		return prodCtl.saveProduct(producto);
	}
	
	@PutMapping("/product/{id}")
	public Producto editProduct(@PathVariable(name="id") Long id, @RequestBody Producto producto) {
		Producto newProduct = new Producto();
		
		newProduct = prodCtl.listById(id);
		newProduct.setNombre(producto.getNombre());
		newProduct.setPrecio(producto.getPrecio());
		
		prodCtl.editProduct(newProduct);
		
		return newProduct;
	}
	
	@DeleteMapping("/product/{id}")
	public void deleteProduct(@PathVariable(name="id") Long id) {
		prodCtl.deleteProduct(id);
	}
	
}
