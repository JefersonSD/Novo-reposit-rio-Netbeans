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
public class AreaASerPintada1 {

    public static void main(String[] args) {

        /*16- Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
              Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 
              litros, que custam R$ 80,00. Informe ao usuário as quantidades de latas de tinta a serem compradas e o preço total.*/
        
        Scanner t = new Scanner(System.in);
        System.out.println("Informe o tamanho da área em metros quadrados a ser pintada: ");
        double area = t.nextDouble();
        double quantidadeTinta = (area / 3) / 18;//Dividindo-se a área por 3, obtém-se a quantidade aproximada de litros de tinta 
                                                 //necessários para pintar toda a área. (/18) obtém-se a quantidade de latas a 
                                                 //serem compradas.	
        double valor = Math.ceil(quantidadeTinta) * 80;//Como não é possível comprar quantidade menor que 18L (1 Lata) é necessário 
                                                       //arredondar esse nº sempre para cima (Math.ceil())
        System.out.printf("Você terá que comprar %.0f lata(s) de tinta para pintar %.0f metros quadrados com um valor total de R$%.2f%n ",
                           Math.ceil(quantidadeTinta), area, valor);
    }

}
