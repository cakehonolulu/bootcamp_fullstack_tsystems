package Task3;

import java.util.Scanner;

public class Task3App {

	public static boolean m_check_prime(int m_number) {
		boolean m_result = true, m_cond = true;
		
		// First to process (No neg. numbers, 0 or 1)
		int i = 2;
		
		// Avoid negative numbers, 0 and 1
		if (m_number > 1)
		{
			// Loop that lasts until i == m_number (Or while condition is still met)
			while (i < m_number && m_cond)
			{
				// Simple modulo operation that checks m_number's prime-ability
				if (m_number % i == 0)
				{
					// Not prime, exit the loop cleanly
					m_cond = false;
					m_result = false;
				}
				
				i++;
			}
		}
		else
		{
			// If number isn't valid, then it's 100% not prime
			m_result = false;
		}
		
		return m_result;
	}
	
	public static void main(String[] args) {
		// Use stdin to grab user input (Using Java's Scanner library)
		Scanner m_stdin_input = new Scanner(System.in);
		
		// Number to check
		int m_number;
		
		// Ask the user for the previous variable
		System.out.println("Input a number to check if it's prime or not: ");
				
		m_number = m_stdin_input.nextInt();

		// Assign the result of the function call to a boolean-type
		boolean m_result = m_check_prime(m_number);
		
		// Tell the user whether the number inputted is prime or not
		if (m_result)
		{
			System.out.println(m_number + " is prime!");
		}
		else
		{
			System.out.println(m_number + " isn't prime!");
		}
	}

}
