package exercicios_aula19_arrays;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class IsPrimo {

    public static void main(String[] args) {
//        33.Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e uma mensagem 
//        indicando se o respectivo elemento é um número primo ou não.

        Scanner t = new Scanner(System.in);
        int[] A = new int[10];
        System.out.println("Informe 10 números para saber quais são primos:");
        int cont = 0;
        for (int i = 0; i < A.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º número:");
            A[i] = t.nextInt();
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 1; j <= A[i]; j++) {
                if (A[i] % j == 0) {
                    cont++;
                }
                if(cont > 2){
                    break;
                }
            }
            if (cont == 2) {
                System.out.println("Número [" + A[i] + "] É primo!");
            } else {
                System.out.println("Número [" + A[i] + "] ");
            }
            cont = 0;
        }
    }

}
