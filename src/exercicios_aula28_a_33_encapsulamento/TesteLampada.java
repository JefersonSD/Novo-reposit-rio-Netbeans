/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula28_a_33_encapsulamento;

/**
 *
 * @author jsjef
 */
public class TesteLampada {
    public static void main(String[] args) {
        
        Lampada lampada = new Lampada();
        boolean estado;
        
        estado = lampada.ascenderLuz();
        //estado = lampada.apagarLuz();
        
        
        if(estado){
            System.out.println("A luz está acessa");
        }else{
            System.out.println("A luz está apagada!");
        }
    }
    
}
