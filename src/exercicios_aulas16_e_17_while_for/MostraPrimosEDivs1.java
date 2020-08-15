package exercicios_aulas16_e_17_while_for;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MostraPrimosEDivs1 {

    public static void main(String[] args) {
        // Altere o programa de cálculo dos números primos, informando, caso o número
        // não seja primo, por quais número ele é divisível.

        Scanner t = new Scanner(System.in);
        List<Integer> lista = new ArrayList();
        int inteiro, contador = 0;
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
            for (int i = 1; i <= inteiro; i++) {

                if (inteiro % i == 0) {

                    lista.add(i);
                    contador++;

                }
                if (i == inteiro && contador > 2) {
                    System.out.println("Não é número primo!");
                    System.out.println("Número(s) pelo(s) qual(ais) o inteiro " + inteiro + " é divisível " + lista);
                }
                if (i == inteiro && contador == 2) {
                    System.out.println("É número primo!");
                }

            }

            contador = 0;
            lista.clear();

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
