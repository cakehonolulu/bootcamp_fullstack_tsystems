package Task4;

import java.util.Scanner;

public class Task4App {

	public static void m_calc_factorial(int m_number) {
		int i, m_factorial = 1;
		
		// Do this while while we don't collide with the provided number
		for (i = 1; i <= m_number; i++)
		{
			/*
			 * Factorials are calculated multiplying the (number - 1) by the previous 
			 * iteration of the same operation (Starting with the provided number).
			 * To me, it's a recursive algorithm but since we haven't dealt with recursiveness
			 * in class I'll avoid using such functions for now.
			 */
			m_factorial = m_factorial * i;
		}
		
		// Print the result
		System.out.println("The factorial of " + m_number + " is " + m_factorial);
	}
	
	public static void main(String[] args) {
		// Use stdin to grab user input (Using Java's Scanner library)
		Scanner m_stdin_input = new Scanner(System.in);
		
		// Number to process
		int m_number;
		
		// Ask the user for the previous variable
		System.out.println("Input a number to calculate it's factorial: ");
		
		m_number = m_stdin_input.nextInt();

		// Calculate the factorial of that number
		m_calc_factorial(m_number);
	}

}
