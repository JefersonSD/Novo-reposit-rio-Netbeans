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
public class Exer12 {

    public static void main(String[] args) {

        /*12 - Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte 
        fórmula: (72.7*altura) - 58*/
        
        Scanner t = new Scanner(System.in);
        System.out.println("Informe a sua altura: ");
        double altura = t.nextDouble();
        double pesoIdeal = (72.7 * altura) - 58;
        System.out.printf("De acordo com a sua altura o seu peso ideal deve ser igual a: %.2f%n", pesoIdeal);
    }

}
