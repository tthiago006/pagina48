package exercicios_pagina48;

import java.util.Scanner;

public class exercicio4_pagina48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner (System.in);
		int i;
		double preço,lucro,valor,resultado;
		
		do {
			i=1;
			System.out.println (" escreva o preço do produto: ");
			preço = leitura.nextDouble();
			System.out.println (" escreva a margem de lucro em %: ");
			lucro = leitura.nextDouble();
			valor = lucro/100;
			resultado = (preço*valor)/100;
			System.out.println (" preço de venda: " +resultado);
			i++;
			System.out.println();
			System.out.println (" deseja continuar a execução do programa? digite 1 para SIM, 2 para NÃO ");
			i = leitura.nextInt();
		}while(i!=2);
		
		leitura.close();

	}

}
