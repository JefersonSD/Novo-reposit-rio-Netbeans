/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula28_a_33_encapsulamento;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class TesteAluno {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        Aluno aluno = new Aluno(104696, "Biologia");
        Aluno aluno2 = new Aluno();
        double media = 0;

        System.out.println("Informe o nome do aluno:");
        aluno.setNome(t.next());
        System.out.println("Informe as disciplinas que o aluno " + aluno.getNome() + " está matriculado");
        for (int i = 0; i < aluno.getDisciplinas().length; i++) {
            System.out.println("Informe a " + (i + 1) + "ª disciplina:");
            aluno.informaDisciplinas(i, t.next());
        }

        for (int i = 0; i < aluno.getNotas().length; i++) {
            for (int j = 0; j < aluno.getNotas()[i].length; j++) {

                System.out.println("Informe a " + (j + 1) + "ª nota da disciplina " + aluno.getDisciplinas()[i]);
                aluno.InformaNotas(i, j, t.nextDouble());
            }

        }
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Matricula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Disciplinas em que o aluno está matriculado:");
        for (int i = 0; i < aluno.getDisciplinas().length; i++) {
            System.out.print("[ " + aluno.getDisciplinas()[i] + " ]");

        }
        System.out.println();
        System.out.println("Notas das disciplinas:");
        for (int i = 0; i < aluno.getNotas().length; i++) {
            System.out.print("Notas da disciplina " + aluno.getDisciplinas()[i] + ": ");
            for (int j = 0; j < aluno.getNotas()[i].length; j++) {
                System.out.print("[" + aluno.getNotas()[i][j] + "]");
                media += aluno.getNotas()[i][j];

            }
            System.out.println();
            System.out.print("Média do aluno: " + media / 4);
            System.out.println();
            System.out.print("Resultado: ");
            
            if (aluno.resultado(aluno.getNotas(),i)) {
                System.out.println("Aprovado!");
            } else {
                System.out.println("Reprovado!");
            }
            System.out.println();
            media = 0;
        }


    }

}
