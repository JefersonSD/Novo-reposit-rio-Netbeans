package aula13;

public class operadoresAritmeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		resultado = resultado - 1; // resultado =- 1
		System.out.println(resultado);
		resultado = resultado * 1; // resultado =* 1
		System.out.println(resultado);
		resultado = resultado /2; // resultado =/ 2
		System.out.println(resultado);
		resultado = resultado + 8;
		System.out.println(resultado);
		resultado = resultado % 7;
		System.out.println(resultado);
		
		//Concatenação de Strings
		
		/*
		 * String primeiroNome = "Esta é "; String segundoNome =
		 * "uma String concatenada."; String terceiroNome = primeiroNome + segundoNome;
		 * System.out.println(terceiroNome);
		 */
		 
		// Incrementos "++" e "--"
		
		//resultado tem valor 2
		System.out.println(++resultado); // Nesse caso o resultado é incrementado antes de imprimir.
		System.out.println(resultado++); // Nesse caso não.
	}	

}
