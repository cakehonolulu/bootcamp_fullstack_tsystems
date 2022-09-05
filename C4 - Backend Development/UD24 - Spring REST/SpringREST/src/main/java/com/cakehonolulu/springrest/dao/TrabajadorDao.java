package com.cakehonolulu.springrest.dao;

import com.cakehonolulu.springrest.dto.Trabajador;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TrabajadorDao extends JpaRepository<Trabajador, Long> {

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
	
}