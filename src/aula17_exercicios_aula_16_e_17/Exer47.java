package aula17_exercicios_aula_16_e_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exer47 {

	public static void main(String[] args) {
//		47 - Em uma competição de ginástica, cada atleta recebe votos de sete jurados. A melhor e a pior nota são 
//		     eliminadas. A sua nota fica sendo a média dos votos restantes. Você deve fazer um programa que receba 
//		     o nome do ginasta e as notas dos sete jurados alcançadas pelo atleta em sua apresentação e depois informe 
//		     a sua média, conforme a descrição acima informada (retirar o melhor e o pior salto e depois calcular a 
//		     média com as notas restantes). As notas não são informados ordenadas. Um exemplo de saída do programa 
//		     deve ser conforme o exemplo abaixo:
//			Atleta: Aparecido Parente
//			Nota: 9.9
//			Nota: 7.5
//			Nota: 9.5
//			Nota: 8.5
//			Nota: 9.0
//			Nota: 8.5
//			Nota: 9.7
//
//			Resultado final:
//			Atleta: Aparecido Parente
//			Melhor nota: 9.9
//			Pior nota: 7.5
//			Média: 9,04
		
		Scanner t = new Scanner(System.in);
		String nome = "";
		double nota = 0;
		List<Double> notas = new ArrayList<Double>();
		double media = 0;
		int opcao;
		
		
		do {
			double menorNota = 0, maiorNota = 0;
			System.out.println("Informe seu nome:");
			nome = t.next();
			
			for (int i = 1; i <=7; i++) {
				System.out.println("Informe a "+ i + "ª nota:");
				nota = t.nextDouble();
				notas.add(nota);
				if(i == 1) {
					menorNota = nota;
				}
			}
			System.out.println("Atleta: " + nome);
			int cont = 0;
			for(double pontos : notas) {
				cont++;
				System.out.println(cont + "ª nota ----> " + pontos );
				
			}
			
			for(double filtro : notas) {
				
				if(filtro > maiorNota) {
					maiorNota = filtro;
				}
				if(filtro <= menorNota) {
					menorNota = filtro;
				}
			}
			cont = 0;
			notas.remove(maiorNota);
			notas.remove(menorNota);
			for (double i : notas) {
				cont++;
				media += i;
			}
			media = media/cont;
			System.out.println("Resultado final:");
			System.out.println("Atleta " + nome);
			System.out.println("Melhor nota: " + maiorNota);
			System.out.println("Pior nota: " + menorNota);
			System.out.printf( "Média: %.2f\n" , media);
			
			notas.clear();
			media = 0;
			
			System.out.println("Tecle 1 para continuar ou 0 para encerrar!");
			opcao = t.nextInt();
			while(opcao != 1 && opcao != 0) {
				System.err.println("Opção inválida!");
				System.out.println("Tecle \"1\" para continuar ou \"0\" para encerrar!\"");
				opcao = t.nextInt();
			}
		
		}while(opcao == 1);
		System.out.println("Fim!");

	}

}
