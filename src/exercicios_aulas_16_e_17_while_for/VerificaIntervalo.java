package exercicios_aulas_16_e_17_while_for;

import java.util.Scanner;

public class VerificaIntervalo {

    public static void main(String[] args) {
        /*
		 * 42 - Faça um programa que leia uma quantidade indeterminada de números
		 * positivos e conte quantos deles estão nos seguintes intervalos: [0-25],
		 * [26-50], [51-75] e [76-100]. A entrada de dados deverá terminar quando for
		 * lido um número negativo.
         */

        Scanner t = new Scanner(System.in);
        double numero;
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;
        System.out.println("Informe uma quantidade indeterminada de números positivos para saber se estão nos "
                + "intervalos [0-25], [26-50], [51-75]\ne [76-100]:\n[números negativos encerram o programa]");
        numero = t.nextDouble();

        do {
            if (cont1 != 0 || cont2 != 0 || cont3 != 0 || cont4 != 0) {
                System.out.println("Informe o próximo número: [números negativos encerram o programa]");
                numero = t.nextDouble();
            }
            if (numero >= 0 && numero <= 25) {
                cont1++;
            } else if (numero >= 26 && numero <= 50) {
                cont2++;
            } else if (numero >= 51 && numero <= 75) {
                cont3++;
            } else if (numero >= 76 && numero <= 100) {
                cont4++;
            } else if (numero > 0) {
                System.out.println("Informe o próximo número: [números negativos encerram o programa]");
                numero = t.nextDouble();
            }

        } while (numero >= 0);

        System.out.println("No intervalo entre [0-25] existe(m) " + cont1 + " número(s) que foi/foram digitado(s)!");
        System.out.println("No intervalo entre [26-50] existe(m) " + cont2 + " número(s) que foi/foram digitado(s)!");
        System.out.println("No intervalo entre [51-75] existe(m) " + cont3 + " número(s) que foi/foram digitado(s)!");
        System.out.println("No intervalo entre [76-100] existe(m) " + cont4 + " número(s) que foi/foram digitado(s)!");
    }

}
