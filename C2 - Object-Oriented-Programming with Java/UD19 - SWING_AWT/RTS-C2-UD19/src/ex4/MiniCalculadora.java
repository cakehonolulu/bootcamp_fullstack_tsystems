package ex4;

import javax.swing.JTextField;

public class MiniCalculadora {
	
	enum Operacion {
		  Suma,
		  Resta,
		  Multiplicacion,
		  Division
	}
	
	static void CalculaOperacion(int operando1, int operando2, Operacion tipo, JTextField resultado)
	{
		switch (tipo) {
			case Division:
				resultado.setText(Double.toString((double)operando1 / operando2));
				break;
			case Multiplicacion:
				resultado.setText(Integer.toString(operando1 * operando2));
				break;
			case Resta:
				resultado.setText(Integer.toString(operando1 - operando2));
				break;
			case Suma:
				resultado.setText(Integer.toString(operando1 + operando2));
				break;
			default:
				break;
		}
	}
}
