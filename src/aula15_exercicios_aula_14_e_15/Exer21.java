package aula15_exercicios_aula_14_e_15;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		
		/*
		 * 21.Um posto está vendendo combustíveis com a seguinte tabela de descontos: .
		 * 		♠ - Álcool: 
		 * 			♦ - até 20 litros, desconto de 3% por litro 
		 * 			♦ - acima de 20 litros, desconto de 5% por litro 
		 * 		♠ - Gasolina: 
		 * 			♦ - até 20 litros, desconto de 4% por litro
		 * 			♦ - acima de 20 litros, desconto de 6% por litro Escreva um algoritmo que leia o número de litros vendidos, o tipo de 
		 * 				combustível (codificado da seguinte forma: A-álcool, G- gasolina), calcule e imprima o valor a ser pago pelo cliente 
		 * 				sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.
		 */

		Scanner t = new Scanner(System.in);
		System.out.println("Informe \"G\" para gasolina e \"A\" para alcool:");
		String tipoCompbustivel = t.next();
		double desconto, total;
		while (!tipoCompbustivel.equalsIgnoreCase("G") && !tipoCompbustivel.equalsIgnoreCase("A")) {
			System.err.println("Caractere inválido!\ndigite \"G\" para gasolina ou \"A\" para alcool: ");
			tipoCompbustivel = t.next();

		}
		System.out.println("Informe a quantidade de litros:");
		double litros = t.nextDouble();

		if (tipoCompbustivel.equals("G")) {

			if (litros <= 20) {
				total = litros * 2.50;
				desconto = total - (total * 0.04);
				System.out.println("Valor a  pagar com desconto: " + desconto);
			} else if (litros > 20) {
				total = litros * 2.50;
				desconto = total - (total * 0.06);
				System.out.println("Valor a  pagar com desconto: " + desconto);
			}

		}else{
			
			if (litros <= 20) {
				total = litros * 1.90;
				desconto = total - (total * 0.03);
				System.out.println("Valor a  pagar com desconto: " + desconto);
			} else if (litros > 20) {
				total = litros * 1.90;
				desconto = total - (total * 0.05);
				System.out.println("Valor a  pagar com desconto: " + desconto);
			}

		}
	}

}
