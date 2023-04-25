package br.com.projetoassessoria.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.projetoassessoria.dao.CRUDAssessoria;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class Suporte extends JFrame {
	
	JFormattedTextField txtData;

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtObservacao;
	CRUDAssessoria cc = new CRUDAssessoria();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Suporte frame = new Suporte();
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
	public Suporte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 867, 547);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeFuncionario = new JLabel("Nome Funcionario");
		lblNomeFuncionario.setForeground(Color.WHITE);
		lblNomeFuncionario.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 20));
		lblNomeFuncionario.setBounds(116, 58, 231, 42);
		contentPane.add(lblNomeFuncionario);
		
		txtNome = new JTextField();
		txtNome.setBackground(new Color(192, 192, 192));
		txtNome.setFont(new Font("Verdana", Font.BOLD, 18));
		txtNome.setColumns(10);
		txtNome.setBounds(20, 96, 417, 51);
		contentPane.add(txtNome);
		
		JLabel lblObservação = new JLabel("Observação");
		lblObservação.setForeground(Color.WHITE);
		lblObservação.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 18));
		lblObservação.setBounds(165, 172, 116, 31);
		contentPane.add(lblObservação);
		
		txtObservacao = new JTextField();
		txtObservacao.setBackground(new Color(192, 192, 192));
		txtObservacao.setColumns(10);
		txtObservacao.setBounds(20, 207, 417, 95);
		contentPane.add(txtObservacao);
		
		JLabel lblDataDeResoluo = new JLabel("Data de resolução");
		lblDataDeResoluo.setForeground(Color.WHITE);
		lblDataDeResoluo.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 20));
		lblDataDeResoluo.setBounds(619, 249, 177, 31);
		contentPane.add(lblDataDeResoluo);
		
		JFormattedTextField txtData = new JFormattedTextField((AbstractFormatter) null);
		txtData.setBackground(new Color(192, 192, 192));
		txtData.setBounds(619, 291, 177, 31);
		contentPane.add(txtData);
		
		JLabel lblAno = new JLabel("Ano -");
		lblAno.setForeground(Color.WHITE);
		lblAno.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 20));
		lblAno.setBounds(619, 315, 83, 42);
		contentPane.add(lblAno);
		
		JLabel lblAno_1 = new JLabel("Mês -");
		lblAno_1.setForeground(Color.WHITE);
		lblAno_1.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 20));
		lblAno_1.setBounds(678, 315, 83, 42);
		contentPane.add(lblAno_1);
		
		JLabel lblAno_1_1 = new JLabel("Dia ");
		lblAno_1_1.setForeground(Color.WHITE);
		lblAno_1_1.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 20));
		lblAno_1_1.setBounds(738, 316, 83, 42);
		contentPane.add(lblAno_1_1);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 20));
		btnRegistrar.setBackground(Color.WHITE);
		btnRegistrar.setBounds(600, 356, 226, 42);
		contentPane.add(btnRegistrar);
		
		JLabel lblSuporte = new JLabel("Suporte");
		lblSuporte.setForeground(Color.WHITE);
		lblSuporte.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 25));
		lblSuporte.setBounds(356, 11, 124, 51);
		contentPane.add(lblSuporte);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 398, 851, 110);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setForeground(Color.WHITE);
		lblStatus.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 20));
		lblStatus.setBounds(482, 122, 76, 42);
		contentPane.add(lblStatus);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Resolvido", "Em Analise", "Pendente"}));
		comboBox.setBounds(572, 111, 249, 72);
		contentPane.add(comboBox);
	}
	
	private void carregarTabela() {
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 398, 851, 110);
		contentPane.add(scrollPane);
		
		String[] cabecalho = {
				"Id Chamado",
				"Nome Pessoa",
				"Departamento",
				"Descrição",
				"Data de Solicitação",
				"Data de Resolução",
				"Status do Chamado",
				"Observação sobre chamado",
				"Nome Funcionario"
		};
		
	
		
	}
	
	
	
	
	private void limparCampos() {
		txtNome.setText("");
		txtObservacao.setText("");
		txtData.setText("");
	}
}
