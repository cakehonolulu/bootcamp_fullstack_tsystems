package com.springer.peliculas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springer.peliculas.dao.SalaDAO;
import com.springer.peliculas.dto.Sala;

@Service
public class SalaSvcImpl implements SalaService {

	@Autowired
	SalaDAO roomDAO;
	
	@Override
	public Sala findById(Long roomId) {
		return roomDAO.findById(roomId).get();
	}

	@Override
	public List<Sala> listRooms() {
		return roomDAO.findAll();
	}

	@Override
	public Sala saveRoom(Sala room) {
		return roomDAO.save(room);
	}

	@Override
	public Sala editRoom(Sala room) {
		return roomDAO.save(room);
	}

	@Override
	public void deleteRoom(Long roomId) {
		roomDAO.deleteById(roomId);
	}

}
