package Task6;

public class Task6App {

	/*
	 * 	Método que añade los espectadores a los objetos pertinentes
	 * 
	 * 	@param	espectadores	:	Objeto espectadores
	 * 	@param	cine			:	Objeti cine
	 */
	public static void addEspectadores(Espectador[] espectadores, Cine cine) {

		// Inicializamos las butacas a 'vacío' (False)
		for (int i = 0; i < cine.asientos.length; i++) {
			cine.asientos[i] = false;
		}

		System.out.println("Espectadores: " + espectadores.length);
	
		// Añadimos los espectadores
		for (int i = 0; i < espectadores.length; i++) {
			cine.añadeEspectador(espectadores[i], cine);
		}
		
		System.out.println("Ocupación: " + cine.getOcupacion() + "; Máximo: " + cine.asientos.length);
	}
	
	/*
	 * 	Método que nos rellena los espectadores
	 * 
	 * 	@return	:	Objeto espectadores
	 */
	public static Espectador[] rellenarEspectadores() {
		Espectador[] espectadores = {
					new Espectador("Pepito", 20, 20),
					new Espectador("Pepita", 30, 10),
					new Espectador("Juanito", 18, 10),
					new Espectador("Juanita", 16, 30),
					new Espectador("Jaimito", 30, 40),
					new Espectador("Jaimita", 31, 30),
					new Espectador("Paul", 18, 10),
					new Espectador("Alice", 16, 30),
					new Espectador("John Doe", 30, 40),
					new Espectador("Jane Doe", 31, 30)
				};
		
		return espectadores;
	}
	
	public static void main(String[] args) {
		
		// Creamos los 3 objetos necesarios
		Pelicula pelicula = new Pelicula("Anabelle", 90, 18, "pepis");
		Cine cine = new Cine(pelicula, 30, (3 * 3));
		Espectador[] espectadores = rellenarEspectadores();

		// Llamamos a los métodos pertinentes
		addEspectadores(espectadores, cine);
	}

}
