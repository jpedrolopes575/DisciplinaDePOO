package br.edu.principal;

import java.util.Scanner;

public class q_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		double num1 = 0;
		double num2 = 0;
		
		System.out.println("***Operações com dois números***\n \n");
		
		System.out.println("Informe o primeiro número.");
		num1 = sc.nextDouble();
		System.out.println("Informe o segundo número.");
		num2 = sc.nextDouble();
		System.out.println("Escolha um cálculo para dois números: \n 1- Média entre os dois números \n 2- Diferença do maior pelo menor \n 3- O produto entre os dois números ");
		opc = sc.nextInt();
		
        if (opc==1) {
        
        	double med = (num1+num2)/2; 
        	System.out.println("A média é "+ med);
        }
        else if(opc==2) {
        	if (num1>num2) {
        		double dif1= num1 - num2;
        		System.out.println("A diferença é "+ dif1);
        	}
        	else {
        		double dif2= num2 - num1;
        		System.out.println("A diferença é "+ dif2);
        	}
        }
        else if(opc==3) {
        	double prodt= num1 * num2;
        	System.out.println("O produto é "+ prodt);
        	
        }
        else {
        	System.out.println("Nenhuma da opções foi escolhida. Programa encerrado.");
        }
	}
	

}
