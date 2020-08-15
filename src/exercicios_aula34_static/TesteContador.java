/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula34_static;

/**
 *
 * @author jsjef
 */
public class TesteContador {
    public static void main(String[] args) {
        
        Contador cont = new Contador();
        Contador cont2 = new Contador();
        Contador.incrementCont();
        Contador.zerarCont();
        
        System.out.println(Contador.getContador());
        
    }
    
}
