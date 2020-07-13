package exercicios_aulas_16_e_17_while_for;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
        /*
		 * 21 -Faça um programa que peça um número inteiro e determine se ele é ou não
		 * um número primo. Um número primo é aquele que é divisível somente por ele
		 * mesmo e por 1.
         */

        Scanner t = new Scanner(System.in);
        int inteiro;
        String opcao;
        System.out.println("Informe quantos números quiser para saber se é um nº primo ou não.");

        do {

            System.out.println("Informe 1 número:");
            inteiro = t.nextInt();
            if (inteiro == 1) {
                System.out.println("Não é número primo!");
            } else if (inteiro == 2) {
                System.out.println("É número primo!");
            }
            for (int i = 2; i < inteiro; i++) {

                if (inteiro % i == 0) {
                    System.out.println("Não é número primo!");
                    break;
                } else {
                    if (i == inteiro - 1) {
                        System.out.println("É número primo!");
                    }

                }
            }

            System.out.println("Deseja verificar outro número? (s/n)");
            opcao = t.next();
            while (!opcao.equalsIgnoreCase("s") && !opcao.equalsIgnoreCase("n")) {

                System.out.println("Opção inválida. Digite \"s\" para sim ou \"n\" para não:");
                opcao = t.next();

            }

        } while (opcao.equalsIgnoreCase("s"));

        System.out.println("Fim!");

    }

}
