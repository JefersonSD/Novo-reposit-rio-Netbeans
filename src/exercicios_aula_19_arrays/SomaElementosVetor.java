/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula_19_arrays;

/**
 *
 * @author jsjef
 */
public class SomaElementosVetor {

    public static void main(String[] args) {
//        12.Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a soma de todos os elementos 
//        armazenados neste vetor.

        int[] A = {1, 5, 3, 9, 7, 8, 12, 11, 20, 23};
        int soma = 0;
        for (int i = 0; i < A.length; i++) {

            soma += A[i];
        }
        System.out.print("Valores do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(" {" + A[i] + "} ");
        }
        System.out.println();
        System.out.println("A soma dos números do vetor é igula a: " + soma);

    }

}
