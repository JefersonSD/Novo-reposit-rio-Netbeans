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
public class Carro {
    
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    //Construtor para inicializar uma variável com um valor default
    Carro(){
        modelo = "Fiat";
    }
    //Construtor que recebrá um ou mais parâmetros quando classe Carro for instanciada
     Carro(String marca_){
        marca = marca_;
    }

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }
     
     
     
}
