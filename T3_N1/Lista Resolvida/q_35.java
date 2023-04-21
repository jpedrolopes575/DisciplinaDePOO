package br.edu.principal;
import java.text.DecimalFormat;
import java.util.Scanner;
public class q_35 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int codigo, qtd;
		        double valor_item, valor_total = 0;
		        String resp= "";
		        System.out.println("---- Produto ------ Código ---- Preço \nCachorro-Quente ---- 100 ---- R$1,20\nBauru simples ------ 101 ---- R$1,30\nBAuru com ovo ------ 102 ---- R$1,50\nHambúguer ---------- 103 ---- R$1,20\nCheeseburguer ------ 104 ---- R$1,30\nRefrigerante ------- 105 ---- R$1,00");

		        do {
		            System.out.println("Digite o código do item: ");
		            codigo = scanner.nextInt();

		            System.out.println("Digite a quantidade desejada: ");
		            qtd = scanner.nextInt();

		            if (codigo == 100) {
		                System.out.println("Cachorro Quente - Valor do item: R$" + (1.20 * qtd));
		                valor_item = 1.20 * qtd;
		            } else if (codigo == 101) {
		                System.out.println("Bauru Simples - Valor do item: R$" + (1.30 * qtd));
		                valor_item = 1.30 * qtd;
		            } else if (codigo == 102) {
		                System.out.println("Bauru com Ovo - Valor do item: R$" + (1.50 * qtd));
		                valor_item = 1.50 * qtd;
		            } else if (codigo == 103) {
		                System.out.println("Hambúrguer - Valor do item: R$" + (1.20 * qtd));
		                valor_item = 1.20 * qtd;
		            } else if (codigo == 104) {
		                System.out.println("Cheeseburguer - Valor do item: R$" + (1.30 * qtd));
		                valor_item = 1.30 * qtd;
		            } else if (codigo == 105) {
		                System.out.println("Refrigerante - Valor do item: R$" + (1.0 * qtd));
		                valor_item = 1.0 * qtd;
		            } else {
		                System.out.println("Código de item inválido!");
		                continue;
		            }

		            valor_total += valor_item;

		            System.out.println("Deseja mais alguma coisa? (S ou N): ");
		            resp = scanner.next();

		        } while (!resp.equalsIgnoreCase("N"));

		        System.out.println("Valor total do pedido: R$" + new DecimalFormat("#,##0.00").format(valor_total));
		    }

	}
