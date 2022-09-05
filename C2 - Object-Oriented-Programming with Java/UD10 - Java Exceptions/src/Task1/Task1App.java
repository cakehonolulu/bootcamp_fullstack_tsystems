package Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1App {
	/*
	 * escribe un programa utilizando para ello el paradigma POO, que juegue con el
	 * usuario a adivinar un número. Debe cumplir los siguientes requerimientos:
	 * 
	 * - el ordenador debe generar un numero ente 1 y 500, y el usuario tiene que
	 * intentar adivinarlo
	 * 
	 * - cada vez que el usuario introduce un valor, el ordenador deve decirle al
	 * usuario si el num q tiene q adivinar es mayot o menor que el que ha
	 * introducido el usuario
	 * 
	 * - cuando consiga adivinarlo, debe indicárselo e imprimir en patalla el numero
	 * de veces que el usuario ha intentado adivinar el numero
	 * 
	 * - si el usuario introduce algo que no es un número, debe indicarlo en
	 * patalla, y contarlo como un intento indicando qye no ha conseguido reconocer
	 * la entrada lanzando una excepción InputMismatchException.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numGenerado = generarNumeroRandom();// generamos un numero
		int intentos = 0;
		int numUsuario = -1;
		do {
			System.out.println("introduce un numero: ");// pedimos al usuario un numero
			try {
				numUsuario = sc.nextInt();// recogemos el numero del usuario
				

				if (numUsuario != numGenerado) {
					ayuda(numUsuario, numGenerado);
					intentos++;
				} else {
					intentos++;
					System.out.println("has acertado el numero " + numGenerado + " en " + intentos + " intentos");
				}

			} catch (InputMismatchException e) {
				System.out.println(e);
				intentos++;

				sc.next();
			}

		} while (numUsuario != numGenerado);

	}

	/***
	 * genera un numero random
	 * 
	 * @return el numero generado
	 */
	public static int generarNumeroRandom() {
		int num = (int) (Math.random() * (10 - 1) + 1);
		return num;
	}

	/***
	 * 
	 * @param num
	 * @param numRandom
	 * 
	 *                  indica al usuario si el numero introducido es menor o mayor
	 *                  que el numero buscado
	 */
	public static void ayuda(int num, int numRandom) {
		if (num < numRandom) {
			System.out.println("el numero que buscas es mayor");
		} else if (num > numRandom) {
			System.out.println("el numero que buscas es menor");

		}
	}

}
