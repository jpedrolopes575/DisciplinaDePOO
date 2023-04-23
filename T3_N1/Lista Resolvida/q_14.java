package br.edu.principal;

public class q_14 {
    public static void main(String[] args) {
		//Programa que calcula a soma dos 50 primeiros números pares
		int soma = 0; 
		int num = 2;
		int qtd = 0;
		
		do {
		    
		   soma = soma + num;
		   num = num + 2;
		   qtd++;
		    
		} while (qtd < 50);
		
		System.out.println("Soma dos 50 primeiros números pares é: "+soma);
	}
}
