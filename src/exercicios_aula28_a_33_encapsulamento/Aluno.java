/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula28_a_33_encapsulamento;

/**
 *
 * @author jsjef
 */
public class Aluno {

//    3. Escreva  uma  classe  para  representar  um  Aluno.  Adicione  atributos   relacionados  às  caracteristicas  de  um  Aluno,  
//       como  nome,  matricula,  curso   que  está  matriculado,  nome  de  3  disciplinas  que  está  cursando  e  as  notas   dessas  
//       3  disciplinas.  Desenvolva  um  método  para  verificar  se  o  aluno  está   aprovado  (nota  maior  ou  igual  a  7)  em  
//       uma  determinada  disciplina.   Escreva  um  programa  para  testar  essa  classe,  que  pede  as  informações  do   aluno 
//       ao  usuário  e  ao  final  informa  o  nome  das  disciplinas,  mostra  as   notas  e  mostra  se  o  aluno  foi  aprovado
//       ou  não.
    private String nome;
    private int matricula;
    private String curso;
    private String[] disciplinas;
    private double[][] notas;

    public Aluno() {}

    public Aluno(int matricula, String curso) {
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = new String[3];
        this.notas = new double[3][4];

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    private boolean verificaSePassou(double[][] notas, int index) {
        double media = 0;
        int contador = 0;
        for (int i = 0; i <= index; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                media += notas[index][j];
                contador++;
            }

        }

        if (media / contador < 7) {
            return false;
        }
        return true;
    }

    public boolean resultado(double[][] notas, int index) {
        return this.verificaSePassou(notas, index);

    }

    public void informaDisciplinas(int pos, String disciplina) {
        this.disciplinas[pos] = disciplina;
    }

    public void InformaNotas(int posI, int posJ, double nota) {
        this.notas[posI][posJ] = nota;
    }

}
