/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula35_recursividade;

/**
 *
 * @author jsjef
 */
public class TesteFatorial {

    public static void main(String[] args) {
        
        int num = Fatorial.fatorial(5);
        imprimeNaTela(num);
    }

    public static void imprimeNaTela(int num) {
        System.out.println(num);
    }

}
