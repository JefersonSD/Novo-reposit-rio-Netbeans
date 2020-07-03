package exercicios_aula_14_e_15;

import java.util.Scanner;

public class OrdemDecrescente {

	public static void main(String[] args) {
		// 9. Faça um Programa que leia três números e mostre-os em ordem decrescente.

		Scanner t = new Scanner(System.in);
		System.out.println("Informe o 1º número: ");
		double n1 = t.nextDouble();
		System.out.println("Informe o 2º número:");
		double n2 = t.nextDouble();
		System.out.println("Informe o 3º número: ");
		double n3 = t.nextDouble();

		if (n1 >= n2 && n1 >= n3 && n2 >= n3) {
			System.out.println(" - n1 : " + n1);
			System.out.println(" - n2 : " + n2);
			System.out.println(" - n3 : " + n3);

		} else if (n1 >= n2 && n1 >= n3 && !(n2 >= n3)) {
			System.out.println(" - n1 : " + n1);
			System.out.println(" - n3 : " + n3);
			System.out.println(" - n2 : " + n2);

		} else if (n2 >= n1 && n2 >= n3 && n3 >= n1) {
			System.out.println(" - n2 : " + n2);
			System.out.println(" - n3 : " + n3);
			System.out.println(" - n1 : " + n1);

		} else if (n2 >= n1 && n2 >= n3 && !(n3 >= n1)) {
			System.out.println(" - n2 : " + n2);
			System.out.println(" - n1 : " + n1);
			System.out.println(" - n3 : " + n3);

		} else if (n3 >= n1 && n3 >= n2 && n1 >= n2) {
			System.out.println(" - n3 : " + n3);
			System.out.println(" - n1 : " + n1);
			System.out.println(" - n2 : " + n2);

		} else {
			System.out.println(" - n3 : " + n3);
			System.out.println(" - n2 : " + n2);
			System.out.println(" - n1 : " + n1);

		}

	}

}
