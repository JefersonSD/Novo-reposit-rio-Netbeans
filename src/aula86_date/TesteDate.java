/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula86_date;

import java.util.Date;

/**
 *
 * @author jsjef
 */
public class TesteDate {
    public static void main (String [] args){
        
        //Imprimindo a data atual
        Date hoje = new Date();
        System.out.println(hoje);
        
        // Imprimindo quantos milisegundos se passaram desde 1970 até hoje
        System.out.println(hoje.getTime());
        
        // Imprimindo o dia atual
        System.out.println(hoje.getDate());
    }
    
}
