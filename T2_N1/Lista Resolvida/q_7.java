package br.edu.principal;

import java.util.Scanner;

public class q_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    double A = 0.0;
        double B = 0.0;
        double C = 0.0;
        double I = 0.0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor para A:");
        A = sc.nextDouble();

        System.out.println("Insira um valor para B:");
        B = sc.nextDouble();

        System.out.println("Insira um valor para C:");
        C = sc.nextDouble();

        System.out.println("Insira um valor para I\n 1- Ordem Crescente\n 2- Ordem Decrescente\n 3- O maior fica entre os dois números");
        I = sc.nextDouble();

        if (I == 1) {
            if (A < B && A < C) {
                if (B < C) {
                    System.out.println("Ordem crescente: " + A + " - " + B + " - " + C);
                } else {
                    System.out.println("Ordem crescente: " + A + " - " + C + " - " + B);
                }
            } else if (B < A && B < C) {
                if (A < C) {
                    System.out.println("Ordem crescente: " + B + " - " + A + " - " + C);
                } else {
                    System.out.println("Ordem crescente: " + B + " - " + C + " - " + A);
                }
            } else {
                if (A < B) {
                    System.out.println("Ordem crescente: " + C + " - " + A + " - " + B);
                } else {
                    System.out.println("Ordem crescente: " + C + " - " + B + " - " + A);
                }
            }
        } else if (I == 2) {
            if (A > B && A > C) {
                if (B > C) {
                    System.out.println("Ordem decrescente: " + A + " - " + B + " - " + C);
                } else {
                    System.out.println("Ordem decrescente: " + A + " - " + C + " - " + B);
                }
            } else if (B > A && B > C) {
                if (A > C) {
                    System.out.println("Ordem decrescente: " + B + " - " + A + " - " + C);
                } else {
                    System.out.println("Ordem decrescente: " + B + " - " + C + " - " + A);
                }
            } else {
                if (A > B) {
                    System.out.println("Ordem decrescente: " + C + " - " + A + " - " + B);
                } else {
                    System.out.println("Ordem decrescente: " + C + " - " + B + " - " + A);
                }
            }
        } else if (I == 3) {
            if (A > B && A > C) {
                System.out.println("Ordem desejada é: " + B + " - " + A + " - " + C);
            } else if (B > A && B > C) {
                System.out.println("Ordem desejada é:" + A + " - " + B + " - " + C);
                } else if(C > A && C > B) {
                	System.out.println("Ordem desejada é:" + A + " - " + C + " - " + B);
                }
            
            }
            }

   
	}
