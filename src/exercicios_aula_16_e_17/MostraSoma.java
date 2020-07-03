package exercicios_aula_16_e_17;

import java.util.Scanner;

public class MostraSoma {

    public static void main(String[] args) {
        // 11 - Altere o programa anterior para mostrar no final a soma dos números.

        Scanner t = new Scanner(System.in);
        int valor1, valor2;
        System.out.println("Informe um número inteiro:");
        valor1 = t.nextInt();
        System.out.println("Informe outro número inteiro:");
        valor2 = t.nextInt();
        boolean controle = true;
        double soma = 0;

        if (valor1 < valor2) {

            for (int i = valor1; i < valor2; i++) {

                if (controle == true) {
                    System.out.print("Números inteiros no intervalo de " + valor1 + " à " + valor2 + ":");
                    ++i;
                    controle = false;
                }
                System.out.print("[" + i + "]");
                soma += i;

            }
            System.out.println();

        } else {

            for (int i = valor2; i < valor1; i++) {

                if (controle == true) {
                    System.out.print("Números inteiros no intervalo de " + valor2 + " à " + valor1 + ":");
                    ++i;
                    controle = false;
                }

                System.out.print("[" + i + "]");
                soma += i;

            }
            System.out.println();
        }
        System.out.print("Soma dos números:[" + soma + "]\n");
    }

}
