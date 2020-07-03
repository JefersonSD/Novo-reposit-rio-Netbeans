package exercicios_aula_19;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class AprovadoReprovado {

    public static void main(String[] args) {
//        19.Ler as duas notas bimestrais para um conjunto de 10 alunos. Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” 
//        do tipo real. Escreva um programa que calcule a média aritmética simples das notas informadas armazenando o resultado em um vetor
//        “Result” de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação de cada aluno. Se a média calculada for superior ou 
//        igual a 7 o aluno estará “aprovado”, caso contrário, a situação do aluno será “reprovado”.

        Scanner t = new Scanner(System.in);
        double[] notas1 = new double[10];
        double[] notas2 = new double[notas1.length];
        double[] results = new double[notas2.length];
        int contador = 1;
        for (int i = 0; i < notas1.length; i++) {
            System.out.println("Informe a " + (contador) + "ª nota do " + (i + 1) + "º aluno:");
            notas1[i] = t.nextDouble();
            for (int j = i; j <= i; j++) {
                System.out.println("Informe a " + (contador + 1) + "ª nota do " + (i + 1) + "º aluno:");
                notas2[i] = t.nextDouble();
            }
        }
        for (int i = 0; i < results.length; i++) {
            results[i] = (notas1[i] + notas2[i]) / 2;
            System.out.print("Média do " + (i + 1) + "º Aluno: ");
            System.out.printf("%.2f\n", results[i]);
            System.out.print("Status: ");
            if (results[i] >= 7) {
                System.out.println("Aprovado!");
            } else {
                System.out.println("Reprovado!");
            }
        }
    }

}
