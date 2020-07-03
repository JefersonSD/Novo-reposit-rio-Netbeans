
package exercicios_aula_19;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class IdadeMaiorQue35 {
    public static void main(String[] args) {
//        17.Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. Escreva um programa que determine 
//        e escreva a quantidade de pessoas que possuem idade superior a 35 anos.

        Scanner t = new Scanner(System.in);
        int [] idades = new int[10];
        int contador = 0;
        System.out.println("Informe as 10 idades:");
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Informe a " + (i+1) + "ª idade:");
            idades[i] = t.nextInt();
            if(idades[i] > 35){
                contador++;
            }
        }
        System.out.print("Elementos do vetor idades:");
        for (int i = 0; i < idades.length; i++) {
            System.out.print(" [" + idades[i] + "] ");
        }
        System.out.println();
        System.out.println("Quantidade de pessoas com idades superiores a 35: " + contador + " pessoas");
    }
    
}
