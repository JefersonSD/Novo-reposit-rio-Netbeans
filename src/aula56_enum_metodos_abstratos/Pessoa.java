/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula56_enum_metodos_abstratos;

/**
 *
 * @author jsjef
 */
public class Pessoa {
    
    private TipoDocumento tipoDocumento;
    private String numeroDocumento;

    public Pessoa() {
    }
    public Pessoa(TipoDocumento tipoDocumento, String numeroDocumento) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public String toString() {
        return "Tipo documento: " + this.tipoDocumento + "\nNúmero documento: " + this.numeroDocumento;  
    } 
    
}
