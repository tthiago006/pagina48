package exercicios_pagina48;

import java.util.Scanner;

public class exercicio1_pagina48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner (System.in);
        int i = 1;
        double salario,inss;
        
        do {
      	  System.out.println (" Escreva  o salário do funcionario: ");
      	  salario = leitura.nextDouble();
      	  if (salario<2000) {
      		  inss = (salario*8.5)/100;
      		  System.out.println ( "desconto:" +inss);
      	  }else {
      		  inss = (salario*11)/100;
      	  }
      	    i = i+1;
      	    System.out.println (" inss: " +inss); 
        }while (i<=4);
        
        leitura.close();


	}

}
