package aula17_exercicios_aula_16_e_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exer39 {

    public static void main(String[] args) {
        /*
		 * 39 - Faça um programa que leia dez conjuntos de dois valores, o primeiro
		 * representando o número do aluno e o segundo representando a sua altura em
		 * centímetros. Encontre o aluno mais alto e o mais baixo. Mostre o número do
		 * aluno mais alto e o número do aluno mais baixo, junto com suas alturas.
         */
        Scanner t = new Scanner(System.in);
        List<Double> lista = new ArrayList();
        double codigo, codMenor = 0, codMaior = 0, contador = 0;
        double altura, maior = 0, menor = 0;
        boolean verifica = true;
        System.out.println("Informe 10 números de alunos com suas respectivas alturas (\"Em centímetros\") :");
        for (double i = 1; i <= 10; i++) {
            contador++;
            System.out.printf("Informe o código do %.0fº aluno\n", i);
            codigo = t.nextInt();
            verifica = true;
            while (lista.contains(codigo) && contador > 1) {
                System.out.println("Código já existe!\nEntre com outro código:");
                codigo = t.nextInt();
                verifica = false;
            }
            if (verifica == true) {
                lista.add(codigo);
            } else {
                lista.add(codigo);
            }

            System.out.printf("Informe a altura  do %.0fº aluno (\"Em centímetros\"):\n", i);
            altura = t.nextDouble();
            if (contador == 1) {
                menor = altura;
            }

            if (altura > maior) {
                maior = altura;
                codMaior = codigo;
            }
            if (altura <= menor) {
                menor = altura;
                codMenor = codigo;
            }

        }

        System.out.printf("Código do maior aluno: %.0f\nAltura do maior aluno: %.2f\n\n"
                + "Código do menor aluno: %.0f\nAltura do menor aluno: %.2f\n ", codMaior, (maior / 100), codMenor, (menor / 100));
    }

}
