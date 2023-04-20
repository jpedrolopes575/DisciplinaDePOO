package br.edu.principal;

import java.util.Scanner;

public class q_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int id = 0;
		int ano = 0;
		System.out.println("Digite o ano do seu nascimento: ");
		id = sc.nextInt();
		System.out.println("Digite o ano atual: ");
		ano = sc.nextInt();
		int idAno = ano - id;
		int idMes = idAno*12;
		int idSemn = idAno*52;
		int idDia = idAno*365;
		System.out.println("Sua idade em: \n" + "Anos: \n" + idAno + "\nMeses: \n" + idMes + "\nSemanas: \n" + idSemn + "\nDias: \n" + idDia);

	}

}
