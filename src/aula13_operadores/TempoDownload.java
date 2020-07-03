/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13_operadores;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class TempoDownload {

    public static void main(String[] args) {
        /*18 - Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), 
               calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).*/

        Scanner t = new Scanner(System.in);
        System.out.println("Informe o tamanho do arquivo para download em \"MB\": ");
        double tArquivo = t.nextDouble();
        System.out.println("Informe a velocidade do link da internet em \"Mbps\": ");
        double link = t.nextDouble();
        double vDownload = tArquivo / (link / 8);
        if (vDownload < 60) { // Tempo em segundos
            System.out.println("A velocidade de Download de um arquivo de tamanho " + tArquivo + " MB será de " + vDownload 
                             + " segundos em uma internet de velocidade " + link + "Mbps.");
        } else if (vDownload >= 60 && vDownload < 3600) { // Tempo em minutos
            double converte = vDownload / 60, arredonda;
            converte -= ((int) converte); // Pegando somente a fração
            if (converte > 0.1 && converte <= 0.5) {
                converte = vDownload / 60;
                arredonda = Math.floor(converte); // Arredonda para baixo
            } else {
                converte = vDownload / 60;
                arredonda = Math.ceil(converte); // Arredonda para cima
            }
            System.out.println("A velocidade de Download de um arquivo de tamanho " + tArquivo + " MB será de aproximadamente "
                    + arredonda + " minuto(s) " + "em uma internet de\nvelocidade " + link + " Mbps.");
        } else { //Tempo em horas
            double converteH = (vDownload / 60) / 60;
            converteH -= ((int) converteH);
            if (converteH == 0) {
                converteH = (vDownload / 60) / 60;
                System.out.println("A velocidade de Download de um arquivo de tamanho " + tArquivo + " MB será de " + converteH
                        + " hora(s)" + " em uma internet de\nvelocidade " + link + " Mbps.");
            } else {
                converteH = (vDownload / 60) / 60; // Converte segundos para horas
                double restoDivisao = converteH -= ((int) converteH); // Pegar a fração (que corresponde a horas) 
                converteH = (vDownload / 60) / 60; // Necessário fazer a conversão novamente por causa do [converteH -= ((int) converteH)}
                vDownload = Math.floor(converteH); //Arredondamento das horas para baixo
                restoDivisao *= 60; // Conversão da fração (que corresponde a horas) para minutos.
                System.out.printf("A velocidade de Download de um arquivo de tamanho %.0f MB será de %.0f hora(s) " + "e %.0f minuto(s) "
                        + "em uma internet de velocidade %.0f Mbps! ", tArquivo, vDownload, restoDivisao, link);
            }
        }
    }

}
