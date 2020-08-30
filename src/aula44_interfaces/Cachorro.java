/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula44_interfaces;

/**
 *
 * @author jsjef
 */
public class Cachorro extends Mamifero implements AnimalEstimacao,AnimalDomesticado{
    
    private String tamanho;
    private String raca;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void amamentar() {
        
    }

    @Override
    public void emitirSom() {
        
    }

    @Override
    public void levarPassear() {
        
    }

    @Override
    public void brincar() {
       
    }

    @Override
    public void levarVeterinario() {
       
    }

    @Override
    public void alimentar() {
        
    }
    
    
}
