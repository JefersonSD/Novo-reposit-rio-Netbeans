package exercicios_aulas14_e_15_ifElse_switch;

import java.util.Scanner;

public class MostraMaior {

	public static void main(String[] args) {
		// 6. Faça um Programa que leia três números e mostre o maior deles.

		Scanner t = new Scanner(System.in);
		System.out.println("Informe o 1º número: ");
		int num1 = t.nextInt();
		System.out.println("Informe o 2º número:");
		int num2 = t.nextInt();
		System.out.println("Informe o 3º número: ");
		int num3 = t.nextInt();

		if (num1 >= num2 && num1 >= num3) {
			System.out.println("Maior número: " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("Maior número: " + num2);
		} else {
			System.out.println("Maior número:" + num3);
		}

	}

}
