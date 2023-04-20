package br.edu.principal;

import java.util.Scanner;

public class q_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade = 0;
		System.out.println("Qual a sua idade?");
		idade = sc.nextInt();
		if (idade>=18) {
			System.out.println("Idade: "+ idade+ ", maior de idade.");

	}
		else {
			System.out.println("Idade: "+idade+", menor de idade. ");
		 }
	}

}
