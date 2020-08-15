/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula36_tem_um_tem_muitos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class TesteCurso {

    public static void main(String[] args) {
//    2. Escreva  uma  classe  para  representar  um  Curso,  que  tem  nome  e  horário.   Cada  curso  tem  um  Professor,  
//       que  possui  nome,  departamento  e  email.   Cada  Curso  também  pode  ter  vários  alunos  (tipo  Aluno).  Cada  
//       Aluno  tem   nome,  matricula  e  4  notas.  Escreva  um  programa  teste  que  crie  um  Curso   com  5  alunos,  
//       e  que  preça  para  o  usuário  entrar  com  as  4  notas  de  cada   aluno.  Ao  final,  imprima  a  média  de  
//       cada  aluno,  se  o  mesmo  está  aprovado   (media  maior  ou  igual  a  7),  e  qual  é  a  média  da  turma.  

        Scanner t = new Scanner(System.in);
        List<Aluno> dadosAlunos = new ArrayList();
        Professor professor = new Professor("Antônio", "Coordenação", "antonio@gmail.com");
        Curso curso = new Curso("Matemática", "13:30", professor);
        int posicao = 0;
        double media = 0;
        boolean passou = false;

        preencheDados(t, dadosAlunos, curso);

        outPut(curso, posicao, media, passou);

    }

    static void preencheDados(Scanner t, List<Aluno> dadosAlunos, Curso curso) {
        for (int i = 0; i < 5; i++) {
            Aluno aluno = new Aluno();
            System.out.println("Informe o nome do " + (i + 1) + "º aluno");
            aluno.setNomeAluno(t.next());
            System.out.println("Informe a matricula:");
            aluno.setMatricula(t.next());
            for (int j = 0; j < aluno.getNotas().length; j++) {
                System.out.println("Informe a " + (j + 1) + "ª nota do aluno " + aluno.getNomeAluno());
                aluno.InformaNotas(j, t.nextDouble());
            }
            dadosAlunos.add(aluno);
            System.out.println();
        }
        curso.setAlunos(dadosAlunos);
    }

    static void outPut(Curso curso, int posicao, double media, boolean passou) {
        
        double soma = 0,mediaGeral = 0;
        int contador = 0;
        
        System.out.println("Dados da turma:");
        System.out.println("Nome da disciplina: " + curso.getNomeDisciplina());
        System.out.println("Horário da disciplina: " + curso.getHorario());
        System.out.println("Professor: " + curso.getProfessor().getNome());
        System.out.println("Departamento: " + curso.getProfessor().getDepartamento());
        System.out.println("E-mail: " + curso.getProfessor().getEmail());
        System.out.println();

        while (posicao < curso.getAlunos().size()) {
            System.out.println("Aluno: " + curso.getAlunos().get(posicao).getNomeAluno());
            System.out.println("Matrícula: " + curso.getAlunos().get(posicao).getMatricula());
            System.out.print("Notas: ");
            for (int i = 0; i < curso.getAlunos().get(posicao).getNotas().length; i++) {
                System.out.print("[" + curso.getAlunos().get(posicao).getNotas()[i] + "]");
                media += curso.getAlunos().get(posicao).getNotas()[i];
                contador++;
                soma += curso.getAlunos().get(posicao).getNotas()[i];
            }
            System.out.println();
            System.out.println("Média: " + media / curso.getAlunos().get(posicao).getNotas().length);
            System.out.print("Resultado: ");
            passou = curso.getAlunos().get(posicao).resultado(curso.getAlunos().get(posicao).getNotas());
            if (passou) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
            posicao++;
            media = 0;
            System.out.println();
            if(posicao == 5){
                System.out.println("Média geral da turma:");
                System.out.println(mediaGeral = soma/contador);
            }
        }

    }

}
