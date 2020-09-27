/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_threads_semaforo_loiane;


/**
 *
 * @author jsjef
 */
public class SimuladorSemaforo {
    public static void main(String[] args) {
        
        ThreadSemaforo semaforo = new ThreadSemaforo();
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println(semaforo.getCor());
            semaforo.esperarMudarCor();
            
        }
        
        semaforo.desligarSemaforo();
    }
    
}
