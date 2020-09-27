/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula85_math;

/**
 *
 * @author jsjef
 */
public class ExemplosMath {
    
    public static void main(String[] args) {
        
        //Potência
        System.out.println(Math.pow(2, 3));
        
        //Arredondamento para baixo ou para cima
        System.out.println(Math.round(4.4));
        
        //Arredonda para cima
        System.out.println(Math.ceil(4.4));
       
        //Arredonda para baixo
        System.out.println(Math.floor(4.9));
       
        //Gerando números aleatórios 
        System.out.println(Math.random());
       
        //Gerando números aleatórios e arredondando com Math.round
        System.out.println(Math.round(Math.random()*10));
       
        //Calculando o seno
        System.out.println(Math.sin(Math.toRadians(30)));
       
        //Calculando o cosseno
        System.out.println(Math.cos(Math.toRadians(1)));
       
        //Calculando a tangente
        System.out.println(Math.tan(Math.toRadians(45)));
       
        
    }
}
