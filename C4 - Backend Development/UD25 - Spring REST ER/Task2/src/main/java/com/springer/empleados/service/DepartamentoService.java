package com.springer.empleados.service;

import java.util.List;

import com.springer.empleados.dto.Departamento;

public interface DepartamentoService {

	/**
	 * Interface-placeholder functions for API usage
	 * Contains CRUD methods for API-to-database interaction
	 */

	/**
	 * @param	Long deptId	Numerical id to be pattern-matched with a (Maybe) existing dept.
	 * @return	Dept object (If found)
	 */
	public Departamento findById(Long deptId);
	
	/**
	 * @return	Java List with Dept objects
	 */
	public List<Departamento> listDepts();
	
	/**
	 * @param	dept	Dept object to-be-saved on the database
	 * @return	The Dept object
	 */
	public Departamento storeDept(Departamento dept);

	/**
	 * @param	deptId	Dept id to be pattern-matched and deleted (If exists)
	 */
	public void deleteDept(Long deptId);
	
	/**
	 * @param	dept	Dept object to-be-updated on the database
	 * @return	The Dept object
	 */
	public Departamento updateDept(Departamento dept);
}
