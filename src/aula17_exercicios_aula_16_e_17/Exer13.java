package aula17_exercicios_aula_16_e_17;

import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args) {
        // 13 - Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo 
        // número Não utilize a função de potência da linguagem.
        Scanner t = new Scanner(System.in);
        int base, expoente;
        System.out.println("Informe dois números \"Base\" e \"Expoente\" para saber a potenciação:");
        System.out.println("Informe a \"Base\" : ");
        base = t.nextInt();
        System.out.println("Informe o \"Expoente\" :");
        expoente = t.nextInt();
        int potencia = base;
        for (int i = 1; i < expoente; i++) {

            potencia *= base;
        }
        System.out.println("Potencia:" + potencia);

    }

}
