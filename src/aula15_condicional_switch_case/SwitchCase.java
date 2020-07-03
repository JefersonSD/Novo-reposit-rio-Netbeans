package aula15_condicional_switch_case;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("Entre com um dia da semana:");
		int diaSemana = t.nextInt();
		
		
		switch(diaSemana) {
		case 1: System.out.println("Domingo"); break; // o break faz com que a execução seja interrompida.
		case 2: System.out.println("Segunda"); break;
		case 3: System.out.println("Terça"); break;
		case 4: System.out.println("Quarta"); break;
		case 5: System.out.println("Quinta"); break;
		case 6: System.out.println("Sexta"); break;
		case 7: System.out.println("Sábado"); break;
		default: System.out.println("Não é um dia da semana");
		}
		
		//Situação em que o break se faz necessário
		switch(diaSemana) {
	
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: System.out.println("É dia útil"); break;
		case 1: 
		case 7: System.out.println("É fim de semana"); break;
		default: System.out.println("Não é um dia da semana");
		}

	}

}
