package Task3;

import java.util.Random;

import exceptions.RandomException;

public class Task3App {
	/*
	 * escribe un programa que genere un numero aleatorio q indique si el numero
	 * generado es par o impar. El programa utilizará para ello el lanzamiento de un
	 * excepción.
	 * 
	 * RECOMENDACIONES
	 * 
	 * el programa utiliza la clase Random() para obtener un número aleatorio entre
	 * 0 y 999 se determina si el numero es par o impar y se lanza una excepción con
	 * el correspondiente mensaje para indicarlo(se limitará a mostrar el mensaje
	 * asociado a la excepción capturada)
	 */
	public static void main(String[] args) {
		Random rn = new Random();
		String mensaje="";
		int num = rn.nextInt(999);
		try {
			if (num % 2 == 0) {
				mensaje = "par";
			} else {
				mensaje = "inpar";
			}
			throw new RandomException(mensaje);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
