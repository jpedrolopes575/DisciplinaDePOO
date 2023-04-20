package br.edu.principal;
import java.util.Scanner;
public class q_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("Calculo da base de um TRIANGULO");
		 int base = 0;
		 int altura = 0;
		 System.out.println("Digite o valor da base do triângulo: ");
	base = sc.nextInt();
	System.out.println("");
	System.out.println("Digite o valor da altura do triângulo: ");
	altura = sc.nextInt();
	System.out.println("");
	double area = (base * altura) / 2;
	System.out.println("A área do triângulo é " + area);
		
		}

	}

