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
public class Contador {
    
//    1. Escreva  uma  classe  chamada  Contador,  que  tem  um  atributo  estático  que   é  incrementado  sempre  que  a  classe  for  
//    instanciada.  Crie  métodos  para   zerar,  incrementar  e  retornar  o  valor  do  contador.  Desenvolva  um   programa  para  
//    testar  essa  classe.
    
    static private int contador = 0;
    
    public Contador(){
        contador++;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Contador.contador = contador;
    }
    
    public static void zerarCont(){
        contador = 0;
    }
    
    public static void incrementCont(){
       contador++;
    }
    
    
}
