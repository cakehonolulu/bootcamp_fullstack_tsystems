package ex1;

import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SaludadorWindow {

	private Saludador salutatous = new Saludador();
	private JFrame Saludador;



	/**
	 * Create the application.
	 */
	public SaludadorWindow() {
		initialize();
		Saludador.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Saludador = new JFrame();
		Saludador.setTitle("Saludador");
		Saludador.setBounds(new Rectangle(0, 0, 450, 300));
		Saludador.setLocationRelativeTo(null);
		Saludador.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Escribe un nombre para saludar");
		label.setBounds(114, 12, 244, 54);
		Saludador.getContentPane().add(label);
		
		JTextField texto = new JTextField();
		texto.setBounds(83, 132, 293, 19);
		Saludador.getContentPane().add(texto);
		// textField.setColumns(10);
		
		JButton boton = new JButton("¡Saludar!");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!texto.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, salutatous.saludar(texto.getText()));
				} else {
					JOptionPane.showMessageDialog(null, "Debes poner un nombre en el recuadro");
				}
			}
		});
		boton.setBounds(160, 199, 117, 25);
		Saludador.getContentPane().add(boton);
	}
}
