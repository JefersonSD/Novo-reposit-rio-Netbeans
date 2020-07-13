package exercicios_aulas_16_e_17_while_for;

import java.util.Scanner;

public class VotosCandidatos {

    public static void main(String[] args) {
//		44 - Em uma eleição presidencial existem quatro candidatos. Os votos são informados por meio de código. Os códigos 
//              utilizados são:
//			1 , 2, 3, 4  - Votos para os respectivos candidatos 
//			(você deve montar a tabela ex: 1 - Jose/ 2- João/etc)
//			5 - Voto Nulo
//			6 - Voto em Branco
//			Faça um programa que calcule e mostre:
//			- O total de votos para cada candidato;
//			- O total de votos nulos;
//			- O total de votos em branco;
//			- A percentagem de votos nulos sobre o total de votos;
//			- A percentagem de votos em branco sobre o total de votos. Para finalizar o conjunto de votos tem-se o valor zero.

        Scanner t = new Scanner(System.in);
        int votos, quantVotosJose = 0, quantVotosJoao = 0, quantVotosAdalberto = 0, quantVotosGeraldo = 0,
                quantVotosNulos = 0, quantVotosBrancos = 0, contGeral = 0;

        double percentNulos = 0, percentBrancos = 0;
        boolean verifica1 = false, verifica2 = false;
        do {
            System.out.println("Vote em um candidato:\n\t\t\tCandidatos\n1-Jose\n2-João\n3-Adalberto"
                    + "\n4-Geraldo\nPara votar nulo vote 5\nPara votar em branco vote 6");
            votos = t.nextInt();
            while (votos != 0 && votos != 1 && votos != 2 && votos != 3 && votos != 4 && votos != 5 && votos != 6) {
                System.err.println("Voto incorreto");
                System.out.println("Vote em um candidato:\n\t\t\tCandidatos\n1-Jose\n2-João\n3-Adalberto"
                        + "\n4-Geraldo\nPara votar nulo vote 5\nPara votar em branco vote 6\nPara encerrar os votos tecle 0");
                votos = t.nextInt();
            }
            switch (votos) {
                case 1:
                    quantVotosJose++;
                    break;
                case 2:
                    quantVotosJoao++;
                    break;
                case 3:
                    quantVotosAdalberto++;
                    break;
                case 4:
                    quantVotosGeraldo++;
                    break;
                case 5:
                    quantVotosNulos++;
                    break;
                case 6:
                    quantVotosBrancos++;
                    break;
            }

        } while (votos != 0);

        contGeral = quantVotosJose + quantVotosJoao + quantVotosAdalberto + quantVotosGeraldo + quantVotosNulos
                + quantVotosBrancos;
        for (double i = 0.001; i < 1; i += 0.001) {

            if (contGeral * i >= quantVotosNulos && verifica1 == false) {
                percentNulos = i * 100;
                verifica1 = true;
            }
            if (contGeral * i >= quantVotosBrancos && verifica2 == false) {
                percentBrancos = i * 100;
                verifica2 = true;
            }
            if (verifica1 == true && verifica2 == true) {
                break;
            }

        }

        System.out.println("Quantidade de votos do candidato José: " + quantVotosJose);
        System.out.println("Quantidade de votos do candidato João: " + quantVotosJoao);
        System.out.println("Quantidade de votos do candidato Adalberto: " + quantVotosAdalberto);
        System.out.println("Quantidade de votos do candidato Geraldo: " + quantVotosGeraldo);
        System.out.println("Quantidade de votos Nulos: " + quantVotosNulos);
        System.out.println("Quantidade de votos em Branco: " + quantVotosBrancos);
        System.out.printf("Porcentagem de votos nulos sobre o total de votos: %.1f\n", percentNulos);
        System.out.printf("Porcentagem de votos em branco sobre o total de votos: %.1f\n", percentBrancos);

    }

}
