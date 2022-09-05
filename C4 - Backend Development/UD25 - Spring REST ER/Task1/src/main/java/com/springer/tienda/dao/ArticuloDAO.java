package com.springer.tienda.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springer.tienda.dto.Articulo;

public interface ArticuloDAO extends JpaRepository<Articulo, Long> {

}
