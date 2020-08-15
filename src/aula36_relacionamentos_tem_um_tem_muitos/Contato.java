/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula36_relacionamentos_tem_um_tem_muitos;

/**
 *
 * @author jsjef
 */
public class Contato {

    private String nome;
    //Criando atributo do tipo da classe
    private Endereco endereco;  // substituindo --> private String endereco
    // private Telefone telefone;   substituindo --> private String telefone
    private Telefone[] telefones;  // substituindo --> private Telefone telefone

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }

   
}
