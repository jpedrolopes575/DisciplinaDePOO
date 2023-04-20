package br.edu.principal;

import java.util.Scanner;

public class q_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = 0;
		System.out.println("Digite o número da tabuada desejada: ");
		num = sc.nextInt();
		int i = 0;
		while(i<=10) {
			int result = num*i;
			System.out.println(num + "*" + i + "=" + result);
			i++;}

	}

}
