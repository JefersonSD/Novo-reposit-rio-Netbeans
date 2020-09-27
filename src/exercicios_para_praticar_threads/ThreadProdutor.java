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
public class ThreadProdutor implements Runnable {

    Deposito dep;
    int tempoEntreProducoes;

    public ThreadProdutor(Deposito dep, int tempoEntreProducoes) {
        this.dep = dep;
        this.tempoEntreProducoes = tempoEntreProducoes;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < dep.capacidade; i++) {

            System.out.println("Colocando item no depósito");
            dep.colocar();
            System.out.println("Quantidade de itens no depósito " + dep.getItens());
            try {
                Thread.sleep(tempoEntreProducoes);
                synchronized (dep) {
                    while (Deposito.estaExecutando) {
                        if (i < dep.capacidade - 1) {
                            dep.wait();
                        }
                        //break;
                    }
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadProdutor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
