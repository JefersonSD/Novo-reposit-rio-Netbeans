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
public class Piramede extends Figura3D {

    private double areaBase;
    private double areaLateral;
    
    private double altura;
    private double lado;
    
    private double volume;
    private double area;

    public double getAreaBase() {
        return areaBase;
    }

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }

    public double getAreaLateral() {
        return areaLateral;
    }

    public void setAreaLateral(double areaLateral) {
        this.areaLateral = areaLateral;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    

    @Override
    public void calcularArea() {

        area = areaBase + areaLateral;

    }

    @Override
    public void calcularVolume() {

       volume = (this.altura*Math.pow(this.lado, 2))/3;

    }

    @Override
    public String toString() {

        return "Área da pirâmede é igual a: " + this.area + "\nVolume da pirâmede é igual a: " + this.volume;
    }

}
