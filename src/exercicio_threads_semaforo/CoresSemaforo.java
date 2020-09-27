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
public class CoresSemaforo implements Runnable {

    Thread thread;
    Semaforo semaforo;
    static boolean suspendeVermelho = true;

    public CoresSemaforo(String nome, Semaforo semaforo) {
        this.semaforo = semaforo;
        thread = new Thread(this, nome);
        thread.start();
    }

    @Override
    public void run() {

        if (thread.getName().equalsIgnoreCase("Verde")) {
            for (int i = 0; i < 5; i++) {
                semaforo.sinalVerde(true);
            }
            semaforo.sinalVerde(false);

        } else if (thread.getName().equalsIgnoreCase("Vermelho")) {
            try {
                while (suspendeVermelho) {
                    Thread.sleep(500);
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(CoresSemaforo.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (thread.getName().equalsIgnoreCase("Amarelo")) {
                for (int i = 0; i < 5; i++) {

                    semaforo.sinalAmarelo(true);
                }
                semaforo.sinalAmarelo(false);
            }
        } else if (thread.getName().equalsIgnoreCase("Amarelo")) {
            for (int i = 0; i < 5; i++) {

                semaforo.sinalAmarelo(true);
            }
            semaforo.sinalAmarelo(false);
        }
        if (thread.getName().equalsIgnoreCase("Vermelho") && !suspendeVermelho) {

            for (int i = 0; i < 5; i++) {
                semaforo.sinalVermelho(true);
            }
            semaforo.sinalVermelho(false);
        }
    }

}
