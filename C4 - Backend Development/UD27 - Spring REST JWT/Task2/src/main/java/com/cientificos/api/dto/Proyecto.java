package com.cientificos.api.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "proyectos")
public class Proyecto {

	@Id
	private String id;
	
	@Column(name = "nombre")
	private String name;
	
	@Column(name = "horas")
	private int hours;

	public Proyecto() {
		
	}
	
	public Proyecto(String id, String name, int hours) {
		this.id = id;
		this.name = name;
		this.hours = hours;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the hours
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param hours the hours to set
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}

}
