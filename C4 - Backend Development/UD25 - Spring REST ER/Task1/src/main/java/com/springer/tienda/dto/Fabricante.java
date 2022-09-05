package com.springer.tienda.dto;

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
@Table(name = "fabricantes")
public class Fabricante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// Autoincrementable ID
	private Long id;

	@Column(name = "nombre")
	// Name of the maker
	private String name;

	@OneToMany
	@JoinColumn(name="id")
	// List w/each maker's items
	private List<Articulo> items;
	
	/**
	 * Default constructor for Hibernate JPA beans
	 */
	public Fabricante() {
		this.name = "";
	}
	
	/**
	 * @param name
	 */
	public Fabricante(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Articulo")
	public List<Articulo> getItems() {
		return items;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(List<Articulo> items) {
		this.items = items;
	}
	
}
