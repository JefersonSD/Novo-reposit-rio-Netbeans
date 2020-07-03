/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13_operadores;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class Soma {

    public static void main(String[] args) {

        /*11 - Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre: 
		           a - o produto do dobro do primeiro com metade do segundo. 
		           b - a soma do triplo do primeiro com o terceiro. 
		           c - o terceiro elevado ao cubo.*/
        
        Scanner t = new Scanner(System.in);
        System.out.println("Informe 1 número inteiro: ");
        double inteiro1 = t.nextDouble();
        System.out.println("Informe outro número inteiro: ");
        double inteiro2 = t.nextDouble();
        System.out.println("Agora informe um número real: ");
        double real = t.nextDouble();
        double result1 = (inteiro1 * 2) + (inteiro2 / 2);
        double result2 = (inteiro1 * 3) + real;
        double result3 = Math.pow(real, 3);
        System.out.println("-> O produto do dobro do primeiro com metade do segundo é = a: " + result1 + "\n" + "-> A soma do triplo "
                         + "do primeiro com o terceiro é = a: " + result2 + "\n" + "-> O terceiro elevado ao cubo é = a: " + result3);
    }
}
