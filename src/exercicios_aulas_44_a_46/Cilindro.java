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
public class Cilindro extends Figura3D  {
    
    private double altura;
    private double raioBase;
    private double raio;
    
    
    private double area;
    private double vCilindro;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRaioBase() {
        return raioBase;
    }

    public void setRaioBase(double raioBase) {
        this.raioBase = raioBase;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    

    @Override
    public void calcularArea() {
        
        area = 2*Math.PI*this.raio*(this.raio+this.altura);
        
    }

    @Override
    public void calcularVolume() {
        
        vCilindro = (Math.PI*Math.pow(raioBase, 2))*altura;
        
    }
    
    @Override
    public String toString(){
        
        return "Área do Cilindro é igual a: " + this.area + "\nVolume do cilindro é igual a: " + this.vCilindro;
    }

 
}
