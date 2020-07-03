package exercicios_aula_14_e_15;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		/*
		 * 18.Faça um Programa que peça um número inteiro e determine se ele é par ou
		 * impar. Dica: utilize o operador módulo (resto da divisão).
		 */

		Scanner t = new Scanner(System.in);
		System.out.println("Informe um número para saber se é par ou impar:");
		int numero = t.nextInt();

		if (numero % 2 == 0) {

			System.out.println("É par!");
		} else {
			System.out.println("É impar!");
		}
	}

}
