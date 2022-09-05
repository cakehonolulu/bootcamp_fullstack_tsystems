package com.cientificos.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cientificos.api.dto.Cientifico;

public interface CientificoDAO extends JpaRepository<Cientifico, Long> {

}
