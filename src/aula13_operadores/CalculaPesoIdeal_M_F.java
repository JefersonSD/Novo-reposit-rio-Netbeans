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
public class CalculaPesoIdeal_M_F {

    public static void main(String[] args) {

        /*13 - Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as 
        seguintes fórmulas: Para homens: (72.7*h) - 58 Para mulheres: (62.1*h) - 44.7 */
        
        Scanner t = new Scanner(System.in);
        System.out.println("Informe a sua altura: ");
        double altura = t.nextDouble();
        System.out.println("Informe o seu sexo: (Digite \"M\" para masculino ou \"F\" para feminino)");
        String sexo = t.next();
        while (!sexo.equals("M") && !sexo.equals("F")) { //Validação de entrada para sexo
            System.out.println("Caractere incorreto (Digite \"M\" para masculino ou \"F\" para feminino)");
            sexo = t.next();
        }
        if (sexo.equals("M")) {
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Por ser do sexo masculino o seu peso ideal deve ser igual a: %.2f%n ", pesoIdeal);
        } else {
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Por ser do sexo feminino o seu peso ideal deve ser igual a: %.2f%n ", pesoIdeal);
        }
    }

}
