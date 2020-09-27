/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_para_praticar_threads;

/**
 *
 * @author jsjef
 */
public class Deposito {
    
    private int itens = 0;
    final int capacidade = 10;
    static boolean estaExecutando = false;
    
    public int getItens(){
        return this.itens;
    }
    
    public synchronized void colocar(){
        if(itens < capacidade){
            itens++;
            estaExecutando = true;
            notify();
        }else{
            System.out.println("Não posso incluir, depósito já está cheio");
        }
        
    }
    
    public synchronized void retirar(){
        if(itens > 0){
            itens--;
            estaExecutando = false;
            notify();
        }else{
            System.out.println("Depósito está vazio!");
        }
    }
    
}
