package Task10;

import java.util.Random;
import java.util.Scanner;

public class Task10App {
	
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
	
	public static void m_fill_array(int m_array[], int m_min, int m_max) {
		// Java's Random Helper
		Random m_rng = new Random();
		
		// 4 is not a prime number
		int m_num = 4;
		
		// Iterate through the entire array's length and store the ranged number
		for (int i = 0; i < m_array.length; i++)
		{
			// Generate a ranged random number
			m_num = m_rng.nextInt(m_max - m_min) + m_min;
			
			// While the number is not prime, keep generating them
			while (!m_check_prime(m_num))
			{
				// Generate a ranged random number
				m_num = m_rng.nextInt(m_max - m_min) + m_min;
			}
			
			// Assign the prime version to the array idx.			
			m_array[i] = m_num;
		}
	}
	
	public static void m_show_array(int m_array[]) {
		System.out.println("Array contents:");
		
		// Variable that holds the sum of each of the array's indices
		int m_number = 0;
		
		// Iterate through the entire array's length and print it's index and value
		for (int i = 0; i < m_array.length; i++)
		{
			// Check if we're dealing with a greater number to store it and print it later
			if (m_array[i] > m_number)
			{
				m_number = m_array[i];
			}
			
			System.out.println(m_array[i] + " ");
		}
		
		System.out.println("Highest number in the array: " + m_number);
	}
	
	public static void main(String[] args) {
		// Use stdin to grab user input (Using Java's Scanner library)
		Scanner m_stdin_input = new Scanner(System.in);
		
		// User-defined array size
		int m_array_sz, m_firstnum, m_secondnum;
		
		System.out.println("Input the desired array size:");
		
		// Read the size
		m_array_sz = m_stdin_input.nextInt();
					
		// Integer array
		int m_array[] = new int[m_array_sz];
		
		System.out.println("Input the minimum number the prime will range off:");
		
		// Read the first number
		m_firstnum = m_stdin_input.nextInt();
		
		System.out.println("Input the minimum number the prime will range to:");
		
		// Read the second number
		m_secondnum = m_stdin_input.nextInt();
		
		// Call the array-filing option
		m_fill_array(m_array, m_firstnum, m_secondnum);
		
		// Call the array-showing option
		m_show_array(m_array);
	}

}
