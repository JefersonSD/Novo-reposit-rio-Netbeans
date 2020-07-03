package exercicios_aula_19;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class PercentParImpar {

    public static void main(String[] args) {

//        15.Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que defina o percentual de elementos pares e ímpares, 
//        respectivamente, armazenados neste vetor.
        Scanner t = new Scanner(System.in);
        double[] A = new double[10];
        System.out.println("Informe 10 números aleatórios:");
        double numeros;
        double contPar = 0, contImpar = 0;
        for (int i = 0; i < A.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º número: ");
            numeros = t.nextInt();
            A[i] = numeros;
            if (numeros % 2 != 0) {
                contImpar++;
            } else {
                contPar++;
            }
        }
        contPar = (contPar*100)/A.length;
        contImpar = 100 - contPar;
        System.out.printf("Porcentagem de números pares no vetor A: %.0f ", contPar );
        System.out.println();
        System.out.printf("Porcentagem de números ímpares no vetor A: %.0f\n", contImpar );

    }
}
