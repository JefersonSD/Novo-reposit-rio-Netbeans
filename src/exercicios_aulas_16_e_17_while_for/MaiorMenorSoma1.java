package exercicios_aulas_16_e_17_while_for;

import java.util.Scanner;

public class MaiorMenorSoma1 {

    public static void main(String[] args) {
        // - 19 Altere o programa anterior para que ele aceite apenas números entre 0 e 1000.

        Scanner t = new Scanner(System.in);
        int[] numeros = new int[5];
        int menorValor = Integer.MAX_VALUE, maiorValor = Integer.MIN_VALUE, soma = 0;
        System.out.println("Informe 10 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º número:");
            numeros[i] = t.nextInt();
            while (numeros[i] < 0 || numeros[i] > 1000) {
                System.out.println("Valor inválido. Informe valores entre 0 e 1000");
                numeros[i] = t.nextInt();

            }
            if (numeros[i] >= maiorValor) {
                maiorValor = numeros[i];
            }
            if (numeros[i] <= menorValor) {

                menorValor = numeros[i];
            }

            soma += numeros[i];
        }
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Soma dos valores: " + soma);

    }

}
