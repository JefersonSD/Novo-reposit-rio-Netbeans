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
public class Fibonacci {

//    1. Escreva  um  método  recursivo  e  estático  que  calcule  e  retorne  o  N-­‐ésimo   termo  da  sequência  Fibonacci.  
//       Alguns  números  desta  sequência  são:  0,  1,   1,  2,  3,  5,  8,  13,  21,  34,  55,  89...
  
    public static int fibonacci(int num) {

        if (num == 0 || num == 1) {
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);

    }
}
