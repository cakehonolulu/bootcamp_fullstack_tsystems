package Task1;

public class Persona {
	private String nombre;
	private int edad;
	private double peso;
	private double altura;
	private String dni;
	private String sexo;
	
	private final String sexo_por_defecto = "hombre";

	/**
	 * @param nombre
	 * @param edad
	 * @param peso
	 * @param altura
	 * @param dni
	 * @param sexo
	 */
	public Persona(String nombre, int edad, double peso, double altura, String dni, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.dni = dni;
		this.sexo = sexo;
	}

	/**
	 * @param nombre
	 * @param edad
	 * @param sexo
	 */
	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	
}
