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
public class Exer4 {

    public static void main(String[] args) {

        //4 - Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        
        Scanner t = new Scanner(System.in);
        System.out.println("Digite a 1ª nota: ");
        double nota1 = t.nextDouble();
        System.out.println("Digite o 2ª nota: ");
        double nota2 = t.nextDouble();
        System.out.println("Digite a 3ª nota: ");
        double nota3 = t.nextDouble();
        System.out.println("Digite o 4ª nota: ");
        double nota4 = t.nextDouble();
        System.out.printf("A média das notas é = a: %.2f %n ", (nota1 + nota2 + nota3 + nota4) / 4);//Fórmula da média usando printf
    }

}
