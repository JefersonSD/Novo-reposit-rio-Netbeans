/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula99_random;

import java.util.Random;

/**
 *
 * @author jsjef
 */
public class TesteRandom {
    public static void main(String[] args){
        
        //Gerando números aleatórios no java
        
        System.out.println(Math.round(Math.random()*100));
        
        //Gerando números inteiros com a classe Random [Pode ser usando long,double,float...]
        
        Random r = new Random();
        System.out.println(r.nextInt()); // São gerados números de acordo que o int consegue guardar no java.
        
        //Limitar a um número desejado
        
        System.out.println(r.nextInt(100));// para incluir o número adiccione +1
    }
    
}
