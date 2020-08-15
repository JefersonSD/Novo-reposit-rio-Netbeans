package exercicios_aulas14_e_15_ifElse_switch;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		
		/*
		 * 14.Faça um programa que lê as duas notas parciais obtidas por um aluno numa
		 * disciplina ao longo de um semestre, e calcule a sua média. A atribuição de
		 * conceitos obedece à tabela abaixo: 
		 * 		♠ Média de Aproveitamento Conceito 
		 * 			♦ Entre 9.0 e 10.0 A 
		 * 			♦ Entre 7.5 e 9.0 B 
		 * 			♦ Entre 6.0 e 7.5 C 
		 * 			♦ Entre 4.0 e 6.0 D 
		 * 			♦ Entre 4.0 e zero E 
		 * O algoritmo deve mostrar na tela as notas, a média, o
		 * conceito correspondente e a mensagem “APROVADO” se o conceito for A, B ou C
		 * ou “REPROVADO” se o conceito for D ou E.
		 */

		Scanner t = new Scanner(System.in);
		System.out.println("Informe a 1ª nota parcial do aluno: ");
		double nota1 = t.nextDouble();
		System.out.println("Informe a 2ª nota parcial do aluno: ");
		double nota2 = t.nextDouble();
		double media = (nota1 + nota2) / 2;
		String conceito;

		if (media >= 9 && media <= 10) {
			conceito = "A";
		}
		else if (media >= 7.5 && media < 9) {
			conceito = "B";
		}
		else if (media >= 6 && media < 7.5) {
			conceito = "C";
		}
		else if (media >= 4 && media < 6) {
			conceito = "D";
		}else {
			conceito = "E";
		}
		
		switch (conceito) {
			case "A": 
				System.out.printf(" ♦ Notas:\n - Nota 1: %.1f\n - Nota 2: %.1f\n ♦ Média:\n %.1f\n ♦ Conceito:\n %s\n ♦ Situação:\n "
								+ " \" APROVADO\" ",nota1,nota2,media, conceito);
			break;
			case "B": 
				System.out.printf(" ♦ Notas:\n - Nota 1: %.1f\n - Nota 2: %.1f\n ♦ Média:\n %.1f\n ♦ Conceito:\n %s\n ♦ Situação:\n "
								+ " \" APROVADO\" ",nota1,nota2,media, conceito);
				break;
			case "C": 
				System.out.printf(" ♦ Notas:\n - Nota 1: %.1f\n - Nota 2: %.1f\n ♦ Média:\n %.1f\n ♦ Conceito:\n %s\n ♦ Situação:\n "
								+ " \" APROVADO\" ",nota1,nota2,media, conceito);
				break;
			case "D": 
				System.out.printf(" ♦ Notas:\n - Nota 1: %.1f\n - Nota 2: %.1f\n ♦ Média:\n %.1f\n ♦ Conceito:\n %s\n ♦ Situação:\n "
								+ " \" REPROVADO\" ",nota1,nota2,media, conceito);
				break;
			case "E": 
				System.out.printf(" ♦ Notas:\n - Nota 1: %.1f\n - Nota 2: %.1f\n ♦ Média:\n %.1f\n ♦ Conceito:\n %s\n ♦ Situação:\n "
								+ " \" REPROVADO\" ",nota1,nota2,media, conceito);
				break;
			}

	}

}
