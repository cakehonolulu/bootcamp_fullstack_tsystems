package com.springer.empleados.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springer.empleados.dto.Empleado;

public interface EmpleadoDAO extends JpaRepository<Empleado, Long> {

}
