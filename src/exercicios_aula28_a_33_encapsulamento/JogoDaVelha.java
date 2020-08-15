/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula28_a_33_encapsulamento;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class JogoDaVelha {

    Scanner t = new Scanner(System.in);

    private boolean ganhou;
    private int jogada;
    private String[][] tabuleiro;
    private int linha;
    private int coluna;
    private int contadorPlayer1;
    private int contadorPlayer2;
    private String jogador;
    private boolean verificaPosicao = false;
    private String sinal;

    public JogoDaVelha() {
        this.tabuleiro = new String[3][3];
        this.jogada = 1;
        this.ganhou = false;
        this.sinal = "X";
    }

    ;

    public boolean getGanhou() {
        return ganhou;
    }

    public void setGanhou(boolean ganhou) {
        this.ganhou = ganhou;
    }

    public int getJogada() {
        return jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
    }

    public String[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(String[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getContadorPlayer1() {
        return contadorPlayer1;
    }

    public void setContadorPlayer1(int contadorPlayer1) {
        this.contadorPlayer1 = contadorPlayer1;
    }

    public int getContadorPlayer2() {
        return contadorPlayer2;
    }

    public void setContadorPlayer2(int contadorPlayer2) {
        this.contadorPlayer2 = contadorPlayer2;
    }

    public String getJogador() {
        return jogador;
    }

    public void setJogador(String jogador) {
        this.jogador = jogador;
    }

    public boolean isVerificaPosicao() {
        return verificaPosicao;
    }

    public void setVerificaPosicao(boolean verificaPosicao) {
        this.verificaPosicao = verificaPosicao;
    }

    public int quemJoga(int quemJoga) {

        if (quemJoga % 2 != 0) {
            jogador = "Jogador 1";
            System.out.println("É a vez do " + jogador + "!");
            sinal = "X";
        } else {
            jogador = "Jogador 2";
            System.out.println("É a vez do " + jogador + "!");
            sinal = "O";
        }
        if (quemJoga == 1) {
            System.out.println("Jogador 1 joga com X");
            System.out.println("Jogador 2 joga com O");
        }
        if(this.jogada==1){
            preencheTabuleiro();
        }
        
        return quemJoga;

    }

    private void preencheTabuleiro() {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {

                tabuleiro[i][j] = "*";

            }

        }
    }

    public void realizaJogada() {
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
                tabuleiro[linha][coluna] = sinal;
            }

        } while (verificaPosicao);
        mostraTabuleiro();
        this.jogada++;
    }

    private int validaJogada(int jogada) {
        while (jogada < 1 || jogada > 3) {
            System.out.println("Jogada inválida! Selecione 1,2 ou 3 ");
            jogada = t.nextInt();

        }
        return jogada;
    }

    private boolean verificaPosicao(int l, int c) {
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

    private void mostraTabuleiro() {
        System.out.println("Situação do tabuleiro!");
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();

        }
    }
    public void verificaTabuleiro(){
        //Verificação na horizontal
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
                    mostraTabuleiro();
                    break;
                }

            }

        }
         // Verificação na vertical
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
                    mostraTabuleiro();
                    break;
                }

            }

        }
         //Verificação na diagonal
         
         if (tabuleiro[0][0].equalsIgnoreCase("X")
                && tabuleiro[1][1].equalsIgnoreCase("X")
                && tabuleiro[2][2].equalsIgnoreCase("X")) {
            ganhou = true;
            mostraTabuleiro();
        } else if (tabuleiro[0][0].equalsIgnoreCase("O")
                && tabuleiro[1][1].equalsIgnoreCase("O")
                && tabuleiro[2][2].equalsIgnoreCase("O")) {
            ganhou = true;
            mostraTabuleiro();
        }
        if (tabuleiro[0][2].equalsIgnoreCase("X")
                && tabuleiro[1][1].equalsIgnoreCase("X")
                && tabuleiro[2][0].equalsIgnoreCase("X")) {
            ganhou = true;
            mostraTabuleiro();
        } else if (tabuleiro[0][2].equalsIgnoreCase("O")
                && tabuleiro[1][1].equalsIgnoreCase("O")
                && tabuleiro[2][0].equalsIgnoreCase("O")) {
            ganhou = true;
            mostraTabuleiro();
        }
        
    }

}
