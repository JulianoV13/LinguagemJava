package br.com.poo.estruturarepeticao;

import javax.swing.JOptionPane;

public class Pares extends JOptionPane {

	public static void main(String[] args) {
		
		String inicio, termino, resultado = "";
		inicio = JOptionPane.showInputDialog("Entre com um número");
		
		termino = JOptionPane.showInputDialog("Entre com um outro número");
		/*
		 * O valores que entrarão em inicio e termino veem do elemnto
		 * JOptionPane.showInputdialog no formato de texto. como iremos
		 * realizar um contagem com os calores será necessario converte-los
		 * para número interio. Assim, usamos a classe Integer com a função
		 * parseInt e convertermos para Número.
		 * */
		
		int in = Integer.parseInt(inicio);
		int ter = Integer.parseInt(termino);

		for(int i = in; i <= ter ; i++) {
			if (i % 2 == 1) {
				resultado += "\n"+i;
			}
		
		}
		JOptionPane.showMessageDialog(null, resultado, "Número pares", JOptionPane.INFORMATION_MESSAGE);
	}

}
