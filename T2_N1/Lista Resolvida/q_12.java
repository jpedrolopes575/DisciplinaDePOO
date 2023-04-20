package br.edu.principal;
import java.util.*;

public class q_12 {

	public static void main(String[] args) {
		//Programa que recebe o cargo de um funcionário, mostra o cargo, valor do aumento e novo salario
		Scanner sc = new Scanner(System.in);
		   
		double sal; 
		double aumento; 
		double novoSal = 0.0;
		int cargo = 0;
		
	    System.out.println("-------------------------------------");
        System.out.println("1 - Escrituário");
        System.out.println("2 - Secretário");
        System.out.println("3 - Caixa ");
        System.out.println("4 - Gerente");
        System.out.println("5 - Diretor");
        System.out.println("-------------------------------------");
	    
	    System.out.print("Insira a colocação do funcionário: ");
	    cargo = sc.nextInt();
	    
	    System.out.print("Insira o respectivo salário: ");
	    sal = sc.nextDouble();
	    
	    System.out.println(" ");
	    
	    if (cargo == 1) {
	        System.out.println("Escrituário");
	        aumento = sal*50 /100.0;
	        System.out.println("Aumento de: R$ "+aumento);
	        novoSal = sal + aumento;
	        System.out.println("Novo salário: R$ "+ novoSal);
	    }
	    
	    else if (cargo == 2) {
	        System.out.println("Secretário");
	        aumento = sal*35 /100.0;
	        System.out.println("Aumento de: R$ "+aumento);
	        novoSal = sal + aumento;
	        System.out.println("Novo salário: R$ "+ novoSal);
	    }
	    
	    else if (cargo == 3) {
	        System.out.println("Caixa");
	        aumento = sal*20 /100.0;
	        System.out.println("Aumento de: R$ "+aumento);
	        novoSal = sal + aumento;
	        System.out.println("Novo salário: R$ "+ novoSal);
	    }
	    
	    else if (cargo == 4) {
	        System.out.println("Gerente");
	        aumento = sal*10 /100.0;
	        System.out.println("Aumento de: R$ "+aumento);
	        novoSal = sal + aumento;
	        System.out.println("Novo salário: R$ "+ novoSal);
	    }
	    
	    else if (cargo == 5) {
	        System.out.println("Diretor.");
	        System.out.println("Sem aumento");


	        System.out.println("Salário : R$ "+ sal);
	    }
	    
	    else {
	        System.out.println("Este cargo não existe");
	    }
	  
		}

	}
