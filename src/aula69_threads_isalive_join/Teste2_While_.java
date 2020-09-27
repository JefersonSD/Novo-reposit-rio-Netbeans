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
public class Teste2_While_ {
    
     public static void main(String[] args) {
        ThreadsIsaliveJoin thread1 = new ThreadsIsaliveJoin("#1",500);
        ThreadsIsaliveJoin thread2 = new ThreadsIsaliveJoin("#2",600);
        ThreadsIsaliveJoin thread3 = new ThreadsIsaliveJoin("#3",1000);
        
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);
        
        t1.start();
        t2.start();
        t3.start();
        
        while(t1.isAlive() || t2.isAlive() || t3.isAlive()) {
            
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
        }
        
        System.out.println("Programa finalizado!");
        
    }
    
}
