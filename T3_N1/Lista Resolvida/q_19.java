package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class q_19 {

	public static void main(String[] args) {
		
		        int Pessoas = 15; 
		        double maiorAlt = 0.0; 
		        double menorAlt = Double.MAX_VALUE; 
		        double somaAltM = 0.0; 
		        int numH = 0; 
		        String sexoMaisAlt = "";

		        Scanner sc = new Scanner(System.in);

		        
		        for (int i = 1; i <= Pessoas; i++) {
		            System.out.println("Insira a altura da pessoa " + i + ":");
		            double altura = sc.nextDouble();

		            System.out.println("Insira o sexo da pessoa " + i + " (M/F):");
		            String sexo = sc.next();

		          
		            if (altura > maiorAlt) {
		                maiorAlt = altura;
		                sexoMaisAlt = sexo;
		            }
		            if (altura < menorAlt) {
		                menorAlt = altura;
		            }

		           
		            if (sexo.equalsIgnoreCase("F")) {
		                somaAltM += altura; 
		            } else if (sexo.equalsIgnoreCase("M")) {
		                numH++; 
		            }
		        }

		        
		        double mediaMulheres = somaAltM / Pessoas;

	
		        System.out.println("Maior altura do grupo: " + maiorAlt+" cm");
		        System.out.println("Menor altura do grupo: " + menorAlt+" cm");
		        System.out.println("Média de altura das mulheres: " + new DecimalFormat("#,##0.00").format(mediaMulheres));
		        System.out.println("Número de homens: " + numH);
		        System.out.println("Sexo da pessoa mais alta: " + sexoMaisAlt);
		    }

		}
