package Task2;
import exceptions.NewException;
public class Task2App {
	/*
	 * escribe un programa, que lanze y capture una excepción customizada. Crea para
	 * ello un package diferente que puedas reutilizar para el resto de tus
	 * proyectos.
	 * 
	 * RECOMENDACIONES
	 * 
	 * el progrma abre un bucle try{} en el que comienza mostrando un mensaje por
	 * pantalla. A continuación, crea un objeto de la clase Exception, indicando en
	 * su costructor un mensaje explicativo.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			throw new NewException();
		} catch (NewException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
