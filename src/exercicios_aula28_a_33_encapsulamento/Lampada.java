/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula28_a_33_encapsulamento;

/**
 *
 * @author jsjef
 */
public class Lampada {

    private String modelo;
    private String tensao;
    private int garantiaMeses;
    private int potencia;
    private String cor;
    private String tipoLuz;

    public Lampada() {
        this.modelo = "Redonda";
        this.tensao = "Bivolt Automático 100V - 240V";
        this.garantiaMeses = 24;
        this.potencia = 25;
        this.cor = "Amarela";
        this.tipoLuz = "Fluorescente";
    }
    
     public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   
    public String getTensao(){
        return tensao;
    }
    
    public void setTensao(String tensao){
        this.tensao = tensao;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }
    
    public boolean ascenderLuz(){
        return true;
    }
    public boolean apagarLuz(){
        return false;
    }

}
