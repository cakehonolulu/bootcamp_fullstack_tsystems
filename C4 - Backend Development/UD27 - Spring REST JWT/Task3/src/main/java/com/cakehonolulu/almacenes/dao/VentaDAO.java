package com.cakehonolulu.almacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakehonolulu.almacenes.dto.Venta;

public interface VentaDAO extends JpaRepository<Venta, Long> {

}
