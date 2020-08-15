package exercicios_aula19_arrays;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class MostraDivisores {

    public static void main(String[] args) {
//        35.Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e a relação de todos 
//        os divisores do respectivo elemento.

        Scanner t = new Scanner(System.in);
        int[] A = new int[10];
        int[] Aux;
        int cont = 0;
        System.out.println("Informe 10 números para saber os seus divisores:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o " + (i + 1) + "º número:");
            A[i] = t.nextInt();
        }
        for (int i = 0; i < A.length; i++) {
            System.out.println("Elemento no vetor A: " + A[i]);
            System.out.print("Divisores do inteiro " + A[i] + ": ");
            for (int j = 1; j <= A[i]; j++) {
                if (A[i] % j == 0) {
                    cont++;
                }
            }
            Aux = new int[cont];
            cont = 0;
            for (int j = 1; j <= A[i]; j++) {
                if (A[i] % j == 0) {
                    Aux[cont] = j;
                    cont++;
                }
            }
            for (int j = 0; j < cont; j++) {
                System.out.print("[" + Aux[j] + "]");
            }
            cont = 0;
            System.out.println();
            System.out.println();
        }
    }

}
