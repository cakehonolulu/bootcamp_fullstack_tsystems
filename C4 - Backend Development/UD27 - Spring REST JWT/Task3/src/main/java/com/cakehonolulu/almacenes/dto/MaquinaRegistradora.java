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
@Table(name = "maquinas")
public class MaquinaRegistradora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="piso")
	private int piso;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy="maquinas_reg")
	private List<Venta> sales;
	
	public MaquinaRegistradora() {
		
	}

	/**
	 * @param id
	 * @param piso
	 */
	public MaquinaRegistradora(Long id, int piso) {
		this.id = id;
		this.piso = piso;
	}

	/**
	 * @return the piso
	 */
	public int getPiso() {
		return piso;
	}

	/**
	 * @param piso the piso to set
	 */
	public void setPiso(int piso) {
		this.piso = piso;
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
