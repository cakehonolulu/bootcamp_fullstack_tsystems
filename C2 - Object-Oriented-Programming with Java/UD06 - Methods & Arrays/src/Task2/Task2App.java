package Task2;

import java.util.Scanner;
import java.util.Random;
import java.math.*;

public class Task2App {

	public static void m_calc_rng_num(int m_size, int m_min, int m_max) {
		Random m_rng = new Random();
		
		System.out.println("Calculating " + m_size + " Random Numbers w/range [" + m_min
				+ ", " + m_max + "]");
		
		// Do this as long as we still have pending calculations
		while (m_size >= 0)
		{
			/*
			 * http://pi.math.cornell.edu/~morris/135/mod.pdf
			 * 
			 * Modulo method adapted for Java's Random.nextInt() needs.
			 */
			System.out.print((m_rng.nextInt(m_max - m_min) + m_min) + " ");
			m_size--;
		}
		
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		// Use stdin to grab user input (Using Java's Scanner library)
		Scanner m_stdin_input = new Scanner(System.in);
		
		// Numbers to generate and it's range (Min num, max num)
		int m_total, m_min, m_max;
		
		// Ask the user for the previous 3 variables
		System.out.println("Input the number of Random Numbers to be generated: ");
		
		m_total = m_stdin_input.nextInt();
		
		System.out.println("Input the minimum number you want: ");
		
		m_min = m_stdin_input.nextInt();
		
		System.out.println("Input the maximum number you want: ");
		
		m_max = m_stdin_input.nextInt();
		
		// Call the function with the user defined parameters
		m_calc_rng_num(m_total, m_min, m_max);
	}

}
