package exercicios_aulas16_e_17_while_for;

public class CrescimentoPopulacional {

	public static void main(String[] args) {
		/*
		 * 4 - Supondo que a população de um país A seja da ordem de 80000 habitantes
		 * com uma taxa anual de crescimento de 3% e que a população de B seja 200000
		 * habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule
		 * e escreva o número de anos necessários para que a população do país A
		 * ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
		 */

		int A = 80000;
		int B = 200000, somaB = B;
		int contador = 1;
		for (int i = A; i < somaB; i++) { // Cada loop do for equivale a 1 ano
			if (i != 80000) {
				i--;
			}
			i *= 0.03; // Tamanho populacional Do País A * Crescimento de 3% ao ano.
			A += i;  // Soma do tamanho populacional com a % de crescimento anual do País A.
			i = A; // Igualação da variável de controle i Ao crescimento populacional daquele ano em relação ao País A
			B *= 0.015; //Tamanho populacional Do País B * Crescimento de 1,5 ao ano
			somaB += B; // Soma do tamanho populacional com a % de crescimento anual do País B.
			B = somaB; // Igualação de B ao crescimento populacional relacionado àquele ano.
			contador++;//Contagem de anos
			

		}
		System.out.println("O País \"A\" terá o mesmo número de habitantes do país \"B\" em exatamente: " + contador + " anos!");
	}

}
