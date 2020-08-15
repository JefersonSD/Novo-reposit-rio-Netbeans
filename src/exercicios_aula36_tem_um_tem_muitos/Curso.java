/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula36_tem_um_tem_muitos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jsjef
 */
public class Curso {

//    2. Escreva  uma  classe  para  representar  um  Curso,  que  tem  nome  e  horário.   Cada  curso  tem  um  Professor,  
//       que  possui  nome,  departamento  e  email.   Cada  Curso  também  pode  ter  vários  alunos  (tipo  Aluno).  Cada  
//       Aluno  tem   nome,  matricula  e  4  notas.  Escreva  um  programa  teste  que  crie  um  Curso   com  5  alunos,  
//       e  que  preça  para  o  usuário  entrar  com  as  4  notas  de  cada   aluno.  Ao  final,  imprima  a  média  de  
//       cada  aluno,  se  o  mesmo  está  aprovado   (media  maior  ou  igual  a  7),  e  qual  é  a  média  da  turma.  
    private String nomeDisciplina;
    private String horario;
    private Professor professor;
    private List<Aluno> alunos;

    public Curso() {
        alunos = new ArrayList();
    }

    public Curso(String nome, String horario, Professor professor) {
        this.nomeDisciplina = nome;
        this.horario = horario;
        this.professor = professor;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    

}
