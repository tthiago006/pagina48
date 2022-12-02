package exercicios_pagina48;

import java.util.Scanner;

public class exercicio3_pagina48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner (System.in);
		int idade, velho=0, novo=200  ;
		String nome, nomeV = null , nomeN = null; 
		
			
			
			for(int i=1; i<=10; i++) {
				System.out.println("Digite seu nome:");
				nome = leitura.next();
			
				
				System.out.println("Digite sua idade:");
				idade = leitura.nextInt();
				
				if (idade>novo) {
					velho = idade+0;
					nomeV = nome;
				}else if (novo>idade) {
					novo = idade+0;
					nomeN = nome;
					
					}
				}
			
		System.out.println(" O mais velho é o "+nomeV+" e ele tem " +velho+" anos ");
	
		System.out.println(" O mais novo é o "+nomeN+" e ele tem "+novo+" anos ");
		
		leitura.close();
	}

}
