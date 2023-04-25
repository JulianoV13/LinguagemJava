package br.com.ProjetoAtividade.view;

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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.ProjetoAtividade.dao.CRUDChamados;
import javax.swing.JTable;

public class Suporte extends JFrame {
	
	JFormattedTextField txtData;

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtObservacao;
	CRUDChamados cc = new CRUDChamados();
	private JTable table;
	private JTextField textField;

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
		contentPane.setBackground(new Color(0, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeFuncionario = new JLabel("Nome Funcionario");
		lblNomeFuncionario.setForeground(Color.WHITE);
		lblNomeFuncionario.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 20));
		lblNomeFuncionario.setBounds(0, 61, 231, 42);
		contentPane.add(lblNomeFuncionario);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Verdana", Font.BOLD, 18));
		txtNome.setColumns(10);
		txtNome.setBounds(0, 101, 231, 31);
		contentPane.add(txtNome);
		
		JLabel lblObservao = new JLabel("Observação");
		lblObservao.setForeground(Color.WHITE);
		lblObservao.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 18));
		lblObservao.setBounds(10, 129, 248, 42);
		contentPane.add(lblObservao);
		
		txtObservacao = new JTextField();
		txtObservacao.setColumns(10);
		txtObservacao.setBounds(0, 160, 231, 110);
		contentPane.add(txtObservacao);
		
		JLabel lblDataDeResoluo = new JLabel("Data de resolução");
		lblDataDeResoluo.setForeground(Color.WHITE);
		lblDataDeResoluo.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 20));
		lblDataDeResoluo.setBounds(10, 303, 231, 42);
		contentPane.add(lblDataDeResoluo);
		
		JFormattedTextField txtData = new JFormattedTextField((AbstractFormatter) null);
		txtData.setBounds(10, 336, 177, 31);
		contentPane.add(txtData);
		
		JLabel lblAno = new JLabel("Ano -");
		lblAno.setForeground(Color.WHITE);
		lblAno.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 20));
		lblAno.setBounds(10, 366, 83, 42);
		contentPane.add(lblAno);
		
		JLabel lblAno_1 = new JLabel("Mês -");
		lblAno_1.setForeground(Color.WHITE);
		lblAno_1.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 20));
		lblAno_1.setBounds(69, 366, 83, 42);
		contentPane.add(lblAno_1);
		
		JLabel lblAno_1_1 = new JLabel("Dia ");
		lblAno_1_1.setForeground(Color.WHITE);
		lblAno_1_1.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 20));
		lblAno_1_1.setBounds(129, 367, 83, 42);
		contentPane.add(lblAno_1_1);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 20));
		btnGravar.setBackground(Color.WHITE);
		btnGravar.setBounds(600, 356, 226, 42);
		contentPane.add(btnGravar);
		
		JLabel lblSuporte = new JLabel("Suporte");
		lblSuporte.setForeground(Color.WHITE);
		lblSuporte.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 25));
		lblSuporte.setBounds(333, 11, 468, 51);
		contentPane.add(lblSuporte);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 398, 851, 110);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setForeground(Color.WHITE);
		lblStatus.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 20));
		lblStatus.setBounds(581, 61, 231, 42);
		contentPane.add(lblStatus);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(510, 96, 231, 92);
		contentPane.add(textField);
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
