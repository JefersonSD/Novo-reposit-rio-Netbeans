package exercicios_aula_14_e_15;

import java.util.Scanner;

public class ImprimeMaior {

	public static void main(String[] args) {

		// 1. Faça um Programa que peça dois números e imprima o maior deles.

		Scanner t = new Scanner(System.in);
		System.out.println("Informe 1 número: ");
		int num1 = t.nextInt();
		System.out.println("Informe outro número: ");
		int num2 = t.nextInt();

		if (num1 > num2) {
			System.out.println("Maior número: " + num1);
		} else {
			System.out.println("Maior número: " + num2);
		}

	}

}
