package com.cakehonolulu.almacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakehonolulu.almacenes.dto.Producto;

public interface ProductoDAO extends JpaRepository<Producto, Long> {

}
