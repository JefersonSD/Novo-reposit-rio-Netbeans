package exercicios_aulas16_e_17_while_for;

import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
        // 24 - Faça um programa que calcule o mostre a média aritmética de N notas.

        Scanner t = new Scanner(System.in);
        System.out.println("Informe as notas para saber a média:");
        double nota, media = 0, contador = 0;
        String opcao;
        do {
            System.out.println("Informe uma nota:");
            nota = t.nextDouble();
            contador++;
            media += nota;
            System.out.println("Deseja informar outra nota? (s/n)");
            opcao = t.next();
            while (!opcao.equalsIgnoreCase("s") && !opcao.equalsIgnoreCase("n")) {

                System.out.println("Opção inválida. Digite \"s\" para sim ou \"n\" para não:");
                opcao = t.next();

            }

        } while (opcao.equalsIgnoreCase("s"));
        media = media / contador;
        System.out.printf("A média das notas é igual a: %.2f\n", media);

    }

}
