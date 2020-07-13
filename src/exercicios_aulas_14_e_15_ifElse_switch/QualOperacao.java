package exercicios_aulas_14_e_15_ifElse_switch;

import java.util.Scanner;

public class QualOperacao {

	public static void main(String[] args) {
		/*
		 * 19.Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual
		 * operação ele deseja realizar. O resultado da operação deve ser acompanhado de
		 * uma frase que diga se o número é: 
		 * 		a - par ou ímpar; 
		 * 		b - positivo ou negativo;
		 */
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe dois números:\n Informe o 1º número:");
		int numero1 = t.nextInt();
		System.out.println("Informe o 2º número:");
		int numero2 = t.nextInt();
		double operacao;
		String pOuN, parImpar, SimNao;
		
		do {
			
			System.out.println(" infornme a operação que deseja realizar:\n\t 1 - Soma\n\t 2 - Multiplicação\n\t 3 - Divião\n\t 4 - Subtração:");
			int opcao = t.nextInt();
			while(opcao != 1 && opcao !=  2 && opcao !=  3 && opcao !=  4) {
				
				System.out.println("Opção incorreta escolha uma opção:\n\t 1 - Soma\n\t 2 - Multiplicação\n\t 3 - Divião\n\t 4 - Subtração:");
				opcao = t.nextInt();
			}
			
			if(opcao == 1) {
				operacao = numero1+numero2;
				if(operacao < 0) {
					pOuN = "Negativo";
				}else {
					pOuN = "Positivo";
				}
				if(operacao%2 == 0) {
					parImpar = "Par!";
				}else {
					parImpar = "Impar!";
				}
				System.out.println("Resultado: [" + operacao + "]\n Positivo ou Negativo?: [" + pOuN + "]\n Par ou Impar?: [" + parImpar +"]");
			}
			if(opcao == 2) {
				operacao = numero1*numero2;
				if(operacao < 0) {
					pOuN = "Negativo";
				}else {
					pOuN = "Positivo";
				}
				if(operacao%2 == 0) {
					parImpar = "Par!";
				}else {
					parImpar = "Impar!";
				}
				System.out.println("Resultado: [" + operacao + "]\n Positivo ou Negativo?: [" + pOuN + "]\n Par ou Impar?: [" + parImpar +"]");
			}
			if(opcao == 3) {
				operacao = numero1/numero2;
				if(operacao < 0) {
					pOuN = "Negativo";
				}else {
					pOuN = "Positivo";
				}
				if(operacao%2 == 0) {
					parImpar = "Par!";
				}else {
					parImpar = "Impar!";
				}
				System.out.println("Resultado: [" + operacao + "]\n Positivo ou Negativo?: [" + pOuN + "]\n Par ou Impar?: [" + parImpar +"]");
			}
			if(opcao == 4) {
				operacao = (numero1) - (numero2);
				if(operacao < 0) {
					pOuN = "Negativo";
				}else {
					pOuN = "Positivo";
				}
				if(operacao%2 == 0) {
					parImpar = "Par!";
				}else {
					parImpar = "Impar!";
				}
				System.out.println("Resultado: [" + operacao + "]\n Positivo ou Negativo?: [" + pOuN + "]\n Par ou Impar?: [" + parImpar +"]");
			}
			
			System.out.println(" Deseja realizar outra operação?:\n \"S\" [SIM]\n \"N\" [NÃO]");
			 SimNao = t.next();
			while(!SimNao.equalsIgnoreCase("S") && !SimNao.equalsIgnoreCase("S") ) {
				
				System.out.println("Opção inválida! Digite: \"S\" para [SIM] ou \"N\" para [NÃO] ");
				SimNao = t.next();
			}
		}while(!SimNao.equals("N"));
		
		System.err.println("FIM ☻");
	}

}
