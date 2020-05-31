package aula15_exercicios_aula_14_e_15;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		// 3. Faça um Programa que verifique se uma letra digitada é "F" ou "M".
		// Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.

		Scanner t = new Scanner(System.in);
		System.out.println("Digite \"M\" para - Masculino ou \"F\" para - Feminino: ");
		String caractere = t.next();

		switch (caractere) {
		case "M":
			System.out.println("M - Masculino");
			break;
		case "F":
			System.out.println("F - Feminino");
			break;
		default:
			System.out.println("Sexo Inválido!");
		}

	}

}
