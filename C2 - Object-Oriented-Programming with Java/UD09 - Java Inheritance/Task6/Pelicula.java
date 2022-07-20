package Task6;

public class Pelicula {
	
	// Nombre de la pelicula
	private String titulo;
	
	// Duración de la película
	private double duracion;
	
	// Edad mínima válida para visualizar la película
	private int edadMimina;
	
	// Nombre del director de la película
	private String director;

	/*
	 *  Constructor por defecto para el Objeto 'Película'.
	 */
	public Pelicula() {
		// Asignamos un título por defecto...
		this.titulo = "";
		
		// ...una duración por defecto...
		this.duracion = 0;
		
		// ...una edad mínima por defecto...
		this.edadMimina = 0;
		
		// ...y un director por defecto.
		this.director = "";
	}

	/*
	 *  Constructor para el Objeto 'Pelicula'.
	 *  Acepta un título, una duración, una edad mínima apta y un nombre del director para el Objeto 'Película'.
	 *  
	 *  @param	titulo		:	Nombre de la película
	 *  @param	duracion	:	Duración de la película
	 *  @param	edadMimina	:	Edad mínima apta para visualizar la película
	 *  @param	director	:	Nombre del director de la película
	 */
	public Pelicula(String titulo, double duracion, int edadMimina, String director) {
		// Asignamos el título...
		this.titulo = titulo;
		
		// ...la duración...
		this.duracion = duracion;
		
		// ...la edad mínima apta para ver la película...
		this.edadMimina = edadMimina;
		
		// ...y el nombre del director.
		this.director = director;
	}

	/*
	 * 	'Getter' que nos devuelve el nombre de la película.
	 * 
	 * 	@return	:	El nombre de la película
	 */
	public String getTitulo() {
		return titulo;
	}

	/*
	 * 	'Getter' que nos devuelve la duración de la película.
	 * 
	 * 	@return	:	La duración de la película
	 */
	public double getDuracion() {
		return duracion;
	}

	/*
	 * 	'Getter' que nos devuelve la edad mínima para ver la película.
	 * 
	 * 	@return	:	La edad mínima para ver la película
	 */
	public int getEdadMimina() {
		return edadMimina;
	}

	/*
	 * 	'Getter' que nos devuelve el nombre del director de la película.
	 * 
	 * 	@return	:	El nombre del director de la película
	 */
	public String getDirector() {
		return director;
	}

	/*
	 * 	'Setter' que asigna un título a la película
	 * 
	 * 	@param	titulo	:	Título de la película
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/*
	 * 	'Setter' que asigna una duración a la película
	 * 
	 * 	@param	duracion	:	Duración de la película
	 */
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	/*
	 * 	'Setter' que asigna una edad mínima a la película
	 * 
	 * 	@param	edadMimina	:	Edad mínima de la película
	 */
	public void setEdadMimina(int edadMimina) {
		this.edadMimina = edadMimina;
	}

	/*
	 * 	'Setter' que asigna un nombre del director de la película
	 * 
	 * 	@param	director	:	Un nombre del director de la película
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/*
	 *  Función .toString() modificada para dar la información necesaria sobre el espectador
	 *  
	 *  @return	:	String con la información
	 */
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", duracion=" + duracion + ", edadMimina=" + edadMimina + ", director="
				+ director + "]";
	}

}
