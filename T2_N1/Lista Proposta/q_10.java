package br.edu.principal;

import java.util.Scanner;

public class q_10 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		double custoF= 0;
		System.out.println("Qual o custo de fábrica?");
		custoF= sc.nextDouble();
 
		if (custoF<=12000) {
			double percDist= (custoF*5)/100;
			double valFinal= percDist+custoF; 
			System.out.println("Valor do distribuidor: "+percDist+ "\nValor de importos: insenso." + "\nValor final de custo: "+valFinal);
		}
		else if  (12000<custoF&&custoF<=25000) {
			double percDist= (custoF*10)/100;
			double percImpos= (custoF*15)/100;
			double valFinal= percDist+percImpos+custoF; 
			System.out.println("Valor do distribuidor: "+percDist+ "\nValor de importos: "+ percImpos+ "\nValor final de custo: "+valFinal);
		}
		else if  (custoF>25000) {
			double percDist= (custoF*15)/100;
			double percImpos= (custoF*20)/100;
			double valFinal= percDist+percImpos+custoF; 
			System.out.println("Valor do distribuidor: "+percDist+ "\nValor de importos: "+ percImpos+ "\nValor final de custo: "+valFinal);
		}

	}

}
