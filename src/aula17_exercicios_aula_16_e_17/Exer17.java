package aula17_exercicios_aula_16_e_17;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		// 17 - Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
		
		Scanner t = new Scanner(System.in);
		int inteiro;
		System.out.println("Informe um número inteiro para saber o seu fatorial:");
		inteiro = t.nextInt();
		int fatorial = inteiro;
		
		for(int i = inteiro-1;i <= inteiro && i > 0; i--) {
			
			inteiro *= i;
			
			
		}
		
		System.out.println("Fatorial de "+ fatorial + " é igual a: " +inteiro);
		

	}

}
