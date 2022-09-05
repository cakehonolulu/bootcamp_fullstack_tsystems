package com.springer.peliculas.service;

import java.util.List;

import com.springer.peliculas.dto.Pelicula;

public interface PeliculaService {

	public Pelicula findById(Long filmId);
	
	public List<Pelicula> listFilms();
	
	public Pelicula saveFilm(Pelicula film);
	
	public Pelicula editFilm(Pelicula film);
	
	public void deleteFilm(Long filmId);
}
