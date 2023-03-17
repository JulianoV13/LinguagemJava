package br.com.poo.estruturaarrey;

public class Estruturaarrey2 {

	public static void main(String[] args) {
		
		int [] numero = {10,23,5,6,8,12,18,15,147,35,66,68,62,34};
		
		for(int i = 0 ; i < numero.length ; i++) {
			if( numero[i] % 2 == 0) {
				System.out.println(numero[i]);
			}
		}
	}

}
