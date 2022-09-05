package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewMain extends JFrame {

	private JPanel contentPane;
	private JButton btnProyectos;
	private JButton btnAsignar;
	private JButton btnCientificos;

	public ViewMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Gestión proyectos y cientificos");
		lblNewLabel.setFont(new Font("DejaVu Sans", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(27, 12, 411, 29);
		contentPane.add(lblNewLabel);

		btnProyectos = new JButton("PROYECTOS");

		btnProyectos.setBounds(43, 134, 136, 25);
		contentPane.add(btnProyectos);

		btnAsignar = new JButton("ASIGNAR");

		btnAsignar.setBounds(43, 198, 136, 25);
		contentPane.add(btnAsignar);

		btnCientificos = new JButton("CIENTIFICOS");
		btnCientificos.setBounds(43, 75, 136, 25);
		contentPane.add(btnCientificos);
	}

	public JButton getBtnProyectos() {
		return btnProyectos;
	}

	public JButton getBtnAsignar() {
		return btnAsignar;
	}

	public JButton getBtnCientificos() {
		return btnCientificos;
	}

}