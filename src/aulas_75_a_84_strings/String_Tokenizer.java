/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas_75_a_84_strings;

import java.util.StringTokenizer;

/**
 *
 * @author jsjef
 */

public class String_Tokenizer {
    
    public static void main(String[] args) {
        
        String doArquivo = "1;Antônio;30;";
        
        // Extraindo tokens da String com StringTokenizer
        
        StringTokenizer st = new StringTokenizer(doArquivo, ";");
        
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        
    
    }
    
}
