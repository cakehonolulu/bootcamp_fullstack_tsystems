package Task5;

public class Task5App {

	public static void main(String[] args) {
		// Arrays de profesores y alumnos
		Profesor profesores[] = llenarAarrayConProfesores();
		Alumno alumnos[] = llenarArrayConAlumnos();
		Alumno alumnos_2[] = llenarArrayConAlumnosDiferentes();// solo para hacer pruebas con diferenes posibilidades

		// Creacion del aula
		Aula aula = new Aula(1, 5, Materia.filosofia, profesores[2], alumnos);

		// Comprobación si se puede dar la clase
		aula.sePuedeDarClase();
	}

	/***
	 * 
	 * @return array con objetos tipo Profesor
	 */
	public static Profesor[] llenarAarrayConProfesores() {
		Profesor profesores[] = { new Profesor("Pepito", 40, "hombre", Materia.matematicas),
				new Profesor("Ana", 35, "mujer", Materia.fisica), new Profesor("Nate", 28, "n/b", Materia.filosofia),
				new Profesor("Pepita", 47, "mujer", Materia.sin_materia),
				new Profesor("Jose", 35, "hombre", Materia.matematicas),
				new Profesor("Josepa", 40, "mujer", Materia.sin_materia) };
		return profesores;
	}

	public static Alumno[] llenarArrayConAlumnos() {
		Alumno alumnos[] = { new Alumno("Pepito1", 15, "hombre", 8), new Alumno("Ana1", 16, "mujer", 5),
				new Alumno("Nate1", 15, "n/b", 2), new Alumno("Pepita1", 15, "mujer", 6),
				new Alumno("Jose1", 16, "hombre", 7), new Alumno("Josepa1", 15, "mujer", 3) };
		return alumnos;
	}

	public static Alumno[] llenarArrayConAlumnosDiferentes() {
		Alumno alumnos_2[] = { new Alumno("Pepito2", 15, "hombre", 2), new Alumno("Ana2", 16, "mujer", 5),
				new Alumno("Nate2", 15, "n/b", 6), new Alumno("Pepita2", 15, "mujer", 6),
				new Alumno("Jose2", 16, "hombre", 5), new Alumno("Josepa2", 15, "mujer", 2) };
		return alumnos_2;
	}
}
