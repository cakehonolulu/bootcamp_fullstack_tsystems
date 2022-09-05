package com.cakehonolulu.springrest.service;

import java.util.List;

import com.cakehonolulu.springrest.dto.Trabajador;

public interface TrabajadorImpl {
	/**
	 * Interface-placeholder functions for API usage
	 * Contains CRUD methods for API-to-database interaction
	 */
	
	/**
	 * @param	name	String that contains a worker's name to find in the database
	 * @return			Java List w/the information
	 */
	public List<Trabajador> findByName(String name);
	
	/**
	 * @param	surname	String that contains a worker's surname to find in the database
	 * @return			Java List w/the information
	 */
	public List<Trabajador> findBySurname(String surname);

	/**
	 * @param	job		String that contains a worker's job to find in the database
	 * @return			Java List w/the information
	 */
	public List<Trabajador> findByJob(String job);

	/**
	 * @param	employerId	Numerical id to be pattern-matched with a (Maybe) existing employer
	 * @return	Employer object (If found)
	 */
	public Trabajador findById(Long employerId);
	
	/**
	 * @return	Java List with Employer objects
	 */
	public List<Trabajador> listEmployers();
	
	/**
	 * @param	employer	Employer object to-be-saved on the database
	 * @return	The Employer object
	 */
	public Trabajador storeEmployer(Trabajador employer);

	/**
	 * @param	employerId	Employer id to be pattern-matched and deleted (If exists)
	 */
	public void deleteEmployer(Long employerId);

	/**
	 * @param	employer	Employer object to-be-updated on the database
	 * @return	The Employer object
	 */
	public Trabajador updateEmployer(Trabajador employer);
}
