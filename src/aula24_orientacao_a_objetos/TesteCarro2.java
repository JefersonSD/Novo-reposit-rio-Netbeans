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
public class TesteCarro2 {
    public static void main(String[] args) {
        
        Carro2 van = new Carro2();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
        
        System.out.println("Marca do carro " + van.marca);
        System.out.println("Modelo do carro " + van.modelo);
        // Chamando método sem parâmetro
        van.exibirAutonomia();
        
        double autonomia = van.obterAutonomia();
        // Chamando método com retorno
        System.out.println("Autonomia do veículo é " + autonomia);
        System.out.println("Autonomia do veículo é " + van.obterAutonomia());
        
        // Chamando método com parâmetro

        System.out.println("Quantidade de combustível[10]: " + van.calcularCombustivel(10));
        System.out.println("Quantidade de combustível[20]: " + van.calcularCombustivel(15));
            
    }
    
}
