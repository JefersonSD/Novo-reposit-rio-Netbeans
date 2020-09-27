/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula69_threads_isalive_join;

/**
 *
 * @author jsjef
 */
public class ThreadsIsaliveJoin implements Runnable{
    
    private String nome;
    private int tempo;

    public ThreadsIsaliveJoin(String nome, int tempo) {

        this.nome = nome;
        this.tempo = tempo;
//        Thread t = new Thread(this);
//        t.start();
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < 6; i++) {

                System.out.println(this.nome + "contador " + i);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
        System.out.println(this.nome+ " terminou  a execução");

    }
}
