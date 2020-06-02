package aula17_exercicios_aula_16_e_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exer27 {

    public static void main(String[] args) {
        /*
		 * 27 - Faça um programa que calcule o número médio de alunos por turma. Para
		 * isto, peça a quantidade de turmas e a quantidade de alunos para cada turma.
		 * As turmas não podem ter mais de 40 alunos.
         */

        Scanner t = new Scanner(System.in);
        List<Integer> lista = new ArrayList();
        int turmas, alunos;
        double media = 0;
        System.out.println("Informe a quantidade de turmas:");
        turmas = t.nextInt();
        for (int i = 1; i <= turmas; i++) {
            System.out.println("Informe a quantidade de alunos da turma:" + i);
            alunos = t.nextInt();
            while (alunos > 40) {

                System.err.println("Não pode haver mais que 40 alunos por turma:");
                alunos = t.nextInt();
            }

            lista.add(alunos);
        }
        for (int soma : lista) {
            media += soma;
        }
        media /= turmas;
        if (media % 1 == 0) {
            System.out.printf(" A Média por turma é igual a %.0f alunos\n", media);
        } else {
            System.out.printf(" A Média por turma é de aproximadamente %.2f alunos\n", media);
        }

    }

}
