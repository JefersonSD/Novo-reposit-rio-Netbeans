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
public class MinhaCalculadora {
    
    // declaração de um método que retorna a soma 2 números
    public int soma ( int num1, int num2){
        return num1+num2;
    }
    //Sobrecarga do método soma alterando a quantidade de parâmetros
    public int soma(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    //Sobrecarga do método soma mudando o tipo de parâmetro
    public double soma(double num1, double num2){
        return num1+num2;
    }
    //Sobrecarga do método soma utilizando como parâmetro um array de inteiros
    public int soma(int [] valoresInteiros){
        int total = 0;
        for (int i = 0; i < valoresInteiros.length; i++) {
           total += valoresInteiros[i];
            
        }
        
        return total;
    }
}
