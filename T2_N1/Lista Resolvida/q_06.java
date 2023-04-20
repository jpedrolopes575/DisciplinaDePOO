package br.edu.principal; 
import java.util.Scanner; 
  
public class q_06 { 
  
public static void main(String[] args) {
//Programa que recebe um número e verifica se ele é par ou ímpar
Scanner sc = new Scanner(System.in);

double num1=0;
System.out.println("****************************");
System.out.println("*O número é par ou ímpar?*");
System.out.println("****************************");
System.out.print("Insira um número inteiro: ");
num1 = sc.nextDouble();

if(num1 % 2 == 0){
System.out.println("O número digitado é par");
}

else{
System.out.println("O número digitado é ímpar");}
}
}
