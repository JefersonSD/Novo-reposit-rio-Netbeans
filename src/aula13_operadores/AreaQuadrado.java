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
public class AreaQuadrado {

    public static void main(String[] args) {
        //7 - Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

        Scanner t = new Scanner(System.in);
        System.out.println("Informe a base do quadrado: ");
        double base = t.nextDouble();
        double area = Math.pow(base, 2) * 2; //Fórmula para calcular a área do quadrado usando Math.pow para calcular a potenciação.
        //Formula original: [Area = Base²]
        System.out.printf("O dobro da área do quadrado é igual a: %.3f%n ", area);
    }

}
