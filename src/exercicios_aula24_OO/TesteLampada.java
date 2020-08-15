/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula24_OO;

/**
 *
 * @author jsjef
 */
public class TesteLampada {
    public static void main(String[] args) {
        
        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.garantiaMeses = 36;
        lampada.potencia = 7;
        lampada.cor = "Amarela";
        
        // para utilizar o array declarado na classe tem-se que instancia-lo primeiro
         lampada.tipos = new String[5];
         lampada.tipos[0] = "Abajur";
         lampada.tipos[1] = "Lampeões";
         
         // Para impressão dos valores no array
        
         for (int i = 0; i < lampada.tipos.length; i++) {
             if(lampada.tipos[i] != null){  
             System.out.println(lampada.tipos[i]);
             }
        }
    }
    
}
