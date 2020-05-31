package aula15_exercicios_aula_14_e_15;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		
		// 2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe 1 número: ");
		int valor = t.nextInt();
		

		if (valor < 0 ) {
			System.out.println("É nengativo");
		} else {
			System.out.println("É positivo");
		}
		
		double valorajuste = 20/100;
		System.out.println(valorajuste);
	}

}
