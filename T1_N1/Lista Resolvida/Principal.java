package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Programa que mostra a parte inteira, fracionária e arredondada de um número
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número real:");
		
		double num = sc.nextDouble();
		double i = Math.floor(num);
		double f = num - i;
		double a = Math.round(num);
		
		System.out.println("Parte inteira do número: " + i);
		System.out.println("Parte fracionaria do número: " + f);
		System.out.println("Parte arredondada do número digitado é: " + a); }
	}
