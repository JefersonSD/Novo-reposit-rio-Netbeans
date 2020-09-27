/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas_75_a_84_strings;

/**
 *
 * @author jsjef
 */
public class StringsFazendoBuscas {
    public static void main (String [] args){
        
        String banana = "banana";
        String ana = "ana";
        
        System.out.println(banana.indexOf("an")); //O método indexof retorna a posição da String ou -1 se não enco.
        System.out.println(banana.indexOf(ana));
        System.out.println(banana.lastIndexOf("a")); // para saber a última vez que a String a aparece
        System.out.println(banana.lastIndexOf(ana));
        
        System.out.println(banana.contains(ana)); //verifica a existência da String e retorna true ou false
        System.out.println(banana.contains("ceu"));
    }
}
