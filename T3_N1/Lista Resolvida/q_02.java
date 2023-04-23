package br.edu.principal;
import java.util.Scanner;
public class q_02 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);

		    int n;
		    double e = 1.0;

		    System.out.print("Digite um valor inteiro e positivo para N: ");
		    n = entrada.nextInt();

		    for (int i = 1; i <= n; i++) {
		      int fat = 1;
		      for (int j = 1; j <= i; j++) {
		        fat *= j;
		      }
		      e += 1.0 / fat;
		    }

		    System.out.printf("O valor de E é: %.2f", e);

		    entrada.close();
		  }
		}
