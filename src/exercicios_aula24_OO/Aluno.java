/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula24_OO;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class Aluno {

    Scanner t = new Scanner(System.in);

//    3. Escreva  uma  classe  para  representar  um  Aluno.  Adicione  atributos   relacionados  às  caracteristicas  de  
//       um  Aluno,  como  nome,  matricula,  curso   que  está  matriculado,  nome  de  3  disciplinas  que  está  cursando 
//       e  as  notas   dessas  3  disciplinas.  Desenvolva  um  método  para  verificar  se  o  aluno  está   aprovado  
//       (nota  maior  ou  igual  a  7)  em  uma  determinada  disciplina.   Escreva  um  programa  para  testar  essa  
//       classe,  que  pede  as  informações  do   aluno  ao  usuário  e  ao  final  informa  o  nome  das  disciplinas,  
//       mostra  as   notas  e  mostra  se  o  aluno  foi  aprovado  ou  não. 
    String nome;
    int matricula;
    String curso;
    String[] disciplinas;
    double[][] notas;
    double  somaNotas = 0;

    String verificaAprovacao(double nota) {
        String resultado;
        if (nota >= 7) {
            resultado = "Aprovado!";
        } else {
            resultado = "Reprovado!";
        }

        return resultado;
    }

    void preencheDadosAluno() {
        System.out.println("Digite o nome do aluno:");
        nome = t.next();
        System.out.println("Digite a matrícula do aluno:");
        matricula = t.nextInt();
        System.out.println("Digite O curso do aluno:");
        curso = t.next();
        System.out.println("Informe as disciplinas que o aluno está matriculado:");
        for (int i = 0; i < disciplinas.length; i++) {
            System.out.println("Informe a " + (i + 1) + "ª disciplina:");
            disciplinas[i] = t.next();
        }
    }

    void InformaNotasAluno() {
        System.out.println("Agora informe as notas para cada disciplina:");
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Informe a " + (j+1) + "ª nota da disciplna " + disciplinas[i]);
                notas[i][j] = t.nextDouble();
            }

        }

    }

    void mostraResultado() {
        System.out.println("Dados do aluno:");
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + curso);
        System.out.println();
        for (int i = 0; i < notas.length; i++) {
            for(int j = 0; j<notas[i].length;j++){
                somaNotas += notas[i][j];
            }
                String resultado = verificaAprovacao(somaNotas/notas[i].length);
                System.out.println("Disciplina: " + disciplinas[i]);
                System.out.printf("Nota da disciplina: %.2f\n", somaNotas/notas[i].length);
                System.out.println("Resultado: " + resultado);
                System.out.println();
                somaNotas = 0;
        }
    }
}
