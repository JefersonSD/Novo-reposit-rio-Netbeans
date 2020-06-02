package aula17_exercicios_aula_16_e_17;

import java.util.Scanner;

public class Exer14 {

    public static void main(String[] args) {
        // 14 - Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de 
        // números impares.

        Scanner t = new Scanner(System.in);
        int inteiros;
        int contadorImpar = 0, contadorPar = 0;
        System.out.println("Informe 10 números inteiros : ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o " + (i + 1) + "º número:");
            inteiros = t.nextInt();
            if (inteiros % 2 == 0) {
                contadorPar++;
            } else {
                contadorImpar++;
            }
        }

        System.out.println("Número de Impares:" + contadorImpar);
        System.out.println("Número de Pares:" + contadorPar);

    }

}
