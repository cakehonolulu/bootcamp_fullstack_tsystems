package com.springer.tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springer.tienda.dao.ArticuloDAO;
import com.springer.tienda.dao.FabricanteDAO;
import com.springer.tienda.dto.Articulo;

@Service
public class ArticuloServiceImpl implements ArticuloService {

	@Autowired
	ArticuloDAO itemsDAO;
	
	@Override
	public Articulo findById(Long itemId) {
		return itemsDAO.findById(itemId).get();
	}

	@Override
	public List<Articulo> listItems() {
		return itemsDAO.findAll();
	}

	@Override
	public Articulo storeItem(Articulo item) {
		return itemsDAO.save(item);
	}

	@Override
	public void deleteItem(Long itemId) {
		itemsDAO.deleteById(itemId);
	}

	@Override
	public Articulo updateItem(Articulo item) {
		return itemsDAO.save(item);
	}

}
