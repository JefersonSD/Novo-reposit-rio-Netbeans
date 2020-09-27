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
public enum TipoDocumento {
    
    CPF {
        @Override
        public String testeGeraNumero() {
            
            return GeraCpfCnpj.cpf();
        }
    }, CNPJ {
        @Override
        public String testeGeraNumero() {
           return GeraCpfCnpj.cnpj();
        }
    };
    
    public abstract String testeGeraNumero();
}
