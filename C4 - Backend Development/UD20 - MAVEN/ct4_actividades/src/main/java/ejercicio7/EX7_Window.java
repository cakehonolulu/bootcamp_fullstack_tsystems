package ejercicio7;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import ejercicio1.EX1_Window;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class EX7_Window extends JFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	boolean type = false;

	final double PESETAS = 166.386;
	
	private static final DecimalFormat formato_decimal = new DecimalFormat("0.00");

	/**
	 * Create the application.
	 */
	public EX7_Window() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 598, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(162, 43, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(374, 43, 114, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel = new JLabel("Cantidad a convertir");
		lblNewLabel.setBounds(12, 45, 174, 15);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setBounds(291, 45, 155, 15);
		frame.getContentPane().add(lblNewLabel_1);

		JButton btnEurosAPesetas = new JButton("Euros a Pesetas");
		
		btnEurosAPesetas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() > 0) {
					textField_1.setText(String.valueOf(formato_decimal.format(Double.parseDouble(textField.getText()) * PESETAS)));

				} else {
					JOptionPane.showMessageDialog(null, "Introduce un valor monetario!");
				}
			}
		});
		
		btnEurosAPesetas.setBounds(102, 94, 174, 25);
		frame.getContentPane().add(btnEurosAPesetas);


		JButton btnPesetasAEuros = new JButton("Pesetas a Euros");
		btnPesetasAEuros.setBounds(102, 94, 174, 25);
		
		btnPesetasAEuros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() > 0) {
					textField_1.setText(String.valueOf(formato_decimal.format(Double.parseDouble(textField.getText()) / PESETAS)));

				} else {
					JOptionPane.showMessageDialog(null, "Introduce un valor monetario!");
				}
			}
		});
		
		frame.getContentPane().add(btnPesetasAEuros);
		
		JButton btnCambiar = new JButton("Cambiar");
		btnCambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!type) {
					btnEurosAPesetas.setVisible(false);
					btnPesetasAEuros.setVisible(true);
					type = true;
					getContentPane().revalidate();
					getContentPane().repaint();
				}
				else
				{
					type = false;
					btnEurosAPesetas.setVisible(true);
					btnPesetasAEuros.setVisible(false);
					getContentPane().revalidate();
					getContentPane().repaint();
				}
			}
		});
		
		btnCambiar.setBounds(372, 94, 134, 25);
		frame.getContentPane().add(btnCambiar);
		

	}
}