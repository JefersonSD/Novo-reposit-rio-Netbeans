/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula68_threads_runnable;

/**
 *
 * @author jsjef
 */
public class TesteMinhaThreadRunnable {
    
    public static void main (String [] args){
        
        MinhaThreadRunnable  runnable = new MinhaThreadRunnable("Thread #1 ", 900);
        MinhaThreadRunnable  runnable1 = new MinhaThreadRunnable("Thread #2 ", 200);
    }
    
}
