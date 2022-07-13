package Task9;

import java.util.Random;
import java.util.Scanner;

public class Task9App {
	
	public static void m_fill_array(int m_array[], int m_min, int m_max) {
		// Use stdin to grab user input (Using Java's Scanner library)
		Scanner m_stdin_input = new Scanner(System.in);
		
		// Java's Random Helper
		Random m_rng = new Random();
		
		// Iterate through the entire array's length and store the ranged number
		for (int i = 0; i < m_array.length; i++)
		{
			m_array[i] = (m_rng.nextInt(m_max - m_min) + m_min);
		}
	}
	
	public static void m_show_array(int m_array[]) {
		System.out.println("Array contents:");
		
		// Variable that holds the sum of each of the array's indices
		int m_number = 0;
		
		// Iterate through the entire array's length and print it's index and value
		for (int i = 0; i < m_array.length; i++)
		{
			// Store the index to the total sum
			m_number += m_array[i];
			System.out.println(m_array[i] + " ");
		}
		
		System.out.println("Sum of all indices: " + m_number);
	}
	
	public static void main(String[] args) {
		// Use stdin to grab user input (Using Java's Scanner library)
		Scanner m_stdin_input = new Scanner(System.in);
		
		// User-defined array size
		int m_array_sz;
		
		System.out.println("Input the desired array size:");
		
		// Read the size
		m_array_sz = m_stdin_input.nextInt();
					
		// Integer array
		int m_array[] = new int[m_array_sz];
		
		// Call the array-filing option
		m_fill_array(m_array, 0, 9);
		
		// Call the array-showing option
		m_show_array(m_array);
	}

}
