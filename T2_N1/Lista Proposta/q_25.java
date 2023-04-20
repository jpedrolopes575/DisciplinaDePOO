package br.edu.principal;

import java.util.Scanner;

public class q_25 {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				double horasT = 0;
				double horasF = 0;
				System.out.println ("Digite o número de horas extras trabalhadas: ");
				horasT = sc.nextDouble();
				System.out.println ("Digite o número de horas de falta: ");
				horasF = sc.nextDouble();
				double minT = horasT*60;
				double minF = horasF*60;
				double H1= minF*2/3;
				double H2= minT-H1;
				System.out.println(minT);
				System.out.println(minF);
				System.out.println(H2);
				
				if (H2<600) {
					System.out.println("Gratificação de R$100,00");
					
				}
				if (H2>=600&&H2<1200) {
					System.out.println("Gratificação de R$200,00");
					
				}
				if (H2>=1200&&H2<=1800) {
					System.out.println("Gratificação de R$300,00");
					
				}
			
				if (H2>=1800&&H2<2400) {
					System.out.println("Gratificação de R$400,00");
				
				}
				if (H2>1400)
					System.out.println("Gratificação de R$500,00");
					
				}

			}