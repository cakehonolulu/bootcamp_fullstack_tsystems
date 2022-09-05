package com.springer.tienda.service;

import java.util.List;

import com.springer.tienda.dto.Articulo;

public interface ArticuloService {

	/**
	 * Interface-placeholder functions for API usage
	 * Contains CRUD methods for API-to-database interaction
	 */

	/**
	 * @param	itemId	Numerical id to be pattern-matched with a (Maybe) existing item
	 * @return	Item object (If found)
	 */
	public Articulo findById(Long itemId);
	
	/**
	 * @return	Java List with Item objects
	 */
	public List<Articulo> listItems();
	
	/**
	 * @param	item	Item object to-be-saved on the database
	 * @return	The Item object
	 */
	public Articulo storeItem(Articulo item);

	/**
	 * @param	itemId	Maker id to be pattern-matched and deleted (If exists)
	 */
	public void deleteItem(Long itemId);
	
	/**
	 * @param	item	Item object to-be-updated on the database
	 * @return	The Item object
	 */
	public Articulo updateItem(Articulo item);
}
