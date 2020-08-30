/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aulas_47_a_52;

/**
 *
 * @author jsjef
 */
public class Contato {

    private String nome;
    private String telefone;
    private static int identificador = 0;

    public Contato() {
        if(identificador <= 5){
            identificador++;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdentificador() {
        return identificador;
    }

    @Override
    public String toString() {

        return "Id do contato: " + identificador + "\nNome do contato: " + this.nome + "\nNúmero de telefone: " + this.telefone;
    }

}
