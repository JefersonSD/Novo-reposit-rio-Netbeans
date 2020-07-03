package exercicios_aula_16_e_17;

import java.util.Scanner;

public class ImprimeMaior {

    public static void main(String[] args) {
        // 7 - Faça um programa que leia 5 números e informe o maior número.
        Scanner t = new Scanner(System.in);
        int[] numeros = new int[5];
        int maior = 0;
        System.out.println("Informe 5 números:");

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = t.nextInt();
            if (numeros[i] > maior) {
                maior = numeros[i];
            }

        }

        System.out.println("Maior número: " + maior);

    }

}
