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
public class TesteLigaDesligaLampada {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String opcao;

        LigaDesligaLampada lampada = new LigaDesligaLampada();
        System.out.println("Deseja ligar a lâmpada? (s/n)");
        opcao = t.next();
        while (!opcao.equalsIgnoreCase("s") && !opcao.equalsIgnoreCase("n")) {
            System.out.println("Opção inválida! Digite 's' para sim ou 'n' para não!");
            opcao = t.next();
        }
        if (opcao.equalsIgnoreCase("s")) {
            lampada.liga();
        } else {
            lampada.desliga();

        }

    }

}
