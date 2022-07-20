package Task3;

public class Electrodomestico {

	public String colores[] = new String[] { "blanco", "negro", "rojo", "azul", "gris" };
	public char consumos[] = new char[] { 'A', 'B', 'C', 'D', 'E', 'F' };

	private final String COLOR = colores[0];
	private final char CONSUMO = consumos[1];
	private final double PRECIO_BASE = 100;
	private final double PESO = 5;
	
	protected double precioBase;
	protected String color;
	protected char consumoEnerg;
	protected double peso;
	
	public Electrodomestico() {
		this.precioBase = PRECIO_BASE;
		this.color = COLOR;
		this.consumoEnerg = CONSUMO;
		this.peso = PESO;
	}
	
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR;
		this.consumoEnerg = CONSUMO;
		this.peso = peso;
	}
	
	public Electrodomestico(double precioBase, String color, char consumoEnerg, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnerg = consumoEnerg;
		this.peso = peso;
	}
}
