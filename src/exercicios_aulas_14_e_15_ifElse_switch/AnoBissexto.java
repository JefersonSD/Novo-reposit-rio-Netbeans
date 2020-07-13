package exercicios_aulas_14_e_15_ifElse_switch;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		/*
		 * 17.Faça um Programa que peça um número correspondente a um determinado ano e
		 * em seguida informe se este ano é ou não bissexto.
		 */

		Scanner t = new Scanner(System.in);
		System.out.println("Informe um número correspondente a um ano para saber se é bissexto ou não:");
		int ano = t.nextInt();

		if (ano % 4 == 0 || ano % 400 == 0 && ano % 100 != 0) {

			System.out.println("É ano bissexto!");

		} else {
			System.out.println("Não é ano bissexto!");

		}
	}

}
