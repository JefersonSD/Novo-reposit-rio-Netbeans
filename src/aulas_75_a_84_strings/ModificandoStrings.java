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
public class ModificandoStrings {
    
    public static void main(String[] args) {
        
        String teste = "Isso é um teste";
        System.out.println(teste);
        System.out.println(teste.substring(10)); // retorna o que está na String a partir da posição 10
        System.out.println(teste.substring(10, 14)); // imprime test porque o último index não é incluso
        
        // outra forma de fazer concatenação
        
        String ola = "olá ";
        String mundo = "mundo";
        String olaMundo = ola.concat(mundo);
        System.out.println(olaMundo);
        
        // correção de Strings com replace e replaceAll
        
        String espaco = "i s p a c o";
        espaco = espaco.replace('i', 'E'); 
        System.out.println(espaco);
        String semEspacos = espaco.replaceAll(" ", "");
        System.out.println(semEspacos);
        
        // removendo espaços no começo e fim da String com o método trim
        
        String nome = " Meu nome é: ";
        System.out.println(nome);
        System.out.println(nome.trim());
    }
    
}
