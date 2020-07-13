package exercicios_aula_19_arrays;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class ImprimePar {

    public static void main(String[] args) {
//        34.Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e a relação de todos 
//        os pares de 0 até o respectivo elemento.

        Scanner t = new Scanner(System.in);
        int[] A = new int[10];
        int[] Aux;
        System.out.println("Informe 10 números para saber os pares de 0 até o respectivo número:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o " + (i + 1) + "º número:");
            A[i] = t.nextInt();
        }
        int cont = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 2; j <= A[i]; j++) {
                if (j % 2 == 0) {
                    cont++;
                }
            }
            Aux = new int[cont];
            cont = 0;
            for (int j = 2; j <= A[i]; j++) {
                if (j % 2 == 0) {
                    Aux[cont] = j;
                    cont++;
                }
            }
            cont = 0;
            if (A[i] > 1) {
                System.out.print("Valor no vetor A: [" + A[i] + "] ");
                System.out.println();
                System.out.print("Valores pares entre 0 e " + A[i] + ": ");
                for (int j = 0; j < Aux.length; j++) {
                    System.out.print("[" + Aux[j] + "]");
                }
            }
            System.out.println();
            System.out.println();
        }

    }

}
