/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas_75_a_84_strings;

/**
 *
 * @author jsjef
 */
public class StringBuilder_Buffer {

    public static void main(String[] args) {

        String[] letras = {"B", "C", "D", "E", "F"};
        String alfabeto = "";

        //Concatenando sem String Builder e Buffer
        for (String letra : letras) {

            alfabeto += letra;
        }
        System.out.println(alfabeto);

        //Concatenando com String Buffer
        StringBuffer sb = new StringBuffer();
        for (String letra : letras) {

            sb.append(letra);
        }

        alfabeto = sb.toString();
        System.out.println(alfabeto);
        
        //Usando o constructor para imprimir a mesma saída
        
        alfabeto = new String(sb);
        System.out.println(alfabeto);
        
        //Usando String buffer para imprimir a Strig ao contrário
        
        System.out.println(sb.reverse());

        //Concatenando com String Builder
        StringBuilder sb_ = new StringBuilder();
        for (String letra : letras) {

            sb_.append(letra);
        }

        alfabeto = sb_.toString();
        System.out.println(alfabeto);
    }

}
