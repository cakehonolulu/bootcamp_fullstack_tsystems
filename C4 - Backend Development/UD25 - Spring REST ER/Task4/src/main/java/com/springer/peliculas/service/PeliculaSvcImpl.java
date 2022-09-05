package com.springer.peliculas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springer.peliculas.dao.PeliculaDAO;
import com.springer.peliculas.dto.Pelicula;

@Service
public class PeliculaSvcImpl implements PeliculaService {

	@Autowired
	PeliculaDAO filmDAO;
	
	@Override
	public Pelicula findById(Long filmId) {
		return filmDAO.findById(filmId).get();
	}

	@Override
	public List<Pelicula> listFilms() {
		return filmDAO.findAll();
	}

	@Override
	public Pelicula saveFilm(Pelicula film) {
		return filmDAO.save(film);
	}

	@Override
	public Pelicula editFilm(Pelicula film) {
		return filmDAO.save(film);
	}

	@Override
	public void deleteFilm(Long filmId) {
		filmDAO.deleteById(filmId);
	}

}
