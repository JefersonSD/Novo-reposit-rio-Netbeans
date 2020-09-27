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
public class StringConstructors {

    public static void main(String[] args) {

        String vazia = new String();  //  O mesmo que iniciar a String com aspas
        System.out.println(vazia); // Nada será impresso

        String java = new String("JAVA"); // Podemos passar uma String para o construtor da Classe String
        System.out.println(java); // imprimirá JAVA

        String java1 = new String(java);//Podemos referenciar outra String no construtor
        System.out.println(java1); // imprimirá JAVA

        char[] C = {'J', 'A', 'V', 'A'};
        String java2 = new String(C); // é possível também passar um array de char para o construtor da classe String
        System.out.println(java2); // imprimirá JAVA

        char[] C1 = {'A', 'B', 'C', 'D', 'E'};
        String alfabeto = new String(C1, 0, 3); //é possível também imprimir parte de um array de chars com o cons. ofset
        System.out.println(alfabeto);

        byte[] byte_ = {65, 66, 63, 64, 69}; // Com o array de byte será impreso a referencia corresp. da tabela ASCII
        String ascii = new String(byte_);
        System.out.println(ascii);
        
        String s = new String(byte_, 0, 3); // o ofset também se aplica para o byte
        System.out.println(s);
        
        String java3 = "JAVA"; // atribuição simples
        String java4 = "JAVA";
        
        System.out.println(java3);
        System.out.println(java4);

    }
}
