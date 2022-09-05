package ejercicio3;


import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EX3_Window {

	private int count1=0, count2=0;
	private JFrame frame;

	

	/**
	 * Create the application.
	 */
	public EX3_Window() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 360, 140);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JLabel lblBoton1 = new JLabel("Boton 1: 0 veces");
		lblBoton1.setBounds(10, 24, 146, 14);
		frame.getContentPane().add(lblBoton1);
		
		final JLabel lblBoton2 = new JLabel("Boton 2: 0 veces");
		lblBoton2.setBounds(187, 24, 147, 14);
		frame.getContentPane().add(lblBoton2);
		
		JButton btn1 = new JButton("Boton 1");
		btn1.setBounds(67, 67, 89, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("Boton2");
		btn2.setBounds(187, 67, 89, 23);
		frame.getContentPane().add(btn2);
		
		//Press btn1
		btn1.addActionListener(new ActionListener() {		

			public void actionPerformed(ActionEvent arg0) {
				count1++;
				lblBoton1.setText("Boton 1: " +  count1 + " veces");
			}
		});
		//Press btn2
		btn2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				count2++;
				lblBoton2.setText("Boton 2: " +  count2 + " veces");
			}
		});
	}
}