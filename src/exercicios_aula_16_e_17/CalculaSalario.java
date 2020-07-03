package exercicios_aula_16_e_17;

import java.util.Calendar;

public class CalculaSalario {

    public static void main(String[] args) {
//		38 - Um funcionário de uma empresa recebe aumento salarial anualmente: Sabe-se que:
//			a - Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
//			b - Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
//			c - A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao dobro 
//				do percentual do ano anterior. Faça um programa que determine o salário atual desse 
//				funcionário. Após concluir isto, altere o programa permitindo que o usuário digite 
//				o salário inicial do funcionário.

        double salario = 1000;
        Calendar hoje = Calendar.getInstance();
        int ano = hoje.get(Calendar.YEAR);
        for (double i = 1995; i <= ano; i++) {

            if (i == 1996) {
                salario += (salario / 100) * 1.5;
                System.out.printf("Salário com aumento no ano de %.0f : %.2f\n", i, salario);
            } else if (i > 1996) {
                salario += (salario / 100) * (2 * 1.5);

            }

        }
        System.out.printf("Salário atual do funcionário: %.2f\n", salario);

    }

}
