/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula34_static;

/**
 *
 * @author jsjef
 */
public class Calculadora {

//     2. Escreva  uma  classe  Calculadora  que  tenha  os  seguintes  métodos:  somar,   subtrair,  multiplicar,  dividir  
//        (dois  números),  elevar  à  potência  n.   Desenvolva  um  programa  para  testar  essa  classe.
//     3. Escreva  um  método  para  calcular  factorial  de  um  número  na  classe   Calculadora  do  exercício  anterior.
    public static int soma(int num1, int num2) {

        return num1 + num2;
    }

    public static int subtrai(int num1, int num2) {

        return num1 - num2;
    }

    public static int multiplica(int num1, int num2) {

        return num1 * num2;
    }

    public static double divide(double num1, double num2) {

        return num1 / num2;
    }

    public static double potencia(int num1, int num2) {

        return Math.pow(num1, num2);

    }

    public static int fatorial(int num1) {
        int fatorial = num1;
        for (int i = num1 - 1; i > 1; i--) {

            fatorial *= i;

        }

        return fatorial;
    }
}
