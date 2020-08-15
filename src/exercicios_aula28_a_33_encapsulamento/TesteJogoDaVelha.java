/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula28_a_33_encapsulamento;

/**
 *
 * @author jsjef
 */
public class TesteJogoDaVelha {
    public static void main(String[] args) {
        
         JogoDaVelha jogo = new JogoDaVelha();
         
          
        System.out.println("Sejam bem vindos ao jogo da velha!");

        while (!jogo.getGanhou()) {
            // chama método quem joga
            jogo.setJogada(jogo.quemJoga(jogo.getJogada()));  
            // chama método realiza jogada
            jogo.realizaJogada();
            //chama método verifica  Tabuleiro
            if (jogo.getJogada() >= 5) {
                jogo.verificaTabuleiro();
            }
            if (!jogo.getGanhou() && jogo.getJogada() == 10) {
                break;
            }

        }
        if (jogo.getGanhou()) {
            System.out.println("Vencedor:");
            System.out.println(jogo.getJogador());
        } else {
            System.out.println("Deu velha!");
        }

        
    }
    
}
