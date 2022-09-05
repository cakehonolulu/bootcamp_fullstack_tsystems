package ejercicio6;

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
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class EX6_Window extends JFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;



	/**
	 * Create the application.
	 */
	public EX6_Window() {
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
		textField.setBounds(128, 43, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(423, 43, 114, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel = new JLabel("Altura (Metros)");
		lblNewLabel.setBounds(12, 45, 174, 15);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Peso (Kilogramos)");
		lblNewLabel_1.setBounds(274, 45, 155, 15);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("IMC");
		lblNewLabel_2.setBounds(260, 99, 70, 15);
		frame.getContentPane().add(lblNewLabel_2);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(302, 97, 114, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JButton btnNewButton = new JButton("Calcular IMC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() > 0) {
					if (textField_1.getText().length() > 0) {
						textField_2.setText(String.valueOf(
								Math.round(
										(Double.parseDouble(textField.getText())) / (Math.pow(Double.parseDouble(textField_1.getText()), 2))
										)));
					} else {
						JOptionPane.showMessageDialog(null, "Introduce un peso!");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Introduce una altura!");
				}
			}
		});
		btnNewButton.setBounds(108, 94, 134, 25);
		frame.getContentPane().add(btnNewButton);

	}
}