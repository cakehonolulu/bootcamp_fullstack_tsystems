package Task5;

abstract class Persona {
	/***
	 * declaración de atributos
	 */
	String nombre;
	int edad;
	String sexo;
	boolean asistencia;

	/***
	 * constructor por defecto
	 */
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = "";
		this.asistencia = false;
	}

	/***
	 * constructor con todos los atributos
	 * 
	 * @param nombre
	 * @param edad
	 * @param sexo
	 */
	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	/***
	 * 
	 * getters y setters de todos los atributos
	 */
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getSexo() {
		return sexo;
	}

	public boolean getAsistencia() {
		return asistencia;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/***
	 * def metodo
	 */
	public void setAsistencia() {
		/*
		 * Dummy function
		 * 
		 * Each inherited class will treat the attendance differently.
		 * 
		 * Leave it as it.
		 */
	}

	/***
	 * imprime el objeto Persona con los valores de todos sus atributos
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", asistencia=" + asistencia + "]";
	}

}
