/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jsjef
 */
public class MultiThread {

    public static void main(String[] args) {
        UmaThread t1, t2, t3;
        t1 = new UmaThread("Primeira", (int) (Math.random() * 8000));
        t2 = new UmaThread("Segunda", (int) (Math.random() * 8000));
        t3 = new UmaThread("Terceira", (int) (Math.random() * 8000));

        t1.start();
        t2.start();
        t3.start();
    }

}
