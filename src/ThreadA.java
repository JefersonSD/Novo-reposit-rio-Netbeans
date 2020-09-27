/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jsjef
 */
public class ThreadA {

    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.start();

        synchronized (b) {
            try {
                System.out.println("Aguardando o b completar...");
                b.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           
           
            System.out.println("Total é igual a: " + b.total);
        }
    }
}

 class ThreadB extends Thread{

    int total;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 4; i++) {
                total += i;
            }
            notify();
        }
    }
}
