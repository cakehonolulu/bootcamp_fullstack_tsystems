package com.springer.peliculas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springer.peliculas.dto.Sala;

public interface SalaDAO extends JpaRepository<Sala, Long> {

}
