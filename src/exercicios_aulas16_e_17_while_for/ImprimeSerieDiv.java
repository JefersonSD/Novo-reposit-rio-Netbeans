package exercicios_aulas16_e_17_while_for;

import java.util.Scanner;

public class ImprimeSerieDiv {

	public static void main(String[] args) {
        
//      51 - Faça um programa que mostre os n termos da Série a seguir:
//           S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m. 
//	     Imprima no final a soma da série.
		
        Scanner t = new Scanner(System.in);
        System.out.println("Informe o dividendo:");
        float dividendo = t.nextInt();
        float cont = 1;
        float soma = 0;

        for (float i = 1; i <= dividendo; i++) {
            if (cont == 1 && i == 1) {
                System.out.printf("%.0f/%.0f " , i, cont);
                soma += i / cont;
            }

            for (float j = i; j <= i; j++) {
                if (i != 1) {
                    cont += 2;
                    System.out.printf("%.0f/%.0f " , i, cont);
                    soma += i / cont;
                }

            }
            if (i < dividendo) {
                System.out.print("+ ");
            }

        }
  
        System.out.printf("\nSoma: %.2f\n", soma);
    }

}

