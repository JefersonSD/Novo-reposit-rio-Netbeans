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
public class MaisMetodosClasseString {
    public static void main(String[] args) {
        
        String ola = "Olá";
        String ola1 = "OLÁ";
        String ola2 = "Olá";
        String ola4 = new String(ola2);
        
        System.out.println("ola equals ola2 = " + ola.equals(ola1)); // false
        System.out.println("ola equals ola3 = " + ola.equals(ola2)); // true
        System.out.println("ola equals ola2 = " + ola.equalsIgnoreCase(ola1)); // com o equalsignorecase será true
        
        System.out.println("ola ==  ola1 = " + (ola == ola1)); //Nesse caso são comparadas as posições de memória
        System.out.println("ola ==  ola2 = " + (ola == ola2)); // true pq as posições de memórias são iguais
        
        System.out.println("ola ==  ola4 = " + (ola == ola4)); // false por que as posi. de memória são diferentes.
        System.out.println("ola equals ola4 = " + ola.equals(ola4)); // true pq o conteúdo das variáveis são iguais
        
        String banana = "banana";
        String ban = "ban";
        String ana = "ana";
        
        System.out.println(banana.regionMatches(3, ana, 1, 2));// verificando a existencia dos chars com regionMatches
        System.out.println(banana.regionMatches(true, 0, ban, 0, 3)); // usando ignorecase com regionMatches
        
        // comparar o final ou começo da String com endsWith (final) ou startsWith (começo)
        System.out.println(banana.endsWith(ana)); // true
        System.out.println(banana.startsWith(ban)); // true
        
        String a = "a";
        String b = "b";
        String aMaiusculo = "A";
        System.out.println(a.compareTo(b)); /*output = -1 por a ser > que b de acordo com a correlação com
                                             a tabela ASCII*/   
        
        // -1 quando  a > b
        // 0  quando  a == b
        // 1 ou >1 quando  a < b
        
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        System.out.println(a.compareTo("a"));
        System.out.println(a.compareTo(aMaiusculo));
        System.out.println(aMaiusculo.compareTo(a));
    }
        
}
