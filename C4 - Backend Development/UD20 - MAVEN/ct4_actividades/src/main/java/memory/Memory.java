package memory;

import java.util.ArrayList;
import java.util.Collections;

public class Memory {

	private ArrayList<Casilla> casillas = new ArrayList<Casilla>();
	private ArrayList<Carta> cartas = new ArrayList<Carta>();

	public Memory() {
		generarCartas();
		generarCasillas();
	}
	
	/**
	 * Creates all the cards
	 */
	private void generarCartas() {
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<8; j++) {
				cartas.add(new Carta(j, "images/memoryP" + j + ".png"));
			}
		}
	}
	
	
	/**
	 * Creates all the squares
	 */
	private void generarCasillas() {
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<8; j++) {
				casillas.add(new Casilla(cartas.get(j)));
			}
		}
		
		Collections.shuffle(casillas);
	}

	public ArrayList<Casilla> getCasillas() {
		return casillas;
	}
	
	
}
