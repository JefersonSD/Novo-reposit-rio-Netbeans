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
public class Exer14 {

    public static void main(String[] args) {
        /*14 - João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
               Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo 
               (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a 
               variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite 
               e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.*/

        Scanner t = new Scanner(System.in);
        System.out.println("Informe o peso total em Kg:  ");
        double peso = t.nextDouble();
        if (peso > 50) {
            double excesso = (peso - 50);
            double multa = excesso * 4.00;
            System.out.printf("O peso foi excedido em %.0fKg. A multa a ser paga será no valor de: R$%.2f%n ", excesso, multa);
        } else {
            System.out.println("Peso está dentro do limite estabelecido pelo regulamento de pesca do estado de São Paulo.");
        }
    }

}
