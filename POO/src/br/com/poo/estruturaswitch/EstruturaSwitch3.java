package br.com.poo.estruturaswitch;

import javax.swing.JOptionPane;

public class EstruturaSwitch3 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Olá! bom dia","Cargo",JOptionPane.INFORMATION_MESSAGE);
		String Cargo = JOptionPane.showInputDialog("Digite um Cargo para saber salário");
		 String rs;
		 
		switch(Cargo) {
		case "Diretor":
			 rs = "20000";
		break;
		case "Gerente":
			rs = "15000";
		break;
		case "Secretária":
			rs = "8000";
		break;
		case "Analista":
			rs = "7000";
		break;
		case "Assistente":
			rs = "4000";
		break;
		case "Estagiário":
			rs = "1500";
		break;
		default:
			rs = "Esta Cargo não existe";
		break;
		}
		JOptionPane.showMessageDialog(null, rs,"Resposta",JOptionPane.INFORMATION_MESSAGE);

		

	}

}
