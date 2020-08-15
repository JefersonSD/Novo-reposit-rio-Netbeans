package exercicios_aulas16_e_17_while_for;

import java.util.Scanner;

public class TabelinhaPaes {

    public static void main(String[] args) {
//		30 - O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende implantar a metodologia da tabelinha, que já é 
//               um sucesso na sua loja de 1,99. Você foi contratado para desenvolver o programa que monta a tabela de preços de pães, 
//               de 1 até 50 pães, a partir do preço do pão informado pelo usuário, conforme o exemplo abaixo:
//			Preço do pão: R$ 0.18
//			Panificadora Pão de Ontem - Tabela de preços
//			1 - R$ 0.18
//			2 - R$ 0.36
//			...
//			50 - R$ 9.00

        Scanner t = new Scanner(System.in);
        double acumula, valor;
        System.out.println("Informe o valor do pão:");
        valor = t.nextDouble();
        for (double i = 1; i <= 50; i++) {
            acumula = i * valor;

            System.out.printf(" %.0f - R$ %.2f\n ", i, acumula);

        }

    }

}
