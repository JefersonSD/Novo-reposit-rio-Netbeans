/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula_24_OO;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class TesteJogoDaVelha {

    public static void main(String[] args) {
        JogoDaVelha2 jogo = new JogoDaVelha2();
        Scanner t = new Scanner(System.in);
        jogo.tabuleiro = new String[3][3];
        jogo.jogada = 1;
        jogo.ganhou = false;

        System.out.println("Sejam bem vindos ao jogo da velha!");

        while (!jogo.ganhou) {
            // chama método quem joga
            jogo.jogada = jogo.quemJoga(jogo.jogada);
            // chama método realiza jogada
            jogo.realizaJogada();
            jogo.jogada++;
            // chama método mostra tabuleiro
            jogo.mostraTabuleiro();
            //chama método verifica  Tabuleiro
            if (jogo.jogada >= 5) {
                jogo.verificaTabuleiro();
            }
            if (!jogo.ganhou && jogo.jogada == 10) {
                break;
            }

        }
        if (jogo.ganhou) {
            jogo.mostraTabuleiro();
            System.out.println("Vencedor:");
            System.out.println(jogo.jogador);
        } else {
            System.out.println("Deu velha!");
        }

    }

}
