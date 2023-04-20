package br.edu.principal;
import java.util.Scanner;

public class q_04 {
	public static void main(String[] args) {
		//Programa que aumenta 25% de um salário para um funcionário
		Scanner sc = new Scanner(System.in);
		
		double sal;
		double aum;
		
		System.out.println("Insira o valor do respectivo salário:");
		sal = sc.nextDouble();
		aum = 0.25*sal;
		
		System.out.println("O salário juntemente com o aumento tem o valor de: "+ (aum+sal));
	}
}
