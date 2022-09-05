package com.cakehonolulu.researchers.dto;

import java.util.List;

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
@Table(name="pieces")
public class Piece {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Supplies> supplies;
	
	// Constructors
	
	/**
	 * Default constructor
	 */
	public Piece () {
		
	}

	
	/**
	 * Constructor with fields
	 * 
	 * @param id
	 * @param name
	 * @param supplies
	 */
	public Piece(Long id, String name, List<Supplies> supplies) {
		this.id = id;
		this.name = name;
		this.supplies = supplies;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @param supplies the supplies to set
	 */
	public void setSupplies(List<Supplies> supplies) {
		this.supplies = supplies;
	}
	
	/**
	 * @return the supplies
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Supplies")
	public List<Supplies> getSupplies() {
		return supplies;
	}
}