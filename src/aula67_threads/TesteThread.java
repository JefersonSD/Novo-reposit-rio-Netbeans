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
public class TesteThread {
    public static void main(String [] args){
        
        MinhaThread thread,thread2,thread3;
        
          thread = new MinhaThread("Thread #1", 200);
          thread2 = new MinhaThread("Thread #2", 300);
          thread3 = new MinhaThread("Thread #3", 400);
        
        thread.start();
        thread2.start();
        thread3.start();
    }
    
}
