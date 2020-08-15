package exercicios_aulas14_e_15_ifElse_switch;

import java.util.Scanner;

public class CalculaValorFrutas {

	public static void main(String[] args) {
		
		/*
		 * 22.Uma fruteira está vendendo frutas com a seguinte tabela de preços: 
		 * 				   Até 5 Kg       			Acima de 5 Kg
		 * Morango      R$ 2,50 por Kg 			    R$ 2,20 por Kg  
		 * Maçã 	    R$ 1,80 por Kg	  		    R$ 1,50 por Kg 
		 * 
		 * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
		 * compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este
		 * total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a
		 * quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo
		 * cliente.
		 */
		
		Scanner t = new Scanner(System.in);
		System.out.println("Entre com a quantidade em Kg de Morangos:");
		double qtdMorango = t.nextDouble();
		System.out.println("Entre com a quantidade em Kg de Maçãs:");
		double qtdMaca = t.nextDouble();
		double valorMorango,valorMaca, vtotal, peso;

		if (qtdMorango <= 5) {
			valorMorango = qtdMorango * 2.50;
		}else{
			valorMorango = qtdMorango * 2.20;
		}
		if (qtdMaca <= 5) {
			valorMaca = qtdMaca * 1.80;
		}else{
			valorMaca = qtdMaca * 1.50;
		}
		
		vtotal = valorMorango+valorMaca;
		peso = qtdMorango+qtdMaca;
		

		if (peso > 8 || vtotal > 25) {
			
			vtotal = vtotal - (vtotal*0.1);
			System.out.println(" Com desconto:\n Total: "+vtotal);

		}else {
			System.err.println(" Sem desconto:\n Total: "+vtotal);
		}

	}

}
