package memory;

public class Casilla {
	private Carta carta;
	
	byte activas = 0;
	
	public Casilla(Carta carta) {
		this.carta = carta;
	}

	public Carta getCarta() {
		return carta;
	}

	
	/**
	 * Compares 2 casillas
	 * @param c Square to compare
	 * @return True if the squares have the same card
	 */
	public boolean compararCasilla(Casilla c) {
		
		return c.getCarta().equals(this.carta);
	}
	
}
