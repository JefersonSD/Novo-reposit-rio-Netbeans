/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula34_static;

/**
 *
 * @author jsjef
 */
public class ConversaoDeUnidadesDeArea {
    
//        4. Escreva  a  classe  ConversaoDeUnidadesDeArea  com  métodos  estáticos   para  conversão  das  unidades  de  área  segundo 
//           a  lista  abaixo.       
//                • 1  metro  quadrado  =  10.76  pés  quadrados     
//                • 1  pé  quadrado  =  929  centímetros  quadrados 
//                • 1  milha  quadrada  =  640  acres  
//                • 1  acre  =  43.560  pés  quadrados
    
    public static double converteMetroQuadradoEmPeQuadrado(int area){
        
        return area * 10.764;
    }
    
    public static double converteMilhaQuadradaEmAcre(int area){
        
       return area * 929;
        
    }
    public static double convertePeQuadradoEmCentimetroQuadrado(int area){
        
       return area * 640;
        
    }
    public static double converteAcreEmPeQuadrado(int area){
        
       return area * 43560;
        
    }
    
}
