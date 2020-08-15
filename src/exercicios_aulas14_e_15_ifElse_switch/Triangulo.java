package exercicios_aulas14_e_15_ifElse_switch;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		/*
		 * 15.Faça um Programa que peça os 3 lados de um triângulo. O programa deverá
		 * informar se os valores podem ser um triângulo. Indique, caso os lados formem
		 * um triângulo, se o mesmo é: equilátero, isósceles ou escaleno. 
		 * 		♠ Dicas: 
		 * 			♦ Três lados formam um triângulo quando a soma de quaisquer dois lados maior que o terceiro; 
		 * 			♦ Triângulo Equilátero: três lados iguais; 
		 * 			♦ Triângulo Isósceles: quaisquer dois lados iguais; 
		 * 			♦ Triângulo Escaleno: três lados diferentes;
		 */
		
		Scanner t = new Scanner(System.in);
		System.out.println(" Informe os três lados de um triângulo para saber se é: equilátero, isósceles ou escaleno. ");
		System.out.println("Primeiro lado: ");
		double lado1 = t.nextDouble();
		System.out.println("Segundo lado: ");
		double lado2 = t.nextDouble();
		System.out.println("Terceiro lado: ");
		double lado3 = t.nextDouble();

		if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {

			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("Triâgulo Equilátero");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Triângulo Isósceles");
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("Triângulo Escaleno");
			}

		} else {

			System.out.println("Não é um triângulo");
		}

	}

}
