package logic;

import java.util.ArrayList;

import model.Moneda;

public class Calculadora {

	private Double valorOrigen;
	
	private Moneda monedaOrigen;
	
	private Double valorFinal;
	
	private Moneda monedaFinal;
	
	private Double ratio;
	
	private ArrayList <Moneda> monedas = new ArrayList<>();

	private int decimales = 0;
	
	public Calculadora(Double valorOrigen, int monedaOrigen, int monedaFinal) {
		llenarMonedas();
		this.valorOrigen = valorOrigen;
		this.monedaOrigen = monedas.get(0);
		this.monedaFinal = monedas.get(1);
		
		actualizarCalculadora();
	}


	public Double calcularRatio() {
		
		return monedaFinal.getValor() / monedaOrigen.getValor();
	}

	public Double calcularMonedaFinal() {
		
		return valorOrigen * ratio;
	}
	
	public void actualizarCalculadora() {
		ratio = calcularRatio();
		valorFinal = calcularMonedaFinal();
	}
	
	private void llenarMonedas() {
		
		monedas.add(new Moneda(1.0, "Dollar", "US", "USD", '$'));
		monedas.add(new Moneda(0.9777, "Euro", "Europe", "EUR", '€'));
		
	}
	
	public void actualizarValorOrigen(int tecla) {
		if(decimales == 0) {
			valorOrigen = valorOrigen * 10 + tecla;
		}else if(decimales == 1){
				valorOrigen = valorOrigen + tecla*0.1;
				decimales++;
		}else if(decimales == 2) {
			valorOrigen = valorOrigen + tecla*0.01;
			decimales++;
		}else {
			//NO ACTUALIZA
		}
		actualizarCalculadora();
	}
	
	public boolean voTieneDecimales() {
		if(valorOrigen % 1 == 0) 
			return false;
		else
			return true;
	}
	
	public String ratioToString() {
		
		return "1 " + monedaOrigen.getAbrev() + " = " + String.format("%.2f", ratio) + " " + monedaFinal.getAbrev();
	}
	
	/*
	 * GETTERS
	 */
	public Double getValorOrigen() {
		return valorOrigen;
	}
	
	public Double getValorFinal() {
		return valorFinal;
	}


	public Double getRatio() {
		return ratio;
	}


	public String getMonedasString() {
		return monedas.toString();
	}
	
	public ArrayList <Moneda> getMonedas() {
		return monedas;
		
	}

	public Moneda getMonedaOrigen() {
		return monedaOrigen;
	}


	public Moneda getMonedaFinal() {
		return monedaFinal;
	}


	public int getDecimales() {
		return decimales;
	}




	/*
	 * SETTERS
	 */
	public void setValorOrigen(Double valorOrigen) {
		this.valorOrigen = valorOrigen;
		actualizarCalculadora();
	}


	public void setMonedaOrigen(Moneda monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
		actualizarCalculadora();
	}


	public void setMonedaFinal(Moneda monedaFinal) {
		this.monedaFinal = monedaFinal;
		actualizarCalculadora();
	}
	

	public void setDecimales(int decimales) {
		this.decimales = decimales;
	}
	
	
}
