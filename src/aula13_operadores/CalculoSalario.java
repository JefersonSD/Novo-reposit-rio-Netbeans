/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13_operadores;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class CalculoSalario {

    public static void main(String[] args) {
//        8 - Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.Calcule e mostre o total do
//            seu salário no referido mês.

        Scanner t = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0,000.00");
        System.out.println("Qual o seu nome?: ");
        String nome = t.next();
        System.out.println(nome + "!" + " quanto você ganha por hora?: ");
        double valorHora = t.nextDouble();
        System.out.println("Quantas horas você trabalha por mês? ");
        double horas = t.nextDouble();
        double salario = valorHora * horas;
        System.out.println(nome + " você ganha " + f.format(salario) + " por mês!");
    }

}
