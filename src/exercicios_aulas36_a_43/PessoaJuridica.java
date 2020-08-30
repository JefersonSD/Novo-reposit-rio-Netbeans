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
public class PessoaJuridica extends Contribuinte {

    @Override
    public String toString() {
        return "Tipo de contribuinte: " + super.getTipoContribuinte() + "\nNome da empresa: " + super.getNome()
                + "\nRenda Bruta: " + super.getRendaBruta();
    }
}
