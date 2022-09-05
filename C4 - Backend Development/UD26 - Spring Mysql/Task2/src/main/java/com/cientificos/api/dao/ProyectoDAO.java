package com.cientificos.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cientificos.api.dto.Proyecto;

public interface ProyectoDAO extends JpaRepository<Proyecto, Long> {

}
