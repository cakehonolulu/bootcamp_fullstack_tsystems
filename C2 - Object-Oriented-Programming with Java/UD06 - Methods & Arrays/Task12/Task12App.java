package Task12;

import java.util.Random;
import java.util.Scanner;

public class Task12App {
	
	public static void m_fill_array(int m_array[]) {
		// Java's Random Helper
		Random m_rng = new Random();
		
		// Iterate through the entire array's length and store the ranged number
		for (int i = 0; i < m_array.length; i++)
		{
			// Generate a random number between [1, 300] and assign to the current array idx.			
			m_array[i] = m_rng.nextInt((300 - 1) + 1) + 1;
		}
	}
	
	public static int m_show_array_digit_collisions(int m_array[], int m_digit) {
		System.out.println("Collisions:");
		int m_collisions = 0;
		
		// Iterate through the entire array's length and print it's index and value
		for (int i = 0; i < m_array.length; i++)
		{			
			// Modulo 10 gives us the last digit
			if (m_array[i] % 10 == m_digit)
			{
				// Increase collisions and print the array idx.
				m_collisions++;
				System.out.print(m_array[i] + " ");
			}
		}
		
		// Check how many collisions
		if (m_collisions == 0)
		{
			System.out.print("None");
		}
		
		System.out.println();
		
		return m_collisions;
	}

	public static int[] m_fill_digit_collisions_array(int m_array[], int m_collisions, int m_digit) {
		// New array with m_collision idx.
		int m_return_array[] = new int[m_collisions];
		
		int j = 0;
		
		// Iterate through the entire array's length and print it's index and value
		for (int i = 0; i < m_array.length; i++)
		{			
			// Modulo 10 gives us the last digit
			if (m_array[i] % 10 == m_digit)
			{
				// Save the collision on the new array
				m_return_array[j] = m_array[i];
				
				// Increase the generated array idx.
				j++;
			}
		}
		
		return m_return_array;
	}
	
	public static void m_show_array(int m_array[]) {
		System.out.println("Array contents:");
		
		// Iterate through the entire array's length and print it's index and value
		for (int i = 0; i < m_array.length; i++)
		{
			System.out.print(m_array[i] + " ");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		// Use stdin to grab user input (Using Java's Scanner library)
		Scanner m_stdin_input = new Scanner(System.in);
		
		boolean m_cond = true;
		
		// User-defined array size and the digit to find
		int m_array_sz, m_digit_to_find;
		
		System.out.println("Input the desired size of the arrays:");
		
		// Read the first size
		m_array_sz = m_stdin_input.nextInt();
		
		// Simple do{} while(); that handles a sanitized user input for single digit numbers
		do
		{
			System.out.println("Input the desired digit to find:");
			
			// Read the digit to find
			m_digit_to_find = m_stdin_input.nextInt();
			
			// Check if between 0-9
			if (m_digit_to_find <= 9 && m_digit_to_find >= 0)
			{
				m_cond = false;
			}
			else
			{
				System.out.println("Number is too large, valid numbers: 0-9");
			}
					
		} while (m_cond);
		
		// First integer array
		int m_array[] = new int[m_array_sz];
			
		// Fill the array with numbers from 1 to 300
		m_fill_array(m_array);
		
		// Print and store the digit collisions
		int m_collisions = m_show_array_digit_collisions(m_array, m_digit_to_find);
		
		// Create the collisions array
		int m_collision_array[] = m_fill_digit_collisions_array(m_array, m_collisions, m_digit_to_find);
		
		// The array's contents should match the detected collisions
		m_show_array(m_collision_array);
		
	}

}
