package br.edu.principal;
import java.util.Scanner;
public class q_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cateto1 = 0;
		double cateto2 = 0;
		System.out.println("Digite o tamanho do primeiro cateto: ");
		cateto1 = sc.nextDouble();
		System.out.println("Digite o tamanho do primeiro cateto: ");
		cateto2 = sc.nextDouble();
		double hip = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
		System.out.println("O valor da hipotenusa é: " + hip);
		
	}

}
