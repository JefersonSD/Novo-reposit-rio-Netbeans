
package exercicios_aula_19;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class Exer14 {
    public static void main(String[] args) {
        
//        14.Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a média aritmética simples
//        dos elementos ímpares armazenados neste vetor.
    
        Scanner t = new Scanner(System.in);
        double[] A = new double[10];
        System.out.println("Informe 10 números aleatórios:");
        double numeros;
        int soma = 0;
        for (int i = 0; i < A.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º número: ");
            numeros = t.nextInt();
            A[i] = numeros;
            if (numeros % 2 != 0 || A[i] == 1) {
                soma += A[i];
            }
        }
        System.out.println("Soma dos números ímpares no vetor: " + soma);
    }
    
}