package com.springer.almacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springer.almacenes.dto.Almacen;

public interface AlmacenDAO extends JpaRepository<Almacen, Long> {

}
