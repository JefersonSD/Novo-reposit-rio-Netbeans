/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula33_sobrecarga_metodos_constructors;

/**
 *
 * @author jsjef
 */
public class TesteCalculadora {
    public static void main(String[] args) {
        
        MinhaCalculadora calc = new MinhaCalculadora();
        
        int [] vetor = new int [3];
        vetor[0] = 1;
        vetor[1] = 2;
        vetor[2] = 3;
        
        System.out.println(calc.soma(vetor));
        
    }
    
}
