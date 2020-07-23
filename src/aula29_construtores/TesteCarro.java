/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula29_construtores;

/**
 *
 * @author jsjef
 */
public class TesteCarro {
   
    public static void main(String [] args){
        
        Carro van = new Carro();
        van.marca = "Fiat";
        //van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
        // output do valos setado na classe
        System.out.println(van.modelo);
        //Instanciação de um novo objeto carro com parâmetros
        Carro carro = new Carro("Toyota");
        System.out.println(carro.marca);
        //Instanciação com todos os parâmetros
        Carro carro2 = new Carro("Fiat", "Pálio", 10, 2.2, 3.8);
        
        System.out.println(carro2.marca);
        System.out.println(carro2.modelo);
        System.out.println(carro2.numPassageiros);
        System.out.println(carro2.capCombustivel);
        System.out.println(carro2.consumoCombustivel);
    }
            
    
}
