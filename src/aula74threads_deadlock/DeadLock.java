/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula74threads_deadlock;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jsjef
 */
public class DeadLock {
    public static void main (String args []){
        
        final String RECURSO1 = " Recurso #1";
        final String RECURSO2 = " Recurso #2";
        
        Thread t1 = new Thread(){
            @Override
            public void run(){
                synchronized(RECURSO1){
                    
                    try {
                        System.out.println("A Thread 1 bloqueou o recurso #1");
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(DeadLock.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("Thread 1 tentando acessar o recurso #2");
                    
                    synchronized(RECURSO2){
                        System.out.println("Thread 2 bloqueou o recurso #2");
                    }
                    
                }
                
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run(){
                synchronized(RECURSO2){
                    
                    try {
                        System.out.println("A Thread 2 bloqueou o recurso #2");
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(DeadLock.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("Thread 2 tentando acessar o recurso #1");
                    
                    synchronized(RECURSO1){
                        System.out.println("Thread 2 bloqueou o recurso #2");
                    }
                    
                }
                
            }
        };
        
        t1.start();
        t2.start();
        
    }
    
}
