/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula70_threads_prioridades;

import aula69_threads_isalive_join.ThreadsIsaliveJoin;

/**
 *
 * @author jsjef
 */
public class TestePrioridade {
    public static void main(String[] args) {
        
        ThreadsIsaliveJoin thread1 = new ThreadsIsaliveJoin("#1", 500);
        ThreadsIsaliveJoin thread2 = new ThreadsIsaliveJoin("#2", 500);
        ThreadsIsaliveJoin thread3 = new ThreadsIsaliveJoin("#3", 500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);
        
//        t1.setPriority(5);
//        t2.setPriority(2);
//        t3.setPriority(1);
        
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        
        t1.start();
        t2.start();
        t3.start();
        
    }
    
    
    
    
}
