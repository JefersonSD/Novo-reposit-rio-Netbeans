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
public class MostraNumero {

    public static void main(String[] args) {

        //2 - Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
        
        Scanner t = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = t.nextInt();
        System.out.println("O número digitado foi: " + num);
    }

}
