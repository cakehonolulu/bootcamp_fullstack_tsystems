package Task4;

public class Raices {
	// atributos
	private double a;
	private double b;
	private double c;

	// constructor
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/***
	 * 
	 * @return el discriminante
	 */
	public double getDiscriminante() {
		double discriminante = Math.pow(this.b, 2) - 4 * this.a * this.c;
		return discriminante;
	}

	/***
	 * 
	 * @return true si tiene 2 soluciones
	 */
	public boolean tieneRaices() {
		if (this.getDiscriminante() >= 0) {
			return true;
		} else {
			return false;
		}
	}

	/***
	 * 
	 * @return true si tiene una solución
	 */
	public boolean tieneRaiz() {
		if (this.getDiscriminante() == 0) {
			return true;
		} else {
			return false;
		}
	}

	/***
	 * calcula y muestra las posibles soluciones
	 */
	public void calcular() {
		double suma = (-b + (Math.sqrt(Math.pow(b, 2) - (4 * this.a * this.c)))) / (2 * this.a);
		double resta = (-b - (Math.sqrt(Math.pow(b, 2) - (4 * this.a * this.c)))) / (2 * this.a);

		if (this.getDiscriminante() < 0) {// uno tiene solucion
			System.out.println("No tiene solucion");
		} else if (this.getDiscriminante() == 0) {// una soluciones
			System.out.println("La solución es " + suma);
		} else {
			System.out.println("Las soluciones son : " + suma + " y: " + resta);
		}

	}

	/***
	 * calcula y muestra las 2 soluciones
	 */
	public void obtenerRaices() {
		double primeraSolucion = (-b + (Math.sqrt(Math.pow(b, 2) - (4 * this.a * this.c)))) / (2 * this.a);
		double segundaSolucion = (-b - (Math.sqrt(Math.pow(b, 2) - (4 * this.a * this.c)))) / (2 * this.a);
		System.out.println("x1: " + primeraSolucion + " x2: " + segundaSolucion);
	}

	/***
	 * calcula y muestra la solucion
	 */
	public void obtenerRaiz() {
		double solucionUnica = (-b + (Math.sqrt(Math.pow(b, 2) - (4 * this.a * this.c)))) / (2 * this.a);
		System.out.println("x: " + solucionUnica);
	}

}
