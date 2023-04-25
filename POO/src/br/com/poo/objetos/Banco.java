package br.com.poo.objetos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Banco extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Banco frame = new Banco();
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
	public Banco() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 338, 188);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(68, 86, 213));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPoupanca = new JButton("Poupança");
		btnPoupanca.setBackground(new Color(241, 224, 10));
		btnPoupanca.setFont(new Font("Calibri", Font.BOLD, 15));
		btnPoupanca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JanelaPoupanca jp = new JanelaPoupanca();
				jp.setVisible(true);
			}
		});
		btnPoupanca.setBounds(163, 11, 149, 127);
		contentPane.add(btnPoupanca);
		
		JButton btnCorrente = new JButton("Corrente");
		btnCorrente.setBackground(new Color(241, 224, 10));
		btnCorrente.setFont(new Font("Calibri", Font.BOLD, 15));
		btnCorrente.setBounds(10, 11, 149, 127);
		contentPane.add(btnCorrente);
	}

}
