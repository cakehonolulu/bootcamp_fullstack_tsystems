package Task1;

import java.util.Scanner;

import java.math.*;

public class Task1App {

	public static void m_calc_circle_area() {
		// Use stdin to grab user input (Using Java's Scanner library)
		Scanner m_stdin_input = new Scanner(System.in);
		int m_radius;
		
		System.out.println("Input the circle radius: ");
		
		// Read the radius off the user
		m_radius = m_stdin_input.nextInt();
		
		// Using 'Math' library functions, calculate the area of the circle and print it out
		System.out.println("Area of the circle: " + (Math.pow(m_radius, 2) * Math.PI));	
	}
	
	public static void m_calc_triangle_area() {
		// Use stdin to grab user input (Using Java's Scanner library)
		Scanner m_stdin_input = new Scanner(System.in);
		int m_base, m_height;
		
		System.out.println("Input the triangle's base: ");
		
		// Ask for the triangle's base
		m_base = m_stdin_input.nextInt();
		
		System.out.println("Input the triangle's height: ");

		// Ask for the triangle's height
		m_height = m_stdin_input.nextInt();

		// Calculate the area using previous variables and print it out
		System.out.println("Area of the triangle: " + ((m_base * m_height) / 2));
	}
	
	public static void m_calc_square_area() {
		// Use stdin to grab user input (Using Java's Scanner library)
		Scanner m_stdin_input = new Scanner(System.in);
		int m_side;
		
		System.out.println("Input the square's side size: ");

		// Ask for the square's base
		m_side = m_stdin_input.nextInt();
		
		// Calculate the area using the previous variable and print it out
		System.out.println("Area of the square: " + (m_side * m_side));
	}
	
	public static void main(String[] args) {
		// Use stdin to grab user input (Using Java's Scanner library)
		Scanner m_stdin_input = new Scanner(System.in);
		boolean m_cond = true;
		String m_option;
		
		// Loop that repeats itself until valid input is fed to the switch() block
		do
		{
			System.out.println("Input the geometric object you want to calculate the area of: ");
			
			// Get the user input as a String
			m_option = m_stdin_input.nextLine();
			
			// Lowercase the String to reduce the number of 'switch' cases
			switch (m_option.toLowerCase())
			{
				case "circulo":
				case "círculo":
					m_calc_circle_area();
					m_cond = false;
					break;
			
				case "triangulo":
				case "triángulo":
					m_calc_triangle_area();
					m_cond = false;
					break;
					
				case "cuadrado":
					m_calc_square_area();
					m_cond = false;
					break;
				
				default:
					System.out.println("Wrong geometric object, supported ones: Círculo, Triángulo & Cuadrado.");
					break;
			}
			
			// Keep looping until valid option is entered
		} while (m_cond);
		
	}
	
}
