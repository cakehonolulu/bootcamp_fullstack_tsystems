package com.cakehonolulu.researchers.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="supplies")
public class Supplies {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	private double price;
	
	@ManyToOne
	@JoinColumn(name="id_piece")
	private Piece piece;
	
	@ManyToOne
	@JoinColumn(name="id_provider")
	private Provider provider;
	
	
	//Constructors
	
	/**
	 * Default constructor
	 */
	public Supplies () {
		
	}

	/**
	 * Constructor with fields
	 * 
	 * @param id
	 * @param price
	 * @param piece
	 * @param provider
	 */
	public Supplies(Long id, double price, Piece piece, Provider provider) {
		this.id = id;
		this.price = price;
		this.piece = piece;
		this.provider = provider;
	}


	// Getters and setters
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the piece
	 */
	public Piece getPiece() {
		return piece;
	}

	/**
	 * @param piece the piece to set
	 */
	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	/**
	 * @return the provider
	 */
	public Provider getProvider() {
		return provider;
	}

	/**
	 * @param provider the provider to set
	 */
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
}
