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
public class Exer9 {

    public static void main(String[] args) {
        //9 - Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.C = 
        //(5 * (F-32) / 9).

        Scanner t = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Farenheit: ");
        double f = t.nextDouble();
        double celcius = (5 * (f - 32) / 9); //Fórmula para converter graus Farenheit em graus Celsius.
        //double celcius = (f-32)/1.8; Outra fórmula para converter graus Farenheit em graus Celsius. 
        System.out.printf("A temperatura %.2f em graus Farenheit, corresponde a temperatura %.2f em graus Celcius, ", f, celcius);
    }

}
