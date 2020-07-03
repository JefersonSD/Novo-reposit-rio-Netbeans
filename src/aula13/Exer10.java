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
public class Exer10 {

    public static void main(String[] args) {

        //10 - Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.
        
        Scanner t = new Scanner(System.in);
        System.out.println("Informe a temperatura em graus Celcius: ");
        double c = t.nextDouble();
        double farenheit = (c * 1.8) + 32;//Fórmula para converter graus Celcius em graus Farenheit.
        System.out.println("A temperatura " + c + " em graus Celsius, corresponde a temperatura " + farenheit + " em graus Farenheit.");
    }
}
