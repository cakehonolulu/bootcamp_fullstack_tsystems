package com.springer.piez_prov.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "suministran")
public class Suministra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "pieza")
	private Pieza piece;

	@ManyToOne
	@JoinColumn(name = "proveedor")
	private Proveedor provider;

	public Suministra() {
		
	}
	
	/**
	 * @param id
	 * @param piece
	 * @param provider
	 */
	public Suministra(Long id, Pieza piece, Proveedor provider) {
		super();
		this.id = id;
		this.piece = piece;
		this.provider = provider;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the piece
	 */
	public Pieza getPiece() {
		return piece;
	}

	/**
	 * @return the provider
	 */
	public Proveedor getProvider() {
		return provider;
	}

	/**
	 * @param piece the piece to set
	 */
	public void setPiece(Pieza piece) {
		this.piece = piece;
	}

	/**
	 * @param provider the provider to set
	 */
	public void setProvider(Proveedor provider) {
		this.provider = provider;
	}
	
	
}
