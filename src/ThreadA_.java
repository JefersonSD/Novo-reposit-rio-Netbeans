/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jsjef
 */
public class ThreadA_ {

    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.start();

        System.out.println("Total é igual a: " + b.total);

    }
}

class ThreadB_ extends Thread {

    int total;

    @Override
    public void run() {

        for (int i = 0; i < 200; i++) {
            total += i;
        }

    }
}
