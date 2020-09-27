/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas_75_a_84_strings;

import java.util.Arrays;

/**
 *
 * @author jsjef
 */
public class StringsExtraindoChars {
    public static void main(String[] args) {
        
        String java = "Java";
        
        for(int i = 0;i<java.length();i++){ // usando charAt para imprimir os chars da String em um for
            
            System.out.println(java.charAt(i));
        }
        
        char [] jav = new char[3];
        java.getChars(0, 3, jav, 0);// Usando getChars para popular um array de chars de 3 positions
        System.out.println(jav);
        
        for (int i = 0, j = 0; i < jav.length; i++, j++) {
            
            jav[j] = java.charAt(i); // populando o array com charAt
            
        }
        
        System.out.println(jav);
        
       byte [] b = new byte[3];
       java.getBytes(0,3,b,0); // Usando getBytes para popular um array de bytes de 3 positions
        System.out.println(Arrays.toString(b));
        
        char [] javaChars = java.toCharArray(); // Método que transforma uma String em um array de chars
        System.out.println(javaChars);
        
    }
    
}
