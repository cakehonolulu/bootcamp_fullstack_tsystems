package Task6;

import java.util.Scanner;

public class Task6App {

	public static int m_calc_digits(int m_number) {
		int m_return = -1;
		String m_digits;
		
		// Check if we're dealing with a positive number
		if (m_number >= 0)
		{
			// int to String
			m_digits = String.valueOf(m_number);
			
			/*
			 * Java Strings have their length defined on the object,
			 * let's take advantage of that to find the number of digits
			 * an integer has.
			 * 
			 * Set those digits as the return value of the function.
			 */
			m_return = m_digits.length();
		}
		else
		{
			System.out.println("Only positive numbers are accepted!");
		}
		
		return m_return;
	}
	
	public static void main(String[] args) {
		// Use stdin to grab user input (Using Java's Scanner library)
		Scanner m_stdin_input = new Scanner(System.in);
		
		// Number to process
		int m_number;
		
		// Ask the user for the previous variable
		System.out.println("Input a number to calculate the number of digits it has: ");
		
		m_number = m_stdin_input.nextInt();

		// Calculate the number of digits of that number...
		int m_digits = m_calc_digits(m_number);
		
		// ...and print it
		System.out.println(m_number + " has " + m_digits + " digits");
	}

}
