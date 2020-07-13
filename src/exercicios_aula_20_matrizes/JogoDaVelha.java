/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula_20_matrizes;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class JogoDaVelha {

    public static void main(String[] args) {
//        6. Faça um programa para jogar o jogo da velha. O programa deve permitir que dois jogadores façam uma partida do jogo da 
//           velha, usando o computador para ver o tabuleiro. Cada jogador vai alternadamente informando a posição onde deseja colocar 
//           a sua peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e determinar automaticamente quando o jogo terminou e
//           quem foi o vencedor (jogador1 ou jogador2). A cada nova jogada, o programa deve atualizar a situação do tabuleiro na tela.

        Scanner t = new Scanner(System.in);
        String[][] tabuleiro = new String[3][3];
        String Jogador1, Jogador2, jogador, Vencedor = "";
        int numero, sortnum;
        int posLinha, posColuna;
        int cont1 = 0, cont2 = 0;
        int contador1 = 0, contador2 = 0;
        boolean fimJogo = false, jogou = false, verifica = false;
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = "*";

            }
        }

        System.out.println("Sejam bem-vindos ao jogo da velha!");
        System.out.println("Informe o nome do 1º jogador:");
        Jogador1 = t.next();
        System.out.println("Informe o nome do 2º jogador:");
        Jogador2 = t.next();
        System.out.println(Jogador1 + " Escolha um número entre 0 e 1:");
        numero = t.nextInt();
        while (numero != 0 && numero != 1) {
            System.out.println("Número incorreto escolha 0 ou 1");
            numero = t.nextInt();
        }
        if (numero == 1) {
            System.out.println("Ok! O/A jogador(a) " + Jogador1 + " ficou com o número " + numero + " e o/a jogador(a) " + Jogador2
                    + " ficou com o número 0");
        } else {
            System.out.println("Ok! O/A jogador(a) " + Jogador1 + " ficou com o número " + numero + " e o/a jogador(a) " + Jogador2
                    + " ficou com o número 1");
        }
        sortnum = (int) (Math.random() * 2);

        System.out.println("O número sorteado foi: " + sortnum);
        if (sortnum == numero) {
            System.out.println("O/A jogador(a) " + Jogador1 + " iniciará!");
            System.out.println(Jogador1 + " jogará com X");
            System.out.println(Jogador2 + " jogará com O");
        } else {
            System.out.println("O/A jogador(a) " + Jogador2 + " iniciará!");
            System.out.println(Jogador2 + " jogará com X");
            System.out.println(Jogador1 + " jogará com O");
        }

        System.out.println("Estas são as jogadas possíveis:");
        System.out.println("L = Linha");
        System.out.println("C = Coluna");

        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.println("L " + "{" + i + "}");
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print("C " + "[" + j + "] ");

            }
            System.out.println("");
        }

        System.out.println("As jogadas serão realizadas indicando a linha e coluna correspondentes!");
        System.out.println("Vence o jogador que conseguir traçar uma linha com o símbolo na vertical, horizontal ou diagonal!");
        if (sortnum == numero) {
            jogador = Jogador1;

        } else {
            jogador = Jogador2;

        }

        do {
            verifica = false;
            while (jogou == false) {

                System.out.println(jogador + " Indique a linha correspondente a sua jogada: (0,1 ou 2)");
                posLinha = t.nextInt();
                while (posLinha != 0 && posLinha != 1 && posLinha != 2) {
                    System.out.println("Opção incorreta! indique 0,1 ou 2");
                    posLinha = t.nextInt();
                }
                System.out.println("Ok! Agora indique a coluna correspondente a sua jogada");
                posColuna = t.nextInt();
                while (posColuna != 0 && posColuna != 1 && posColuna != 2) {
                    System.out.println("Opção incorreta! indique 0,1 ou 2");
                    posColuna = t.nextInt();
                }
                if (jogador.equalsIgnoreCase(Jogador1)) {
                    cont1++;
                    if (tabuleiro[posLinha][posColuna].equalsIgnoreCase("*")) {
                        if (sortnum == numero) {
                            tabuleiro[posLinha][posColuna] = "X";
                            jogou = true;
                        } else {
                            tabuleiro[posLinha][posColuna] = "O";
                            jogou = true;
                        }

                    } else if (tabuleiro[posLinha][posColuna].equals("O")) {
                        if (sortnum == numero) {
                            System.out.println("Seu oponente já marcou esta posição");
                        } else {
                            System.out.println("Você já marcou essa posição!");
                        }

                    } else {
                        if (sortnum == numero) {
                            System.out.println("Você já marcou essa posição!");
                        } else {
                            System.out.println("Seu oponente já marcou esta posição");
                        }

                    }

                } else {
                    cont2++;
                    if (tabuleiro[posLinha][posColuna].equalsIgnoreCase("*")) {
                        if (sortnum != numero) {
                            tabuleiro[posLinha][posColuna] = "X";
                            jogou = true;
                        } else {
                            tabuleiro[posLinha][posColuna] = "O";
                            jogou = true;
                        }

                    } else if (tabuleiro[posLinha][posColuna].equals("O")) {
                        if (sortnum != numero) {
                            System.out.println("Seu oponente já marcou esta posição");
                        } else {
                            System.out.println("Você já marcou essa posição!");
                        }

                    } else {
                        if (sortnum != numero) {
                            System.out.println("Você já marcou essa posição!");
                        } else {
                            System.out.println("Seu oponente já marcou esta posição");
                        }

                    }
                }
            }
            jogou = false;
            if (fimJogo == false) {
                System.out.println("Situação do tabuleiro");
                for (int i = 0; i < tabuleiro.length; i++) {
                    for (int j = 0; j < tabuleiro[i].length; j++) {
                        System.out.print(tabuleiro[i][j] + " ");
                    }
                    System.out.println("");
                }

            }

            if (cont1 >= 3 || cont2 >= 3) {
                // Verificando tabuleiro na horizontal
                for (int i = 0; i < tabuleiro.length; i++) {
                    if (fimJogo == true) {
                        break;
                    }
                    for (int j = 0; j < tabuleiro[i].length; j++) {
                        if (tabuleiro[i][j].equals("X")) {
                            contador1++;
                            if (contador1 == 3) {
                                if (sortnum == numero) {
                                    Vencedor = Jogador1;
                                } else {
                                    Vencedor = Jogador2;
                                }

                                fimJogo = true;
                                break;
                            }

                        } else if (!tabuleiro[i][j].equalsIgnoreCase("*")) {
                            contador2++;
                            if (contador2 == 3) {
                                if (sortnum != numero) {
                                    Vencedor = Jogador1;
                                } else {
                                    Vencedor = Jogador2;
                                }
                                fimJogo = true;
                                break;
                            }
                        }

                    }
                    contador1 = 0;
                    contador2 = 0;
                }
                //Verificando tabuleiro na vertical
                if (fimJogo == false) {
                    for (int i = 0; i < tabuleiro.length; i++) {
                        if (fimJogo == true) {
                            break;
                        }
                        for (int j = 0; j < tabuleiro[i].length; j++) {
                            if (tabuleiro[j][i].equals("X")) {
                                contador1++;
                                if (contador1 == 3) {
                                    if (sortnum == numero) {
                                        Vencedor = Jogador1;
                                    } else {
                                        Vencedor = Jogador2;
                                    }
                                    fimJogo = true;
                                    break;
                                }

                            } else if (!tabuleiro[j][i].equalsIgnoreCase("*")) {
                                contador2++;
                                if (contador2 == 3) {
                                    if (sortnum != numero) {
                                        Vencedor = Jogador1;
                                    } else {
                                        Vencedor = Jogador2;
                                    }
                                    fimJogo = true;
                                    break;
                                }
                            }
                        }
                        contador1 = 0;
                        contador2 = 0;
                    }
                }

                //Verificando tabuleiro na diagonal
                if (fimJogo == false) {
                    if (tabuleiro[0][0].equalsIgnoreCase("X")
                            && tabuleiro[1][1].equalsIgnoreCase("X")
                            && tabuleiro[2][2].equalsIgnoreCase("X")) {
                        if (sortnum == numero) {
                            Vencedor = Jogador1;
                            fimJogo = true;
                        } else {
                            Vencedor = Jogador2;
                            fimJogo = true;
                        }

                    } else if (tabuleiro[0][0].equalsIgnoreCase("O")
                            && tabuleiro[1][1].equalsIgnoreCase("O")
                            && tabuleiro[2][2].equalsIgnoreCase("O")) {

                        if (sortnum != numero) {
                            Vencedor = Jogador1;
                            fimJogo = true;
                        } else {
                            Vencedor = Jogador2;
                            fimJogo = true;
                        }

                    }
                }
                if (fimJogo == false) {
                    if (tabuleiro[0][2].equalsIgnoreCase("X")
                            && tabuleiro[1][1].equalsIgnoreCase("X")
                            && tabuleiro[2][0].equalsIgnoreCase("X")) {
                        if (sortnum == numero) {
                            Vencedor = Jogador1;
                            fimJogo = true;
                        } else {
                            Vencedor = Jogador2;
                            fimJogo = true;
                        }

                    } else if (tabuleiro[0][2].equalsIgnoreCase("O")
                            && tabuleiro[1][1].equalsIgnoreCase("O")
                            && tabuleiro[2][0].equalsIgnoreCase("O")) {

                        if (sortnum != numero) {
                            Vencedor = Jogador1;
                            fimJogo = true;
                        } else {
                            Vencedor = Jogador2;
                            fimJogo = true;
                        }

                    }
                }

                if (fimJogo == false) {
                    for (int i = 0; i < tabuleiro.length; i++) {
                        if (verifica == true) {
                            break;
                        }
                        for (int j = 0; j < tabuleiro[i].length; j++) {
                            if (tabuleiro[i][j].equalsIgnoreCase("*")) {
                                verifica = true;

                                break;
                            } else if (i == 2 && j == 2) {
                                fimJogo = true;

                            }

                        }

                    }
                }
            }
            if (jogador.equalsIgnoreCase(Jogador1)) {
                jogador = Jogador2;
            } else {
                jogador = Jogador1;
            }

        } while (fimJogo == false || verifica == true);

        if (!Vencedor.equalsIgnoreCase("")) {
            System.out.println("Vencedor(a) " + Vencedor);
        } else {
            System.out.println("Deu velha!");
        }

    }

}
