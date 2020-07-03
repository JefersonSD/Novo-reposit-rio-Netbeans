package exercicios_aula_14_e_15;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		// 7. Faça um Programa que leia três números e mostre o maior e o menor deles.

		Scanner t = new Scanner(System.in);
		System.out.println("Informe o 1º número: ");
		int num1 = t.nextInt();
		System.out.println("Informe o 2º número:");
		int num2 = t.nextInt();
		System.out.println("Informe o 3º número: ");
		int num3 = t.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("Maior número: " + num1);
			if (num2 < num3) {
				System.out.println("Menor númro: " + num2);
			} else {
				System.out.println("Menor númro: " + num3);
			}
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("Maior número: " + num2);
			if (num3 < num1) {
				System.out.println("Menor númro: " + num3);
			} else {
				System.out.println("Menor númro: " + num1);
			}
		} else {
			System.out.println("Maior número:" + num3);
			if (num1 < num2) {
				System.out.println("Menor númro: " + num1);
			} else {
				System.out.println("Menor número: " + num2);
			}

		}
	}

}
