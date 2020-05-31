package aula15_exercicios_aula_14_e_15;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		/*
		 * 5. Faça um programa para a leitura de duas notas parciais de um aluno. O
		 * programa deve calcular a média alcançada por aluno e apresentar: o A mensagem
		 * "Aprovado", se a média alcançada for maior ou igual a sete; o A mensagem
		 * "Reprovado", se a média for menor do que sete; o A mensagem
		 * "Aprovado com Distinção", se a média for igual a dez.
		 */

		Scanner t = new Scanner(System.in);
		System.out.println("Informe a 1ª nota do aluno:");
		double nota1 = t.nextDouble();
		System.out.println("Informe a 2ª nota do aluno:");
		double nota2 = t.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media >= 7 && media <= 9.99) {
			System.out.println("Aprovado!");
		} else if (media < 7) {
			System.out.println("Reprovado!");
		} else {
			System.out.println("Aprovado com Distinção");
		}

	}

}
