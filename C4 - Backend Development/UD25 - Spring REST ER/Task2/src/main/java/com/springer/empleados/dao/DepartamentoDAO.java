package com.springer.empleados.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springer.empleados.dto.Departamento;

public interface DepartamentoDAO extends JpaRepository<Departamento, Long> {

}
