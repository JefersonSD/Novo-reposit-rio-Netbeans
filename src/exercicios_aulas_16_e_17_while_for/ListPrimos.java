package exercicios_aulas_16_e_17_while_for;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListPrimos {

    public static void main(String[] args) {
        /*
		 * 35 - Encontrar números primos é uma tarefa difícil. Faça um programa que gera
		 * uma lista dos números primos existentes entre 1 e um número inteiro informado
		 * pelo usuário.
         */

        Scanner t = new Scanner(System.in);
        List<Double> lista = new ArrayList();
        System.out.println("Informe um número inteiro > que 0:");
        double numero = t.nextDouble(), cont = 0;
        while (numero <= 0) {
            System.out.println("Valor inválido!\nInforme um número inteiro > que 0:");
            numero = t.nextDouble();
        }
        for (double i = 1; i <= numero; i++) { // for (double i = numero; i > 0; i++) { (Para mostrar do maior para o menor)
            for (double j = i; j > 0; j--) {
                if (i % j == 0) {
                    cont++;
                }
            }

            if (cont == 2) {
                lista.add(i);
            }
            cont = 0;
        }

        System.out.println("Números primos entre 1 e " + numero + " : " + lista);
    }

}
