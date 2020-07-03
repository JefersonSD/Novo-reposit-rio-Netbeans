package exercicios_aula_14_e_15;

import java.util.Scanner;

public class InvestigaCrime {

	public static void main(String[] args) {
		
		/*
		 * 20.Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As
		 * perguntas são: 
		 * 		♦ - "Telefonou para a vítima?" 
		 * 		♦ - "Esteve no local do crime?" 
		 * 		♦ - "Mora perto da vítima?" 
		 * 		♦ - "Devia para a vítima?" 
		 * 		♦ - "Já trabalhou com a vítima?" 
		 * O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente 
		 * a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele 
		 * será classificado como "Inocente".
		 */

		Scanner t = new Scanner(System.in);
		System.err.println("Responda \"SIM\" ou \"NÃO\"\n");
		System.out.println("Telefonou para a vítima?:");
		String pergunta1 = t.next();
		System.out.println("Esteve no local do crime?:");
		String pergunta2 = t.next();
		System.out.println("Mora perto da vítima?:");
		String pergunta3 = t.next();
		System.out.println("Devia para a vítima?:");
		String pergunta4 = t.next();
		System.out.println("Já trabalhou com a vítima?:");
		String pergunta5 = t.next();

		int controle = 0;

		if (pergunta1.equalsIgnoreCase("SIM")) {
			controle++;
		}
		if (pergunta2.equalsIgnoreCase("SIM")) {
			controle++;
		}
		if (pergunta3.equalsIgnoreCase("SIM")) {
			controle++;
		}
		if (pergunta4.equalsIgnoreCase("SIM")) {
			controle++;
		}
		if (pergunta5.equalsIgnoreCase("SIM")) {
			controle++;
		}
		
		if(controle == 2 ) {
			System.out.println("Você é Suspeito!");
		}else if(controle == 3 || controle == 4) {
			System.out.println("Você é Cúmplice!");
		}else if(controle == 5) {
			System.err.println("Você é o Assassino!");
		}else {
			System.out.println("Você é Inocente ☻!");
		}
			
	}

}
