package br.edu.principal;
import java.util.Scanner;

public class q_07 {
	public static void main(String[] args) {
		// Programa que calcula salario com gratificação e imposto
		Scanner sc = new Scanner(System.in);
		
		double sal;
		double imp;
		
		System.out.println("Insira o valor do respectivo salário: ");
		sal = sc.nextDouble();
		imp = sal * 10/100;
		System.out.println("O valor do respectivo salário com gratificação de R$ 50,00 + imposto será: "+((sal+50)-imp));
	}

}
