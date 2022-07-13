package Task11App;

import javax.swing.JOptionPane;

public class Task11App {

	public static void main(String[] args) {
		// Ask the user for the day
		String m_input = JOptionPane.showInputDialog("Input the day of the week");

		/*
		 * Switch block to process the day of the week.
		 * Convert the input to lowercase to reduce the block's size.
		 */
		switch (m_input.toLowerCase())
		{
			/*
			 * We can group all the work days and non-work ones to reuse the same
			 * instruction. This reduces the block size and avoids un-necessary
			 * instruction repetition.
			 */
			case "lunes":
			case "martes":
			case "miércoles":
			case "miercoles":
			case "jueves":
			case "viernes":
				JOptionPane.showMessageDialog(null, m_input + " is a working day");
				break;
			
			case "sabado":
			case "sábado":
			case "domingo":
				JOptionPane.showMessageDialog(null, m_input + " is a non-working day!");
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "The day you entered isn't valid");
				break;
		}
	}

}
