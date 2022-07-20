package Task4;

public class Task4App {

	public static void main(String[] args) {
//		Se crea el objeto equacion asignandole los atributos
		Raices equacion = new Raices(5, -20, 15);
//		Ejecutamos el metodo para ver la solucion de la equacion
		verSolucionesEquacion(equacion);
	}

	public static void verSolucionesEquacion(Raices equacion) {
//		Si la equacion tiene dos raizes como resultado obtendra las 2 raizes,
//		si solo tiene una raiz como resultado solo mostrará 1 raiz
		if (equacion.tieneRaices()) {
			equacion.obtenerRaices();
		} else if (equacion.tieneRaiz()) {
			equacion.obtenerRaiz();
		}

		equacion.calcular();
	}

}
