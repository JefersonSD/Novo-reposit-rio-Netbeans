package exercicios_aula_16_e_17;

import java.util.Scanner;

public class EOuNaoPrimo {

    public static void main(String[] args) {
        /*
		 * 34 - Os números primos possuem várias aplicações dentro da Computação, por
		 * exemplo na Criptografia. Um número primo é aquele que é divisível apenas por
		 * um e por ele mesmo. Faça um programa que peça um número inteiro e determine
		 * se ele é ou não um número primo.
         */

        Scanner t = new Scanner(System.in);
        int numero, contador = 0;
        System.out.println("Informe um número inteiro:");
        numero = t.nextInt();

        for (int i = numero; i > 0; i--) {

            if (numero % i == 0) {
                contador++;
            }

        }

        if (contador == 2) {
            System.out.println("É número primo!");
        } else {
            System.out.println("Não é número primo!");
        }
    }

}
