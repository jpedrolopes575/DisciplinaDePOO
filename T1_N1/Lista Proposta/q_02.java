package br.edu.principal;

import java.util.Scanner;

public class q_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		System.out.println ("Digite o primeiro número da sua multiplicação: ");
		num1 = sc.nextInt();
		System.out.println ("Digite o segundo número (diferente de 0) da sua multiplicação: ");
		num2 = sc.nextInt();
		System.out.println ("Digite o terceeiro número da sua multiplicação: ");
		num3 = sc.nextInt();
		double mult = num1*num2*num3;
		System.out.println("o resultado da sua multiplição é: " + mult);

	}

}
