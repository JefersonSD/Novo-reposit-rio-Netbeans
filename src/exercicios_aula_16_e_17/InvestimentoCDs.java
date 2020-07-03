package exercicios_aula_16_e_17;

import java.util.Scanner;

public class InvestimentoCDs {

    public static void main(String[] args) {
        /*
		 * 28 - Faça um programa que calcule o valor total investido por um colecionador
		 * em sua coleção de CDs e o valor médio gasto em cada um deles. O usuário
		 * deverá informar a quantidade de CDs e o valor para em cada um.
         */

        Scanner t = new Scanner(System.in);
        int quantCd;
        double valor, media, vTotal = 0;
        System.out.println("Informe a quantidade de CD´s:");
        quantCd = t.nextInt();
        for (int i = 1; i <= quantCd; i++) {

            System.out.println("Informe o valor do " + i + "º CD:");
            valor = t.nextDouble();
            vTotal += valor;
        }
        media = vTotal / quantCd;
        System.out.printf("Valor total gasto: %.2f\n", vTotal);
        System.out.printf("Média de valor por CD: %.2f\n", media);
    }

}
