package Task6;

import java.util.Random;

public class Cine {

	// Objeto película
	private Pelicula pelicula;
	
	// Precio por entrada
	private double precio;
	
	// Matriz donde asignar a los espectadores de manera aleatoria
	boolean asientos[];
	
	// Máximo de espectadores por cine
	private Integer ocupacion;

	/*
	 *  Constructor para el Objeto 'Cine'.
	 *  Acepta un Objeto 'Película', el precio de la anterior y la medida de la sala (En butacas).
	 *  
	 *  @param	pelicula	:	Objeto con información sobre la película a proyectar
	 *  @param	precio		:	Precio por espectador para ver la película
	 *  @param	medida		:	Medida del Cine en butacas
	 */
	public Cine(Pelicula pelicula, double precio, Integer medida) {
		// Asignamos la película...
		this.pelicula = pelicula;
		
		// ...el precio...
		this.precio = precio;
		
		// ...el número de asientos...
		this.asientos = new boolean[medida];
		
		// ...y el número de ocupación actual.
		this.ocupacion = 0;
	}

	/*
	 *  Constructor por defecto para el Objeto 'Cine'.
	 */
	public Cine() {
		// Asignamos la película por defecto...
		this.pelicula = new Pelicula();
		
		// ...un precio por defecto...
		this.precio = 0;

		// ...el número de asientos por defecto...
		this.asientos = new boolean[1];
		
		// ...y el número de ocupación actual.
		this.ocupacion = 0;
	}

	/*
	 * 	'Getter' que nos devuelve la película a proyectar
	 * 
	 * 	@return	:	Objeto 'Pelicula'
	 */
	public Pelicula getPelicula() {
		return pelicula;
	}

	/*
	 * 	'Getter' que nos devuelve el precio por entrada
	 * 
	 * 	@return	:	El precio por entrada
	 */
	public double getPrecio() {
		return precio;
	}

	/*
	 * 	'Getter' que nos devuelve la ocupación del cine actual
	 * 
	 * 	@return	:	La ocupación del cine actual
	 */
	public Integer getOcupacion() {
		return ocupacion;
	}

	/*
	 * 	'Getter' que nos devuelve el total de butacas del cine
	 * 
	 * 	@return	:	El total de butacas del cine
	 */
	public Integer getCineSize() {
		return this.asientos.length;
	}

	/*
	 * 	'Setter' que asigna una película al cine
	 * 
	 * 	@param	pelicula	:	Pelicula a visualizar en el cine
	 */
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	/*
	 * 	'Setter' que asigna el precio por entrada
	 * 
	 * 	@param	precio	:	El precio por entrada
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/*
	 * 	'Setter' que asigna la ocupación del cine
	 * 
	 * 	@param	ocupacion	:	La ocupación del cine
	 */
	public void setOcupacion(Integer ocupacion) {
		this.ocupacion = ocupacion;
	}

	/*
	 * 	'Setter' que asigna el total de butacas del cine
	 * 
	 * 	@param	medida	:	El total de butacas del cine
	 */
	public void setCineSize(Integer medida) {
		this.asientos = new boolean[medida];
	}

	/*
	 *  Función que añade espectadores en función de el cumplimiento de
	 *  una serie de condiciones que permiten o no la entrada al mismo.
	 *  
	 *  Se añaden 1 por 1 de forma aleatoria en el mismo.
	 *  
	 *  @param	espectadores	:	Espectador a añadir
	 *  @param	cine			:	Cine donde añadir el espectador
	 */
	public void añadeEspectador(Espectador espectadores, Cine cine) {
		// Usaremos la API Random() de Java
		Random numeroAleatorio = new Random();
		
		// Número entero aleatorio
		Integer numero;
		
		// Condicional para el bucle
		boolean m_cond = true;

		// Comprobar que aún caben espectadores
		if (this.getOcupacion() < cine.asientos.length) {
			// Comprobar que la edad del espectador es apta para la película
			if (espectadores.getEdad() >= this.getPelicula().getEdadMimina()) {
				// Comprobar que el espectador tiene dinero para pagar el ticket
				if (espectadores.getDinero() >= this.getPrecio()) {
					
					// Genera números aleatorios hasta dar con una butaca vacía
					do {
						numero = numeroAleatorio.nextInt(9);

						// Si está vacía, ya tenemos dónde sentar al espectador
						if (cine.asientos[numero] != true) {
							m_cond = false;
						}
						
					} while (m_cond);

					// Sentamos al espectador en la butaca vacía
					cine.asientos[numero] = true;

					// Incrementamos la ocupación actual del cine
					this.setOcupacion((this.getOcupacion() + 1));
				} else {
					System.out.println(espectadores.getNombre() + " no puede pagar la entrada, tiene "
							+ espectadores.getDinero() + "€ pero la entrada value " + this.getPrecio() + "€");
				}
			} else {
				System.out.println(espectadores.getNombre() + " no supera la edad mínima de "
						+ this.getPelicula().getEdadMimina() + "; tiene " + espectadores.getEdad() + " años.");
			}
		} else {
			System.out.println("El cine está lleno, no se puede añadir otro espectador.");
		}
	}

	/*
	 *  Función .toString() modificada para dar la información necesaria sobre el cine
	 *  
	 *  @return	:	String con la información
	 */
	@Override
	public String toString() {
		return "Cine [pelicula=" + pelicula + ", precio=" + precio + "]";
	}

}
