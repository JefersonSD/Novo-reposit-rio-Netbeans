package exercicios_aulas14_e_15_ifElse_switch;

import java.util.Scanner;

public class CupomFiscalCarne {

	public static void main(String[] args) {
		/*
		 * 23.O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira: 
		 * 
		 * o 					Até 5 Kg					 Acima de 5 Kg 
		 * o File Duplo 	 R$ 4,90 por Kg 				R$ 5,80 por Kg
		 * o Alcatra 		 R$ 5,90 por Kg 				R$ 6,80 por Kg 
		 * o Picanha 		 R$ 6,90 por Kg 				R$ 7,80 por Kg 
		 * 
		 * Para atender a todos os clientes, cada cliente poderá levar apenas um dos
		 * tipos de carne da promoção, porém não há limites para a quantidade de carne
		 * por cliente. Se compra for feita no cartão Tabajara o cliente receberá ainda
		 * um desconto de 5% sobre o total a compra. Escreva um programa que peça o tipo
		 * e a quantidade de carne comprada pelo usuário e gere um cupom fiscal,
		 * contendo as informações da compra: tipo e quantidade de carne, preço total,
		 * tipo de pagamento, valor do desconto e valor a pagar.
		 */		

	
			Scanner t = new Scanner(System.in);
			System.out.println(" Escolha o tipo de carne :\n\t 1 - Filé Duplo\n\t 2 - Alcatra\n\t 3 - Picanha\n");
			int opcao = t.nextInt();
			double valorTotal = 0, desconto, vTotalDesconto;
			String tipoCartao, tipoCarne="";
			while (opcao != 1 && opcao != 2 && opcao != 3) {

				System.out.println("Opção incorreta escolha uma opção:\n\t 1 - Filé Duplo\n\t 2 - Alcatra\n\t 3 - Picanha\n");
				opcao = t.nextInt();
			}
			System.out.println("Informe a quantidade em Kg de carne: ");
			double quantidade = t.nextDouble();
			
			switch(opcao) {
			
			case 1:
				if(quantidade<=5) {
					valorTotal = quantidade*4.90;
				}else {
					valorTotal = quantidade*5.80;
				}
				tipoCarne = "Filé Duplo";
				break;
			case 2:
				if(quantidade<=5) {
					valorTotal = quantidade*5.90;
				}else {
					valorTotal = quantidade*6.80;
				}
				tipoCarne = "Alcatra";
				break;
			case 3:
				if(quantidade<=5) {
					valorTotal = quantidade*6.90;
				}else {
					valorTotal = quantidade*7.80;
				}
				tipoCarne = "Picanha";
				break;
			}
			
			System.out.println("Compra realizada com o cartão Tabajara? Responda (Sim) ou (Não)");
			String credCard = t.next();
			if(credCard.equalsIgnoreCase("sim") ) {
				desconto = valorTotal*0.05;
				vTotalDesconto = valorTotal - desconto;
				tipoCartao = "Tabajara";
			}else {
				tipoCartao = "Outro";
				desconto = 0.0;
				vTotalDesconto = valorTotal;
			}
			
			System.out.println(" ------------------Cupom Fiscal-----------------------\n | - Tipo de carne\t\t\t" + tipoCarne + "\n | "
							 + "- Quantidade\t\t\t\t" + quantidade +" Kg \n | - Preço total\t\t\t" + valorTotal + " \n "
							 + "| - Tipo de pagamento\t\t\t" + tipoCartao + " \n | - Valor do desconto\t\t\t" + desconto + " "
							 + "\n | - Valor a pagar\t\t\t" + vTotalDesconto);
			
		
	}

}
