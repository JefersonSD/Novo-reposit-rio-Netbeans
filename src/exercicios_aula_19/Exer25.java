package exercicios_aula_19;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class Exer25 {

    public static void main(String[] args) {
//        25.Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, obedecendo as seguintes regras de 
//        formação: 
//            a) B[i] deverá receber 1 quando A[i] for par; 
//            b) B[i] deverá receber 0 quando A[i] for ímpar.
        Scanner t = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        System.out.println("Informe 10 números:");
        for (int i = 0; i < A.length; i++) {
            A[i] = t.nextInt();
            if (A[i] % 2 == 0) {
                B[i] = 1;
            } else {
                B[i] = 0;
            }
        }
        System.out.print("Vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(" [" + A[i] + "] ");
        }
        System.out.println();
        System.out.print("Vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print(" [" + B[i] + "] ");
        }
        System.out.println();
    }

}