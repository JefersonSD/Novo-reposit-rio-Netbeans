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
public class Externa2 {

    public void metodoQualquer() {

        class ClasseLocal {
            
            private String texto = "texto classe local";
            
            public void imprimeTexto(){
                System.out.println(texto);
            }
        }
            ClasseLocal c = new ClasseLocal();  
            c.imprimeTexto();
    }
    
    public static void main(String[] args) {
        
        Externa2 externa2 = new Externa2();
        
        externa2.metodoQualquer();
    }

}
