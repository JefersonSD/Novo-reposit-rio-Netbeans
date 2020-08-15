package exercicios_aulas16_e_17_while_for;

import java.util.Scanner;

public class CalculaValorHDiv {

    public static void main(String[] args) {
        // Sendo H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que calcule o valor de H com N termos.

        Scanner t = new Scanner(System.in);
        System.out.println("Informe um dividendo:");
        double dividendo = t.nextDouble();
        double H = 1;
        String output = "H = 1 + ";
        for (double i = 2; i <= dividendo; i++) {
            output += 1 + "/" + i;
            H += 1 / i;
            if (i < dividendo) {
                output += " + ";
            }

        }
        System.out.println(output);
        System.out.println("Resultado de H:");
        System.out.printf("%.2f\n", H);

    }

}
