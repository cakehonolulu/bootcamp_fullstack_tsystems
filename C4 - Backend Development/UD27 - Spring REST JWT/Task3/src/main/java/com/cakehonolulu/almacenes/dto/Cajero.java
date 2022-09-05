package com.cakehonolulu.almacenes.dto;

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
@Table(name = "cajeros")
public class Cajero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "fullname")
	private String fullName;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy="cajero")
	private List<Venta> sales;

	public Cajero() {
		
	}

	/**
	 * @param id
	 * @param nombre
	 */
	public Cajero(Long id, String nombre) {
		this.id = id;
		this.fullName = nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.fullName = nombre;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	
	/**
	 * @return the sales
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Venta")
	public List<Venta> getSales() {
		return sales;
	}

	/**
	 * @param sales the sales to set
	 */
	public void setSales(List<Venta> sales) {
		this.sales = sales;
	}
	
}
