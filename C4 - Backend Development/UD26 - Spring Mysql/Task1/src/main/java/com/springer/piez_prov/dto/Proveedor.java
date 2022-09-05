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
@Table(name = "proveedores")
public class Proveedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// Autoincrementable ID
	private Long id;
	
	@Column(name = "nombre")
	// Name of the 'Proveedor'
	private String name;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "proveedor")
	private List<Suministra> proveedoresPiezas;

	public Proveedor() {
		
	}
	
	/**
	 * @param id
	 * @param name
	 * @param proveedoresPiezas
	 */
	public Proveedor(Long id, String name, List<Suministra> proveedoresPiezas) {
		super();
		this.id = id;
		this.name = name;
		this.proveedoresPiezas = proveedoresPiezas;
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
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ProveedorPiezas")
	public List<Suministra> getProveedoresPiezas() {
		return proveedoresPiezas;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param proveedoresPiezas the proveedoresPiezas to set
	 */
	public void setProveedoresPiezas(List<Suministra> proveedoresPiezas) {
		this.proveedoresPiezas = proveedoresPiezas;
	}

}
