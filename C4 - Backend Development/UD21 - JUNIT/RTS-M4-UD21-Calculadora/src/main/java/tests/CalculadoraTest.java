package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import logic.Calculadora;
import model.Moneda;

class CalculadoraTest {

	Calculadora calculator = new Calculadora(0.0, 0, 1);
	Moneda[] currencies = { new Moneda(1.0, "Dollar", "US", "USD", '$'),
						    new Moneda(0.9777, "Euro", "Europe", "EUR", '€')};

	@Test
	public void testGetterMoneda() {
		assertEquals(currencies[0].getValor(), 1.0);
		assertEquals(currencies[0].getNombre(), "Dollar");
		assertEquals(currencies[0].getLugar(), "US");
		assertEquals(currencies[0].getAbrev(), "USD");
		assertEquals(currencies[0].getSimbolo(), '$');
		assertEquals(currencies[0].toString(), ("US - Dollar"));
		
		assertEquals(currencies[1].getValor(), 0.9777);
		assertEquals(currencies[1].getNombre(), "Euro");
		assertEquals(currencies[1].getLugar(), "Europe");
		assertEquals(currencies[1].getAbrev(), "EUR");
		assertEquals(currencies[1].getSimbolo(), '€');
		assertEquals(currencies[1].toString(), ("Europe - Euro"));
	}
	
	@Test
	public void testGettersCalculadora() {
		assertEquals(calculator.getValorOrigen(), 0.0);
		assertEquals(calculator.getValorFinal(), calculator.getValorOrigen() * (calculator.getMonedaFinal().getValor() / calculator.getMonedaOrigen().getValor()));
		assertEquals(calculator.getRatio(), (calculator.getMonedaFinal().getValor() / calculator.getMonedaOrigen().getValor()));
		assertEquals(calculator.getMonedasString(), "[US - Dollar, Europe - Euro]");
		
		// Both coming tests also test the ArrayList <Monedas> getter
		assertEquals(calculator.getMonedaOrigen(), calculator.getMonedas().get(0));
		assertEquals(calculator.getMonedaFinal(), calculator.getMonedas().get(1));
	}

	@Test
	public void testSettersCalculadora() {
		calculator.setValorOrigen(13.37);
		assertEquals(calculator.getValorOrigen(), 13.37);
		
		calculator.setMonedaOrigen(new Moneda(0.0, "A", "B", "C", 'D'));
		assertEquals(calculator.getMonedaOrigen().getValor(), 0.0);
		assertEquals(calculator.getMonedaOrigen().getNombre(), "A");
		assertEquals(calculator.getMonedaOrigen().getLugar(), "B");
		assertEquals(calculator.getMonedaOrigen().getAbrev(), "C");
		assertEquals(calculator.getMonedaOrigen().getSimbolo(), 'D');
		assertEquals(calculator.getMonedaOrigen().toString(), ("B - A"));
		
		calculator.setMonedaFinal(new Moneda(10.0, "E", "F", "G", 'H'));
		assertEquals(calculator.getMonedaFinal().getValor(), 10.0);
		assertEquals(calculator.getMonedaFinal().getNombre(), "E");
		assertEquals(calculator.getMonedaFinal().getLugar(), "F");
		assertEquals(calculator.getMonedaFinal().getAbrev(), "G");
		assertEquals(calculator.getMonedaFinal().getSimbolo(), 'H');
		assertEquals(calculator.getMonedaFinal().toString(), ("F - E"));		
	}
	
	@Test
	public void testactualizarValorOrigen() {
		assertEquals(calculator.calcularRatio(), 0.9777);
		assertEquals(calculator.calcularMonedaFinal(), 0.0);
		assertEquals(calculator.voTieneDecimales(), false);
		assertEquals(!calculator.voTieneDecimales(), true);
		assertEquals(calculator.ratioToString(), "1 USD = 0.98 EUR");
	}

	// He intentado hacer los test de actualizarValorOrigen ni de voTieneDecimales (el true)
	// El window builder ha sido imposible, he preguntado tambien a otro team y tampoco han sabido como hacerlo
	
}