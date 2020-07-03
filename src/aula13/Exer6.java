/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class Exer6 {

    public static void main(String[] args) {

        //6 - Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
        
        Scanner t = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");
        double raio = t.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);//Fórmula para calcular a área do círculo usando Math.PI para buscar o número PI 
        //e  Math.pow para calcular a potenciação. Formula original: [Area = PI*raio²]
        System.out.printf("O cálculo da área cujo o raio é " + raio + " é igual a %.3f %n", area);
    }

}
