package com.cientificos.api.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cientificos")
public class Cientifico {

	@Id
	private String dni;
	
	@ManyToOne
	@JoinColumn(name="cientifico")
	private Cientifico scientific;

	@ManyToOne
	@JoinColumn(name="proyecto")
	private Proyecto project;

	public Cientifico() {
	}

	public Cientifico(String dni, Cientifico scientific, Proyecto project) {
		super();
		this.dni = dni;
		this.scientific = scientific;
		this.project = project;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @return the scientific
	 */
	public Cientifico getScientific() {
		return scientific;
	}

	/**
	 * @return the project
	 */
	public Proyecto getProject() {
		return project;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @param scientific the scientific to set
	 */
	public void setScientific(Cientifico scientific) {
		this.scientific = scientific;
	}

	/**
	 * @param project the project to set
	 */
	public void setProject(Proyecto project) {
		this.project = project;
	}
	
}
