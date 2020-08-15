/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula34_static;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class TesteConversaoDeUnidadesDeVolume {

    static int volume, opcao;

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("Informe o volume:");
        volume = t.nextInt();
        System.out.println("Qual conversão deseja fazer?");
        System.out.println("1 - Litros em centímetros cúbicos\n2 - Metros cúbicos em litros\n3 - Metros cúbicos em pés cúbicos"
                + "\n4 - Galão americano em polegadas cúbicas\n5 - Galão americano em litros ");
        opcao = t.nextInt();
        while (opcao < 1 || opcao > 5) {
            System.out.println("Opção inválida");
            System.out.println("Qual conversão deseja fazer?");
            System.out.println("1 - Litros em centímetros cúbicos\n2 - Metros cúbicos em litros\n3 - Metros cúbicos em pés cúbicos"
                    + "\n4 - Galão americano em polegadas cúbicas\n5 - Galão americano em litros ");
            opcao = t.nextInt();
        }

        switch (opcao) {
            case 1:
                System.out.printf("%.2f\n", ConversaoDeUnidadesDeVolume.converteLitrosEmCentimetrosCubicos(volume));
                break;
            case 2:
                System.out.printf("%.2f\n", ConversaoDeUnidadesDeVolume.converteMetroCubicoEmLitros(volume));
                break;
            case 3:
                System.out.printf("%.2f\n", ConversaoDeUnidadesDeVolume.converteMetrosCubicosEmPesCubicos(volume));
                break;
            case 4:
                System.out.printf("%.2f\n", ConversaoDeUnidadesDeVolume.converteGalaoAmericanoEmPolegadasCubicas(volume));
                break;
            case 5:
                System.out.printf("%.2f\n", ConversaoDeUnidadesDeVolume.converteGalaoAmericanoEmLitros(volume));
                break;
        }

    }

}
