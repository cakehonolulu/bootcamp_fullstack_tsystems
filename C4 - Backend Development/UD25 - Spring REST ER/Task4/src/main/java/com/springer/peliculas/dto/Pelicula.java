package com.springer.peliculas.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre")
	private String title;
	
	@Column(name = "calificacion_edad")
	private int ageRestriction;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pelicula")
	private List<Sala> rooms;

	public Pelicula() {
		this.title = "";
		this.ageRestriction = 0;
	}
	
	public Pelicula(Long id, String title, int ageRestriction, List<Sala> rooms) {
		this.id = id;
		this.title = title;
		this.ageRestriction = ageRestriction;
		this.rooms = rooms;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the ageRestriction
	 */
	public int getAgeRestriction() {
		return ageRestriction;
	}

	/**
	 * @return the rooms
	 */
	public List<Sala> getRooms() {
		return rooms;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param ageRestriction the ageRestriction to set
	 */
	public void setAgeRestriction(int ageRestriction) {
		this.ageRestriction = ageRestriction;
	}

	/**
	 * @param rooms the rooms to set
	 */
	public void setRooms(List<Sala> rooms) {
		this.rooms = rooms;
	}
	
	
}
