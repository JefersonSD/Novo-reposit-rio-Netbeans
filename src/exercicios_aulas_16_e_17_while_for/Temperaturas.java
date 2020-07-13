package exercicios_aulas_16_e_17_while_for;

import java.util.Scanner;

public class Temperaturas {

    public static void main(String[] args) {
        /*
		 * 33 - O Departamento Estadual de Meteorologia lhe contratou para desenvolver
		 * um programa que leia as um conjunto indeterminado de temperaturas, e informe
		 * ao final a menor e a maior temperaturas informadas, bem como a média das
		 * temperaturas.
         */

        Scanner t = new Scanner(System.in);
        int temperatura, contador = 0, maiorT = 0, menorT = 0;
        double media = 0;
        String opcao;

        do {
            contador++;
            if (contador == 1) {
                System.out.println("Informe as temperaturas:");
                temperatura = t.nextInt();
                menorT = temperatura;
            } else {
                System.out.println("Informe a próxima temperatura:");
                temperatura = t.nextInt();
            }
            if (temperatura > maiorT) {
                maiorT = temperatura;
            }
            if (temperatura < menorT && temperatura != 0) {
                menorT = temperatura;
            }
            media += temperatura;
            System.out.println("[Digite \" exit \" se quiser sair do progroma ou \"next\" para continuar]");
            opcao = t.next();
            while (!opcao.equalsIgnoreCase("exit") && !opcao.equalsIgnoreCase("next")) {
                System.out.println("Opção inválida\n Digite \" exit \" se quiser sair do progroma ou \"next\" para continuar]");
                opcao = t.next();
            }

        } while (!opcao.equalsIgnoreCase("exit"));

        System.out.println("Maior temperatura: " + maiorT + "\nMenor temperatura: " + menorT + "\nMédia: " + media / contador);
    }

}
