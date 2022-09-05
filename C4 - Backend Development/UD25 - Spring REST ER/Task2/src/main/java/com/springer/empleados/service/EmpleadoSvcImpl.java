package com.springer.empleados.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springer.empleados.dao.DepartamentoDAO;
import com.springer.empleados.dao.EmpleadoDAO;
import com.springer.empleados.dto.Empleado;

@Service
public class EmpleadoSvcImpl implements EmpleadoService {

	@Autowired
	EmpleadoDAO employeeDAO;
	
	@Override
	public Empleado findById(Long employeeId) {
		return employeeDAO.findById(employeeId).get();
	}

	@Override
	public List<Empleado> listEmployees() {
		return employeeDAO.findAll();
	}

	@Override
	public Empleado storeEmploye(Empleado employee) {
		return employeeDAO.save(employee);
	}

	@Override
	public void deleteEmployee(Long employeeId) {
		employeeDAO.deleteById(employeeId);
	}

	@Override
	public Empleado updateEmployee(Empleado employee) {
		return employeeDAO.save(employee);
	}

	
}
