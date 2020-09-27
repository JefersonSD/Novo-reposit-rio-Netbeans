/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula61_valor_e_referencia;

/**
 *
 * @author jsjef
 */
public class ValorEreferencia {
    
    private static void PassagemParametroValorEreferencia(int valor, Contato contato){
        
        int novoValor = valor + 10;
        valor = novoValor;
        
        contato = new Contato("Contato 2","00000-2154","joana@email.com");
        
    }
    private static void PassagemParametroValorEreferencia2(int valor, Contato contato){
        
        int novoValor = valor +10;
        valor = novoValor;
        
        
        contato.setNome("Contato"+ novoValor);
        
    }
    
    public static void main(String[] args) {
        
        Contato contato = new Contato("Contato 1","966584-2351","joao@email.com");
        int valor = 10;
        
        System.out.println(valor);
        System.out.println(contato);
        
        PassagemParametroValorEreferencia2(valor, contato);
        
        System.out.println(valor);
        System.out.println(contato);
        
        
    }
    
}
