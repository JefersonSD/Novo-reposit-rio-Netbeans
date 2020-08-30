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
public class Peixe extends Animal{
    
    private String caracteristicas;
    
    public Peixe(){
        super.setCor("Amarelo com preto");
        super.setAmbiente("Rios de água doce");
        
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }  
    
    @Override
    public String toString(){
        return "Nome: " + super.getNome() + "\nComprimento: " + super.getComprimento() + "\nQuantidade de patas: "
                + super.getQuantidadePatas() + "\nCor: " + super.getCor() + "\nAmbiente: " + super.getAmbiente()
                + "\nVelocidade: " + super.getVelocidade() + "\nCaracteristicas: " + this.caracteristicas;
    }
}
