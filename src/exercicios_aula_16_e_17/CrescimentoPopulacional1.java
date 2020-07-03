package exercicios_aula_16_e_17;

public class CrescimentoPopulacional1 {

	public static void main(String[] args) {

		long A = 80000;
		long B = 200000;
		int anos = 0;

		while (A < B) {

			A += A * 0.03;
			B += B * 0.015;
			anos++;
			
		}
		System.out.println("O País \"A\" terá o mesmo número de habitantes do país \"B\" em exatamente: " + anos + " anos!");

	}

}
