package Task7;

import java.util.Scanner;

public class Task7App {

	public static void m_currency_convert(int m_euros, String m_currency) {
		// Monetary constants to use in conversion
		final double m_pounds = 0.86;
		final double m_dollars = 1.28611;
		final double m_yens = 129.852;
		
		// Switch block that handles each type of currency conversion
		switch (m_currency)
		{
			case "yen":
				System.out.println(m_euros + "€ are " + (m_euros * m_yens)  + "¥");
				break;
				
			case "dollar":
				System.out.println(m_euros + "€ are " + (m_euros * m_dollars)  + "$");
				break;
				
			case "pound":
				System.out.println(m_euros + "€ are " + (m_euros * m_pounds)  + "£");
				break;
				
			default:
				break;
		}
	}
	
	public static void main(String[] args) {
		// Use stdin to grab user input (Using Java's Scanner library)
		Scanner m_stdin_input = new Scanner(System.in);
		
		// Number to convert
		int m_euros;
		
		// Conditional for the while loop
		boolean m_cond = true;
		
		// Currency to convert to
		String m_currency = null;
		
		// Ask the user for the previous variable
		System.out.println("Input the number of Euros to convert: ");
		
		// Read the numeric amount to convert
		m_euros = m_stdin_input.nextInt();
		
		do
		{
			// Ask the user for the currency to convert to
			System.out.println("Input the currency you want to convert to (Yens, Dollars or Pounds): ");
			
			// Flush stdin
			m_stdin_input.nextLine();
			
			// Read the input
			m_currency = m_stdin_input.nextLine();
			
			// Switch block that handles the currency type to convert to
			switch (m_currency.toLowerCase())
			{
				case "yen":
				case "yens":
					m_currency = "yen";
					m_cond = false;
					break;
					
				case "dollar":
				case "dollars":
				case "dolar":
					m_currency = "dollar";
					m_cond = false;
					break;
					
				case "pound":
				case "pounds":

					m_currency = "pound";
					m_cond = false;
					break;
					
				default:
					System.out.println("Unsupported currency!");
					break;
			}
			
		} while (m_cond);

		// Process the currency conversion
		m_currency_convert(m_euros, m_currency);
	}

}
