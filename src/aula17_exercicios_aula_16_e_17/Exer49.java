package aula17_exercicios_aula_16_e_17;

public class Exer49 {

	public static void main(String[] args) {

//		49 - Faça um programa que mostre os n termos da Série a seguir:
//			  S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m. 
//			Imprima no final a soma da série.

		int dividendo = 10;
		int cont = 1;
		double soma = 0;

		for (int i = 1; i <= dividendo; i++) {
			if (cont == 1 && i == 1) {
				System.out.print(i + "/" + cont + " ");
				soma += i/cont;
			}

			for (int j = i; j <= i; j++) {
				if (i != 1) {
					cont += 2;
					System.out.print(i + "/" + cont + " ");
					soma += i/cont;
				}

			}
			if(i < 10) {
				System.out.print("+ ");
			}
			
		}
		// No momento a IDE está apresentando problemas para realizar divisões. Não é possível dividir numeros maiores 
		// por menores e não são aceitos valores de divisão .flutuante.
		// Por exemplo:
		// Se eu dividir 3/2 que é igual a 1,5 e tentar guardar em uma variável double ou float só é guardado o número 
		// inteiro nesse caso 1. E se a divisão for de um número menor por um maior o valor guardado é 0.
		// Por esse motivo para a soma desse exercício o valor está incorreto.
		System.out.println("\nSoma: " + soma );
	}

}
