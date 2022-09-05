package com.springer.peliculas.service;

import java.util.List;

import com.springer.peliculas.dto.Pelicula;
import com.springer.peliculas.dto.Sala;

public interface SalaService {

	public Sala findById(Long roomId);
	
	public List<Sala> listRooms();
	
	public Sala saveRoom(Sala room);
	
	public Sala editRoom(Sala room);
	
	public void deleteRoom(Long roomId);
}
