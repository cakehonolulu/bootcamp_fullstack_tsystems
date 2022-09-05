package com.springer.empleados.controller;

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

import com.springer.empleados.dto.Departamento;
import com.springer.empleados.dto.Empleado;
import com.springer.empleados.service.DepartamentoSvcImpl;
import com.springer.empleados.service.EmpleadoSvcImpl;


@RestController
@RequestMapping("/api")
public class EmpresaController {

	@Autowired
	DepartamentoSvcImpl deptSvc;
	
	@Autowired
	EmpleadoSvcImpl employeeSvc;
	
	/**
	 * GET Requests
	 */	
	@GetMapping("/departments/{id}")
	public Departamento findDeptById(@PathVariable(name = "id") Long id) {
		return deptSvc.findById(id);
	}

	@GetMapping("/departments")
	public List<Departamento> listDepts() {
		return deptSvc.listDepts();
	}
	
	@GetMapping("/employees/{id}")
	public Empleado findItemById(@PathVariable(name = "id") Long id) {
		return employeeSvc.findById(id);
	}

	@GetMapping("/employees")
	public List<Empleado> listEmployees() {
		return employeeSvc.listEmployees();
	}
	
	/**
	 * POST Requests
	 */
	@PostMapping("/departments")
	public Departamento storeDept(@RequestBody Departamento dept) {
		return deptSvc.storeDept(dept);
	}
	
	@PostMapping("/employees")
	public Empleado storeItem(@RequestBody Empleado employee) {
		return employeeSvc.storeEmploye(employee);
	}
	
	/**
	 * PUT Requests
	 */
	@PutMapping("/departments/{id}")
	public Departamento updateDept(@PathVariable(name = "id") Long id, @RequestBody Departamento dept) {
		Departamento updatedDept;
		
		updatedDept = deptSvc.findById(id);
		updatedDept.setName(dept.getName());
		updatedDept.setBudget(dept.getBudget());
		deptSvc.updateDept(updatedDept);
		
		return updatedDept;
	}

	@PutMapping("/employees/{id}")
	public Empleado updateEmployee(@PathVariable(name = "id") Long id, @RequestBody Empleado employee) {
		Empleado updatedEmployee;
		
		updatedEmployee = employeeSvc.findById(id);
		updatedEmployee.setDni(employee.getDni());
		updatedEmployee.setName(employee.getName());
		updatedEmployee.setSurname(employee.getSurname());
		
		employeeSvc.updateEmployee(updatedEmployee);
		
		return updatedEmployee;
	}
	
	/**
	 * DELETE Requests
	 */
	@DeleteMapping("/departments/{id}")
	public void deleteDept(@PathVariable(name = "id") Long id) {
		deptSvc.deleteDept(id);
	}
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable(name = "id") Long id) {
		employeeSvc.deleteEmployee(id);
	}
}
