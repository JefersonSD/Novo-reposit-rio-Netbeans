package exercicios_aula_16_e_17;

import java.util.Scanner;

public class GeradorDeTabuada {

    public static void main(String[] args) {
//		12 - Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele 
//		deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
//			Tabuada de 5:
//			5 X 1 = 5
//			5 X 2 = 10
//			...
//			5 X 10 = 50

        Scanner t = new Scanner(System.in);
        int numero;
        System.out.println("Informe um número entre 1 e 10: ");
        numero = t.nextInt();
        while(numero <= 0 || numero >10){
            if(numero <= 0 ){
                System.out.println("Número não pode ser menor ou igual a 0. Informe novamente:");
                numero = t.nextInt();
            }else{
                 System.out.println("Número não pode ser maior que 10. Informe novamente:");
                 numero = t.nextInt();
            }
           
        }
        for (int i = 1; i <= 10; i++) {

            System.out.println(numero + " X " + i + " = " + numero * i);
        }

    }

}
