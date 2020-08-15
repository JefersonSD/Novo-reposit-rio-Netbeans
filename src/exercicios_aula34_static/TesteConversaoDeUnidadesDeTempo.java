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
public class TesteConversaoDeUnidadesDeTempo {

    static int intervalo, opcao;

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        System.out.println("Informe o intervalo:");
        intervalo = t.nextInt();
        System.out.println("Qual conversão deseja fazer?");
        System.out.println("1 - Minutos para Segundos\n2 - Hora para minutos\n3 - Dia para hora"
                + "\n4 - Semana para dias\n5 - Mês para dias\n6 - Ano para dias ");
        opcao = t.nextInt();
        while (opcao < 1 || opcao > 6) {
            System.out.println("Opção inválida");
            System.out.println("Qual conversão deseja fazer?");
            System.out.println("1 - Minutos para Segundos\n2 - Hora para minutos\n3 -  Dia para hora"
                    + "\n4 - Semana para dias\n5 - Mês para dias\n6 - Ano para dias ");
            opcao = t.nextInt();
        }

        switch (opcao) {
            case 1:
                System.out.println(ConversaoDeUnidadesDeTempo.converteMinutosEmSegundos(intervalo));
                break;
            case 2:
                System.out.println(ConversaoDeUnidadesDeTempo.converteHorasEmMinutos(intervalo));
                break;
            case 3:
                System.out.println(ConversaoDeUnidadesDeTempo.converteDiasEmHoras(intervalo));
                break;
            case 4:
                System.out.println(ConversaoDeUnidadesDeTempo.converteSemanaEmDias(intervalo));
                break;
            case 5:
                System.out.println(ConversaoDeUnidadesDeTempo.converteMesEmDias(intervalo));
                break;
            case 6:
                System.out.printf("%.2f dias\n",ConversaoDeUnidadesDeTempo.converteAnoEmDias(intervalo));
                break;
        }

    }
}
