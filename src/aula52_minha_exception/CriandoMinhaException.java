/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula52_minha_exception;

/**
 *
 * @author jsjef
 */
public class CriandoMinhaException {
    public static void main(String[] args) {

        int[] arrayInt = {2, 8, 9, 6, 15, 16, 30, 28};
        int[] denom = {0, 4, 3, 3, 10};

        for (int i = 0; i < arrayInt.length; i++) {

            try {
                
                if(arrayInt[i]%2 != 0){
                    
                    throw new DivisaoNaoExata(arrayInt[i], denom[i]);
                }
                System.out.println(arrayInt[i] + "/" + denom[i] + "=" + arrayInt[i] / denom[i]);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata a) {
                System.out.println("Ocorreu um erro!");
                a.printStackTrace();
            }
        }

    }
}
