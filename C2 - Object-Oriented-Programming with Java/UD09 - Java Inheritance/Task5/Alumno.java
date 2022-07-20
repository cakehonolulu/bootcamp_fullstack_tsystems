package Task5;

// Usaremos la API RNG de Java para calcular números aleatorios
import java.util.Random;

// Alumno hereda de Persona
public class Alumno extends Persona {
	
	// Calificación numérica de los alumnos
	private double calificación;

	/*
	 *  Este constructor nos permite asignar una nota a un alumno (Y por
	 *  consecuente, persona) con los datos por defecto de los constructores.
	 *  
	 *  @param calificación: La nota que tiene el determinado alumno
	 */
	public Alumno(double calificación) {
		// Llamada al constructor padre (Persona)
		super();
		// Asignación de calificación
		this.calificación = calificación;
		// Cálculo de asistencia
		setAsistencia();
	}

	/*
	 *  Este constructor nos permite asignar una nota a un alumno (Y por
	 *  consecuente, persona) con los datos por defecto de los constructores.
	 *  
	 *  @param nombre		: String que nos da el nombre del alumno
	 *  @param edad			: Número entero que define la edad del alumno
	 *  @param sexo			: String con el sexo del alumno
	 *  @param calificación	: La nota que tiene el determinado alumno
	 */
	public Alumno(String nombre, int edad, String sexo, double calificación) {
		// Llamada al constructor padre (Persona) con los argumentos necesarios
		super(nombre, edad, sexo);
		// Asignación de calificación
		this.calificación = calificación;
		// Cálculo de asistencia
		setAsistencia();
	}

	/*
	 *  Constructor por defecto de la clase alumno, todo por defecto.
	 */
	public Alumno() {
		// Llamada al constructor padre (Persona)
		super();
		// Asignación de calificación
		this.calificación = 0;
		// Cálculo de asistencia
		setAsistencia();
	}

	/*
	 *  'Getter' que nos devuelve la calificación del alumno.
	 *  
	 *  @return: Calificación del alumno
	 */
	public double getCalificación() {
		// Retornamos la calificación
		return calificación;
	}

	/*
	 *  'Setter' aplica una calificación al alumno.
	 *  
	 *  @param calificación	: Nota a asignar al alumno
	 */
	public void setCalificación(double calificación) {
		// Le asignamos la calificación
		this.calificación = calificación;
	}

	/*
	 *  'Setter' que calcula un porcentaje aleatorio y en función
	 *   del mismo, se decide o no si marcar la asistencia del alumno.
	 */
	@Override
	public void setAsistencia() {
		// Usaremos la libreria Random de Java
		Random rng = new Random();
		
		// Generamos un entero del 0-100 (Es el porcentaje)
		int porcentaje = rng.nextInt(100);
		
		// Si el porcentaje es > 50%, marcamos la asistencia
		if (porcentaje > 50)
		{
			// Asignamos que el alumno asiste
			this.asistencia = true;
		}
	}
	
	/*
	 *  Método .toString() modificado para mostrar la calificación del alumno
	 *
	 *  @return	: La frase final conteniendo la información de la clase
	 */
	@Override
	public String toString() {
		// Llamada a la función padre + información de esta misma clase
		return super.toString() + " Alumno [calificación=" + calificación + "]";
	}

}
