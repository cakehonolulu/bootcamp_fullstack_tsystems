package com.cientificos.api.service;

import java.util.List;

import com.cientificos.api.dto.Proyecto;

public interface ProyectosService {

	public Proyecto findById(Long id);

	public List<Proyecto> listProjects();
	
	public Proyecto saveProject(Proyecto proyecto);
	
	public Proyecto editProject(Proyecto proyecto);
	
	public void deleteProject(Long id);
}
