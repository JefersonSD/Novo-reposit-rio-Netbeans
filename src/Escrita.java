
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jsjef
 */
public class Escrita extends Thread {

    private int i;
    private static int cont = 0;
    private int identificacao;

    public Escrita() {
        cont++;
        identificacao = cont;
        new Thread(this).start();
    }

    public void run() {
        while (true) {
            System.out.println("Número (" + identificacao + "): " + i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Escrita.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
