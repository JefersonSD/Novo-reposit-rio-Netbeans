/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula48_multiplos_try_catch;

import java.util.Scanner;


/**
 *
 * @author jsjef
 */
public class UsandoThrows {
    
    public static void main(String[] args) {
        System.out.println("Informe um número double:");
        try {
            double num = retornaDouble();
            System.out.println("O número digitado foi: " + num);
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro!");
            ex.printStackTrace();
        }
        
    }
    
    public static double retornaDouble() throws Exception{
        
        double num;
        Scanner t = new Scanner(System.in);
        num = t.nextDouble();
        return num; 
    }
    
}
