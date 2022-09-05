package com.springer.peliculas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springer.peliculas.dto.Pelicula;

public interface PeliculaDAO extends JpaRepository<Pelicula, Long> {

}
