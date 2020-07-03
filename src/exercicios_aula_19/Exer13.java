package exercicios_aula_19;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class Exer13 {

    public static void main(String[] args) {

//        13.Criar um vetor A com 10 elementos inteiros. Implementar um programa que determine a soma dos elementos armazenados neste 
//        vetor que são múltiplos de 5.
        Scanner t = new Scanner(System.in);
        double[] A = new double[10];
        System.out.println("Informe 10 números aleatórios:");
        double numeros;
        int soma = 0;
        for (int i = 0; i < A.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º número: ");
            numeros = t.nextInt();
            A[i] = numeros;
            if (numeros % 5 == 0) {
                soma += A[i];
            }
        }
        System.out.print("Valores do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.printf("{ %.0f }",A[i]);
        }
        System.out.println();
        System.out.println("Soma dos múltiplos de 5: " + soma);
    }
}
