package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.ControllerClients;

import javax.swing.Box;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewClients extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewClients frame = new ViewClients();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewClients() {
		setTitle("Tarea 1");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Insert Client");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerClients.insertClient();
			}
		});
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(73, 126, 126, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete Client");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerClients.deleteClient();
			}
		});
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBounds(73, 186, 126, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("List Clients");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerClients.listClients();
			}
		});
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.setBounds(242, 126, 131, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Update Client");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerClients.updateClient();
			}
		});
		btnNewButton_3.setEnabled(false);
		btnNewButton_3.setBounds(242, 186, 131, 25);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Connect w/Database");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (ControllerClients.makeConnection())
				{
					btnNewButton_4.setEnabled(false);
					btnNewButton_3.setEnabled(true);
					btnNewButton_2.setEnabled(true);
					btnNewButton_1.setEnabled(true);
					btnNewButton.setEnabled(true);
				}
			}
		});
		btnNewButton_4.setBounds(131, 45, 181, 41);
		contentPane.add(btnNewButton_4);
	}
}
