package br.edu.principal;

import java.util.Scanner;

import java.text.DecimalFormat;

public class q_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sexo = 0;
		double altura = 0;
		System.out.println("Informe seu sexo: 1 para Feminino ou Masculino.");
		sexo = sc.nextInt();
		System.out.println("Informe sua altura, na forma decimal (ex: 1,55)");
		altura = sc.nextDouble();
		
		if (sexo == 1) { 
			double peso1= (62.1*altura)-44.7;
			System.out.print("Seu peso ideal é de: ");
			  System.out.println( new DecimalFormat("#,##0.00").format(peso1)+" kg" );}
			  else if (sexo == 2) {
	    	double peso2= (72.7*altura)-58;
	    	System.out.print("Seu peso ideal é de: ");
	    	  System.out.println( new DecimalFormat("#,##0.00").format(peso2) +" kg");
	    }
			
		}
	}


