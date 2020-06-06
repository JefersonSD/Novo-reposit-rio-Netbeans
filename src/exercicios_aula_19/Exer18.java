package exercicios_aula_19;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class Exer18 {

    public static void main(String[] args) {
//        18.Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. Escreva um programa que determine 
//        e escreva a menor e a maior idades e suas respectivas posições.

        Scanner t = new Scanner(System.in);
        int[] idades = new int[10];
        int menorIdade = Integer.MAX_VALUE, maiorIdade = Integer.MIN_VALUE;
        System.out.println("Informe a 10 idades:");
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Informe a " + (i + 1) + "ª idade:");
            idades[i] = t.nextInt();
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
            }
            if (idades[i] < menorIdade) {
                menorIdade = idades[i];
            }
        }
        System.out.println("Maior idade = " + maiorIdade);
        System.out.println("Menor idade = " + menorIdade);
    }

}
