/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula38_palavra_chave_super;


/**
 *
 * @author jsjef
 */
public class Aluno extends Pessoa {

    private String[] cursos;
    private double[] notas;

    public Aluno(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone, cpf);
    }
    
    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public double verificarAprovacao() {
        return 0;
    }

}
