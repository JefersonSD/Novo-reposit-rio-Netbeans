package exercicios_aulas16_e_17_while_for;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IverteNumero {

    public static void main(String[] args) {
//		48 - Faça um programa que peça um numero inteiro positivo e em seguida mostre este numero invertido.
//		Exemplo:
//		  12376489
//		  => 98467321
        int inteiro = 0;
        Scanner t = new Scanner(System.in);

        try {
            System.out.println("Informe um número inteiro positivo:");
            inteiro = t.nextInt();
            while (inteiro < 0 || inteiro % 1 != 0) {
                System.err.println("Valor inválido");
                System.out.println("Informe um número inteiro positivo:");
                inteiro = t.nextInt();
            }

        } catch (InputMismatchException ex) {

            System.out.println("Número não pode ser ponto flutuante!");
            System.err.println("Programa encerrado!");
        }

        String converte, inverte = "";
        converte = Integer.toString(inteiro);

        for (int i = converte.length() - 1; i > 0; i--) {
            if (i == converte.length() - 1) {
                inverte += converte.substring(i);
            }

            inverte += converte.substring(i - 1, i);

        }

        System.out.println(inverte);

    }

}
