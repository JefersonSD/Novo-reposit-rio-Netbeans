/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula98_bigdecimal_biginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author jsjef
 */
public class TesteBigDecimalBigInteger {
    public static void main(String[] args) {
        
        //Exemplo de cálculo que o java não tem precisão
        
        double a = 0.03;
        double b = 0.01;
        System.out.println(a-b); // Saída:  0.019999999999999997
        
        /*Para esses casos são utilizados:
        BigInteger: para trabalhar com inteiros
        BigDecimal: para trabalhar com double*/
        
        //Exemplo BigDecimal
        
        BigDecimal _a = new BigDecimal("0.03");
        BigDecimal _b = new BigDecimal("0.01");
        BigDecimal _c = _a.subtract(_b);
        System.out.println(_c);
        
        //Na classe BigDecimal é possível termos números que superam o tamanho do long e double também.
        
        BigDecimal bd = new BigDecimal("1245789654.2514789");
        BigDecimal bd1 = new BigDecimal("12478521456982.25147893");
        System.out.println(bd.add(bd1));
        
        //Multipicando o número
        System.out.println(bd.multiply(bd1));
        
        //Divisão a partir de uma nova instância de BigDecimal
        
        System.out.println(bd.divide(new BigDecimal(2)));
        
        BigInteger bi = new BigInteger("1000000000000000000000");
        System.out.println(bi);
        
        
        
        
    }
    
}
