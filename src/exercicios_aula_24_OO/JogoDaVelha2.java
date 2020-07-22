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
public class JogoDaVelha2 {

    Scanner t = new Scanner(System.in);

//    4. Reescreva  o  exercício  6  da  aula  20  (Jogo  da  Velha).  Desenvolva  uma  classe   para  representar  
//       o  Jogo  da  Velha.  Desenvolva  uma  classe  para  testar  o   Jogo. 
    boolean ganhou;
    int jogada;
    String[][] tabuleiro;
    int linha;
    int coluna;
    int contadorPlayer1;
    int contadorPlayer2;
    String jogador;
    boolean verificaPosicao = false;

    int validaJogada(int jogada) {
        while (jogada < 1 || jogada > 3) {
            System.out.println("Jogada inválida! Selecione 1,2 ou 3 ");
            jogada = t.nextInt();

        }
        return jogada;
    }

    int quemJoga(int quemJoga) {

        if (quemJoga % 2 != 0) {
            jogador = "Jogador 1";
            System.out.println("É a vez do " + jogador + "!");
        } else {
            jogador = "Jogador 2";
            System.out.println("É a vez do " + jogador + "!");
        }
        if (quemJoga == 1) {
            System.out.println("Jogador 1 joga com X");
            System.out.println("Jogador 2 joga com O");
        }
        return quemJoga;

    }

    void realizaJogada() {
        if (jogada == 1) {
            System.out.println("Essas são as jogadas possíveis:");
            for (int i = 0; i < tabuleiro.length; i++) {
                System.out.println("Linha: " + (i + 1));
                for (int j = 0; j < tabuleiro[i].length; j++) {
                    tabuleiro[i][j] = "*";
                    System.out.print("Coluna: " + (j + 1) + " ");

                }
                System.out.println();
            }
        }
        do {
            verificaPosicao = false;
            System.out.println("Selecione sua jogada:");
            System.out.println("Selecione a linha (1,2 ou 3)");
            linha = t.nextInt();
            linha = validaJogada(linha);
            System.out.println("Selecione a coluna (1,2 ou 3)");
            coluna = t.nextInt();
            coluna = validaJogada(coluna);
            //chama método verifica posição

            if (!verificaPosicao(--linha, --coluna)) {
                if (jogada % 2 != 0) {
                    tabuleiro[linha][coluna] = "X";
                } else {
                    tabuleiro[linha][coluna] = "O";
                }
            }

        } while (verificaPosicao);
    }

    void mostraTabuleiro() {
        System.out.println("Situação do tabuleiro!");
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();

        }
    }

    void verificaTabuleiro() {
        for (int i = 0; i < tabuleiro.length; i++) {
            if (ganhou) {
                break;
            }
            contadorPlayer1 = 0;
            contadorPlayer2 = 0;

            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (tabuleiro[i][j].equalsIgnoreCase("X")) {
                    contadorPlayer1++;
                } else if (tabuleiro[i][j].equalsIgnoreCase("O")) {
                    contadorPlayer2++;
                }
                if (contadorPlayer1 == 3 || contadorPlayer2 == 3) {
                    ganhou = true;
                    break;
                }

            }

        }
        for (int i = 0; i < tabuleiro.length; i++) {
            if (ganhou) {
                break;
            }
            contadorPlayer1 = 0;
            contadorPlayer2 = 0;

            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (tabuleiro[j][i].equalsIgnoreCase("X")) {
                    contadorPlayer1++;
                } else if (tabuleiro[j][i].equalsIgnoreCase("O")) {
                    contadorPlayer2++;
                }
                if (contadorPlayer1 == 3 || contadorPlayer2 == 3) {
                    ganhou = true;
                    break;
                }

            }

        }

        if (tabuleiro[0][0].equalsIgnoreCase("X")
                && tabuleiro[1][1].equalsIgnoreCase("X")
                && tabuleiro[2][2].equalsIgnoreCase("X")) {
            ganhou = true;
        } else if (tabuleiro[0][0].equalsIgnoreCase("O")
                && tabuleiro[1][1].equalsIgnoreCase("O")
                && tabuleiro[2][2].equalsIgnoreCase("O")) {
            ganhou = true;
        }
        if (tabuleiro[0][2].equalsIgnoreCase("X")
                && tabuleiro[1][1].equalsIgnoreCase("X")
                && tabuleiro[2][0].equalsIgnoreCase("X")) {
            ganhou = true;
        } else if (tabuleiro[0][2].equalsIgnoreCase("O")
                && tabuleiro[1][1].equalsIgnoreCase("O")
                && tabuleiro[2][0].equalsIgnoreCase("O")) {
            ganhou = true;
        }
    }

    boolean verificaPosicao(int l, int c) {
        if (jogador.equalsIgnoreCase("Jogador 1")) {
            if (tabuleiro[l][c].equalsIgnoreCase("X")) {
                System.out.println("Você já indicou essa posição!");
                verificaPosicao = true;
            } else if (tabuleiro[l][c].equalsIgnoreCase("O")) {
                System.out.println("Seu oponente já indicou essa posição!");
                verificaPosicao = true;
            }
        } else {
            if (tabuleiro[l][c].equalsIgnoreCase("X")) {
                System.out.println("Seu oponente já indicou essa posição!");
                verificaPosicao = true;
            } else if (tabuleiro[l][c].equalsIgnoreCase("O")) {
                System.out.println("Você já indicou essa posição!");
                verificaPosicao = true;
            }

        }
        return verificaPosicao;
    }
}
