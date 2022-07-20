package Task6;

public class Espectador {
	
	// Nombre del espectador
	private String nombre;
	
	// Edad del espectador
	private int edad;
	
	// Dinero del espectador
	private double dinero;

	/*
	 *  Constructor por defecto para el Objeto 'Espectador'.
	 */
	public Espectador() {
		// Asignamos el nombre por defecto...
		this.nombre = "";
		
		// ...la edad por defecto...
		this.edad = 0;
		
		// ...y el dinero por defecto.
		this.dinero = 0;
	}

	/*
	 *  Constructor para el Objeto 'Espectador'.
	 *  Acepta un nombre, una edad y un valor monetario para el Espectador.
	 *  
	 *  @param	nombre	:	Nombre del espectador
	 *  @param	edad	:	Edad del espectador
	 *  @param	dinero	:	Dinero del espectador
	 */
	public Espectador(String nombre, int edad, double dinero) {
		// Asignamos el nombre...
		this.nombre = nombre;
		
		// ...la edad...
		this.edad = edad;
		
		// ...y el dinero.
		this.dinero = dinero;
	}

	/*
	 * 	'Getter' que nos devuelve el nombre del espectador
	 * 
	 * 	@return	:	El nombre del espectador
	 */
	public String getNombre() {
		return nombre;
	}

	/*
	 * 	'Getter' que nos devuelve la edad del espectador
	 * 
	 * 	@return	:	La edad del espectador
	 */
	public int getEdad() {
		return edad;
	}

	/*
	 * 	'Getter' que nos devuelve el dinero del espectador
	 * 
	 * 	@return	:	El dinero del espectador
	 */
	public double getDinero() {
		return dinero;
	}

	/*
	 * 	'Setter' que asigna un nombre al espectador
	 * 
	 * 	@param	nombre	:	Nombre del espectador
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/*
	 * 	'Setter' que asigna una edad al espectador
	 * 
	 * 	@param	edad	:	Edad del espectador
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/*
	 * 	'Setter' que asigna el valor monetario que porta el espectador
	 * 
	 * 	@param	dinero	:	Dinero del espectador
	 */
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	/*
	 *  Función .toString() modificada para dar la información necesaria sobre el espectador
	 *  
	 *  @return	:	String con la información
	 */
	@Override
	public String toString() {
		return "Espectador [nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + "]";
	}

}
