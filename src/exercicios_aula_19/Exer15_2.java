package exercicios_aula_19;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class Exer15_2 {

    public static void main(String[] args) {

//        15.Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que defina o percentual de elementos pares e ímpares, 
//        respectivamente, armazenados neste vetor.
        Scanner t = new Scanner(System.in);
        double[] A = new double[11];
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
        for (double i = 0.001; i < 1; i += 0.001) {
            percentImpar = 11 * i;
            if (percentImpar >= contImpar) {
                percentImpar = i * 100;
                break;
            }
        }
        for (double i = 0.001; i < 1; i += 0.001) {
            percentPar = 11 * i;
            if (percentPar >= contPar) {
                percentPar = i * 100;
                break;
            }
        }
        System.out.printf("Porcentagem de números pares no vetor A: %.2f ", percentPar);
        System.out.println();
        System.out.printf("Porcentagem de números ímpares no vetor A: %.2f\n", percentImpar);

    }
}