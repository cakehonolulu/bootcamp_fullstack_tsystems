package Task1;

//clase hija de Electrodomestico
public class Lavadora extends Electrodomestico {
	// atributos
	private int carga;
//constantes
	private final int PESO_CARGA = 5;

//constuctor por defecto
	public Lavadora() {
		super();
		this.carga = PESO_CARGA;
	}

//constructor con 2 parametros, resto por defecto
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = PESO_CARGA;
	}

//constructor con todos los atributos pasados por parametro
	public Lavadora(double precioBase, String color, char consumoEnerg, double peso, int carga) {
		super(precioBase, color, consumoEnerg, peso);
		this.carga = carga;
	}

//getters y setters
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public void precioFinal() {
		super.precioFinal();

		if (carga >= 30) {
			this.precioBase += 50;
		}
	}

	/***
	 * sobreescribe el metodo toString() para imprimir la información que
	 * necesitamos
	 */
	@Override
	public String toString() {
		return super.toString() + "\n └» Lavadora [carga=" + carga + "]";
	}

}
