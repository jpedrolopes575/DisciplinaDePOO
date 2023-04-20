package br.edu.principal;

import java.util.Scanner;

public class q_20 {

	public static void main(String[] args) {
	//Programa que recebe código de um produto, seu peso, e o país de origem
	Scanner sc = new Scanner(System.in);
	
	double PesoQuilos = 0.0;
	double PesoGramas = 0.0;
	
	System.out.println("Insira o código do produto (1 a 10):");
	int produto = sc.nextInt();
	System.out.println("Insira o código do país que o produto vem (1 a 3):");
	int país = sc.nextInt();
	System.out.println("Insira o peso do prduto(Kg): ");
	
	double quilo = sc.nextDouble();
	double PreçoGramas = 0.0;
	double imposto = 0.0;
	
	if (produto >= 1 && produto <= 4) {
		PreçoGramas = 10;
		} 
	else if (produto >= 5 && produto <= 7) {
		PreçoGramas = 25;
		} 
	else if (produto >= 8 && produto <= 10) {
		PreçoGramas = 35;
		} 
	else {System.out.println("Escolha opções válidas."); 
	}
	
	PesoGramas = quilo * 1000;
	
	double PreçoTotal = PesoGramas * PreçoGramas;
	System.out.println("O peso do produto em gramas é: "+ PesoGramas +" gramas");
	System.out.println("Valor sem os impostos:");
	System.out.println("Preço do produto em g:" + PreçoTotal +"reais");
	
	if (país == 1) {
		imposto = 0;
		System.out.println("O valor do imposto será de "+ imposto + " reais");
	} 
	else if (país == 2) {
		imposto = PreçoTotal * 0.15;
		System.out.println("O valor do imposto será de "+ imposto + " reais");
		} 
	else if (país == 3) {
		imposto = PreçoTotal * 0.25;
		System.out.println("O valor do imposto será de "+ imposto + " reais");
		} 
	else {
		System.out.println("Escolha apenas uma das três opções!!!"); }
	
	double ValorTotal = PreçoTotal + imposto;
	System.out.println("Valor com imposto");
	System.out.println("Valor total do produto: " + ValorTotal + " reais.");
	}}
