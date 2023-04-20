package br.edu.principal;

import java.util.Scanner;

public class q_04 {

	public static void main(String[] args) {
		// Programa que recebe três números e os coloca em ordem crescente
		
		double num1 = 0.0;
		double num2 = 0.0;
		double num3 = 0.0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número:");
		num1 = sc.nextDouble();
		
		System.out.println("Insira o segundo número:");
		num2 = sc.nextDouble();
		
		System.out.println("Insira o terceiro número:");
		num3 = sc.nextDouble();
		
		if ((num1 < num2) & (num1 < num3)){
			if(num2 < num3) {
				System.out.println("Ordem crescente:"+num1 +" - "+ num2+" - "+num3);	
			}
			else  { 
				System.out.println("Ordem crescente: "+num1 +" - "+ num3+" - "+num2);
			}
		}
		
		else if ((num2 < num1) & (num2 < num3)){
			if(num1 < num3) {
				System.out.println("Ordem crescente : "+num2 +" - "+ num1+" - "+num3);	
			}
			else  { 
				System.out.println("Ordem crescente:"+num2 +" - "+ num3+" - "+num1);
			}
		}
		
		else if ((num3 < num1) & (num3 < num2)){
			if(num1 < num2) {
				System.out.println("Ordem crescente:"+num3 +" - "+ num1+" - "+num2);	
			}
			else  { 
				System.out.println("Ordem crescente :"+num3 +" - "+ num2+" - "+num1);
			}
		}
		
	
		}
	
	}
