package com.springer.almacenes.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Caja {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// Autoincrementable ID
	private Long id;
	
	@Column(name = "num_ref")
	private int numRef;
	
	@Column(name = "contenido")
	private String content;
	
	@Column(name = "valor")
	private int value;

	@ManyToOne
	@JoinColumn(name = "storage")
	private Almacen storage;
	
	public Caja() {
		this.numRef = 0;
		this.content = "";
		this.value = 0;
	}
	
	public Caja(Long id, int numRef, String content, int value, Almacen storage) {
		this.id = id;
		this.numRef = numRef;
		this.content = content;
		this.value = value;
		this.storage = storage;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the numRef
	 */
	public int getNumRef() {
		return numRef;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @return the storage
	 */
	public Almacen getStorage() {
		return storage;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param numRef the numRef to set
	 */
	public void setNumRef(int numRef) {
		this.numRef = numRef;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	/**
	 * @param storage the storage to set
	 */
	public void setStorage(Almacen storage) {
		this.storage = storage;
	}
	
}
