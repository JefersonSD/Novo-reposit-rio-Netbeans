/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jsjef
 */
public class UmaThread extends Thread {

    private int delay;
    private String identificacao;

    public UmaThread(String identifacacao, int delay) {
        this.identificacao = super.getName();
        this.delay = delay;
    }

    public void run() {

        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            System.out.println("Thread: " + identificacao + " foi interrompida");
        }
        for (int i = 0; i < 10; i++) {
        System.out.println(" >> " + identificacao + " " + delay);    
        }
    }

}
