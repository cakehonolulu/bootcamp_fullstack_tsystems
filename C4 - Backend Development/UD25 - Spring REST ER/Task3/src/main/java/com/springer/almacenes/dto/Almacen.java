package com.springer.almacenes.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Almacen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "lugar")
	private String place;
	
	@Column(name = "capacidad")
	private int capacity;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "storage")
	private List<Caja> boxes;
	
	public Almacen() {
		this.place = "";
		this.capacity = 0;
	}
	
	public Almacen(Long id, String place, int capacity) {
		this.id = id;
		this.place = place;
		this.capacity = capacity;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the place
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "box")
	public List<Caja> getBoxes() {
		return boxes;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param place the place to set
	 */
	public void setPlace(String place) {
		this.place = place;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void setBoxes(List<Caja> box) {
		this.boxes = box;
	}
	
}
