package com.cakehonolulu.almacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakehonolulu.almacenes.dto.Cajero;

public interface CajeroDAO extends JpaRepository<Cajero, Long> {

}
