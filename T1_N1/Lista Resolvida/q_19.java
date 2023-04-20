package br.edu.principal;

import java.util.Scanner;

public class q_19 {

	public static void main(String[] args) {
		// Programa que calcula a altura de degraus para subir
		double a_degrau;
		double a_usuario;
		double qtd_degraus;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor da altura (em metros) dos degraus:");
		a_degrau = sc.nextDouble();
		
		System.out.println("insira a altura (em metros) que você deseja alcançar:");
		a_usuario = sc.nextDouble();
		qtd_degraus = a_usuario/a_degrau;
		
		System.out.println("A quantidade de degraus a ser subida é de: "+ Math.round(qtd_degraus)+" degraus");
		
		
	}

}