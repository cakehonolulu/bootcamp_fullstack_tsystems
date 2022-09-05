package com.cientificos.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cientificos.api.dao.AsignadoDAO;
import com.cientificos.api.dto.Asignado;

public class AsignadosSvcImpl implements AsignadosService {

	@Autowired
	AsignadoDAO assignedSvc;
	
	@Override
	public Asignado findById(Long id) {
		return assignedSvc.findById(id).get();
	}

	@Override
	public List<Asignado> listAssignations() {
		return assignedSvc.findAll();
	}

	@Override
	public Asignado saveAssignation(Asignado assigned) {
		return assignedSvc.save(assigned);
	}

	@Override
	public Asignado editAssignation(Asignado assigned) {
		return assignedSvc.save(assigned);
	}

	@Override
	public void deleteAssignation(Long id) {
		assignedSvc.deleteById(id);
	}

}
