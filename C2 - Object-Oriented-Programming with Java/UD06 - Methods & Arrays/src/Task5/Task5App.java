package Task5;

import java.util.Scanner;

public class Task5App {

	public static String m_calc_binary(int m_number) {
		String m_return = null;
		
		/*
		 * While we could do the method that was given to us
		 * in the Scorn presentation of the unit's exercises;
		 * I prefer to use Java's provided Integer.toBinaryString()
		 * to calculate the binary representation of an integer.
		 */
		m_return = Integer.toBinaryString(m_number);
		
		// Return that String
		return m_return;
	}
	
	public static void main(String[] args) {
		// Use stdin to grab user input (Using Java's Scanner library)
		Scanner m_stdin_input = new Scanner(System.in);
		
		// Number to process
		int m_number;
		
		// Ask the user for the previous variable
		System.out.println("Input a number to calculate it's factorial: ");
		
		m_number = m_stdin_input.nextInt();

		// Calculate the factorial of that number...
		String m_binary = m_calc_binary(m_number);
		
		// ...and print it
		System.out.println(m_number + " in binary is:\n" + m_binary);
	}

}
