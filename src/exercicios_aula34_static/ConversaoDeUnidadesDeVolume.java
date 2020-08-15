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
public class ConversaoDeUnidadesDeVolume {

//    5. Escreva  a  classe  ConversaoDeUnidadesDeVolume  com  métodos  estáticos   para  conversão  das  unidades  de  volume  segundo  
//       a  lista  abaixo.       
//               • 1  litro  =  1000  centímetros  cúbicos
//               • 1  metro  cúbico  =  1000  litros     
//               • 1  metro  cúbico  =  35.32  pés  cúbicos    
//               • 1  galão  americano  =  231  polegadas  cúbicas     
//               • 1  galão  americano  =  3.785  litros    
    
    public static double converteLitrosEmCentimetrosCubicos(double volume) {

        return volume * 1000;
    }

    public static double converteMetroCubicoEmLitros(double volume) {

        return volume * 1000;
    }

    public static double converteMetrosCubicosEmPesCubicos(double volume) {

        return volume * 35.315;

    }

    public static double converteGalaoAmericanoEmPolegadasCubicas(double volume) {

        return volume * 231;
    }

    public static double converteGalaoAmericanoEmLitros(double volume) {

        return volume * 3.785;
    }

}
