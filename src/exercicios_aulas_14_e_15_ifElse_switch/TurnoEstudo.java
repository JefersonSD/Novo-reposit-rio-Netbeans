package exercicios_aulas_14_e_15_ifElse_switch;

import java.util.Scanner;

public class TurnoEstudo {

	public static void main(String[] args) {
		/*
		 * 10.Faça um Programa que pergunte em que turno você estuda. Peça para digitar
		 * M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!",
		 * "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
		 */

		Scanner t = new Scanner(System.in);
		System.out.println(
				"Em qual turno você estuda?:\n\t ♦ Digite:\n\t\t -\"M\" para Matutino\n\t\t -\"V\" para Vespertino\n\t\t -\"N\" para Noturno  ");
		String turno = t.next();

		switch (turno) {

		case "M":
			System.out.println("Bom dia!");
			break;
		case "V":
			System.out.println("Boa tarde!");
			break;
		case "N":
			System.out.println("Boa noite!");
			break;
		case "m":
			System.out.println("Bom dia!");
			break;
		case "v":
			System.out.println("Boa tarde!");
			break;
		case "n":
			System.out.println("Boa noite!");
			break;
		default:
			System.out.println("Valor Inválido!");
		}
	}

}
