/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula35_recursividade;

/**
 *
 * @author jsjef
 */
public class Somando {
//    2. Escreva  um  método  recursivo  e  estático  que  receba  um  número  inteiro   positivo  N  e  calcule  
//       o  somatório  dos  números  de  1  a  N  
    
    public static int somaNumeros(int numero){
        if(numero == 1){
            return 1;
        }
        System.out.println(numero);
        return numero += somaNumeros(numero-1);
    } 
}
