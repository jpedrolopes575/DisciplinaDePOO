package br.edu.principal;

import java.util.Scanner;

public class q_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int sal = 0;
		double vend = 0;
		System.out.println("Digite o seu salário fixo: ");
		sal = sc.nextInt();
		System.out.println("Digite o valor de suas vendas: ");
		vend = sc.nextInt();
		double comis =  ((vend/100)*4);
		double perc = comis + sal;
		System.out.print("Sua comisão é: R$" + comis + "\nO valor que você deve receber é: R$" + perc);	

	}

}
