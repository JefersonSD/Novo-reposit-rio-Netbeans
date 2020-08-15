package exercicios_aulas16_e_17_while_for;

import java.util.Scanner;

public class InputCrescPop {

    public static void main(String[] args) {
        /*
		 * 5 - Altere o programa anterior permitindo ao usuário informar as populações e as
		 * taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.
         */
        Scanner t = new Scanner(System.in);
        double paisA, paisB, crescimentoA, crescimentoB, aumentoA , aumentoB;
        int contador = 0;
        String opcao;
        System.out.println("Informe o tamanho populacional de dois Países \"A\" e \"B\" e as respectivas taxas de crescimento ao ano "
                + "para saber em\nquanto tempo o País com menor população alcançara o País de Maior população em relação a "
                + "quantidade de habitantes:\n ");

        do {
            System.out.println("Informe o tamanho populacional do País \"A\": ");
            paisA = t.nextDouble();
            System.out.println("Informe a porcentagem de crescimento anual em relação ao País \"A\": ");
            crescimentoA = t.nextDouble();
            System.out.println("Informe o tamanho populacional do País \"B\": ");
            paisB = t.nextDouble();
            System.out.println("Informe a porcentagem de crescimento anual em relação ao País \"B\": ");
            crescimentoB = t.nextDouble();
            if (paisA < 0 || paisB < 0 || paisA == paisB || crescimentoA <= 0 || crescimentoB <= 0 || crescimentoA == crescimentoB) {
                System.err.println("Valor inválido\n\t ♦ Regras:\n");
                System.out.println("Os Países A e B não podem ter populações menores que 0.");
                System.out.println("Os Países A e B não podem ter populações de tamanhos iguais.");
                System.out.println("O crescimento dos Países A e B não pode ser menor ou igual a 0");
                System.out.println("O crescimento dos Países A e B não pode ser igual");
            } else {

                if (paisA < paisB) {
                    while (crescimentoA <= crescimentoB) {
                        System.err.println("A porcentagem de crescimento populacional do País com menor número de habitantes tem que ser "
                                + "maior do que a do país\ncom maior número de habitantes\nTaxa de crescimento anual do País A: "
                                + crescimentoA + "%\nInforme novamente a porcentagem de crescimento do País B:");
                        crescimentoB = t.nextDouble();
                    }

                    while (paisA < paisB) {

                        aumentoA = (paisA / 100) * crescimentoA;
                        aumentoB = (paisB / 100) * crescimentoB;
                        paisA += aumentoA;
                        paisB += aumentoB;
                        contador++;
                    }

                    System.out.println("O País \"A\" terá o mesmo número de habitantes do país \"B\" em exatamente: " + contador + " anos!");

                } else {
                    while (crescimentoB <= crescimentoA) {
                        System.err.println("A porcentagem de crescimento populacional do país com menor número de habitantes tem que ser "
                                + "maior do que  a do país\ncom maior número de habitantes\nTaxa de crescimento anual do País A: "
                                + crescimentoA + "%\nInforme novamente a porcentagem de crescimento do País B:");
                        crescimentoB = t.nextDouble();
                    }

                    while (paisB < paisA) {

                        aumentoA = (paisA / 100) * crescimentoA;
                        aumentoB = (paisB / 100) * crescimentoB;
                        paisA += aumentoA;
                        paisB += aumentoB;
                        contador++;
                    }

                    System.out.println("O País \"B\" terá o mesmo número de habitantes do país \"A\" em exatamente: " + contador + " anos!");
                }

            }
            System.out.println("Deseja refazer o cálculo a partir de outros dados?: (S/N)");
            opcao = t.next();
            contador = 0;
        } while (!opcao.equalsIgnoreCase("N"));

        System.out.println("Fim!");
    }

}
