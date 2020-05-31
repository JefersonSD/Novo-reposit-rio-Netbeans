package aula17_exercicios_aula_16_e_17;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
//		32 - Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser conforme 
//		o exemplo abaixo:
//			Fatorial de: 5
//			5! =  5 . 4 . 3 . 2 . 1 = 120
		Scanner t = new Scanner(System.in);
		System.out.println("Informe 1 número para saber o seu Fatorial:");
		int numero = t.nextInt();
		long soma = 0;
		boolean chave = true;
		for (int i = numero - 1; i >= 1; i--) {
			if (chave == true) {
				soma = numero * i;
			} else if (chave == false) {
				soma *= i;
			}

			for (int j = i + 1; j > i; j--) {
				if (chave == true) {
					System.out.print(numero + "! = " + numero + " . " + i);
					chave = false;
				} else {
					System.out.print(" . " + i);
				}

			}

		}

		System.out.print(" = " + soma);

	}

}
