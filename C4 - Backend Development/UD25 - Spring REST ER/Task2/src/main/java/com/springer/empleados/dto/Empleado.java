package com.springer.empleados.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "dni")
	// DNI String
	private String dni;
	
	@Column(name = "nombre")
	// Name of the employee.
	private String name;
	
	@Column(name = "apellidos")
	// Surname of the employee.
	private String surname;

	@ManyToOne
	@JoinColumn(name = "departamento")
	private Departamento dept;
	
	public Empleado() {
		this.dni = "";
		this.name = "";
		this.surname = "";
	}
	
	public Empleado(String dni, String name, String surname) {
		this.dni = dni;
		this.name = name;
		this.surname = surname;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @return the dept
	 */
	public Departamento getDepartamento() {
		return dept;
	}
	
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
}
