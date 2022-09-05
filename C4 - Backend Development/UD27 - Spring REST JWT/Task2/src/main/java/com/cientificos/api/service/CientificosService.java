package com.cientificos.api.service;

import java.util.List;

import com.cientificos.api.dto.Cientifico;

public interface CientificosService {

	public Cientifico findById(Long id);

	public List<Cientifico> listScientists();
	
	public Cientifico saveScientist(Cientifico scientist);
	
	public Cientifico editScientist(Cientifico scientist);
	
	public void deleteScientist(Long id);
}
