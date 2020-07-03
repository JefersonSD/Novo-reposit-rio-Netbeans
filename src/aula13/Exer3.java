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
public class Exer3 {

    public static void main(String[] args) {

        //3 - Faça um Programa que peça dois números e imprima a soma.
        
        Scanner t = new Scanner(System.in);
        System.out.println("Digite o 1º número: ");
        int num1 = t.nextInt();
        System.out.println("Digite o 2º número: ");
        int num2 = t.nextInt();
        System.out.println("A soma dos números é = a: " + (num1 + num2));
    }

}
