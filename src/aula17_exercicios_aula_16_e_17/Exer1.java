package aula17_exercicios_aula_16_e_17;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		/*
		 * 1 - Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem
		 * caso o valor seja inválido e continue pedindo até que o usuário informe um
		 * valor válido.
		 */
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe 1 número entre 0 e 10:");
		int num = t.nextInt();
		
		while(num < 0 || num >10) {
			
			System.err.println("Número inválido! ");
			System.out.println("Informe 1 número entre 0 e 10: ");
			num = t.nextInt();
		}
		System.out.println("Número digitado " + num);
		
	}

}
