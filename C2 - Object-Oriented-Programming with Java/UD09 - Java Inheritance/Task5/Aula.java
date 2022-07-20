package Task5;

// Usaremos la API para Arrays de Java
import java.util.Arrays;

public class Aula {
	// La aula contiene un ID numérico...
	int id;
	
	// ...número máximo de personas...
	int maxEst;
	
	// ...tipo de materia a impartir...
	Materia materia;
	
	// ...lista de alumnos...
	Alumno alumnos[];
	
	// ...y profesor designado
	Profesor profesor;

	/*
	 *  Este constructor nos permite crear una aula con una serie de parámetros que
	 *  nosotros le podemos pasar al mismo.
	 *  
	 *  @param id		: ID numérico de la aula
	 *  @param maxEst	: Número máximo de alumnos en esta aula
	 *  @param materia	: Enumeración con el tipo de materia a impartir en este aula
	 *  @param profesor	: El Profesor designado a esta aula
	 *  @param alumnos	: Los alumnos designados a esta aula
	 */
	public Aula(int id, int maxEst, Materia materia, Profesor profesor, Alumno alumnos[]) {
		// Asignamos el ID...
		this.id = id;
		
		// ...el alumnado máximo permitido...
		this.maxEst = maxEst;
		
		// ...la materia a impartir...
		this.materia = materia;
		
		// ...el profesor...
		this.profesor = profesor;
		
		// ...y los alumnos, mediante los parámetros del constructor.
		this.alumnos = alumnos;
	}

	/*
	 *  Este constructor nos permite crear una aula por defecto.
	 */
	public Aula() {
		// Asignamos el ID...
		this.id = 0;
		
		// ...el alumnado máximo permitido...
		this.maxEst = 0;
		
		// ...la materia a impartir...
		this.materia = Materia.sin_materia;
		
		// ...el profesor...
		this.profesor = null;
		
		// ...y los alumnos, con una serie de parámetros por defecto.
		this.alumnos = null;
	}

	/*
	 *  'Getter' que nos devuelve los alumnos asignados al aula.
	 *  
	 *  @return	: Los alumnos del aula
	 */
	public Alumno[] getAlumnos() {
		// Retorna los alumnos
		return alumnos;
	}

	/*
	 *  'Getter' que nos devuelve el profesor asignado al aula.
	 */
	public Profesor getProfesor() {
		// Retorna el profesor
		return profesor;
	}

	/*
	 *  'Setter' que nos permite asignar alumnos al aula.
	 *  
	 *  @param alumnos	: Los alumnos del aula
	 */
	public void setAlumnos(Alumno[] alumnos) {
		// Asigna los alumnos al aula
		this.alumnos = alumnos;
	}

	/*
	 *  'Setter' que nos permite asignar al profesor(a) en el aula.
	 *  
	 *   @param	profesor	: El profesor del aula
	 */
	public void setProfesor(Profesor profesor) {
		// Asigna el profesor al aula
		this.profesor = profesor;
	}

	/*
	 *  'Getter' que nos devuelve el ID del aula
	 *  
	 *  @return	: El ID del aula
	 */  
	public int getId() {
		// Retorna el ID del aula
		return id;
	}

	/*
	 *  'Getter' que nos devuelve el alumnado máximo permitido por aula
	 *  
	 *  @return	: El alumnado máximo permitido por aula
	 */  
	public int getMaxEst() {
		// Retorna el alumnado máximo permitido por aula
		return maxEst;
	}

	/*
	 *  'Setter' que nos permite asignar el ID del aula
	 *  
	 *  @param id	: El ID del aula
	 */
	public void setId(int id) {
		// Asigna el ID al aula
		this.id = id;
	}

	/*
	 *  'Setter' que nos permite asignar los alumnos máximos asignados al aula
	 *  
	 *  @param maxEst	: Los alumnos máximos en el aula
	 */
	public void setMaxEst(int maxEst) {
		// Asignamos el valor
		this.maxEst = maxEst;
	}

	/*
	 *  'Getter' que nos devuelve la materia del aula
	 *  
	 *  @return	: La materia del aula
	 */
	public Materia getMateria() {
		// Retorna la materia del aula
		return materia;
	}

	/*
	 *  'Setter' que le asigna al aula una materia
	 *  
	 *  @param materia	: La materia del aula
	 */
	public void setMateria(Materia materia) {
		// Asigna una determinada materia a la materia de la aula
		this.materia = materia;
	}

	/*
	 *  Función que dictamina si se puede o no dar clase en una determinada aula.
	 *  
	 *  Se realiza un patrón de comprovaciones para informar al usuario en todo momento
	 *  de el resultado (Sea negativo o positivo) del análisis de disponibilidad.
	 */
	public void sePuedeDarClase() {
		// Comprobamos si el profesor puede asistir
		if (this.getProfesor().getAsistencia() == false) {
			System.out.println("la clase no se puede dar, ya que el profesor no puede asistir");
		// Comprobamos si la materia a impartir puede impartirla este profesor
		} else if (!(this.getMateria().equals(this.getProfesor().getMateria()))) {
			System.out.println("la clase no se puede dar, ya que el profesor no da la materia del aula");
		// Comprobamos si el aforo del aula supera el 50%
		} else if (alumnosPresentes() < (this.getMaxEst() / 2)) {
			System.out.println("la clase no se puede dar, ya que el numero de alumnos en inferior al 50% del aula");

		} else {
			// Mostramos los alumnos aprobados...
			System.out.println("ALUMNOS APROBADOS: ");

			for (int i = 0; i < alumnos.length; i++) {
				if (alumnos[i].getCalificación() >= 5) {
					System.out.println(alumnos[i].toString());
				}
			}

			// ...y todos los presentes.
			System.out.println("ALUMNOS PRESENTES EN LA CLASE: ");
			
			for (int i = 0; i < alumnos.length; i++) {
				if (alumnos[i].getAsistencia() == true) {
					System.out.println(alumnos[i].toString());
				}
			}
		}

	}

	/*
	 *  Función que nos retorna el número de alumnos presentes en el aula.
	 *  
	 *  @return	: El número total de alumnos presentes en el aula
	 */
	public int alumnosPresentes() {
		int presentes = 0;

		for (int i = 0; i < this.alumnos.length; i++) {
			if (alumnos[i].getAsistencia() == true) {
				presentes++;

			}
		}
		return presentes;
	}

	/*
	 *  Método .toString() modificado para mostrar la información del aula
	 *  
	 *  @return	: La frase final conteniendo la información de la clase
	 */
	@Override
	public String toString() {
		return "Aula [id=" + id + ", maxEst=" + maxEst + ", materia=" + materia + ", alumnos="
				+ Arrays.toString(alumnos) + ", profesor=" + profesor + "]";
	}

}
