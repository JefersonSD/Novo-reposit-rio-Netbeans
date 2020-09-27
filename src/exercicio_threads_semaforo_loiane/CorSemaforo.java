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
public enum CorSemaforo {
    
    VERDE(2000), AMARELO(500), VERMELHO(1000);
    
    private int tempoEspera;
    
    CorSemaforo(int tempoEspera){
        this.tempoEspera = tempoEspera;
    }
    
    public int getTempoEspera(){
        return this.tempoEspera;
    }
    
}
