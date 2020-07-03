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
public class DescontosSalario {

    public static void main(String[] args) {

        /*15 - Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total 
               do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o 
               sindicato, faça um programa que nos dê: 
			           a - salário bruto. 
			           b - quanto pagou ao INSS. 
			           c - quanto pagou ao sindicato. 
			           d - o salário líquido. 
			           e - calcule os descontos e o salário líquido, conforme a tabela abaixo: 
                                           + Salário Bruto : R$ 
			  		   - IR (11%) : R$ 
			  		   - INSS (8%) : R$ 
			  		   - Sindicato ( 5%) : R$  
			  		   = Salário Liquido : R$ 
			 		   Obs.: Salário Bruto - Descontos = Salário Líquido.*/
        Scanner t = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora? : ");
        double vHora = t.nextDouble();
        System.out.println("Quantas horas você trabalha por mês? : ");
        double horasT = t.nextDouble();
        double salarioBruto = vHora * horasT;
        double impRenda = salarioBruto * 0.11;
        double INSS = salarioBruto * 0.08;
        double sind = salarioBruto * 0.05;
        double salLiquido = salarioBruto - impRenda - INSS - sind;
        System.out.printf(" - Salário bruto: R$%.2f%n - Desconto de IR: R$%.2f%n - INSS: R$%.2f%n - Sindicato: R$%.2f%n - Salário Líquido: "
                        + "R$%.2f ", salarioBruto, impRenda, INSS, sind, salLiquido);
    }
}
