package br.edu.principal;
import java.util.Scanner;

public class q_16 {
	
		public static void main(String[] args) {
		//Programa que recebe dois números,calcula a soma dos números pares do intervalo, 
		//e a múltiplicação dos ímpares do intervalo	
		Scanner sc = new Scanner(System.in);
		double num1; 
		double num2; 
		double soma; 
		double mult;
		soma = 0;
		mult = 1;
		System.out.println("****************************");
		System.out.println("*Diga 2 números...*");
		System.out.println("****************************");
		System.out.print("Insira seu primeiro número: ");
		num1 = sc.nextDouble();
		System.out.print("Insira seu segundo número: ");
		num2 = sc.nextDouble();
		
		
		if (num1 > num2) {
		    for (double i = num2; i <= num1; i++) {
		       if ((i%2) == 0) {
		            soma = soma + i;
		        }  
		        else {  
		            mult = mult * i; 
		        } 
		    }
		} 
		
		if (num1 == num2) {
		    if((num1%2) == 0) {
		        soma = soma + num1;
		    }
		    else {
		        mult = mult * num1;
		    }
		}
		
		if (num1 < num2) {
		    for (double i = num1; i <= num2; i++) {
		        if ((i%2) == 0) {
		            soma = soma + i;
		        }  
		        else {  
		            mult = mult * i; 
		        }
		    }  
		}   
		               
        
        System.out.println(" ");
        System.out.println("Soma dos números pares do intervalo, juntamente aos inseridos é: "+soma);
        System.out.println("Multiplicaão dos ímpares desse intervalo, juntamente aos números digitados é: "+mult);
	}	
}