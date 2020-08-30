/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula52_minha_exception;

/**
 *
 * @author jsjef
 */
public class DivisaoNaoExata extends Exception{
    
    private double num;
    private double denom;

    public DivisaoNaoExata(double num, double denom) {
        this.num = num;
        this.denom = denom;
    }

    @Override
    public String toString() {
        return "Divisão do número " + this.num + " por " + this.denom + " não exata"; 
    }
    
    
    
    
}
