/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula59_import_static;

/**
 *
 * @author jsjef
 */

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
//caso queira importar todos os métodos da classe Math
//import static java.lang.Math.*;
public class TesteImportStatic {
    
    public static void main (String [] args){
        
        
        double a = 2;
        double b = 4;
        double c = 6;
        
        System.out.println(sqrt(b));
        System.out.println(pow(a, c));
        
    }
}
