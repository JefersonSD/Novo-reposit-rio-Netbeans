package exercicios_aulas_14_e_15_ifElse_switch;

import java.util.Scanner;

public class IndicaMaisBarato {

	public static void main(String[] args) {
		/*
		 * 8. Faça um programa que pergunte o preço de três produtos e informe qual
		 * produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
		 */

		Scanner t = new Scanner(System.in);
		System.out.println("Informe o preço do 1º produto: ");
		double preco1 = t.nextDouble();
		System.out.println("Informe o preço do 2º produto:");
		double preco2 = t.nextDouble();
		System.out.println("Informe o preço do 3º produto: ");
		double preco3 = t.nextDouble();

		if (preco1 <= preco2 && preco1 <= preco3) {
			System.out.println("Você deve comprar o produdo cujo preço é: " + preco1);

		} else if (preco2 <= preco1 && preco2 <= preco3) {
			System.out.println("Você deve comprar o produdo cujo preço é: " + preco2);

		} else {
			System.out.println("Você deve comprar o produdo cujo preço é: " + preco3);

		}

	}

}
