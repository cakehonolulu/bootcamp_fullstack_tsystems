package Task3;

import java.util.Hashtable;
import java.util.Scanner;

public class Task3App {
	
	/*
	 *  Function that displays all of the program's options
	 */
	public static void m_items_menu_print_help() {
		System.out.println("'list' to list the current inventory");
		System.out.println("'listarticle' to list an article from the current inventory");
		System.out.println("'remove' to remove an article from the inventory");
		System.out.println("'help' to print this submenu");
		System.out.println("'add' to add an item into the inventory");
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
		boolean m_ret = false;

		if (m_inventory.size() >= 10 || m_inventory_size.size() >= 10)
		{
			m_ret = true;
		}
		
		return m_ret;
	}
	
	/*
	 *  Function that fills the available store's items
	 *  
	 *  @param m_items_list	: Hashtable to fill with names and prices
	 */
	public static void m_inventory_menu(Hashtable <String, Double> m_inventory, Hashtable <String, Integer> m_inventory_size) {
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
				case "list":
					// If string is 'list', print all available market's items
					for (String m_item: m_inventory.keySet()) {
						System.out.println("Article: " + m_item + "; Price: " + m_inventory.get(m_item) +
								"€; Number in Stock: " + m_inventory_size.get(m_item));
					}
					break;

				case "remove":
					System.out.println("Input the article to remove:");
					System.out.print("-> ");
					m_option = m_stdio_input.next();
					
					if (m_inventory.containsKey(m_option) == true)
					{
						m_inventory.remove(m_option);
						m_inventory_size.remove(m_option);
						System.out.println("Article: " + m_option + " removed!");
					}
					else
					{
						System.out.println("Article not found!");
					}
					break;
				
				case "listarticle":
					System.out.println("Input the article to find:");
					System.out.print("-> ");
					m_option = m_stdio_input.next();
					
					if (m_inventory.containsKey(m_option) == true)
					{
						System.out.println("Article: " + m_option + "\nPrice: " + m_inventory.get(m_option)
							+ "€\nNumber in stock: " + m_inventory_size.get(m_option));
					}
					else
					{
						System.out.println("Article not found!");
					}
					break;
				
				case "help":
					m_items_menu_print_help();
					break;
					
				case "end":
					m_cond = false;
					break;
					
				default:
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
						
						m_inventory.put(m_option, m_price);
						
						m_inventory_size.put(m_option, m_quantity);
					}
					else
					{
						System.out.println("The inventory is full!");
					}
					break;
			}
	
		}
		
	}
	
	public static void main(String[] args) {
		Hashtable <String, Double> m_inventory = new Hashtable <String, Double> ();
		
		Hashtable <String, Integer> m_inventory_size = new Hashtable <String, Integer> ();
		
		m_inventory_menu(m_inventory, m_inventory_size);

	}

}
