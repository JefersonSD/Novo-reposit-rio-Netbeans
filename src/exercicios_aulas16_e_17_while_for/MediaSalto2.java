package exercicios_aulas16_e_17_while_for;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaSalto2 {

    public static void main(String[] args) {
//		46 - Em uma competição de salto em distância cada atleta tem direito a cinco saltos. No final da série 
//		     de saltos de cada atleta, o melhor e o pior resultados são eliminados. O seu resultado fica sendo 
//		     a média dos três valores restantes. Você deve fazer um programa que receba o nome e as cinco distâncias 
//		     alcançadas pelo atleta em seus saltos e depois informe a média dos saltos conforme a descrição acima 
//		     informada (retirar o melhor e o pior salto e depois calcular a média). Faça uso de uma lista para armazenar
//		     os saltos. Os saltos são informados na ordem da execução, portanto não são ordenados. O programa deve ser 
//		     encerrado quando não for informado o nome do atleta. A saída do programa deve ser conforme o exemplo abaixo:

//			Atleta: Rodrigo Curvêllo
//
//			Primeiro Salto: 6.5 m
//			Segundo Salto: 6.1 m
//			Terceiro Salto: 6.2 m
//			Quarto Salto: 5.4 m
//			Quinto Salto: 5.3 m
//
//			Melhor salto:  6.5 m
//			Pior salto: 5.3 m
//			Média dos demais saltos: 5.9 m
//
//			Resultado final:
//			Rodrigo Curvêllo: 5.9 m
        Scanner t = new Scanner(System.in);
        String nome = "";
        double distancia = 0;
        List<Double> distancias = new ArrayList();
        double media = 0;
        int opcao;

        do {
            double minValue = 0, maxValue = 0;
            System.out.println("Informe seu nome:");
            nome = t.next();

            for (int i = 1; i <= 5; i++) {
                System.out.println("Informe a " + i + "ª distância:");
                distancia = t.nextDouble();
                distancias.add(distancia);
                if (i == 1) {
                    minValue = distancia;
                }
            }
            System.out.println("Atleta: " + nome);
            int cont = 0;
            for (double saltos : distancias) {
                cont++;
                System.out.println(cont + "º salto ----> " + saltos);

            }

            for (double filtro : distancias) {

                if (filtro > maxValue) {
                    maxValue = filtro;
                }
                if (filtro <= minValue) {
                    minValue = filtro;
                }
            }
            System.out.println("Melhor salto: " + maxValue);
            System.out.println("Pior salto: " + minValue);
            cont = 0;
            distancias.remove(maxValue);
            distancias.remove(minValue);
            for (double i : distancias) {
                cont++;
                media += i;
            }
            media = media / cont;
            System.out.printf("Média dos demais saltos: %.2f\n\n", media);
            System.out.println("Resultado final:");
            System.out.printf("%s: %.2f\n", nome, media);

            distancias.clear();
            media = 0;

            System.out.println("Tecle 1 para continuar ou 0 para encerrar!");
            opcao = t.nextInt();
            while (opcao != 1 && opcao != 0) {
                System.err.println("Opção inválida!");
                System.out.println("Tecle \"1\" para continuar ou \"0\" para encerrar!\"");
                opcao = t.nextInt();
            }

        } while (opcao == 1);
        System.out.println("Fim!");

    }

}
