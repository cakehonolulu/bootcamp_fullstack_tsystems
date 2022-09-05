package com.springer.tienda.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "articulos")
public class Articulo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// Autoincrementable ID
	private Long id;

	@Column(name = "nombre")
	// Name of the article
	private String name;
	
	@Column(name = "precio")
	// Price of the article
	private int price;

	@ManyToOne
	@JoinColumn(name = "fabricante")
	private Fabricante maker;
	
	/**
	 * Default constructor for Hibernate JPA beans
	 */
	public Articulo() {
		this.name = "";
		this.price = 0;
		this.maker = new Fabricante();
	}
	
	/**
	 * @param name
	 * @param price
	 */
	public Articulo(String name, int price, Fabricante maker) {
		this.name = name;
		this.price = price;
		this.maker = maker;
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
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	
	/**
	 * @return the maker
	 */
	public Fabricante getMaker() {
		return maker;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	/**
	 * @return the maker
	 */
	public void setMaker(Fabricante maker) {
		this.maker = maker;
	}
	
}
