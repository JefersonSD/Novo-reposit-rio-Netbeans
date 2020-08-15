package exercicios_aulas14_e_15_ifElse_switch;

import java.util.Scanner;

public class Equacao2Grau {

	public static void main(String[] args) {
		
		/*
		 * 16.Faça um programa que calcule as raízes de uma equação do segundo grau, na
		 * forma ax2 + bx + c. O programa deverá pedir os valores de a, b e c e fazer as
		 * consistências, informando ao usuário nas seguintes situações: 
		 * 		a. Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os demais valores, 
		 * 		   sendo encerrado; 
		 * 		b. Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa; 
		 * 		c. Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário; 
		 * 		d. Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
		 */

		Scanner t = new Scanner(System.in);
		System.out.println("Informe o valor de a:");
		double valorA = t.nextDouble();
		System.out.println("Informe o valor de b:");
		double valorB = t.nextDouble();
		System.out.println("Informe o valor de c:");
		double valorC = t.nextDouble();

		if (valorA == 0) {
			System.err.println("Não é uma equação do 2º grau. O programa será encerrado!");

		} else {

			double delta = Math.pow(valorB, 2) - 4 * valorA * (valorC);
			if (delta < 0) {

				System.err.println("A Equação não possui raízes reais. O programa será encerrado! ");

			} else if (delta == 0) {
				System.out.println("Fórmula de Delta: Δ = b2 – 4ac");
				double raizReal = -valorB / (2 * valorA);
				System.out.println("Valor Delta:" + delta);
				System.out.println("A equação possui apenas uma raiz real: " + raizReal);

			} else {
				System.out.println("Fórmula de Delta: Δ = b2 – 4ac");
				System.out.println("Valor Delta:" + delta);
				double raizReal1 = (-valorB + Math.sqrt(delta)) / (2 * valorA);
				double raizReal2 = (-valorB - Math.sqrt(delta)) / (2 * valorA);
				System.out.println(" A equação possui duas raízes reais:\n" + raizReal1 + "\n" + raizReal2);

			}

		}

	}

}
