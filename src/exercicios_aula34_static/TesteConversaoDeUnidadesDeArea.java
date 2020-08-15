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
public class TesteConversaoDeUnidadesDeArea {

    static int area, opcao;

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        System.out.println("Informe a área:");
        area = t.nextInt();
        System.out.println("Qual conversão deseja fazer?");
        System.out.println("1 - Metro quadrado para Pé quadrado\n2 - Milha quadrada para Acre\n3 -  Pé quadrado para centimetro quadrado"
                + "\n4 - Acre para Pé quadrado ");
        opcao = t.nextInt();
        while (opcao < 1 || opcao > 4) {
            System.out.println("Opção inválida");
            System.out.println("Qual conversão deseja fazer?");
            System.out.println("1 - Metro quadrado para Pé quadrado\n2 - Milha quadrada para Acre\n3 -Pé quadrado para centimetro quadrado"
                    + "\n4 - Acre para Pé quadrado ");
            opcao = t.nextInt();
        }
        
        switch(opcao){
            case 1:
                System.out.printf("%.2f\n",ConversaoDeUnidadesDeArea.converteMetroQuadradoEmPeQuadrado(area));
                break;
            case 2:
                System.out.printf("%.2f\n",ConversaoDeUnidadesDeArea.converteMilhaQuadradaEmAcre(area));
                break;
            case 3:
                System.out.printf("%.2f\n",ConversaoDeUnidadesDeArea.convertePeQuadradoEmCentimetroQuadrado(area));
                break;
            case 4:
                System.out.printf("%.2f\n",ConversaoDeUnidadesDeArea.converteAcreEmPeQuadrado(area));
                break;
        }

    }

}
