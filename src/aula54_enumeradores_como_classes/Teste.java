/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula54_enumeradores_como_classes;

/**
 *
 * @author jsjef
 */
public class Teste {
    public static void main(String[] args) {
        
        DiaSemana dia = DiaSemana.TERCA;
        
        System.out.println(dia + " -> " + dia.getValor());
        
        Data data = new Data(1, 4, 1997, DiaSemana.DOMINGO);  
        
        Formulario form = new Formulario();
        
        form.setGenero(Formulario.Genero.FEMININO);
        System.out.println(form.getGenero());
    }
   
}
