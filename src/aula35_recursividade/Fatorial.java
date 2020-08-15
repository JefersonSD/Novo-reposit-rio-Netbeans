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
public class Fatorial {

    public static int fatorial(int num) {

        if (num == 0) {
            return 1;
        }

        return num * fatorial(num-1);

    }
}
