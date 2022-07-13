package Task11;

import java.util.Random;
import java.util.Scanner;

public class Task11App {
	
	public static int[] m_mult_arrays(int m_first_array[], int m_second_array[]) {
		// Return array with the same size as the 2 parameter arrays
		int m_mult_array[] = new int[m_first_array.length];
		
		// Fill new array with the product of each of the 2's array idx.
		for (int i = 0; i < m_first_array.length; i++)
		{
			m_mult_array[i] = (m_first_array[i] * m_second_array[i]);
		}
		
		// Return the array
		return m_mult_array;
	}
	
	public static void m_fill_array(int m_array[]) {
		// Java's Random Helper
		Random m_rng = new Random();
		
		// Iterate through the entire array's length and store the ranged number
		for (int i = 0; i < m_array.length; i++)
		{
			// Generate a random number and assign to the current array idx.			
			m_array[i] = m_rng.nextInt();
		}
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
		
		// User-defined array size
		int m_firstnum;
		
		System.out.println("Input the desired size of the arrays:");
		
		// Read the first size
		m_firstnum = m_stdin_input.nextInt();
		
		// First integer array
		int m_first_array[] = new int[m_firstnum];
	
		// Fill the first array with random numbers
		m_fill_array(m_first_array);
		
		// Second integer array
		int m_second_array[] = m_first_array;

		// Fill the second array with random numbers
		m_fill_array(m_second_array);
		
		// Set the multiplication array to the result of the function
		int m_mult_array[] = m_mult_arrays(m_first_array, m_second_array);
		
		// Show the 3 arrays
		m_show_array(m_first_array);
		m_show_array(m_second_array);
		m_show_array(m_mult_array);
		
	}

}
