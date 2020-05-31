package aula17_exercicios_aula_16_e_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		/*
		 * 23 - Faça um programa que mostre todos os primos entre 1 e N sendo N um
		 * número inteiro fornecido pelo usuário. O programa deverá mostrar também o
		 * número de divisões que ele executou para encontrar os números primos. Serão
		 * avaliados o funcionamento, o estilo e o número de testes (divisões)
		 * executados.
		 */

		Scanner t = new Scanner(System.in);
		List<Double> lista = new ArrayList<Double>();
		System.out.println("Informe um número inteiro maior que 0:");
		double numero = t.nextDouble(), contador = 0, contador1 = 0;

		for (double i = numero; i > 0; i--) {
			for (double j = i; j > 0; j--) {
				contador++;
				if (i % j == 0) {
					contador1++;
				}

			}

			if (contador1 == 2) {

				lista.add(i);

			}
			contador1 = 0;

		}

		System.out.println("Números primos entre 1 e " + numero + ": " + lista);
		System.out.println("Quantidade de divisões para encontrar os números primos: " + contador);
	}

}
