package br.com.poo.estruturarepeticao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EstruturaWhile1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtinicial;
	private JTextField txtfinal;
	
	String dados = "";
	int i;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EstruturaWhile1 frame = new EstruturaWhile1();
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
	public EstruturaWhile1() {
		setResizable(false);
		setBackground(new Color(143, 143, 143));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\juliano.vbatista\\Desktop\\broto.png"));
		setTitle("Janela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 377);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(79, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Número Inicial");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 11, 75, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Número Final");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 50, 75, 28);
		contentPane.add(lblNewLabel_1);
		
		txtinicial = new JTextField();
		txtinicial.setBounds(85, 15, 86, 20);
		contentPane.add(txtinicial);
		txtinicial.setColumns(10);
		
		txtfinal = new JTextField();
		txtfinal.setBounds(85, 54, 86, 20);
		contentPane.add(txtfinal);
		txtfinal.setColumns(10);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 130, 161, 197);
		contentPane.add(scrollPane);
		
		JTextArea txtResultado = new JTextArea();
		txtResultado.setToolTipText("");
		txtResultado.setBackground(new Color(201, 201, 201));
		scrollPane.setViewportView(txtResultado);
		
		JButton btnExecutar = new JButton("Executar");
		btnExecutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				i = Integer.parseInt(txtinicial.getText());
				
			while (i <= Integer.parseInt(txtfinal.getText())) {
				dados += i +"\n";
				i++;
			}
			txtResultado.setText(dados);
			txtinicial.setText("");
			txtfinal.setText("");
			dados = "";
				
			}
		});
		btnExecutar.setForeground(new Color(0, 0, 0));
		btnExecutar.setBackground(new Color(128, 128, 128));
		btnExecutar.setBounds(10, 89, 161, 23);
		contentPane.add(btnExecutar);
	}
}
