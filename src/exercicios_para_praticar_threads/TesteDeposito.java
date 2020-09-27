/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_para_praticar_threads;

/**
 *
 * @author jsjef
 */
public class TesteDeposito {

    public static void main(String[] args) {

        Deposito d = new Deposito();
        
        ThreadProdutor produtor = new ThreadProdutor(d, 200);
        ThreadConsumidor consumidor = new ThreadConsumidor(d, 400);
    
    }

}
