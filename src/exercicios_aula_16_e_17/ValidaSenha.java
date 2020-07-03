package exercicios_aula_16_e_17;

import java.util.Scanner;

public class ValidaSenha {

	public static void main(String[] args) {
		/*
		 * 2 - Faça um programa que leia um nome de usuário e a sua senha e não aceite a
		 * senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a
		 * pedir as informações.
		 */
		

		Scanner t = new Scanner(System.in);
		System.out.println("Informe um nome de usuário:");
		String nome = t.next();
		System.out.println("Informe uma senha:");
		String senha = t.next();
		
		while(senha.equalsIgnoreCase(nome)) {
			
			System.err.println("Senha não pode ser igual ao nome do usuário ");
//			System.out.println("Informe um nome de usuário:");
//			nome = t.next();
			System.out.println("Informe uma senha:");
			senha = t.next();
		}
		System.out.println("Sucesso!");
	}

}
