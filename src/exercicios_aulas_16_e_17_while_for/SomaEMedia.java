package exercicios_aulas_16_e_17_while_for;

import java.util.Scanner;

public class SomaEMedia {

    public static void main(String[] args) {
        // 8 - Faça um programa que leia 5 números e informe a soma e a média dos números.

        Scanner t = new Scanner(System.in);
        System.out.println("Informe 5 números: ");
        int soma = 0;
        double media = 0;
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Informe o " + (i + 1) + "º número :");
            soma += numeros[i] = t.nextInt();

        }
        System.out.println("A soma total dos números é igual a: " + soma);
        System.out.println("A média dos números é igual a: " + soma / 5);
    }

}
