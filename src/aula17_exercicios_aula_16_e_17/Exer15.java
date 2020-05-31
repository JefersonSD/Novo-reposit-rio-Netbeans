package aula17_exercicios_aula_16_e_17;

public class Exer15 {

	public static void main(String[] args) {
		// 15 - A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série até o 	termo.
		
		
		int fibonacci = 1, guardaValor = 0;
		System.out.println("Sequência de Fibonnaci:");
		for(int i = -1, j = -2;i<=15; i++,j++) {
			
			if(i == 1) {
				fibonacci += i;	
				guardaValor = fibonacci;
			}
			if(j==1) {
				fibonacci = guardaValor + j;	
				
			}else if (j>1) {
				 
				fibonacci+=guardaValor;
				guardaValor = fibonacci - guardaValor;	
				
			}
			
			System.out.println(fibonacci);
			
		}
		
		

	}

}
