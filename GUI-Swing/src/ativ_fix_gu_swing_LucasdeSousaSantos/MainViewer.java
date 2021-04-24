package ativ_fix_gu_swing_LucasdeSousaSantos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class MainViewer {

	private JFrame frmCalculadora;
	private JTextField num1TextField;
	private JTextField num2TextField;
	private JTextPane txtpnResultado;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainViewer window = new MainViewer();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainViewer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setAlwaysOnTop(true);
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 300, 400);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		JLabel lblCalculadora = new JLabel("Calculadora");
		lblCalculadora.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblCalculadora.setBounds(38, 11, 194, 50);
		frmCalculadora.getContentPane().add(lblCalculadora);
		
		JLabel lblNum1 = new JLabel("N\u00FAmero 1");
		lblNum1.setBounds(10, 80, 60, 14);
		frmCalculadora.getContentPane().add(lblNum1);
		
		num1TextField = new JTextField();
		num1TextField.setHorizontalAlignment(SwingConstants.CENTER);
		num1TextField.setText("0.0");
		num1TextField.setBounds(94, 72, 180, 30);
		frmCalculadora.getContentPane().add(num1TextField);
		num1TextField.setColumns(10);
		
		JLabel lblNum2 = new JLabel("N\u00FAmero 2");
		lblNum2.setBounds(10, 155, 60, 14);
		frmCalculadora.getContentPane().add(lblNum2);
		
		num2TextField = new JTextField();
		num2TextField.setHorizontalAlignment(SwingConstants.CENTER);
		num2TextField.setText("0.0");
		num2TextField.setColumns(10);
		num2TextField.setBounds(94, 147, 180, 30);
		frmCalculadora.getContentPane().add(num2TextField);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(10, 188, 264, 30);
		btnCalcular.addActionListener(new ControleSoma(this));
		frmCalculadora.getContentPane().add(btnCalcular);
		
		txtpnResultado = new JTextPane();
		txtpnResultado.setBorder(new EmptyBorder(8, 8, 8, 8));
		txtpnResultado.setText("Resultado");
		txtpnResultado.setBounds(10, 229, 264, 102);
		frmCalculadora.getContentPane().add(txtpnResultado);
	}

	public JFrame getFrmCalculadora() {
		return frmCalculadora;
	}

	public void setFrmCalculadora(JFrame frmCalculadora) {
		this.frmCalculadora = frmCalculadora;
	}

	public JTextField getNum1TextField() {
		return num1TextField;
	}

	public void setNum1TextField(JTextField num1TextField) {
		this.num1TextField = num1TextField;
	}

	public JTextField getNum2TextField() {
		return num2TextField;
	}

	public void setNum2TextField(JTextField num2TextField) {
		this.num2TextField = num2TextField;
	}

	public JTextPane getTxtpnResultado() {
		return txtpnResultado;
	}

	public void setTxtpnResultado(JTextPane txtpnResultado) {
		this.txtpnResultado = txtpnResultado;
	}
	
	
	
}
