package br.edu.principal;
import java.util.Scanner;
public class q_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("Digite a base da potencia:");
		 int base = sc.nextInt();
		 System.out.println("Digite a potencia:");
		 int pot = sc.nextInt();
		
		 double resultado = base;
		
		 for (int i=1; i<pot; i++) {
			 resultado *= base;
		 }
		 System.out.println("Resultado: " + resultado);
		
		}

	}
