package Task5;

import java.util.Random;

public class Profesor extends Persona {

	private Materia materia;

	//Contructor por defecto
	public Profesor() {
		super();
		this.materia = Materia.sin_materia;
		setAsistencia();
	}

	//Constructor por parametros:
	//@param nombre:nombre del profesor, edad: edad del profesor,
	//sexo: sexo del profesor materia: materia que explica el profesor (enum)
	public Profesor(String nombre, int edad, String sexo, Materia materia) {
		super(nombre, edad, sexo);
		this.materia = materia;
		setAsistencia();
	}

	//Metodos get y set para materia
	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	//El profesor assistirá con un 80% de probabilidad
	@Override
	public void setAsistencia() {
		Random rng = new Random();
		int porcentaje = rng.nextInt(100);
		
		if (porcentaje > 20)
		{
			this.asistencia = true;
		}
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return super.toString() + "Profesor [materia=" + materia + "]";
	}

}
