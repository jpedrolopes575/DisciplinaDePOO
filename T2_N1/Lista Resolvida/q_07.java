package br.edu.principal;

import java.util.Scanner;

public class q_07 {

	public static void main(String[] args) {
		// Programa que recebe três números e os coloca em ordem crescente, decrescente, e o maior número no meio
		
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
		
		System.out.println("Insira um valor para I (1,2 ou 3):");
		I = sc.nextDouble();
		if (I==1) {
				(A < B) & (A < C) }
			if(B < A) {
				System.out.println("Ordem crescente:" A +" - "+ B+" - "+ C);	
			}
			else  { 
				System.out.println("Ordem crescente: "+ A +" - "+ C +" - "+ B);
			}
		}
		
		 if ((B < A) & (B < C)){
		 else if(A < C) {
				System.out.println("Ordem crescente : "+ B +" - "+ A +" - "+ C);	
			}
			else  { 
				System.out.println("Ordem crescente:"+ B +" - "+ C +" - "+ A);
			}
		}
		
		 if ((C < A) & (C < B)){
		 else if(A < B) {
				System.out.println("Ordem crescente:"+C +" - "+ A +" - "+ B);	
			}
			else  { 
				System.out.println("Ordem crescente :"+ C +" - "+ B +" - "+ A );
			}
		}
		
	
		}
	if (I==2) {
		((A > B) & (A > C)){
		if(B > A) {
			System.out.println("Ordem Decrescente:" A +" - "+ B+" - "+ C);	
		}
		else  { 
			System.out.println("Ordem crescente: "+ A +" - "+ C +" - "+ B);
		}
	}
	
	 if ((B > A) & (B > C)){
	 else if(A > C) {
			System.out.println("Ordem Decrescente : "+ B +" - "+ A +" - "+ C);	
		}
		else  { 
			System.out.println("Ordem Decrescente:"+ B +" - "+ C +" - "+ A);
		}
	}
	
	 if ((C > A) & (C > B)){
	 else if(A > B) {
			System.out.println("Ordem Decrescente:"+C +" - "+ A +" - "+ B);	
		}
		else  { 
			System.out.println("Ordem Decrescente :"+ C +" - "+ B +" - "+ A );
		}
	}
	
	if (I==3) {
		(A > B) & (A > C); {
				System.out.println("Ordem Desejada é:" B +" - "+ A +" - "+ C);	
			}
		}
		
		 if ((B > A) & (B > C)){
		  {
				System.out.println("Ordem Desejada é : "+ A +" - "+ B +" - "+ C);	
			}
		}		
		 if ((C > A) & (C > B)){
		  {
				System.out.println("Ordem Desejada é:"+A +" - "+ C +" - "+ B);	
			}
			
		}
		

		}
	}
	}