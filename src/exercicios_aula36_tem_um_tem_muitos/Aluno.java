/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula36_tem_um_tem_muitos;

/**
 *
 * @author jsjef
 */
public class Aluno {

    private String nomeAluno;
    private String matricula;
    private double[] notas;

    public Aluno() {
        notas = new double[4];
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void InformaNotas(int index, double notas) {

        this.notas[index] = notas;

    }

    private boolean verificaSePassou(double[] notas) {
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        media /= notas.length;

        if (media >= 7) {
            return true;
        }
        return false;
    }

    public boolean resultado(double[] notas) {
        return verificaSePassou(notas);
    }
}
