package CalculadoraInversaApp;

import javax.swing.JOptionPane;

public class CalculadoraInversaApp {

	public static void main(String[] args) {
		// Variables that hold the calculator's operands
		int m_first_operand, m_second_operand;
		
		// Sign to-be-processed
		String m_arithmetic_sign;

		/*
		 *  Ask the user for the operands and the arithmetic sign.
		 *  The operands must be parsed as integers (JOptionPane stores the input as a String)
		 */
		m_first_operand = Integer.parseInt(JOptionPane.showInputDialog("Input the first operand"));
		m_second_operand = Integer.parseInt(JOptionPane.showInputDialog("Input the second operand"));
		m_arithmetic_sign = JOptionPane.showInputDialog("Input the arithmetic operation");
		
		// Switch block for processing each type of supported arithmetic sign
		switch (m_arithmetic_sign)
		{
			case "+":
				JOptionPane.showMessageDialog(null,m_first_operand + " + " + m_second_operand + " = "
						+ (m_first_operand + m_second_operand));
				break;
			
			case "-":
				JOptionPane.showMessageDialog(null,m_first_operand + " - " + m_second_operand + " = "
						+ (m_first_operand - m_second_operand));
				break;
			
			case "*":
				JOptionPane.showMessageDialog(null,m_first_operand + " * " + m_second_operand + " = "
						+ (m_first_operand * m_second_operand));
				break;
			
			case "/":
				JOptionPane.showMessageDialog(null,m_first_operand + " / " + m_second_operand + " = "
						+ (m_first_operand / m_second_operand));
				break;
			
			case "^":
				JOptionPane.showMessageDialog(null,m_first_operand + "^" + m_second_operand + " = "
						+ (Math.pow(m_first_operand, m_second_operand)));
				break;
				
			case "%":
				JOptionPane.showMessageDialog(null,m_first_operand + " % " + m_second_operand + " = "
						+ (m_first_operand % m_second_operand));
				break;
			
			default:
				JOptionPane.showMessageDialog(null, "Invalid " + m_arithmetic_sign + " operand!");
				break;
		}
	}

}
