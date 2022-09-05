package com.springer.peliculas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springer.peliculas.dto.Pelicula;
import com.springer.peliculas.dto.Sala;
import com.springer.peliculas.service.PeliculaSvcImpl;
import com.springer.peliculas.service.SalaSvcImpl;

@RestController
@RequestMapping("/api")
public class FilmController {

	@Autowired
	PeliculaSvcImpl filmSvc;
	
	@Autowired
	SalaSvcImpl roomSvc;
	
	/**
	 * GET REQUESTS
	 */
	@GetMapping("/films")
	public List<Pelicula> listFilms() {
		return filmSvc.listFilms();
	}
	
	@GetMapping("/films/{id}")
	public Pelicula filmById(@PathVariable(name="id") Long filmId) {
		return filmSvc.findById(filmId);
	}
	
	@GetMapping("/rooms")
	public List<Sala> listRoms() {
		return roomSvc.listRooms();
	}
	
	@GetMapping("/rooms/{id}")
	public Sala roomById(@PathVariable(name="id") Long roomId) {
		return roomSvc.findById(roomId);
	}
	
	/**
	 * POST REQUESTS
	 */
	@PostMapping("/films")
	public Pelicula saveFilm(@RequestBody Pelicula film) {
		return filmSvc.saveFilm(film);
	}
	
	@PostMapping("/rooms")
	public Sala saveRoom(@RequestBody Sala room) {
		return roomSvc.saveRoom(room);
	}
	
	/**
	 * PUT REQUESTS
	 */
	@PutMapping("/films/{id}")
	public Pelicula editFilm(@PathVariable(name="id") Long filmId, @RequestBody Pelicula film) {
		Pelicula selectedFilm = new Pelicula();

		selectedFilm = filmSvc.findById(filmId);
		selectedFilm.setTitle(film.getTitle());
		selectedFilm.setAgeRestriction(film.getAgeRestriction());
		
		selectedFilm = filmSvc.saveFilm(selectedFilm);
		
		return selectedFilm;
	}
	
	/**
	 * DELETE REQUESTS
	 */	
	@DeleteMapping("/films/{id}")
	public void deleteFilm(@PathVariable(name="id") Long filmId) {
		filmSvc.deleteFilm(filmId);
	}
}
