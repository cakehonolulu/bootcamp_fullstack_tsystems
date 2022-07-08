package Task10App;

import javax.swing.JOptionPane;

public class Task10App {

	public static void main(String[] args) {
		// Ask for the number of sales
		String m_input = JOptionPane.showInputDialog("Input the number of sales");
		
		// Convert the String object to int
		int m_num_sales = Integer.parseInt(m_input);
		
		// Initialize the total amount to 0
		Double m_total_obtained = 0.0;

		// Loop helper
		int i = 0;
		
		// Do this while we haven't completed all the orders
		while (i < m_num_sales)
		{
			// Accumulate the number from the user's input
			m_total_obtained += Double.parseDouble(JOptionPane.showInputDialog(
					"Input the amount sold for the item " + (i + 1)));
			
			i++;
		}
		
		// Print the total obtained
		JOptionPane.showMessageDialog(null, "Total obtained: " + m_total_obtained + "€");
	}

}
