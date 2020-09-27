/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula67_threads;

/**
 *
 * @author jsjef
 */
public class MinhaThread extends Thread {
    
    private String nome;
    private int tempo;
    
    public MinhaThread(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
        
    }
    
    @Override
    public void run(){
            try {
            Thread.sleep(tempo);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(this.nome + " contador " + i);
        }
            System.out.println(this.nome + "terminou a execução!");
    }
        
}
