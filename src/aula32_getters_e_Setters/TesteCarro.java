/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula32_getters_e_Setters;

/**
 *
 * @author jsjef
 */
public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        //Setando atributo através do método set
        carro.setMarca("Fiat");
        //Pegando valor do atributo através do método get
        System.out.println(carro.getMarca());
    }
    
}
