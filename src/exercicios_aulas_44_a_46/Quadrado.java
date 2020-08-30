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
public class Quadrado extends Figura2D {

    private double lado;
    private double area;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {

        this.area = Math.pow(this.lado, 2);

    }

    @Override
    public String toString() {

        return "Área do quadrado é igual a " + this.area;
    }

}
