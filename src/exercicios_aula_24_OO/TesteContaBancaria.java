/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula_24_OO;

/**
 *
 * @author jsjef
 */
public class TesteContaBancaria {
    public static void main(String[] args) {
        
        ContaBancaria contas = new ContaBancaria();
        
        contas.limite = 100;
        contas.numeroAgencia = 1245;
        contas.numeroConta = 587;
        
        System.out.println("O limite da conta " + contas.numeroConta + " é = " + contas.limite);
        
    }
    
}
