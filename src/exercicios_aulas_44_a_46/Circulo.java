/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aulas_44_a_46;

/**
 *
 * @author jsjef
 */
public class Circulo extends Figura2D {

    private double raio;
    private double area;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {

        this.area = Math.PI * Math.pow(raio, 2);
        
    }
    
     @Override
    public String toString() {

        return "Área do círculo é igual a " + this.area;
    }
    
    
}
