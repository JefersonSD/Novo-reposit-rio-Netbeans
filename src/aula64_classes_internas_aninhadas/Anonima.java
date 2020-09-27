/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula64_classes_internas_aninhadas;

/**
 *
 * @author jsjef
 */
public class Anonima {
    
    public void imprimeTexto(){
        System.out.println("Texto qualquer");
    }
    
    public static void main(String[] args){
        
        Anonima anonima = new Anonima(){
            
            @Override
            public void imprimeTexto(){
                
                System.out.println("Sobrescrevendo o texto!");
            }
        };
        
        anonima.imprimeTexto();
        
        //usando a interface
        Texto texto = new Texto(){
            @Override   
            public void imprimeTexto() {
                
                System.out.println("Qualquer texto interface");
                
            }
            
        };
        
        texto.imprimeTexto();
    }
}
