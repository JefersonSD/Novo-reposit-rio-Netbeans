package exercicios_aulas14_e_15_ifElse_switch;

import java.util.Scanner;

public class DescontosSalario {

	public static void main(String[] args) {
		
		/*
		 * 12.Faça um programa para o cálculo de uma folha de pagamento, sabendo que os
		 * descontos são do Imposto de Renda, que depende do salário bruto (conforme
		 * tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do
		 * Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário
		 * Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá
		 * pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no
		 * mês. 
		 * 		♦ Desconto do IR: 
		 * 		♦ Salário Bruto até 900 (inclusive) - isento 
		 * 		♦ Salário Bruto até 1500 (inclusive) - desconto de 5% 
		 * 		♦ Salário Bruto até 2500 (inclusive) - desconto de 10% 
		 * 		♦ Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor 
		 * 		  da hora é 5 e a quantidade de hora é 220. 
		 * 				♠ Salário Bruto: (5 *220): -------- R$ 1100,00 
		 * 				♠ (-) IR (5%):--------------------- R$ 55,00 
		 * 				♠ (-) INSS ( 10%): ---------------- R$ 110,00 
		 * 				♠ FGTS (11%):---------------------- R$ 121,00 
		 * 				♠ Total de descontos:-------------- R$ 165,00 
		 * 				♠ Salário Liquido:----------------- R$ 935,00
		 */

		Scanner t = new Scanner(System.in);
		System.out.println("Quanto você ganha por hora?: ");
		double vHora = t.nextDouble();
		System.out.println("Quantas hora você trabalha por mês?: ");
		double horasT = t.nextDouble();
		double salario = horasT * vHora;
		double INSS, sind, IR, FGTS, descontos, salarioLiquido;

		if (salario <= 900) {
			INSS = salario * 0.1;
			FGTS = salario * 0.11;
			sind = salario * 0.03;
			descontos = INSS + sind;
			salarioLiquido = salario - INSS - sind;
			System.out.printf(" - Salário Bruto: %.2f\n - Insento de IR\n - (-)INSS: %.2f\n - FGTS: %.2f\n - (-)Sindicato: %.2f\n - Descontos: %.2f\n "
							+ "- Salário Líquido: %.2f ",salario, INSS, FGTS, sind, descontos, salarioLiquido);
		} else if (salario > 900 && salario <= 1500) {
			IR = salario * 0.05;
			INSS = salario * 0.1;
			FGTS = salario * 0.11;
			sind = salario * 0.03;
			descontos = INSS + sind + IR;
			salarioLiquido = salario - INSS - sind - IR;
			System.out.printf(" - Salário Bruto: %.2f\n - (-)Imposto de Renda: %.2f\n - (-)INSS: %.2f\n - FGTS: %.2f\n - (-)Sindicato: %.2f\n "
							+ "- Descontos: %.2f\n - Salário Líquido: %.2f ",salario, IR, INSS, FGTS, sind, descontos, salarioLiquido);
		} else if (salario > 1500 && salario <= 2500) {
			IR = salario * 0.1;
			INSS = salario * 0.1;
			FGTS = salario * 0.11;
			sind = salario * 0.03;
			descontos = INSS + sind + IR;
			salarioLiquido = salario - INSS - sind - IR;
			System.out.printf(" - Salário Bruto: %.2f\n - (-)Imposto de Renda: %.2f\n - (-)INSS: %.2f\n - FGTS: %.2f\n - (-)Sindicato: %.2f\n "
							+ "- Descontos: %.2f\n - Salário Líquido: %.2f ",salario, IR, INSS, FGTS, sind, descontos, salarioLiquido);
		} else {
			IR = salario * 0.2;
			INSS = salario * 0.1;
			FGTS = salario * 0.11;
			sind = salario * 0.03;
			descontos = INSS + sind + IR;
			salarioLiquido = salario - INSS - sind - IR;
			System.out.printf(" - Salário Bruto: %.2f\n - (-)Imposto de Renda: %.2f\n - (-)INSS: %.2f\n - FGTS: %.2f\n - (-)Sindicato: %.2f\n "
							+ "- Descontos: %.2f\n - Salário Líquido: %.2f ",salario, IR, INSS, FGTS, sind, descontos, salarioLiquido);
		}

	}

}
