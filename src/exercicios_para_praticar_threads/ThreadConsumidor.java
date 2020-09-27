/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_para_praticar_threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jsjef
 */
public class ThreadConsumidor extends Thread {
    
    Deposito dep;
    int tempoEntreConsumo;

    
    public ThreadConsumidor(Deposito dep, int tempoEntreConsumo){
        this.dep = dep;
        this.tempoEntreConsumo = tempoEntreConsumo;
        start();
    }
    
    @Override
    public void run(){
        for(int i = 0;i< dep.capacidade;i++){
            
            System.out.println("Retirando item do depósito!");
            dep.retirar();
            System.out.println("Quantidade de itens no depósito " + dep.getItens());
            try {
                Thread.sleep(tempoEntreConsumo);
                synchronized(dep){
                    while(!Deposito.estaExecutando){
                        if(i < dep.capacidade-1){
                            dep.wait(); 
                        }
                        //break;
                    }
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadConsumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
