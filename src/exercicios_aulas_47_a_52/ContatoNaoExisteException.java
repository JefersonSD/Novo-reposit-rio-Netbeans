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
public class ContatoNaoExisteException extends Exception {

    @Override
    public String toString() {
        return "Contato não encontrado!";   
    }
}
