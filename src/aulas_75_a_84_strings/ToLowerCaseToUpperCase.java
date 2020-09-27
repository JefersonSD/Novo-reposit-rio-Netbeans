/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas_75_a_84_strings;

import java.util.Locale;

/**
 *
 * @author jsjef
 */
public class ToLowerCaseToUpperCase {
    public static void main(String[] args) {
        
        String teste = "Teste";
        System.out.println(teste.toLowerCase()); // Imprime tudo minúsculo
        System.out.println(teste.toUpperCase(Locale.ITALY));
        
        if(teste.toLowerCase().equals(teste.toLowerCase())){ // comparações assim também podem ser feitas
            
        }
    }
    
}
