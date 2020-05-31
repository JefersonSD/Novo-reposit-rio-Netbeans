package aula17_exercicios_aula_16_e_17;

import java.util.Scanner;

public class Exer36 {

	public static void main(String[] args) {
//		36 - Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será digitado pelo usuário, mas a tabuada não deve 
//			 necessariamente iniciar em 1 e terminar em 10, o valor inicial e final devem ser informados também pelo usuário, conforme exemplo 
//			 abaixo:
//			Montar a tabuada de: 5
//			Começar por: 4
//			Terminar em: 7
//
//			Vou montar a tabuada de 5 começando em 4 e terminando em 7:
//			5 X 4 = 20
//			5 X 5 = 25
//			5 X 6 = 30
//			5 X 7 = 35
//			Obs: Você deve verificar se o usuário não digitou o final menor que o inicial.
		
		Scanner t = new Scanner(System.in);
		int tabuada,nInicio,nFinal;
		System.out.println("Informe o número para fazer a tabuada:");
		tabuada = t.nextInt();
		System.out.println("Informe o 1º número do intevalo:");
		nInicio = t.nextInt();
		System.out.println("Informe o 2º número do intervalo:");
		nFinal = t.nextInt();
		while(nFinal <= nInicio) {
			
			System.out.println("2º intervalo não pode ser menor que o 1º intervalo\nInforme o 2º número do intervalo:");
			nFinal = t.nextInt();
		}
		
		for (int i = nInicio; i <= nFinal; i++) {
			
			System.out.println(tabuada + " X " + i + " = " + tabuada*i);
			
		}
		
	}

}
