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
public class Professor extends Pessoa{
    
    private String departamento;
    private String nomeCurso;
    private double salario;

    public Professor(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone, cpf);
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
      public double calcularSalrioLiquido(){
        return 0;
    }  
      
    
}
