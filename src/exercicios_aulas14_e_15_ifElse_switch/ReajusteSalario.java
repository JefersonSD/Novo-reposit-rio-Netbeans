package exercicios_aulas14_e_15_ifElse_switch;

import java.util.Scanner;

public class ReajusteSalario {

	public static void main(String[] args) {
		
		/*
		 * 11.As Organizações Tabajara resolveram dar um aumento de salário aos seus
		 * colaboradores e lhe contraram para desenvolver o programa que calculará os
		 * reajustes. 
		 * ♠ Faça um programa que recebe o salário de um colaborador e o
		 * reajuste segundo o seguinte critério, baseado no salário atual: 
		 *	    ♦ salários até R$ 280,00 (incluindo): 
		 * 				♦ aumento de 20% 
		 * 		♦ salários entre R$ 280,00 e R$700,00: 
		 * 				♦ aumento de 15% 
		 * 		♦ salários entre R$ 700,00 e R$ 1500,00: 
		 * 				♦ aumento de 10% 
		 * 		♦ salários de R$ 1500,00 em diante: 
		 * 				♦ aumento de 5% 
		 * 		♦ Após o aumento ser realizado, informe na tela: 
		 * 				♦ o salário antes do reajuste; 
		 * 				♦ o percentual de aumento aplicado; 
		 * 				♦ o valor do aumento; 
		 * 				♦ o novo salário, após o aumento.
		 */

		Scanner t = new Scanner(System.in);
		System.out.println("Informe o salário do colaborador: ");
		double salario = t.nextDouble(),reajuste = 0.0, valorajuste = 0.0;

		if (salario <= 280) {
			valorajuste = 0.2*salario;
			reajuste = salario+valorajuste;
			System.out.println(" - Salário antes do reajuste: " + salario + "\n - 20% de aumento \n - Valor do aumento "
					+ valorajuste + "\n - Salário com ajuste " + reajuste);
		}else if (salario > 280 && salario <= 700) {
			valorajuste = 0.15 * salario;
			reajuste = salario + valorajuste;
			System.out.println("- Salário antes do reajuste: " + salario + "\n - 15% de aumento \n - Valor do aumento "
					+ valorajuste + "\n - Salário com ajuste " + reajuste);
		} else if (salario > 700 && salario <= 1500) {
			valorajuste = 0.1 * salario;
			reajuste = salario + valorajuste;
			System.out.println("- Salário antes do reajuste: " + salario + "\n - 10% de aumento \n - Valor do aumento "
					+ valorajuste + "\n - Salário com ajuste " + reajuste);
		} else {
			valorajuste = 0.05 * salario;
			reajuste = salario + valorajuste;
			System.out.println("- Salário antes do reajuste: " + salario + "\n - 5% de aumento \n - Valor do aumento "
					+ valorajuste + "\n - Salário com ajuste " + reajuste);

		}
	}

}
