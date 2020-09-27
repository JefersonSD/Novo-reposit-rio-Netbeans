/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula95_resourse_bundle;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author jsjef
 */
public class TesteResourseBundle {
    public static void main(String[] args) {
        
        System.out.println("Locale atual: " + Locale.getDefault());
        ResourceBundle rb = ResourceBundle.getBundle("meu-texto");
        System.out.println("Olá: " + rb.getString("hello"));
        System.out.println("Mundo: " + rb.getString("world"));
        
        Locale.setDefault(Locale.US);
        System.out.println("Locale atual: " + Locale.getDefault());
        
        rb = ResourceBundle.getBundle("meu-texto");
        
        System.out.println("Olá: " + rb.getString("hello"));
        System.out.println("Mundo: " + rb.getString("world"));
        
    }
    
}
