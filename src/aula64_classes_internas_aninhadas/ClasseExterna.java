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
public class ClasseExterna {
    
    private String texto = "Texto externo";
    
    public class ClasseInterna{
        
        private String texto = "Texto interno";
        
        public void imprimeTexto(){
            System.out.println(texto);
            
            System.out.println(ClasseExterna.this.texto);
        }
    }
    
    public static void main (String [] args){
        
        ClasseExterna externa = new ClasseExterna();
        ClasseInterna interna = externa.new ClasseInterna();
        
        interna.imprimeTexto();
        
        
    }
}
