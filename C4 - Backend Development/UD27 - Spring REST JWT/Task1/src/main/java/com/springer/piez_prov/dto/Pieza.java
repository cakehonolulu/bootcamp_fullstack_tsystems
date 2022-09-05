package com.springer.piez_prov.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "piezas")
public class Pieza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// Autoincrementable ID
	private Long id;
	
	@Column(name = "nombre")
	// Name of the 'Pieza'
	private String name;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pieza")
	private List<Suministra> supply;
	
	public Pieza() {
		
	}
	
	/**
	 * @param id
	 * @param name
	 * @param supply
	 */
	public Pieza(Long id, String name, List<Suministra> supply) {
		this.id = id;
		this.name = name;
		this.supply = supply;
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

	/**
	 * @return the supply
	 */
	public List<Suministra> getSupply() {
		return supply;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "proveedor")
	public List<Suministra> getProveedoresPiezas() {
		return supply;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param supply the supply to set
	 */
	public void setSupply(List<Suministra> supply) {
		this.supply = supply;
	}

	/**
	 * @param pieza the pieza to set
	 */
	public void setProveedoresPiezas(List<Suministra> supply) {
		this.supply = supply;
	}
}
