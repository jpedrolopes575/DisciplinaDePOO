package br.edu.principal;
import java.util.Scanner;

public class q_18 {

	public static void main(String[] args) {
		// Programa que mostra  a quantidade de ração após 5 dias 
		Scanner sc = new Scanner(System.in);

		double peso_saco;
		double racao_gato1;
		double racao_gato2;
		double totalfinal;
		
		System.out.println("Insira o peso total do saco de ração em kg ");
		peso_saco = sc.nextDouble();
		
		System.out.println("Insira a quantidade (em gramas) que será dado ao gato1 por dia: ");
		racao_gato1 = sc.nextDouble();
		racao_gato1 = racao_gato1 / 1000;
		
		System.out.println("insira a quantidade (em gramas) que será dado ao gato2 por dia: ");
		racao_gato2 = sc.nextDouble();
		racao_gato2 = racao_gato2 / 1000;
		totalfinal = peso_saco - 5*(racao_gato1 + racao_gato2);
		
		System.out.println("Após um total de 5 dias restará:"+ totalfinal + " Kg de ração");
		
	}

}