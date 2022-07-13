package Task8;

import java.util.Scanner;

public class Task8App {
	
	public static void m_fill_array(int m_array[]) {
		// Use stdin to grab user input (Using Java's Scanner library)
		Scanner m_stdin_input = new Scanner(System.in);
		
		int i = 0, m_number;
		
		do
		{
			// Tell the user what to do
			System.out.println("Number to add to the array: ");
			
			// Read the numeric amount to convert
			m_number = m_stdin_input.nextInt();
			
			// Store it on the array @ offset 'i'
			m_array[i] = m_number;
			
			// Increment the array-offseting variable
			i++;
		} while (i < m_array.length);
	}
	
	public static void m_show_array(int m_array[]) {
		// Iterate through the entire array's length and print it's index and value
		for (int i = 0; i < m_array.length; i++)
		{
			System.out.println("array[" + i + "] = " + m_array[i]);
		}
	}
	
	public static void main(String[] args) {
		// 10-member integer array
		int m_number_array[] = new int[10];
		
		// Call the array-filing option
		m_fill_array(m_number_array);
		
		// Call the array-showing option
		m_show_array(m_number_array);
	}

}
