package exercicios_aula_16_e_17;

import java.util.Scanner;

public class FaixaEtariaTurma {

    public static void main(String[] args) {
        /*
		 * // Faça um programa que peça para n pessoas a sua idade, ao final o programa
		 * devera verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e
		 * maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a
		 * média calculada.
         */

        Scanner t = new Scanner(System.in);
        double idade, mediaIdade = 0, contador = 0;
        String opcao;
        do {
            System.out.println("Informe a sua idade:");
            idade = t.nextDouble();
            contador++;
            mediaIdade += idade;
            System.out.println("Deseja informar outra idade? (s/n)");
            opcao = t.next();
            while (!opcao.equalsIgnoreCase("s") && !opcao.equalsIgnoreCase("n")) {

                System.out.println("Opção inválida. Digite \"s\" para sim ou \"n\" para não:");
                opcao = t.next();

            }

        } while (opcao.equalsIgnoreCase("s"));
        mediaIdade = mediaIdade / contador;
        System.out.printf("Média é igual a: %.2f\n", mediaIdade);
        if (mediaIdade >= 0 && mediaIdade <= 25.26) {
            System.out.println("A turma é jovem");
        } else if (mediaIdade >= 60) {
            System.out.println("A turma é idosa");
        } else {
            System.out.println("A turma é adulta");
        }

    }

}
