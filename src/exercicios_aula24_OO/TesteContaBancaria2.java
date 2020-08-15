/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula24_OO;


/**
 *
 * @author jsjef
 */
public class TesteContaBancaria2 {
    public static void main(String[] args) {
        
        ContaBancaria2 conta = new ContaBancaria2();
        conta.agencia = 3698;
        conta.conta = 58748;
        conta.limite = 1000;
        conta.saldo = 300;
        conta.status = "Especial";
 
        //conta.saque(250);
        conta.consultaSaldo();
        conta.saque(1300);
        conta.consultaSaldo();
        conta.deposito(500);
        conta.consultaSaldo();
    
    }
        
    
}
