package Task5;

import javax.swing.JOptionPane;

public class Task5App {
	/*
	 * haz una clase llamada Password que siga las siguientes condiciones:ç - que
	 * tenfa los atributos longitud y contraseña. Por defecto la longitud sera 8
	 * 
	 * -constructores:
	 * 
	 * uno por defecto, uno con la longitud que pasemos.generará una contraseña
	 * aleatoria con esas longitud
	 * 
	 * -metodos
	 * 
	 * · esFuerte() -devuelve un booleano si es fuerte o no (fuerte = mas de 2
	 * mayusculas,mas de 1 minuscula y mas de 5 numeros
	 * 
	 * · generarPassword() -genera la contraseña del objeto con la longitud que
	 * tenga
	 * 
	 * getters y setters
	 * 
	 * crea una clase ejecutable
	 * 
	 * - crea un array de Password con el tamaño que tu le indiques por teclado
	 * 
	 * - crea un bucle que cree un objeto para cada posición del array
	 * 
	 * - indica por teclado la longitud de los Passwords(antes del bucle)
	 * 
	 * - crea otro array de booleanos donde se almacene si el password del array de
	 * Password es o no fuerte(usa el bucle anterior)
	 * 
	 * al final muestra la contraseña y si es no fuerte(usa el bucle anterior). usa
	 * este simple formato
	 * 
	 * constaseña1valor_booleano1 consaseña2valor_booleanno2
	 */
	public static void main(String[] args) {
		int tamaño_array = Integer.parseInt(JOptionPane.showInputDialog("Tamaño del array de contraseñas"));

		Password contraseñas[] = new Password[tamaño_array];
		boolean seguras[] = new boolean[tamaño_array];

		for (int i = 0; i < tamaño_array; i++) {
			int tamaño_contraseña = Integer.parseInt(JOptionPane.showInputDialog("Tamaño de la contraseña " + (i + 1)));

			contraseñas[i] = new Password(tamaño_contraseña);

			if (Password.esFuerte(contraseñas[i].getContrasena())) {
				seguras[i] = true;
			} else {
				seguras[i] = false;
			}
			
			System.out.println(contraseñas[i].getContrasena() + " : " + seguras[i]);
		}

	}

}
