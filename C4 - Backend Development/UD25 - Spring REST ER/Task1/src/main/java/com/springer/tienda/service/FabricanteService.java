package com.springer.tienda.service;

import java.util.List;

import com.springer.tienda.dto.Fabricante;

public interface FabricanteService {
	/**
	 * Interface-placeholder functions for API usage
	 * Contains CRUD methods for API-to-database interaction
	 */
	
	/**
	 * @param	makerId	Numerical id to be pattern-matched with a (Maybe) existing maker
	 * @return	Maker object (If found)
	 */
	public Fabricante findById(Long makerId);
	
	/**
	 * @return	Java List with Maker objects
	 */
	public List<Fabricante> listMakers();
	
	/**
	 * @param	maker	Maker object to-be-saved on the database
	 * @return	The Maker object
	 */
	public Fabricante storeMaker(Fabricante maker);

	/**
	 * @param	makerId	Maker id to be pattern-matched and deleted (If exists)
	 */
	public void deleteMaker(Long makerId);
	
	/**
	 * @param	maker	Maker object to-be-updated on the database
	 * @return	The Maker object
	 */
	public Fabricante updateMaker(Fabricante maker);
}
