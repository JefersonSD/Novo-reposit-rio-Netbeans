package exercicios_aula19_arrays;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class PercentParImpar2 {

    public static void main(String[] args) {

//        15.Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que defina o percentual de elementos pares e ímpares, 
//        respectivamente, armazenados neste vetor.
        Scanner t = new Scanner(System.in);
        double[] A = new double[10];
        System.out.println("Informe 10 números aleatórios:");
        double numeros;
        int contPar = 0, contImpar = 0;
        double percentImpar = 0, percentPar = 0;
        for (int i = 0; i < A.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º número: ");
            numeros = t.nextInt();
            A[i] = numeros;
            if (numeros % 2 != 0 || A[i] == 1) {
                contImpar++;
            } else {
                contPar++;
            }
        }
        if (contImpar > 0) {
            for (double i = 0.01; i <= 1 || i > 1; i += 0.01) {
                percentImpar = 10 * i;
                if (percentImpar >= contImpar) {
                    percentImpar = i * 100;
                    break;
                }
            }
        }
        if (contPar > 0) {
            for (double i = 0.01; i <= 1 || i > 1; i += 0.01) {
                percentPar = 10 * i;
                if (percentPar >= contPar) {
                    percentPar = i * 100;
                    break;
                }
            }
        }
        System.out.print("Valores do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.printf("{ %.0f }",A[i]);
        }
        System.out.println();
        System.out.printf("Porcentagem de números pares no vetor A: %.0f ", Math.floor(percentPar));
        System.out.println();
        System.out.printf("Porcentagem de números ímpares no vetor A: %.0f\n", Math.floor(percentImpar));
    }

}
