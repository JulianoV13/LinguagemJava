package br.com.poo.estruturaarrey;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Padaria extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigoProduto;
	private JTextField txtCodigoBarras;
	private JTextField txtDescricao;
	private JTextField txtValorUnitario;
	private JTextField txtQuantidade;
	private JTextField txtTotalItems;
	private JTextField txtSubtotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Padaria frame = new Padaria();
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
	public Padaria() {
		
		String[][] produtos = {
				
				{"2023","Pão Francês","13.00","17032023"},
				{"2024","Pão de Leite","15.00","14032024"},
				{"2025","Torta de Frango","50.00","17032025"},
				{"2026","Leite Integral","5.00","17032026"},
				{"2027","Manteiga","5.00","17032027"},
				{"2028","Bolo","20.00","17032028"},
				{"2029","Bauru","12.00","17032029"},
				{"2030","Suco Laranja","7.00","17032030"},
				
		};
		
		
		
		
		
		setResizable(false);
		setTitle("Janela Padaria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlEsquerdo = new JPanel();
		pnlEsquerdo.setBackground(new Color(61, 29, 9));
		pnlEsquerdo.setBounds(0, 0, 800, 700);
		contentPane.add(pnlEsquerdo);
		pnlEsquerdo.setLayout(null);
		
		JLabel lblLogo = new JLabel("New label");
		lblLogo.setBounds(0, 0, 800, 300);
		
		/*
		 * Para ajustar a image ao tamanho da Label, foi necessário aplicar o comando
		 * new ImageIcon para definir a scala no elemento getImage.
		 * O tamanho da image foi de ajustado para largura da label(lbl.getWidth) e altura da
		 * label (lbl.getHeight) e para finalizar, foi alterado a forma de fechamento da
		 * imagem quando a tela fecha, foi setado o valor para suaviazação(image.SCALE_SMMOTH)
		 * */
		
		lblLogo.setIcon(new ImageIcon(new ImageIcon(Padaria.class.getResource("/br/com/poo/images/Logo.PNG")).getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH)));
		pnlEsquerdo.add(lblLogo);
		
		JLabel lblCodigoProduto = new JLabel("Código do Produto:");
		lblCodigoProduto.setForeground(new Color(255, 255, 255));
		lblCodigoProduto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCodigoProduto.setBounds(10, 311, 171, 39);
		pnlEsquerdo.add(lblCodigoProduto);
		
		JLabel lblCodigobarras = new JLabel("Código de Barras:");
		lblCodigobarras.setForeground(Color.WHITE);
		lblCodigobarras.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCodigobarras.setBounds(495, 311, 159, 39);
		pnlEsquerdo.add(lblCodigobarras);
		
		txtCodigoProduto = new JTextField();
		txtCodigoProduto.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				for(int linha = 0 ; linha < produtos.length ; linha++) {
					
					for(int coluna = 0 ; coluna < produtos[0].length; coluna++) {
						if(txtCodigoProduto.getText().equals(produtos[linha][0])) {
							txtCodigoBarras.setText(produtos[linha][3]);
							txtDescricao.setText(produtos[linha][1]);
							txtValorUnitario.setText(produtos[linha][2]);
							break;
						}
					}
				}
			}
		});
		txtCodigoProduto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCodigoProduto.setForeground(new Color(255, 255, 255));
		txtCodigoProduto.setBackground(new Color(61, 29, 8));
		txtCodigoProduto.setBounds(10, 372, 171, 30);
		pnlEsquerdo.add(txtCodigoProduto);
		txtCodigoProduto.setColumns(10);
		txtCodigoProduto.setBorder(null);
		
		txtCodigoBarras = new JTextField();
		txtCodigoBarras.setForeground(new Color(255, 255, 255));
		txtCodigoBarras.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCodigoBarras.setColumns(10);
		txtCodigoBarras.setBackground(new Color(61, 29, 8));
		txtCodigoBarras.setBounds(495, 372, 171, 30);
		pnlEsquerdo.add(txtCodigoBarras);
		txtCodigoBarras.setBorder(null);

		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 406, 780, 2);
		pnlEsquerdo.add(separator);
		
		JLabel lblDescricao = new JLabel("Descrição:");
		lblDescricao.setForeground(Color.WHITE);
		lblDescricao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDescricao.setBounds(10, 413, 171, 39);
		pnlEsquerdo.add(lblDescricao);
		
		txtDescricao = new JTextField();
		txtDescricao.setForeground(Color.WHITE);
		txtDescricao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDescricao.setColumns(10);
		txtDescricao.setBackground(new Color(61, 29, 8));
		txtDescricao.setBounds(10, 474, 780, 30);
		pnlEsquerdo.add(txtDescricao);
		txtDescricao.setBorder(null);

		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 515, 780, 2);
		pnlEsquerdo.add(separator_1);
		
		JLabel lblValorUnitario = new JLabel("Valor Unitário");
		lblValorUnitario.setForeground(Color.WHITE);
		lblValorUnitario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblValorUnitario.setBounds(33, 515, 129, 39);
		pnlEsquerdo.add(lblValorUnitario);
		
		txtValorUnitario = new JTextField();
		txtValorUnitario.setForeground(new Color(255, 255, 255));
		txtValorUnitario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtValorUnitario.setColumns(10);
		txtValorUnitario.setBackground(new Color(61, 29, 8));
		txtValorUnitario.setBounds(10, 552, 171, 30);
		pnlEsquerdo.add(txtValorUnitario);
		txtValorUnitario.setBorder(null);

		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setForeground(Color.WHITE);
		lblQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblQuantidade.setBounds(301, 515, 109, 39);
		pnlEsquerdo.add(lblQuantidade);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setForeground(new Color(255, 255, 255));
		txtQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtQuantidade.setColumns(10);
		txtQuantidade.setBackground(new Color(61, 29, 8));
		txtQuantidade.setBounds(272, 552, 171, 30);
		pnlEsquerdo.add(txtQuantidade);
		txtQuantidade.setBorder(null);

		
		JLabel lblTotalItems = new JLabel("Total Items");
		lblTotalItems.setForeground(Color.WHITE);
		lblTotalItems.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTotalItems.setBounds(557, 515, 109, 39);
		pnlEsquerdo.add(lblTotalItems);
		
		txtTotalItems = new JTextField();
		txtTotalItems.setForeground(new Color(255, 255, 255));
		txtTotalItems.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTotalItems.setColumns(10);
		txtTotalItems.setBackground(new Color(61, 29, 8));
		txtTotalItems.setBounds(528, 552, 171, 30);
		pnlEsquerdo.add(txtTotalItems);
		txtTotalItems.setBorder(null);

		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 593, 780, 2);
		pnlEsquerdo.add(separator_1_1);
		
		JLabel lblSubtotal = new JLabel("Subtotal:");
		lblSubtotal.setForeground(Color.WHITE);
		lblSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblSubtotal.setBounds(10, 593, 129, 39);
		pnlEsquerdo.add(lblSubtotal);
		
		txtSubtotal = new JTextField();
		txtSubtotal.setForeground(new Color(255, 255, 255));
		txtSubtotal.setFont(new Font("Tahoma", Font.BOLD, 40));
		txtSubtotal.setColumns(10);
		txtSubtotal.setBackground(new Color(61, 29, 8));
		txtSubtotal.setBounds(181, 617, 302, 72);
		pnlEsquerdo.add(txtSubtotal);
		txtSubtotal.setBorder(null);

		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.setForeground(new Color(255, 255, 255));
		btnIncluir.setBackground(new Color(106, 52, 2));
		btnIncluir.setIcon(new ImageIcon(Padaria.class.getResource("/br/com/poo/images/Incluir.png")));
		btnIncluir.setBounds(533, 622, 246, 51);
		pnlEsquerdo.add(btnIncluir);
		btnIncluir.setBorder(null);

		
		JPanel pnlDireito = new JPanel();
		pnlDireito.setBackground(new Color(255, 255, 255));
		pnlDireito.setBounds(810, 0, 774, 700);
		contentPane.add(pnlDireito);
		
		JPanel pnlBase = new JPanel();
		pnlBase.setBackground(new Color(192, 192, 192));
		pnlBase.setBounds(0, 710, 1584, 150);
		contentPane.add(pnlBase);
	}
}
