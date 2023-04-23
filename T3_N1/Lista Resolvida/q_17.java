package br.edu.principal;
import java.util.Scanner;

public class q_17 {
	
	public static void main(String[] args) {
		//Programa que recebe dois números, se forem crescentes,média do intervalo,
		//decrescentes=quantidade de números pares,caso os números forem iguais, mensagem
		Scanner sc = new Scanner(System.in);
		double num1; 
		double num2; 
		double media;
		double soma = 0;
		int qtd = 0;
		int qtdPares = 0;
		System.out.println("****************************");
		System.out.println("*Calcula média e qtd de nmrs pares*");
		System.out.println("****************************");
		System.out.print("insira seu primeiro número: ");
		num1 = sc.nextDouble();
		System.out.print("Insira seu segundo número: ");
		num2 = sc.nextDouble();
		
		System.out.println(" ");
		
		if (num1 < num2) {
		    for (double i = num1; i <= num2; i++) {
		        soma = soma + i;
		        qtd = qtd + 1;
		    }
		media = soma/qtd;
		System.out.println("Intervalo crescente, a média dos números do intervalo é: "+media);
		}
		
		if (num1 > num2) {
		    for (double i = num2; i <= num1; i++) {
		        if ((i%2) == 0) {
		            qtdPares = qtdPares + 1;
		        }
		    }
		System.out.println("Intervalo decrescente, a quantidade de números pares nesse intervalo é: "+qtdPares);    
		}
		if (num1 == num2) {
		    System.out.println("Números iguais, tente novamente...");
		}
	}
	

}
