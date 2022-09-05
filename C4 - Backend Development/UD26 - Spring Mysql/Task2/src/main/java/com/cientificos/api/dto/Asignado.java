package com.cientificos.api.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "asignados")
public class Asignado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="cientifico")
	private Cientifico scientific;

	@ManyToOne
	@JoinColumn(name="proyecto")
	private Proyecto project;

	public Asignado() {
	}

	public Asignado(Long id, Cientifico scientific, Proyecto project) {
		super();
		this.id = id;
		this.scientific = scientific;
		this.project = project;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
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
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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
