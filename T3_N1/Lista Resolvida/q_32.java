package br.edu.principal;

import java.lang.Math;

import java.util.Scanner;
public class q_32 {

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Digite a base: ");
		        double x = sc.nextDouble();

		        System.out.println("Digite o expoente: ");
		        double y = sc.nextDouble();

		        double result = Math.pow(x, y);

		        System.out.printf("%.2f ^ %.2f é igual a %.2f%n", x, y, result);

		        //scanner.close();
		    }
		}

