/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas_75_a_84_strings;

/**
 *
 * @author jsjef
 */
public class Pessoa {

    private int cod;
    private String nome;
    private int idade;

    public Pessoa(int cod, String nome, int idade) {
        this.cod = cod;
        this.nome = nome;
        this.idade = idade;
    }

    public int getCod() {
        return this.cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Código: " + this.cod + "Nome: " + this.nome + " Idade: " + this.idade;
    }

}
