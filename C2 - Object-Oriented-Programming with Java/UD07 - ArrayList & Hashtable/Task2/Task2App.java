package Task2;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Task2App {
	
	/*
	 *  Function that adds items to the basket
	 *  
	 *  @param m_items_list	: Hashtable to handle with names and prices
	 *  @param m_basket		: ArrayList with the current basket
	 */
	public static void m_items_add(Hashtable <String, Double> m_items_list, ArrayList <Double> m_basket) {
		boolean m_cond = true;
		Scanner m_stdio_input = new Scanner(System.in);
		String m_option;
		
		// Loop that ensures user still wants to add items
		while (m_cond)
		{
			System.out.println("Enter the product you want to add; enter 'list' to view all products, enter 'end' to return to the main menu");
			System.out.print("-> ");
			
			m_option = m_stdio_input.next();
			
			// Check if string entered is not equal to 'end'
			if (!m_option.equals("end"))
			{
				// Check if string entered is not equal to 'list'
				if (!m_option.equals("list"))
				{
					// Check if item is available in 'market'...
					if (m_items_list.containsKey(m_option))
					{
						// ..and add it
						m_basket.add(m_items_list.get(m_option));
						System.out.println("Item " + m_option + " added to the cart");
					}
					else
					{
						System.out.println("Item unavailable");
					}
				}
				else
				{
					// If string is 'list', print all available market's items
					for (String m_item: m_items_list.keySet()) {  
						System.out.println(m_item + " -> " + m_items_list.get(m_item) + "€");
					}
				}

			}
			else
			{
				m_cond = false;
			}
		}
		
	}
	
	/*
	 *  Function that displays the entire cart
	 *  
	 *  @param m_basket		: ArrayList with the current basket
	 */
	public static void m_view_cart(ArrayList <Double> m_basket) {
		Double m_sum = 0.0;
		
		// Calculate the cart's total price
		for (Double i : m_basket) {
			m_sum += i;
		}
		
		// Print total items and total money to pay of the current cart
		System.out.println("Total items in cart: " + m_basket.size());
		System.out.println("Total to pay: " + (m_sum + (m_sum * 0.21)) + "€ (21% IVA)");
	}
	
	/*
	 *  Function that handles the buy of the current cart
	 *  
	 *  @param m_basket		: ArrayList with the current basket
	 */
	public static void m_buy(ArrayList <Double> m_basket) {
		Scanner m_stdio_input = new Scanner(System.in);
		boolean m_cond = true;
		Double m_option;
		System.out.println("Applying 21% of IVA...");
		
		Double m_sum = 0.0;
		
		// Calculate the cart's total price
		for (Double i : m_basket) {
			m_sum += i;
		}

		// Calculate the total price (Ceil it up to 2 decimal positions and add 21% of IVA)
		System.out.println("Total to pay: " + (Math.round((m_sum + (m_sum * 0.21)) * 100.0) / 100.0) + "€ (21% IVA)");
		
		// Print total items in cart
		System.out.println("Total items in cart: " + m_basket.size());
		
		// Loop that goes as long as no good price is entered
		while (m_cond)
		{
			System.out.println("Introduce how much you want to pay");
			System.out.print("-> ");
			
			m_option = m_stdio_input.nextDouble();
			
			// Check if qty. entered is good
			if (m_option >= (Math.round((m_sum + (m_sum * 0.21)) * 100.0) / 100.0)) 
			{
				// Print the change
				System.out.println("Return: " + String.format("%.02f", Math.abs((m_sum + (m_sum * 0.21)) - m_option)) + "€\nHave a great day!");
				m_cond = false;
			}
			else
			{
				System.out.println("You need to pay more money!");
			}

		}
		
	}
	
	/*
	 *  Function that prints a help menu
	 */
	public static void m_print_help_menu() {
		System.out.println("[1] Add Item to Cart");
		System.out.println("[2] View the Cart");
		System.out.println("[3] Proceed to Buy");
		System.out.println("[4] Help Menu");
		System.out.println("[5] Exit the Store");
	}
	
	/*
	 *  Function provides a user menu to organize the UX
	 *  
	 *  @param m_items_list	: Hashtable to handle with names and prices
	 *  @param m_basket		: ArrayList with the current basket
	 */
	public static void m_items_menu(Hashtable <String, Double> m_items_list, ArrayList <Double> m_basket) {
		boolean m_cond = true;
		Scanner m_stdio_input = new Scanner(System.in);
		byte m_option;
		
		System.out.println("Welcome to the online foodmarket!");
		
		// Menu loop
		do
		{
			System.out.println("Input your desired option and press ENTER (For help, press 4):");
			
			m_option = m_stdio_input.nextByte();
			
			// Based-off the input, do one action or another
			switch (m_option)
			{
				case 1:
					// Add items to the cart
					m_items_add(m_items_list, m_basket);
					break;
				case 2:
					// View current cart
					m_view_cart(m_basket);
					break;
				case 3:
					// Buys the current cart
					m_buy(m_basket);
					m_cond = false;
					break;
				case 4:
					// Prints the help menu
					m_print_help_menu();
					break;
				case 5:
					// Exits the app
					System.out.println("Bye!");
					m_cond = false;
					break;
					
				default:
					// Unhandled condition
					System.out.println("Unrecognized option!");
					break;
			}
			
			
		} while (m_cond);
	}
	
	/*
	 *  Function that fills the available store's items
	 *  
	 *  @param m_items_list	: Hashtable to fill with names and prices
	 */
	public static void m_items_fill(Hashtable <String, Double> m_items_list) {
		m_items_list.put("eggs", 1.89);
		m_items_list.put("ham", 2.31);
		m_items_list.put("cheese", 1.59);
		m_items_list.put("bread", 0.99);
		m_items_list.put("milk", 3.56);
		m_items_list.put("butter", 1.29);
		m_items_list.put("t-shirt", 12.99);
		m_items_list.put("trousers", 9.99);
		m_items_list.put("candles", 1.29);
		m_items_list.put("keyboard", 13.99);	
	}
	
	public static void main(String[] args) {
		/*
		 *  Hashtable containing the name of the available items plus it's price
		 */
		Hashtable <String, Double> m_items_available = new Hashtable <String, Double> ();
		
		/*
		 *  ArrayList containing the current basket's item prices
		 */
		ArrayList <Double> m_basket = new ArrayList <> ();

		// Fill the currently available items
		m_items_fill(m_items_available);
		
		// Show the filled students structure
		m_items_menu(m_items_available, m_basket);

	}

}
