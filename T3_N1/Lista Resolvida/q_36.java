package br.edu.principal;
import java.util.Scanner;

public class q_36 {
	
	public static void main(String[] args) {
		//Programa que calcula a média de idades de um grupo de indivíduos
		Scanner sc = new Scanner(System.in);
		
		int idade;
		int qtd;
		int n;
		double media;
		double soma = 0;
		n = 1;
	    qtd = 0;
	    System.out.println("****************************");
	    System.out.println("*Média de idades de um grupo:*");
	    System.out.println("****************************");
	    System.out.println("Quando você digitar todas as idades(dos indivíduos), digite 0");
	    System.out.print("Digite a idade do 1° idivíduo: ");
	    idade = sc.nextInt();
	    
	    while (idade > 0) {
	        n++;
	        soma = soma + idade;
	        qtd = qtd + 1;
	        System.out.print("Insira a idade do "+n+"° idivíduo: ");
	        idade = sc.nextInt();
	    }
		
		System.out.println(" ");
		media = soma/qtd;
		System.out.println("A média das idades do grupo é igual a: "+media+" anos.");	
	}


}