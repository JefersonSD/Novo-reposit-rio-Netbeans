/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula62_varargs;

/**
 *
 * @author jsjef
 */
public class TesteVarArgs {
    
    public static void main(String[] args) {
        
        System.out.println(soma(1, 2));
        System.out.println(soma(1, 2, 2));
        
        int [] vetor = {1,6,7,9,10};
        System.out.println(soma(vetor));
        
        
        System.out.println(soma(1,2,6,3,5,8,9,15,16));
    }
    
    static int soma(int a, int b){
        return a+b;
    }
    
    static int soma(int a, int b, int c){
        return a+b;
    }
    
    static int soma(int[]vetor){
        
        int somaTotal = 0;
        
        for(int i = 0;i<vetor.length;i++){
            
            somaTotal += vetor[i];
        }
        
        return somaTotal;
    }
    static int soma(double a, int c, Integer...varArgs){
        
        int somaTotal = 0;
        
        for(int i = 0;i<varArgs.length;i++){
            
            somaTotal += varArgs[i];
        }
        
        return somaTotal;
    }
}
