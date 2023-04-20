package br.edu.principal;

import java.util.Scanner;
import java.text.DecimalFormat;

public class q_03 {

	public static void main(String[] args) {
		//Programa que recebe três notas, com seus respectivos pesos, calculando a média ponderada.	
		
		double n1;
		double n2;
		double n3;
		int p1;
		int p2;
		int p3;
		double mf;
				
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("insira sua primeira nota:");
		n1 = sc.nextDouble();
		
		System.out.println("insira o peso da primeira nota:");
		p1 = sc.nextInt();
		
		System.out.println("Insira a segunda nota:");
		n2 = sc.nextDouble();
		
		System.out.println("Insira o peso da segunda nota:");
		p2 = sc.nextInt();
		
		System.out.println("Insira a terceira nota:");
		n3 = sc.nextDouble();
		
		System.out.println("Insira o peso da terceira nota:");
		p3 = sc.nextInt();
				
		mf = (n1 * p1 + n2 * p2 + n3 * p3)/(p1 + p2 + p3);
				
		DecimalFormat df = new DecimalFormat("#.00");
				
		System.out.println("Sua média ponderada é: " + df.format(mf));
		

	}

}
