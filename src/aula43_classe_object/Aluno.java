/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula43_classe_object;

import java.util.Arrays;

/**
 *
 * @author jsjef
 */
public class Aluno {

    private String[] cursos;
    private double[] notas;

    public Aluno() {};
    
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

    //@Override
    public String obterEndereco() {
        String s = "Endereço do aluno: ";
        //s += this.getEndereco();
        return s;
    }

//    @Override
//    public String toString() {
//
//        String s = "Notas : ";
//
//        for (double nota : notas) {
//            s += nota + " ";
//        }
//
//        return s;
//    }

    @Override
    public String toString() {
        return "Cursos = " + Arrays.toString(cursos) +  "\n" + "Notas = " + Arrays.toString(notas);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Arrays.deepEquals(this.cursos, other.cursos)) {
            return false;
        }
        if (!Arrays.equals(this.notas, other.notas)) {
            return false;
        }
        return true;
    }
    
    
    
}
