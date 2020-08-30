/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aulas36_a_43;

/**
 *
 * @author jsjef
 */
public class Mamifero extends Animal {
    
    private String alimento;
    
    public Mamifero(){
        super.setQuantidadePatas(4);
        super.setAmbiente("Terra");
    }
    
    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
     @Override
    public String toString(){
        return "Nome: " + super.getNome() + "\nComprimento: " + super.getComprimento() + " metros\nQuantidade de patas: "
                + super.getQuantidadePatas() + "\nCor: " + super.getCor() + "\nAmbiente: " + super.getAmbiente()
                + "\nVelocidade: " + super.getVelocidade() + "\nAlimento: " + this.alimento;
    }
    
}
