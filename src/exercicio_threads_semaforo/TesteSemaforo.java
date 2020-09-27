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
public class TesteSemaforo {
    
    public static void main(String[] args) {
        
        Semaforo semaforo = new Semaforo();
        
        CoresSemaforo verde = new CoresSemaforo("Verde", semaforo);
        CoresSemaforo amarelo = new CoresSemaforo("Amarelo", semaforo);
        CoresSemaforo vermelho = new CoresSemaforo("Vermelho", semaforo);
        
        Thread t1 = new Thread(verde);
        Thread t2 = new Thread(amarelo);
        Thread t3 = new Thread(vermelho);
        t1.setPriority(Thread.MAX_PRIORITY);
        
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(TesteSemaforo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
