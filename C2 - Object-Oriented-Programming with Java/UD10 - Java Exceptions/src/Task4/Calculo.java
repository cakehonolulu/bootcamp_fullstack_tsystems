package Task4;

import javax.swing.JOptionPane;

public class Calculo {

	public static void operacion() {
		int opcion = 0;
		try {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"que operación quiere realizar? \n1 - suma\n2 - resta\n3 - multiplicación\n4 - división\n5 - potencia\n6 - raíz cuadrada\n7 - raíz cubica"));
		} catch (NumberFormatException e) {
			System.out.println("introduce un numero!");
		}
		switch (opcion) {
		case 1:
			suma();
			break;
		case 2:
			resta();
			break;
		case 3:
			multiplica();
			break;
		case 4:
			divide();
			break;
		case 5:
			potencia();
			break;
		case 6:
			raizCuadrada();
			break;
		case 7:
			raizCubica();
			break;
		default:
			JOptionPane.showMessageDialog(null, "la opción introducida no es correcta");
			break;
		}
	}

	public static void suma() {
		double num1 = 0;
		double num2 = 0;
		double resultado = 0;
		try {
			num1 = Double.parseDouble(JOptionPane.showInputDialog("introduce el primer numero: "));
		} catch (NumberFormatException e) {
			System.out.println("introduce un numero!");
		}
		try {
			num2 = Double.parseDouble(JOptionPane.showInputDialog("introduce el segundo numero: "));
		} catch (NumberFormatException e) {
			System.out.println("introduce un numero!");
		}
		resultado = num1 + num2;
		JOptionPane.showMessageDialog(null, "la suma de " + num1 + " y " + num2 + " es " + resultado);

	}

	public static void resta() {
		double num1 = 0;
		double num2 = 0;
		double resultado = 0;
		try {
			num1 = Double.parseDouble(JOptionPane.showInputDialog("introduce el primer numero: "));
		} catch (NumberFormatException e) {
			System.out.println("introduce un numero!");
		}
		try {
			num2 = Double.parseDouble(JOptionPane.showInputDialog("introduce el segundo numero: "));
		} catch (NumberFormatException e) {
			System.out.println("introduce un numero!");
		}
		resultado = num1 - num2;
		JOptionPane.showMessageDialog(null, "la resta de " + num1 + " menos " + num2 + " es " + resultado);

	}

	public static void multiplica() {
		double num1 = 0;
		double num2 = 0;
		double resultado = 0;
		try {
			num1 = Double.parseDouble(JOptionPane.showInputDialog("introduce el primer numero: "));
		} catch (NumberFormatException e) {
			System.out.println("introduce un numero!");
		}
		try {
			num2 = Double.parseDouble(JOptionPane.showInputDialog("introduce el segundo numero: "));
		} catch (NumberFormatException e) {
			System.out.println("introduce un numero!");
		}
		resultado = num1 * num2;
		JOptionPane.showMessageDialog(null, "la multiplicación de " + num1 + " y " + num2 + " es " + resultado);

	}

	public static void divide() {
		double num1 = 0;
		double num2 = 0;
		double resultado = 0;
		
		try {
			num1 = Double.parseDouble(JOptionPane.showInputDialog("introduce el primer numero: "));
		} catch (NumberFormatException e) {
			System.out.println("introduce un numero!");
		}
		
		try {
			num2 = Double.parseDouble(JOptionPane.showInputDialog("introduce el segundo numero: "));
		} catch (NumberFormatException e) {
			System.out.println("introduce un numero!");
		}
		
		try {
			resultado = num1 / num2;
			
			if (resultado == Double.POSITIVE_INFINITY ||
					resultado == Double.NEGATIVE_INFINITY ||
					resultado == Double.NaN)
                throw new ArithmeticException();

			JOptionPane.showMessageDialog(null, "la división de " + num1 + " entre " + num2 + " es " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Error! Resultado de la división no definido");
		}
		

	}

	public static void potencia() {
		double num1 = 0;
		double num2 = 0;
		double resultado = 0;
		try {
			num1 = Double.parseDouble(JOptionPane.showInputDialog("introduce el numero que quieres elevar: "));
		} catch (NumberFormatException e) {
			System.out.println("introduce un numero!");
		}
		try {
			num2 = Double.parseDouble(JOptionPane.showInputDialog("introduce la potencia a la que quieres elevar: "));
		} catch (NumberFormatException e) {
			System.out.println("introduce un numero!");
		}
		resultado = Math.pow(num1, num2);
		JOptionPane.showMessageDialog(null, num1 + " elevado a " + num2 + " es " + resultado);

	}

	public static void raizCuadrada() {
		double num1 = 0;
		double resultado = 0;
		try {
			num1 = Double.parseDouble(JOptionPane.showInputDialog("introduce el numero para saber su raís cuadrada: "));
		} catch (NumberFormatException e) {
			System.out.println("introduce un numero!");
		}

		resultado = Math.sqrt(num1);
		JOptionPane.showMessageDialog(null, "la raiz cuadrada de " + " es " + resultado);
	}

	public static void raizCubica() {
		double num1 = 0;
		double resultado = 0;
		try {
			num1 = Double.parseDouble(JOptionPane.showInputDialog("introduce el numero para saber su raíz cúbica: "));
		} catch (NumberFormatException e) {
			System.out.println("introduce un numero!");
		}

		resultado = Math.cbrt(num1);
		JOptionPane.showMessageDialog(null, "la raiz cuadrada de " + " es " + resultado);
	}

}
