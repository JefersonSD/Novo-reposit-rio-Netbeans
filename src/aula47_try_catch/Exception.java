/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula47_try_catch;

/**
 *
 * @author jsjef
 */
public class Exception {

    public static void main(String[] args) {

        try {
            System.out.println("Antes da exception");

            int[] vetor = new int[3];

            vetor[3] = 5;
            
            System.out.println("Essa linha não vai imprimir!");

        } catch (ArrayIndexOutOfBoundsException exception) {
            
            System.out.println("Você está tentando acessar uma posição inválida no array!");

        }
        
        System.out.println("Essa linha vai imprimir");

    }

}
