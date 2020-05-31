package aula17_exercicios_aula_16_e_17;

import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {
        // 10 - Faça um programa que receba dois números inteiros e gere os números inteiros
        // que estão no intervalo compreendido por eles.

        Scanner t = new Scanner(System.in);
        int valor1, valor2;
        System.out.println("Informe um número inteiro:");
        valor1 = t.nextInt();
        System.out.println("Informe outro número inteiro:");
        valor2 = t.nextInt();
        boolean controle = true;

        if (valor1 < valor2) {

            for (int i = valor1; i < valor2; i++) {

                if (controle == true) {
                    System.out.println("Números inteiros no intervalo de " + valor1 + " à " + valor2);
                    ++i;
                    controle = false;
                }
                System.out.print("[" + i + "]");

            }

        } else {

            for (int i = valor2; i < valor1; i++) {

                if (controle == true) {
                    System.out.println("Números inteiros no intervalo de " + valor2 + " à " + valor1);
                    ++i;
                    controle = false;
                }
                System.out.println("[" + i + "]");

            }

        }

    }

}
