/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aulas36_a_43;

/**
 *
 * @author jsjef
 */
public class PessoaFisica extends Contribuinte {

    public PessoaFisica() {

    }

    @Override
    public String toString() {
        return "Tipo de contribuinte: " + super.getTipoContribuinte() + "\nNome do contribuinte: " + super.getNome()
                + "\nSalário Bruto: " + super.getRendaBruta();
    }
}
