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
public class Triangulo extends Figura2D {

    private double base;
    private double altura;
    private double area;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    

    @Override
    public void calcularArea() {


        this.area = (base * altura) / 2;
    }
    
    @Override
    public String toString(){
        
        return "Área do triangulo é igual a " + this.area;
    }

}
