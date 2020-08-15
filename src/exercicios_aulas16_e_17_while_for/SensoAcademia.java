package exercicios_aulas16_e_17_while_for;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SensoAcademia {

    public static void main(String[] args) {
        /*
		 * 37 - Uma academia deseja fazer um senso entre seus clientes para descobrir o
		 * mais alto, o mais baixo, a mais gordo e o mais magro, para isto você deve
		 * fazer um programa que pergunte a cada um dos clientes da academia seu código,
		 * sua altura e seu peso. O final da digitação de dados deve ser dada quando o
		 * usuário digitar 0 (zero) no campo código. Ao encerrar o programa também deve
		 * ser informados os códigos e valores do clente mais alto, do mais baixo, do
		 * mais gordo e do mais magro, além da média das alturas e dos pesos dos
		 * clientes
         */

        Scanner t = new Scanner(System.in);
        List<Double> lista = new ArrayList();
        double mediaAltura = 0, mediaPeso = 0, altura, peso;
        double contador = 0, maiorPeso = 0, menorPeso = 0, maiorAltura = 0, menorAltura = 0;
        double cod1 = 0, cod2 = 0, cod3 = 0, cod4 = 0, codigo;
        boolean verifica = true;
        do {
            System.out.println("Informe o seu código:  [para encerrar a entrada de dados digite 0]");
            codigo = t.nextInt();
            if (codigo != 0) {
                contador++;
                for (int i = 0; i < lista.size(); i++) {
                    verifica = true;
                    if (lista.contains(codigo) && contador > 1) {
                        while (lista.contains(codigo)) {
                            System.out.println("Código já existe! Informe outro código:");
                            codigo = t.nextInt();
                        }
                        lista.add(codigo);
                        verifica = false;
                        break;
                    }
                }
                if (contador == 1 || verifica == true) {
                    lista.add(codigo);
                }
                System.out.println("Informe a sua altura:");
                altura = t.nextDouble();
                System.out.println("Informe o seu peso:");
                peso = t.nextDouble();
                if (contador == 1) {
                    menorAltura = altura;
                    menorPeso = peso;
                    cod2 = codigo;
                    cod4 = codigo;
                }

                if (altura > maiorAltura) {
                    maiorAltura = altura;
                    cod1 = codigo;
                }
                if (altura < menorAltura) {
                    menorAltura = altura;
                    cod2 = codigo;
                }
                if (peso > maiorPeso) {
                    maiorPeso = peso;
                    cod3 = codigo;
                }
                if (peso < menorPeso) {
                    menorPeso = peso;
                    cod4 = codigo;
                }

                mediaAltura += altura;
                mediaPeso += peso;

            }

        } while (codigo != 0);

        System.out.printf("Cliente mais alto:\nCódigo do cliente: %.0f\nAltura: %.2f metros\n", cod1, maiorAltura);
        System.out.printf("Cliente mais baixo:\nCódigo do cliente: %.0f\nAltura: %.2f metros\n", cod2, menorAltura);
        System.out.printf("Cliente mais gordo:\nCódigo do cliente: %.0f\nPeso: %.2f Kg\n", cod3, maiorPeso);
        System.out.printf("Cliente mais magro:\nCódigo do cliente: %.0f\nPeso: %.2f Kg\n", cod4, menorPeso);
        System.out.printf("Média de altura dos clientes: %.2f metros\n", (mediaAltura / contador));
        System.out.printf("Média de peso dos clientes: %.2f Kg\n", (mediaPeso / contador));

    }

}
