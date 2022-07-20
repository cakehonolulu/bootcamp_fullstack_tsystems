package Task1;

//clase hija de la clase Electrodomestico
public class Television extends Electrodomestico {
//atributos
	private double resolucion;
	private boolean sintonizador;

//constuctor por defecto
	public Television() {
		super();
		this.resolucion = 20;
		this.sintonizador = false;
	}

//constructor con 2 atributos pasados por parametro, resto por defecto
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		this.resolucion = 20;
		this.sintonizador = false;
	}

//constuctor con todos los atributos pasados por parametro
	public Television(double precioBase, String color, char consumoEnerg, double peso, double resolucion,
			boolean sintonizador) {
		super(precioBase, color, consumoEnerg, peso);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}

//getters y setters se todos los atributos
	public double getResolucion() {
		return resolucion;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	public void setSintonizador(boolean sintonizador) {
		this.sintonizador = sintonizador;
	}

	/***
	 * calcula el precio final en función de la resolucion
	 * 
	 */
	public void precioFinal() {
		super.precioFinal();

		if (this.resolucion >= 40) {
			this.precioBase += (this.precioBase * 0.3);
		}

		if (this.sintonizador == true) {
			this.precioBase += 50;
		}
	}

	/***
	 * sobreescribre el metodo toString() para poder imprimir la información que nos
	 * interesa, de la manera que necesitamos
	 */
	@Override
	public String toString() {
		return super.toString() + "\n └» Television [resolucion=" + resolucion + ", sintonizador=" + sintonizador + "]";
	}

}
