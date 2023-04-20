package br.edu.principal;

import java.util.Scanner;

public class q_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double peso = 0.0;
		System.out.println("Digite seu peso em kg: ");
		peso = sc.nextDouble();
		double peso15 = (peso*15)/100;
		double peso20 = (peso*20)/100;
		double peso115 = peso + peso15;
		double peso220 = peso - peso20;
		System.out.println("Seu peso: " + peso + "\nSeu peso +15%: " + peso115 + "\nSeu peso -20%: " + peso220);

	}

}
