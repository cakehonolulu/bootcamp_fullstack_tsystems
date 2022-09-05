package com.springer.empleados.service;

import java.util.List;

import com.springer.empleados.dto.Departamento;
import com.springer.empleados.dto.Empleado;

public interface EmpleadoService {

	/**
	 * Interface-placeholder functions for API usage
	 * Contains CRUD methods for API-to-database interaction
	 */

	/**
	 * @param	Long employeeId	Numerical id to be pattern-matched with a (Maybe) existing employee.
	 * @return	Employee object (If found)
	 */
	public Empleado findById(Long employeeId);
	
	/**
	 * @return	Java List with Employee objects
	 */
	public List<Empleado> listEmployees();
	
	/**
	 * @param	employee	Employee object to-be-saved on the database
	 * @return	The Employee object
	 */
	public Empleado storeEmploye(Empleado employee);

	/**
	 * @param	employeeId	Employee id to be pattern-matched and deleted (If exists)
	 */
	public void deleteEmployee(Long employeeId);
	
	/**
	 * @param	employee	Employee object to-be-updated on the database
	 * @return	The Employee object
	 */
	public Empleado updateEmployee(Empleado employee);
}
