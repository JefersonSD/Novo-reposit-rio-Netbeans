package aula17_exercicios_aula_16_e_17;

public class Exer16 {

    public static void main(String[] args) {
        // 16 - A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até que 
        // o valor seja maior que 500.

        int fibonacci = 1, guardaValor = 0;
        System.out.println("Sequência de Fibonnaci:");
        for (int i = -1, j = -2; i <= 13; i++, j++) {

            if (i == 1) {
                fibonacci += i;
                guardaValor = fibonacci;
            }
            if (j == 1) {
                fibonacci = guardaValor + j;

            } else if (j > 1) {

                fibonacci += guardaValor;
                guardaValor = fibonacci - guardaValor;

            }
  
            System.out.println(fibonacci);
        }

    }

}
