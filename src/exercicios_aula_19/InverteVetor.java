package exercicios_aula_19;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class InverteVetor {

    public static void main(String[] args) {
//       28.Ler um vetor A com 10 elementos e construir um vetor B de mesmo tipo e tamanho e com os mesmos elementos de A, sendo 
//       que estes deverão estar invertidos, ou seja, o primeiro elemento de A passa a ser o último de B, o segundo elemento de A
//       passa a ser o penúltimo de B e assim por diante.

        Scanner t = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[A.length];
        System.out.println("Informe 10 números:");
        for (int i = 0; i < A.length; i++) {
            System.out.println((i + 1) + "º número:");
            A[i] = t.nextInt();
        }
        for (int i = 0, j = A.length - 1; i < A.length; i++, j--) {
            B[j] = A[i];
        }
        System.out.print("Elementos do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(" [" + A[i] + "] ");
        }
        System.out.println();
        System.out.print("Elementos do vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print(" [" + B[i] + "] ");
        }
        System.out.println();
    }

}
