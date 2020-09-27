/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula73_threads_resume_suspend_stop;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jsjef
 */
public class Teste {

    public static void main(String[] args) {

        MinhaThread t1 = new MinhaThread("#1");
        MinhaThread t2 = new MinhaThread("#2");

        t1.suspend();
        
        try {
            Thread.sleep(900);
        } catch (InterruptedException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        t1.resume();
        t1.stop();

    }

}
