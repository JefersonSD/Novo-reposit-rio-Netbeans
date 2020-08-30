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
public class AgendaCheiaExeption extends Exception {
    
    int i;

    public AgendaCheiaExeption(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Máximo de " + (this.i-1) + " contatos podem ser cadastrados!\nEscolha consultar ou sair no menu principal";
    }  
   
}
