package Task4;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Task4App {
	
	/*
	 *  Function that displays all of the program's options
	 */
	public static void m_items_menu_print_help() {
		// Print all the options
		System.out.println("'list_all_stock' to list the current inventory");
		System.out.println("'list_article_in_stock' to list an article from the current inventory");
		System.out.println("'remove_article_from_stock' to remove an article from the inventory");
		System.out.println("'add_stock' to add an item into the inventory");
		System.out.println("'add_to_cart' to add an item into the cart");
		System.out.println("'view_cart' list all the items in the cart");
		System.out.println("'buy_cart' buy the current cart");
		System.out.println("'help' to print this submenu");
		System.out.println("'end' exit the application");
	}
	
	/*
	 *	Function that checks if we still have space left for more items in the stock
	 *
	 *	@param	m_inventory			:	Hashtable containing the name and price of the item
	 *	@param	m_inventory_size	:	Hashtable containing the name and inventory size of the items
	 *
	 *	@return						:	Boolean variable that tells the uswe whether the inventory is full or not
	 */
	public static boolean m_inventory_check(Hashtable <String, Double> m_inventory, Hashtable <String, Integer> m_inventory_size) {
		// Value to return
		boolean m_ret = false;

		// Check size of both Hashtables, if they exceed the default size, return true
		if (m_inventory.size() >= 10 || m_inventory_size.size() >= 10)
		{
			m_ret = true;
		}
		
		// True = full; False = not full
		return m_ret;
	}
	
	/*
	 *	Function that removes an item from the current inventory
	 *
	 *	@param	m_item				:	String that determines which item has to be removed
	 *	@param	m_inventory			:	Hashtable containing the name and price of the item
	 *	@param	m_inventory_size	:	Hashtable containing the name and inventory size of the items
	 */
	public static void m_remove_item(String m_item, Hashtable <String, Double> m_inventory, Hashtable <String, Integer> m_inventory_size) {
		// Check if the Hashtable contains the item to remove
		if (m_inventory.containsKey(m_item) == true)
		{
			// Remove the references from both Hashtables
			m_inventory.remove(m_item);
			m_inventory_size.remove(m_item);
			
			System.out.println("Article: " + m_item + " removed!");
		}
		else
		{
			System.out.println("Article not found!");
		}	
	}
	
	/*
	 *	Function that lists an item referenced by a String
	 *
	 *	@param	m_item				:	String that determines which item has to be listed
	 *	@param	m_inventory			:	Hashtable containing the name and price of the item
	 *	@param	m_inventory_size	:	Hashtable containing the name and inventory size of the items
	 */
	public static void m_items_list(String m_item, Hashtable <String, Double> m_inventory, Hashtable <String, Integer> m_inventory_size) {
		
		// Check if the inventory has the item
		if (m_inventory.containsKey(m_item) == true)
		{
			System.out.println("Article: " + m_item + "\nPrice: " + m_inventory.get(m_item)
				+ "€\nNumber in stock: " + m_inventory_size.get(m_item));
		}
		else
		{
			System.out.println("Article not found!");
		}
	}
	
	/*
	 *	Function that adds an item to the basket
	 *
	 *	@param	m_items_list		:	Hashtable containing the items list
	 *	@param	m_basket			:	ArrayList with the current basket
	 */
	public static void m_items_add_basket(Hashtable <String, Double> m_items_list, ArrayList <Double> m_basket) {
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
	 *  Function that provides an interface for the user
	 *  
	 *  @param	m_inventory			: Hashtable with names and prices of the stock
	 *  @param	m_inventory_size	: Hashtable with names and amount of the stock
	 *  @param	m_basket			: ArrayList with the current basket
	 */
	public static void m_app_menu(Hashtable <String, Double> m_inventory,
			Hashtable <String, Integer> m_inventory_size, ArrayList <Double> m_basket) {
		boolean m_cond = true;
		Scanner m_stdio_input = new Scanner(System.in);
		String m_option;
		Double m_price;
		Integer m_quantity;
		
		// Loop that ensures user still wants to add items
		while (m_cond)
		{
			System.out.println("Inventory submenu (Enter 'help' for help)");
			System.out.print("-> ");
			
			m_option = m_stdio_input.next();
			
			switch (m_option) {
				case "list_all_stock":
					// If string is 'list', print all available market's items
					for (String m_item: m_inventory.keySet()) {
						System.out.println("Article: " + m_item + "; Price: " + m_inventory.get(m_item) +
								"€; Number in Stock: " + m_inventory_size.get(m_item));
					}
					break;

				case "remove_article_from_stock":
					System.out.println("Input the article to remove:");
					System.out.print("-> ");
					m_option = m_stdio_input.next();
					
					m_remove_item(m_option, m_inventory, m_inventory_size);
					break;
				
				case "list_article_in_stock":
					System.out.println("Input the article to find:");
					System.out.print("-> ");
					m_option = m_stdio_input.next();
					
					m_items_list(m_option, m_inventory, m_inventory_size);
					break;
				
				case "add_stock":
					// First check if we have space left
					if (m_inventory_check(m_inventory, m_inventory_size) == false)
					{
						System.out.println("Enter the product you want to add");
						System.out.print("-> ");
						
						m_option = m_stdio_input.next();
						
						System.out.println("Enter the price for " + m_option);
						System.out.print("-> ");
						
						m_price = m_stdio_input.nextDouble();
						
						System.out.println("Enter the quantity for " + m_option);
						System.out.print("-> ");
						
						m_quantity = m_stdio_input.nextInt();
						
						// Add the new item to the stock
						m_inventory.put(m_option, m_price);
						m_inventory_size.put(m_option, m_quantity);
					}
					else
					{
						System.out.println("The inventory is full!");
					}
					break;
					
				case "add_to_cart":
					m_items_add_basket(m_inventory, m_basket);
					break;
					
				case "view_cart":
					// View current cart
					m_view_cart(m_basket);
					break;
					
				case "buy_cart":
					// Buys the current cart
					m_buy(m_basket);
					m_cond = false;
					break;
									
				case "help":
					m_items_menu_print_help();
					break;
					
				case "end":
					m_cond = false;
					break;

				default:
					System.out.println("Unrecognized option");
					break;
				}
			}
	
		}
		
	public static void main(String[] args) {
		Hashtable <String, Double> m_inventory = new Hashtable <String, Double> ();
		
		Hashtable <String, Integer> m_inventory_size = new Hashtable <String, Integer> ();
		
		ArrayList <Double> m_basket = new ArrayList <Double> ();
		
		m_app_menu(m_inventory, m_inventory_size, m_basket);
	}

}
