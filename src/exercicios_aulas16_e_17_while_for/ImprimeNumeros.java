package exercicios_aulas16_e_17_while_for;

public class ImprimeNumeros {

	public static void main(String[] args) {
		/*
		 * 6 - Faça um programa que imprima na tela os números de 1 a 20, um abaixo do
		 * outro. Depois modifique o programa para que ele mostre os números um ao lado
		 * do outro.
		 */
		
		for(int i = 0;i <=20; i++) {
			
			//System.out.println(i);// lista
			System.out.print("[" + i + "]" ); // lado a lado
			
		}
                System.out.println();
	}

}