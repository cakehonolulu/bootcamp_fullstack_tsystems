package com.springer.empleados.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springer.empleados.dao.DepartamentoDAO;
import com.springer.empleados.dto.Departamento;

@Service
public class DepartamentoSvcImpl implements DepartamentoService {

	@Autowired
	DepartamentoDAO deptDAO;
	
	@Override
	public Departamento findById(Long deptId) {
		return deptDAO.findById(deptId).get();
	}

	@Override
	public List<Departamento> listDepts() {
		return deptDAO.findAll();
	}

	@Override
	public Departamento storeDept(Departamento dept) {
		return deptDAO.save(dept);
	}

	@Override
	public void deleteDept(Long deptId) {
		deptDAO.deleteById(deptId);
	}

	@Override
	public Departamento updateDept(Departamento dept) {
		return deptDAO.save(dept);
	}

}
