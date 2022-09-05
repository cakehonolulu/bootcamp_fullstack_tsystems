package com.cientificos.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cientificos.api.dao.ProyectoDAO;
import com.cientificos.api.dto.Proyecto;

public class ProyectosSvcImpl implements ProyectosService {

	@Autowired
	ProyectoDAO projectsSvc;
	
	@Override
	public Proyecto findById(Long id) {
		return projectsSvc.findById(id).get();
	}

	@Override
	public List<Proyecto> listProjects() {
		return projectsSvc.findAll();
	}

	@Override
	public Proyecto saveProject(Proyecto proyecto) {
		return projectsSvc.save(proyecto);
	}

	@Override
	public Proyecto editProject(Proyecto proyecto) {
		return projectsSvc.save(proyecto);
	}

	@Override
	public void deleteProject(Long id) {
		projectsSvc.deleteById(id);
	}

}
