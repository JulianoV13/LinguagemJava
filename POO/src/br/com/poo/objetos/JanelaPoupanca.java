package br.com.poo.objetos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Button;
import java.awt.ScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class JanelaPoupanca extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeroBanco;
	private JTextField txtAgencia;
	private JTextField txtNumeroConta;
	private JTextField txtTitular;
	private JTextField txtSaldo;
	private JTextField txtRendimento;
	private Label lblTitular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPoupanca frame = new JanelaPoupanca();
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
	public JanelaPoupanca() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Java\\Jota\\POO\\src\\br\\com\\poo\\images\\Sem título.png"));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 381);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(241, 224, 10));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNumeroBanco = new JTextField();
		txtNumeroBanco.setBounds(10, 114, 86, 20);
		contentPane.add(txtNumeroBanco);
		txtNumeroBanco.setColumns(10);

		
		txtAgencia = new JTextField();		
		txtAgencia.setColumns(10);
		txtAgencia.setBounds(106, 114, 86, 20);
		contentPane.add(txtAgencia);
		
		txtNumeroConta = new JTextField();
		txtNumeroConta.setColumns(10);
		txtNumeroConta.setBounds(202, 114, 250, 20);
		contentPane.add(txtNumeroConta);
		
		txtTitular = new JTextField();
		txtTitular.setBounds(10, 168, 442, 20);
		contentPane.add(txtTitular);
		txtTitular.setColumns(10);
		
		Label lblNumeroBanco = new Label("Núm do Banco:");
		lblNumeroBanco.setFont(new Font("Calibri Light", Font.BOLD, 11));
		lblNumeroBanco.setBounds(10, 86, 86, 22);
		contentPane.add(lblNumeroBanco);
		
		Label lblAgencia = new Label("Agência:");
		lblAgencia.setFont(new Font("Calibri", Font.BOLD, 11));
		lblAgencia.setBounds(106, 86, 86, 22);
		contentPane.add(lblAgencia);
		
		Label lblNumeroConta = new Label("Número da Conta:");
		lblNumeroConta.setFont(new Font("Calibri", Font.BOLD, 11));
		lblNumeroConta.setBounds(202, 86, 100, 22);
		contentPane.add(lblNumeroConta);
		
		txtSaldo = new JTextField();
		txtSaldo.setColumns(10);
		txtSaldo.setBounds(10, 222, 204, 20);
		contentPane.add(txtSaldo);
		
		txtRendimento = new JTextField();
		txtRendimento.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(txtRendimento.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Campo obrigatório");
					txtRendimento.requestFocus();
				}
				btnVerificarSaldo.setText("Abrir Conta");
				btnVerificarSaldo.setEnabled(true);
			}
		});
		txtRendimento.setColumns(10);
		txtRendimento.setBounds(224, 222, 228, 20);
		contentPane.add(txtRendimento);
		
		Label lblSaldo = new Label("Saldo Inícial:");
		lblSaldo.setFont(new Font("Calibri", Font.BOLD, 11));
		lblSaldo.setBounds(10, 194, 100, 22);
		contentPane.add(lblSaldo);
		
		Label lblRendimento = new Label("Rendimento:");
		lblRendimento.setFont(new Font("Calibri", Font.BOLD, 11));
		lblRendimento.setBounds(224, 194, 100, 22);
		contentPane.add(lblRendimento);
		
		lblTitular = new Label("Nome do Títular:");
		lblTitular.setFont(new Font("Calibri", Font.BOLD, 11));
		lblTitular.setBounds(10, 140, 130, 22);
		contentPane.add(lblTitular);
		
		Button btnVerificarSaldo = new Button("Verificar Saldo");
		btnVerificarSaldo.setForeground(new Color(241, 224, 10));
		btnVerificarSaldo.setBackground(new Color(0, 5, 191));
		btnVerificarSaldo.setFont(new Font("Calibri", Font.BOLD, 12));
		btnVerificarSaldo.setBounds(10, 270, 144, 62);
		contentPane.add(btnVerificarSaldo);
		btnVerificarSaldo.setEnabled(false);
		
		Button btnDepositar = new Button("Depositar");
		btnDepositar.setBackground(new Color(0, 5, 191));
		btnDepositar.setForeground(new Color(241, 224, 10));
		btnDepositar.setFont(new Font("Calibri", Font.BOLD, 12));
		btnDepositar.setBounds(160, 270, 123, 28);
		contentPane.add(btnDepositar);
		btnDepositar.setEnabled(false);
		
		Button btnSacar = new Button("Sacar");
		btnSacar.setBackground(new Color(0, 5, 191));
		btnSacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSacar.setForeground(new Color(241, 224, 10));
		btnSacar.setFont(new Font("Calibri", Font.BOLD, 12));
		btnSacar.setBounds(160, 304, 123, 28);
		contentPane.add(btnSacar);
		btnSacar.setEnabled(false);
		
		TextField txtValor = new TextField();
		txtValor.setFont(new Font("Cambria", Font.BOLD, 50));
		txtValor.setBounds(308, 270, 144, 62);
		contentPane.add(txtValor);
		
		JLabel lblBancodoBrasil = new JLabel("Banco do Brasil");
		lblBancodoBrasil.setFont(new Font("Arial Black", Font.PLAIN, 40));
		lblBancodoBrasil.setForeground(new Color(0, 5, 191));
		lblBancodoBrasil.setBounds(95, 22, 357, 43);
		contentPane.add(lblBancodoBrasil);
		
		Label lblValor = new Label("Valor:");
		lblValor.setBounds(308, 245, 62, 22);
		contentPane.add(lblValor);
	}
}
