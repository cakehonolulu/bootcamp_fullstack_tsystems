package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import logic.Calculadora;
import model.Moneda;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;

public class CalculadoraWindow {

	private JFrame frmCalculadora;
	private Color GRIS = new Color(28,28,28);
	private Color NEGRO = new Color(18,18,18);
	private Calculadora calculadora;
	private JLabel lblDineroOrigen;
	private JLabel lblDineroFin;
	JLabel lblCambio;
	
	private ArrayList<Moneda> monedas = new ArrayList<Moneda>();
	private Moneda[] curr = {new Moneda(1.0, "Dollar", "US", "USD", '$'), new Moneda(0.9777, "Euro", "Europe", "EUR", '€')};
	
	/**
	 * Create the application.
	 */
	public CalculadoraWindow() {
		initialize();
		frmCalculadora.setVisible(true);
		calculadora = new Calculadora(0.0, 0, 1);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.getContentPane().setBackground(GRIS);
		frmCalculadora.setBounds(100, 100, 640, 480);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		
		JPanel panelNumeros = new JPanel();
		panelNumeros.setBackground(GRIS);
		frmCalculadora.getContentPane().add(panelNumeros, BorderLayout.EAST);
		panelNumeros.setBounds(362, 11, 252, 420);
		panelNumeros.setLayout(new GridLayout(0, 3, 2, 2));
		
		JPanel panelFill = new JPanel();
		panelFill.setBackground(GRIS);
		panelNumeros.add(panelFill);
		
		JButton btnCE = new JButton("CE");
		btnCE.setForeground(Color.WHITE);
		btnCE.setBackground(NEGRO);
		btnCE.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		btnCE.setBorder(BorderFactory.createLineBorder(NEGRO,1));
		panelNumeros.add(btnCE);
		
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.setValorOrigen(0.0);
				calculadora.setDecimales(0);
				
				lblDineroOrigen.setText(String.format("%.0f", calculadora.getValorOrigen()) + " $");
				
				lblDineroFin.setText(String.format("%.0f", calculadora.getValorFinal()) + " €");
			}
		});
		
		
		JButton btnDelete = new JButton("<x");
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setBackground(NEGRO);
		btnDelete.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		btnDelete.setBorder(BorderFactory.createLineBorder(NEGRO,1));
		panelNumeros.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(calculadora.getDecimales() > 2) {
					calculadora.setValorOrigen((int)(calculadora.getValorOrigen() * 10) / 10d);
					calculadora.setDecimales(2);
					lblDineroOrigen.setText(String.format("%.2f", calculadora.getValorOrigen()) + " " + calculadora.getMonedaOrigen().getSimbolo());
				}else if(calculadora.getDecimales() == 2) {
					calculadora.setValorOrigen((double)(calculadora.getValorOrigen().intValue()));
					calculadora.setDecimales(1);
					lblDineroOrigen.setText(String.format("%.2f", calculadora.getValorOrigen()) + " " + calculadora.getMonedaOrigen().getSimbolo());
				}else if(calculadora.getDecimales() == 1){
					calculadora.setValorOrigen((double)(calculadora.getValorOrigen().intValue()));
					calculadora.setDecimales(0);
					lblDineroOrigen.setText(String.format("%.0f", calculadora.getValorOrigen()) + " " + calculadora.getMonedaOrigen().getSimbolo());
				}else {
					calculadora.setValorOrigen((double)(calculadora.getValorOrigen().intValue() / 10));
					lblDineroOrigen.setText(String.format("%.0f", calculadora.getValorOrigen()) + " " + calculadora.getMonedaOrigen().getSimbolo());
				}
				
			
				actualizarVista();
			}
		});
		
		JButton btnNum7 = new JButton("7");
		btnNum7.setForeground(Color.WHITE);
		btnNum7.setBackground(Color.BLACK);
		btnNum7.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		btnNum7.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		clickBotonNumerico(btnNum7);
		panelNumeros.add(btnNum7);
		
		JButton btnNum8 = new JButton("8");
		btnNum8.setForeground(Color.WHITE);
		btnNum8.setBackground(Color.BLACK);
		btnNum8.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		btnNum8.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		clickBotonNumerico(btnNum8);
		panelNumeros.add(btnNum8);
		
		JButton btnNum9 = new JButton("9");
		btnNum9.setForeground(Color.WHITE);
		btnNum9.setBackground(Color.BLACK);
		btnNum9.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		btnNum9.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		clickBotonNumerico(btnNum9);
		panelNumeros.add(btnNum9);
		
		JButton btnNum4 = new JButton("4");
		btnNum4.setForeground(Color.WHITE);
		btnNum4.setBackground(Color.BLACK);
		btnNum4.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		btnNum4.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		clickBotonNumerico(btnNum4);
		panelNumeros.add(btnNum4);
		
		JButton btnNum5 = new JButton("5");
		btnNum5.setForeground(Color.WHITE);
		btnNum5.setBackground(Color.BLACK);
		btnNum5.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		btnNum5.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		clickBotonNumerico(btnNum5);
		panelNumeros.add(btnNum5);
		
		JButton btnNum6 = new JButton("6");
		btnNum6.setForeground(Color.WHITE);
		btnNum6.setBackground(Color.BLACK);
		btnNum6.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		btnNum6.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		clickBotonNumerico(btnNum6);
		panelNumeros.add(btnNum6);
		
		JButton btnNum1 = new JButton("1");
		btnNum1.setForeground(Color.WHITE);
		btnNum1.setBackground(Color.BLACK);
		btnNum1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		btnNum1.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		clickBotonNumerico(btnNum1);
		panelNumeros.add(btnNum1);
		
		JButton btnNum2 = new JButton("2");
		btnNum2.setForeground(Color.WHITE);
		btnNum2.setBackground(Color.BLACK);
		btnNum2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		btnNum2.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		clickBotonNumerico(btnNum2);
		panelNumeros.add(btnNum2);
		
		JButton btnNum3 = new JButton("3");
		btnNum3.setForeground(Color.WHITE);
		btnNum3.setBackground(Color.BLACK);
		btnNum3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		btnNum3.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		clickBotonNumerico(btnNum3);
		panelNumeros.add(btnNum3);
		
		
		JPanel panelFill1 = new JPanel();
		panelFill1.setBackground(GRIS);
		panelNumeros.add(panelFill1);
		
		JButton btnNum0 = new JButton("0");
		btnNum0.setForeground(Color.WHITE);
		btnNum0.setBackground(Color.BLACK);
		btnNum0.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		btnNum0.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		clickBotonNumerico(btnNum0);
		panelNumeros.add(btnNum0);
		
		
		
		JButton btnComa = new JButton(",");
		btnComa.setForeground(Color.WHITE);
		btnComa.setBackground(Color.BLACK);
		btnComa.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		btnComa.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		panelNumeros.add(btnComa);
		btnComa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(calculadora.getDecimales() == 0) {
					lblDineroOrigen.setText(calculadora.getValorOrigen().intValue() + ",00 " + calculadora.getMonedaOrigen().getSimbolo());
					calculadora.setDecimales(1);
				}
			}
		});
		
		JPanel panelMonedaOrigen = new JPanel();
		panelMonedaOrigen.setBackground(GRIS);
		panelMonedaOrigen.setBounds(50, 60, 190, 109);
		frmCalculadora.getContentPane().add(panelMonedaOrigen);
		panelMonedaOrigen.setLayout(null);
		
		lblDineroOrigen = new JLabel("0 $");
		lblDineroOrigen.setForeground(Color.WHITE);
		lblDineroOrigen.setFont(new Font("Segoe UI Semibold", Font.BOLD, 36));
		lblDineroOrigen.setBounds(8, 7, 172, 58);
		panelMonedaOrigen.add(lblDineroOrigen);
		
		JComboBox comboBoxMonedaOrigen = new JComboBox(curr);
		comboBoxMonedaOrigen.addItemListener(e -> {
			Moneda m = (Moneda)e.getItem();
			calculadora.setMonedaOrigen(m);
			actualizarVista();
		});
		comboBoxMonedaOrigen.setBackground(GRIS);
		comboBoxMonedaOrigen.setForeground(Color.WHITE);
		comboBoxMonedaOrigen.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		comboBoxMonedaOrigen.setBounds(8, 76, 172, 22);
		panelMonedaOrigen.add(comboBoxMonedaOrigen);
		
		JPanel panelMonedaFin = new JPanel();
		panelMonedaFin.setBackground(GRIS);
		panelMonedaFin.setLayout(null);
		panelMonedaFin.setBounds(50, 239, 190, 109);
		frmCalculadora.getContentPane().add(panelMonedaFin);
		
		lblDineroFin = new JLabel("0 \u20AC");
		lblDineroFin.setForeground(Color.WHITE);
		lblDineroFin.setFont(new Font("Segoe UI", Font.PLAIN, 36));
		lblDineroFin.setBounds(8, 7, 172, 58);
		panelMonedaFin.add(lblDineroFin);
		
		
		JComboBox comboBoxMonedaFin = new JComboBox(curr);
		comboBoxMonedaFin.setSelectedIndex(1);
		comboBoxMonedaFin.addItemListener(e -> {
			Moneda m = (Moneda)e.getItem();
			calculadora.setMonedaFinal(m);
			actualizarVista();
		});
		comboBoxMonedaFin.setBackground(GRIS);
		comboBoxMonedaFin.setForeground(Color.WHITE);
		comboBoxMonedaFin.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		
		comboBoxMonedaFin.setBounds(8, 76, 172, 22);
		panelMonedaFin.add(comboBoxMonedaFin);
		
		lblCambio = new JLabel("1 USD = 0,9777 EUR");
		lblCambio.setForeground(Color.WHITE);
		lblCambio.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblCambio.setBounds(50, 397, 190, 20);
		frmCalculadora.getContentPane().add(lblCambio);
		
		
	}

	private void clickBotonNumerico(final JButton btn) {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(btn.getText());
				calculadora.actualizarValorOrigen(num);
				if(!(calculadora.getValorOrigen()==0 && num==0)) {
					if(calculadora.voTieneDecimales())
						lblDineroOrigen.setText(String.format("%.2f", calculadora.getValorOrigen()) + " " + calculadora.getMonedaOrigen().getSimbolo());
					else
						lblDineroOrigen.setText(String.format("%.0f", calculadora.getValorOrigen()) + " " + calculadora.getMonedaOrigen().getSimbolo());

					actualizarVista();
				}
			}
		});
	}
	
	private void actualizarVista() {
		lblDineroFin.setText(String.format("%.2f", calculadora.getValorFinal()) + calculadora.getMonedaFinal().getSimbolo());
		lblCambio.setText(calculadora.ratioToString());
	}
}