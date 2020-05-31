package aula17_exercicios_aula_16_e_17;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		//20 - Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o fatorial várias vezes e limitando o fatorial a números 
		//inteiros positivos e menores que 16.
		
		Scanner t = new Scanner(System.in);
		double inteiro, fatorial;
		String opcao;
		do {
			
			System.out.println("Informe um número inteiro positivo menor que 16 para saber o seu fatorial:");
			inteiro = t.nextDouble();
			while(inteiro%1 != 0 || inteiro < 0 || inteiro >= 16) {
				
				System.out.println("Número inválido. Informe um número inteiro positivo menor que 16:");
				inteiro = t.nextDouble();
				
			}
			fatorial = inteiro;
			
			for(double i = inteiro-1;i <= inteiro && i > 0; i--) {
				
				inteiro *= i;
				
				
			}
			
			 System.out.println("Fatorial de "+ fatorial + " é igual a: " +inteiro);
			
			System.out.println("Deseja calcular o fatorial novamente: (s/n)");
			 opcao = t.next();
			 while(!opcao.equalsIgnoreCase("s") && !opcao.equalsIgnoreCase("n")) {
				 
				 System.out.println("Opção inválida. Digite \"s\" para sim ou \"n\" para não:");
				 opcao = t.next();
				 
			 }
			 
			
			
		}while(opcao.equalsIgnoreCase("s"));
	
			System.err.println("Fim ☻");
	}

}
