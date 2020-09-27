/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula55_metodos_value_valueof;

import aula54_enumeradores_como_classes.DiaSemana;

/**
 *
 * @author jsjef
 */
public class TesteEnum2 {
    public static void main(String[] args) {
        
        
        //System.out.println(DiaSemana.valueOf("DOMINGO"));
        //System.out.println(DiaSemana.valueOf(DiaSemana.class, "DOMINGO"));
       
       
        DiaSemana dia =  DiaSemana.valueOf(DiaSemana.class, "DOMINGo");
        
        System.out.println(dia);
    }
    
}
