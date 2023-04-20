package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // Código que recebe quatro numeros digitados e soma todos eles
				Scanner sc = new Scanner(System.in);
				int n1;
				int n2;
				int n3;
				int n4;
				System.out.println("Digite o primeiro número número: ");
				n1 = sc.nextInt();
				
				System.out.println("Digite o segundo número: ");
				n2 = sc.nextInt();
				
				System.out.println("Digite o terceiro número: ");
				n3 = sc.nextInt();
				
				System.out.println("Digite o quarto número: ");
				n4 = sc.nextInt();
				
				System.out.println("A soma dos quatro números é igual a: "+(n1+n2+n3+n4));
			}
	}

