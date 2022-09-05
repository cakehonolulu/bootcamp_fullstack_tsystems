package com.cientificos.api.service;

import java.util.List;

import com.cientificos.api.dto.Asignado;

public interface AsignadosService {
	
	public Asignado findById(Long id);

	public List<Asignado> listAssignations();
	
	public Asignado saveAssignation(Asignado assigned);
	
	public Asignado editAssignation(Asignado assigned);
	
	public void deleteAssignation(Long id);
}
