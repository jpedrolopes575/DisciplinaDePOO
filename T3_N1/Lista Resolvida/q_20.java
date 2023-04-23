package br.edu.principal;

public class q_20 {

	public static void main(String[] args) {
		 double cels, faren;
		 System.out.println("****************************");
		 System.out.println("*Tabela de Conversão Fahrenheit to Celsius*");
		 System.out.println("****************************");
		    System.out.println("Fahrenheit\tCelsius");
		    for(faren = 50; faren <= 65; faren++) {
		      cels = 5.0/9.0*(faren - 32);
		      System.out.printf("%.0f\t\t%.2f\n", faren, cels);
		    }
		  }
		}
