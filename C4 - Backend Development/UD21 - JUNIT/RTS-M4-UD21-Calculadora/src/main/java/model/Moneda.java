package model;

public class Moneda {

	private Double valor;
	private String nombre;
	private String lugar;
	private String abrev;
	private char simbolo;
	
	public Moneda(Double valor, String nombre, String lugar, String abrev, char simbolo) {
		this.valor = valor;
		this.nombre = nombre;
		this.lugar = lugar;
		this.abrev = abrev;
		this.simbolo = simbolo;
	}

	public Double getValor() {
		return valor;
	}


	public String getNombre() {
		return nombre;
	}

	public String getLugar() {
		return lugar;
	}
	
	public String getAbrev() {
		return abrev;
	}

	public char getSimbolo() {
		return simbolo;
	}
	
	@Override
	public String toString() {
		return lugar + " - " + nombre;
	}

	

}
