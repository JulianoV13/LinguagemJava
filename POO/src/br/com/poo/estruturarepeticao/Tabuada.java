package br.com.poo.estruturarepeticao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Tabuada extends JFrame {
	
	static String dados = "";

	public static void main(String[] args) {
		
		/*
		 * gerando um objeto de janela baseado na classe
		 * JFrame. Abaixo um processo de instância
		 * */
		
		JFrame janela = new JFrame();
		// tamanho em largura e altura
		janela.setSize(500, 400);
		
		// posicionar a janela no centro da tela
		janela.setLocationRelativeTo(null);
		
		//aplicar um titulo a janela que será criada
		janela.setTitle("Tabuada");
		
		//Comando para fechar e retirar a janela da memoria
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//vamos definir o layout como null . isso no ajudar
		//a posicionar os componentes livremente
		janela.getContentPane().setLayout(null);
		
		/*
		 * Vamos adicionar um componente de texto a nossa janela
		 * este componente sera um rotulo(label -> Jlabel)
		 * */
		JLabel lblNumero = new JLabel("Digite um número para a tabuada");
		/*
		 *para posicionar a label na janela criada será necessário
		 *utilizar as configuraçoes de posiçao x e y , largura e altura
		 */
		lblNumero.setBounds(10,10,255,30);
		//Vamos adicionar a label(lblNumero) a tela janela
		janela.add(lblNumero);
		
		/*
		 * vamos adicionar um novo componente chamado JtextArea
		 * para apresentar os resultados da tabuada
		 * */
		JTextArea txtResultado = new JTextArea();
		//vamos posicionar e definir a largura e altura da caixa
		txtResultado.setBounds(10,40,463,300);
		
		//adicionar a caixa de texto a janela
		janela.add(txtResultado);
		
		/*
		 *para o usuario inserir um numero para a tabuada, iremos
		 *adicionar um novo componente chamado JTEXTField(Campo de texto)
		 * */
		
		JTextField txtNumero = new JTextField();
		txtNumero.setBounds(210,10,30,30);
		janela.add(txtNumero);
		
		JButton btnCalcular = new JButton("calcular");
		btnCalcular.setBounds(250,10,200,30);
		janela.add(btnCalcular);

		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				for(int i = 1 ; i <= 10 ; i++) {
					
					dados += txtNumero.getText() + 
							" x " + i +" = " +
							Integer.parseInt(txtNumero.getText()) * i+ "\n";

				}
				
				txtResultado.setText(dados);
				txtNumero.setText("");
				dados = ""; // Limpar a variavel dados
				
			}
		
		});
		
		
		
		
		
		//Comando para mostrar a janela
		janela.setVisible(true);

	}

}
