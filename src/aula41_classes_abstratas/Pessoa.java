/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula41_classes_abstratas;


/**
 *
 * @author jsjef
 */
public abstract class Pessoa {
    
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    
    public Pessoa(){};

    public Pessoa(String nome, String endereco, String telefone, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    // Um método abstrato não pode ter implementação, somente nas classes filhas.
    public abstract String obterEndereco();
    
   // Obs: na classe abstrata os métodos com modificadores default, public e protected podem ser abstratos exceto o private.
}
