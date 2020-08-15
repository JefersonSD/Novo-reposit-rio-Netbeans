package exercicios_aulas16_e_17_while_for;

import java.util.Random;
import java.util.Scanner;

public class CalculoJuros {

    public static void main(String[] args) {
//		41 - Faça um programa que receba o valor de uma dívida e mostre uma tabela com os seguintes 
//			 dados: valor da dívida, valor dos juros, quantidade de parcelas e valor da parcela.
//		Os juros e a quantidade de parcelas seguem a tabela abaixo:
//			
//		Quantidade de Parcelas  % de Juros sobre o valor inicial da dívida
//		1       0
//		3       10
//		6       15
//		9       20
//		12      25
//		
//		Exemplo de saída do programa:
//			
//		Valor da Dívida Valor dos Juros Quantidade de Parcelas  Valor da Parcela
//		R$ 1.000,00     0               1                       R$  1.000,00
//		R$ 1.100,00     100             3                       R$    366,00
//		R$ 1.150,00     150             6                       R$    191,67
//
        Scanner t = new Scanner(System.in);
        Random r = new Random();
        double valorDivida, valorParcela = 0, juros = 0;
        System.out.println("Informe o valor da dívida:");
        valorDivida = t.nextDouble();
        int[] parcela = new int[]{1, 3, 6, 9, 12};
        double qtdParcela = parcela[r.nextInt(parcela.length)];
        int valor = (int) qtdParcela;
        switch (valor) {
            case 1:
                System.out.printf("Valor da Dívida\t\tValor dos Juros\t\tQuantidade de Parcelas\t\tValor da Parcela\n   R$%.2f"
                        + "\t\t    R$%.0f\t\t\t\t   %.0f\t\t\t    R$%.2f\n", valorDivida, juros, qtdParcela, valorDivida);
                break;
            case 3:
                juros += (valorDivida / 100) * 10;
                valorDivida += juros;
                valorParcela = valorDivida / qtdParcela;
                System.out.printf("Valor da Dívida\t\tValor dos Juros\t\tQuantidade de Parcelas\t\tValor da Parcela\n   R$%.2f"
                        + "\t\t    R$%.2f\t\t\t   %.0f\t\t\t    R$%.2f\n", valorDivida, juros, qtdParcela, valorParcela);
                break;
            case 6:
                juros += (valorDivida / 100) * 15;
                valorDivida += juros;
                valorParcela = valorDivida / qtdParcela;
                System.out.printf("Valor da Dívida\t\tValor dos Juros\t\tQuantidade de Parcelas\t\tValor da Parcela\n   R$%.2f"
                        + "\t\t    R$%.2f\t\t\t   %.0f\t\t\t    R$%.2f\n", valorDivida, juros, qtdParcela, valorParcela);
                break;
            case 9:
                juros += (valorDivida / 100) * 20;
                valorDivida += juros;
                valorParcela = valorDivida / qtdParcela;
                System.out.printf("Valor da Dívida\t\tValor dos Juros\t\tQuantidade de Parcelas\t\tValor da Parcela\n   R$%.2f"
                        + "\t\t    R$%.2f\t\t\t   %.0f\t\t\t    R$%.2f\n", valorDivida, juros, qtdParcela, valorParcela);
                break;
            case 12:
                juros += (valorDivida / 100) * 25;
                valorDivida += juros;
                valorParcela = valorDivida / qtdParcela;
                System.out.printf("Valor da Dívida\t\tValor dos Juros\t\tQuantidade de Parcelas\t\tValor da Parcela\n   R$%.2f"
                        + "\t\t    R$%.2f\t\t\t   %.0f\t\t\t    R$%.2f\n", valorDivida, juros, qtdParcela, valorParcela);
                break;
        }

    }

}
