package Task6App;

import javax.swing.JOptionPane;

public class Task6App {

	public static void main(String[] args) {
		// IVA is constant
		final double IVA = 0.21;

		// Ask the user for the base price
		String m_base_price = JOptionPane.showInputDialog("Input the basic price");
		
		// Calculate the IVA-priced-in value and show the user
		System.out.println("Base price: " + m_base_price + "€ + " + (IVA * 100) + "% IVA = "
				+ ((Double.parseDouble(m_base_price) * IVA) + Double.parseDouble(m_base_price)) + "€");
	}

}
