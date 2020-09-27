/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_threads_semaforo;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jsjef
 */
public class Semaforo {
    
    boolean stopNotifyAmarelo;
    String controlaSemaforo;

    public synchronized void sinalVerde(boolean estaExecutando) {
        
        if(!estaExecutando){
            notify();
            controlaSemaforo = "Verde";
            return;
        }
        
        System.out.println("Sinal Aberto, prossiga!");
        controlaSemaforo = "Verde";
        notify();
        try {
            Thread.sleep(3000);
            while (controlaSemaforo.equalsIgnoreCase("Verde")) {
                wait();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Semaforo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public synchronized void sinalAmarelo(boolean estaExecutando) {
        
         if(!estaExecutando){
            notify();
            controlaSemaforo = "Amarelo";
            return;
        }
        System.out.println("Atenção!");
        if(stopNotifyAmarelo){
            notify();
        }
        controlaSemaforo = "Amarelo";
        stopNotifyAmarelo = true;
        try {
            Thread.sleep(1000);
            while (controlaSemaforo.equalsIgnoreCase("Amarelo")) {
                CoresSemaforo.suspendeVermelho = false;
                wait();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Semaforo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public synchronized void sinalVermelho(boolean estaExecutando) {
        
         if(!estaExecutando){
            notify();
            controlaSemaforo = "Vermelho";
            return;
        }

        System.out.println("Pare!");
        controlaSemaforo = "Vermelho";
        notify();
        try {
            Thread.sleep(3000);
            while (controlaSemaforo.equalsIgnoreCase("Vermelho")) {
                wait();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Semaforo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
