package com.springer.empleados.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// Codigo
	private Long code;
	
	@Column(name = "nombre")
	// Name of the dept.
	private String name;
	
	@Column(name = "presupuesto")
	// Budget of the dept.
	private int budget;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dept")
	private List<Empleado> employees;
	
	public Departamento() {
		this.name = "";
		this.budget = 0;
	}
	
	public Departamento(Long code, String name, int budget) {
		this.code = code;
		this.name = name;
		this.budget = budget;
	}

	/**
	 * @return the code
	 */
	public Long getCode() {
		return code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the budget
	 */
	public int getBudget() {
		return budget;
	}

	/**
	 * @return the employees
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	public List<Empleado> getEmpleados() {
		return employees;
	}
	
	/**
	 * @param code the code to set
	 */
	public void setCode(Long code) {
		this.code = code;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param budget the budget to set
	 */
	public void setBudget(int budget) {
		this.budget = budget;
	}
	
}
