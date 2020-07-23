/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula24_orientacao_a_objetos;

/**
 *
 * @author jsjef
 */
public class Carro2 {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    // método sem parâmetro
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é " + this.capCombustivel * this.consumoCombustivel + "Km.");
    }
    //método com retorno
    double obterAutonomia(){
        return this.capCombustivel*this.consumoCombustivel;
    }
    //método com parâmetro
     double calcularCombustivel(double km){
         
         double qtdCombustivel = km/consumoCombustivel;
         
         return qtdCombustivel;
     }
    
}
