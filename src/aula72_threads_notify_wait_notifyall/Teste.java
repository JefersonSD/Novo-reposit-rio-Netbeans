/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula72_threads_notify_wait_notifyall;


/**
 *
 * @author jsjef
 */
public class Teste {
    public static void main(String[] args) {
        
        TiqueTaque tt = new TiqueTaque();
        ThreadTiqueTaque tique = new ThreadTiqueTaque("Tique", tt);
        ThreadTiqueTaque taque = new ThreadTiqueTaque("Taque", tt);
        
        try {
            tique.t.join();
            taque.t.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
     
    }
    
}
