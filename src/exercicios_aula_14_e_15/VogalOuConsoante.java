package exercicios_aula_14_e_15;

import java.util.Scanner;

public class VogalOuConsoante {

	public static void main(String[] args) {
		// 4. Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

		Scanner t = new Scanner(System.in);
		System.out.println("Digite uma letra: ");
		String letra = t.next();

		if (letra.length() > 1) {

			System.out.println("Não é uma letra válida");

		} else {
			switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
				System.out.println("É vogal");
				break;
			default:
				System.out.println("É consoante");
			}
		}

	}

}
