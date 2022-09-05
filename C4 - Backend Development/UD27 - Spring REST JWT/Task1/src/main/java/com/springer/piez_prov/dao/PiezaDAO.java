package com.springer.piez_prov.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springer.piez_prov.dto.Pieza;

public interface PiezaDAO extends JpaRepository<Pieza, Long> {

}
