package br.edu.principal;
import java.util.Scanner;
public class q_06 {

    
	 public static void main(String[] args) {
//programa que calcula o valor final de um salário com gratificaçao de 5% e imposto de 7%
		double sal;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor do seu salário: ");
		sal = sc.nextDouble();
		
		 double grat = sal * 1.05;
		 double imp = sal * 1.07;
		 float salreceber = (float) (sal + grat - imp);
		 
		 System.out.println("O valor final do seu salário será de: " +salreceber);
	}
}
