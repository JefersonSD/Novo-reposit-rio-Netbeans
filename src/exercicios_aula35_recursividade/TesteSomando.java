/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula35_recursividade;

import exercicios_aula35_recursividade.Somando;
import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class TesteSomando {
    static int numero;
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Informe um número inteiro para saber o somatório de 1 até o respectivo número");
        numero = Somando.somaNumeros(numero = t.nextInt());
        System.out.println(numero);
    }

}
