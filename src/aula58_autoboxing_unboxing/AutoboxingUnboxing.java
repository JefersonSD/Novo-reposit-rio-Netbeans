/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula58_autoboxing_unboxing;

/**
 *
 * @author jsjef
 */
public class AutoboxingUnboxing {
    
    public static void main(String[] args) {
        
        //autoboxing --- atrinui um valor primitivo a um tipo objeto [Classe wrapper]
        Short num6 = 1;
        Byte num7 = 2;
        Long num8 = 3l;
        Integer num9 = 5;
        Float num10 = 3.5f;
        Double num11 = 3.5;
        Boolean flag2 = true;
        Character char_ = 'f';
        
        //auto un-boxing --- atrinui um tipo objeto [classe wrapper] a um tipo primitivo
        
        int a = num9;
        
        //autoboxing em expressões
        num9++;
        System.out.println(num9);
        
        //auto - unboxing num9 e autoboxing [resultado da expressão a+num9 para o objeto num14]
        Integer num14 = a+num9;
    }
    
}
