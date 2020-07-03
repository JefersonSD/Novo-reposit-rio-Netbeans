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
public class AreaASerPintada2 {

    public static void main(String[] args) {

        /*17 - Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
                Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 
                litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00. 
                        Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações: 
		  	       ♠ - comprar apenas latas de 18 litros;
                               ♠ - comprar apenas galões de 3,6 litros; 
                               ♠ - misturar latas e galões, de forma que o preço seja o menor. 
                               Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.*/
        
        double inteiro = 0;//Variável  declarada globalmente para ser enchergada pelos if`s da compra de latas e galões. Receberá um int.
        Scanner t = new Scanner(System.in);
        System.out.println("Informe o tamanho da área em metros quadrados a ser pintada: ");
        double area = t.nextDouble();
        //Latas de 18 Litros 
        double tintaLata = (area / 6) / 18;
        double valor = Math.ceil(tintaLata) * 80;
        System.out.printf("Caso você queira comprar latas de tinta de 18 litros, Você terá que comprar %.0f lata(s) para pintar %.0f "
                        + "metros quadrados\ncom um valor total de R$%.2f%n", Math.ceil(tintaLata), area, valor);
        // Galões de 3,6 Litros 
        double tintaGaloes = (area / 6) / 3.6;
        double valor1 = Math.ceil(tintaGaloes) * 25;
        System.out.printf("Caso você queira comprar galões de tinta de 3,6 litros, Você terá que comprar %.0f galão(ões) para pintar %.0f "
                        + "metros\nquadrados com um valor total de R$%.2f%n\n", Math.ceil(tintaGaloes), area, valor1);
        // Para comprar Latas e galões de tinta para economizar 
        if (tintaLata % 1 != 0) { //No java existe %1. Realizei testes!
            inteiro = Math.floor(tintaLata);// Uso do Math.floor para arredondar o resultado para baixo
        } 
        //O 0.2 foi usado nesse if porque considerando as latas de 18 Litros é a correspondencia para 1 galão de 3,6 litros
        if ((tintaLata > inteiro) && (tintaLata <= inteiro + 0.2) && area > 64.8 || (tintaLata > inteiro + 0.2) && (tintaLata <= inteiro 
                + (0.2 * 2)) && area > 64.8|| (tintaLata > inteiro + (0.2 * 2)) && (tintaLata <= inteiro + (0.2 * 3)) && area > 64.8) {
            System.out.println("Sugestão para economizar dinheiro:");
            double lata = inteiro;//Variável criada para ficar claro que multiplica-se a "lata"*80.
            if ((tintaLata > inteiro) && (tintaLata <= inteiro + 0.20)) {
                double valorTotal = (lata * 80) + 25;
                System.out.printf("Para %.0f metros quadrados você pode comprar %.0f lata(s) de 18 litros de tinta e 1 galão de 3,6 "
                        + "litros.O que dará um\ntotal de %.2f%n ", area, inteiro, valorTotal);
            } else if ((tintaLata > inteiro + 0.20) && (tintaLata <= inteiro + (0.20 * 2))) {
                double valorTotal = (lata * 80) + 50;
                System.out.printf("Para %.0f metros quadrados você pode comprar %.0f lata(s) de 18 litros de tinta e 2 galões de 3,6 "
                        + "litros. O que dará um\ntotal de %.2f%n ", area, inteiro, valorTotal);
            } else {
                double valorTotal = (lata * 80) + 75;
                System.out.printf("Para %.0f metros quadrados você pode comprar %.0f lata(s) de 18 litros de tinta e 3 galões de 3,6 "
                        + "litros. O que dará um\ntotal de %.2f%n ", area, inteiro, valorTotal);
            }
        }
    }

}
