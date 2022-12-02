package exercicios_pagina48;

import java.util.Scanner;

public class exercicio2_pagina48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner (System.in);
		int i=1,n,resultado;
		
		System.out.println (" informe o valor da tabuada que você quer descobrir: ");
		n = leitura.nextInt(); 		
		do {
			resultado = n*i;
			System.out.println (n+ " X " +i+ " = " +resultado);
			i = i+1;
		} while (i<=10);
		
		leitura.close();

	}

}
