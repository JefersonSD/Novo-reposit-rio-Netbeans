package aula17_exercicios_aula_16_e_17;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exer43 {

    public static void main(String[] args) {
//		43 - O cardápio de uma lanchonete é o seguinte:
//		
//				Especificação   Código  Preço
//				Cachorro Quente 100     R$ 1,20
//				Bauru Simples   101     R$ 1,30
//				Bauru com ovo   102     R$ 1,50
//				Hambúrguer      103     R$ 1,20
//				Cheeseburguer   104     R$ 1,30
//				Refrigerante    105     R$ 1,00
//		
//				Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. Calcule e mostre o valor
//                              a ser pago por item (preço * quantidade) e o total geral do pedido. Considere que o cliente deve informar
//                              quando o pedido deve ser encerrado.	

        Scanner t = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("00.00");
        int codigo, cod1 = 0, cod2 = 0, cod3 = 0, cod4 = 0, cod5 = 0, cod6 = 0, quantidade;
        int quant1 = 0, quant2 = 0, quant3 = 0, quant4 = 0, quant5 = 0, quant6 = 0;
        double valor1 = 1.20, valor2 = 1.30, valor3 = 1.50, valor4 = 1.20, valor5 = 1.30, valor6 = 1;
        double valorTotal = 0;
        String opcao;
        boolean verifica1, verifica2, verifica3, verifica4, verifica5, verifica6 = false;
        verifica1 = verifica2 = verifica3 = verifica4 = verifica5 = verifica6;
        do {
            System.out.println("informe o código do produto que deseja:");
            System.out.println("Especificação   Código   Preço\nCachorro Quente  100    R$ 1,20\nBauru Simples   "
                    + " 101    R$ 1,30\nBauru com ovo    102    R$ 1,50\nHambúrguer       103    R$ "
                    + "1,20\nCheeseburguer    104    R$ 1,30\nRefrigerante     105    R$ 1,00");
            codigo = t.nextInt();
            while (codigo != 100 && codigo != 101 && codigo != 102 && codigo != 103 && codigo != 104 && codigo != 105) {
                System.err.println("Código inválido! ");
                System.out.println("informe o código do produto que deseja:");
                System.out.println("Especificação   Código   Preço\nCachorro Quente  100    R$ 1,20\nBauru Simples   "
                        + " 101    R$ 1,30\nBauru com ovo    102    R$ 1,50\nHambúrguer       103    R$ "
                        + "1,20\nCheeseburguer    104    R$ 1,30\nRefrigerante     105    R$ 1,00");
                codigo = t.nextInt();
            }
            System.out.println("informe a quantidade:");
            quantidade = t.nextInt();
            switch (codigo) {
                case 100:
                    if (verifica1 == false) {
                        valor1 *= quantidade;
                        cod1 = codigo;
                        quant1 += quantidade;
                        verifica1 = true;
                    } else {
                        valor1 += quantidade * 1.20;
                        quant1 += quantidade;
                    }
                    break;
                case 101:
                    if (verifica2 == false) {
                        valor2 *= quantidade;
                        cod2 = codigo;
                        quant2 += quantidade;
                        verifica2 = true;
                    } else {
                        valor2 += quantidade * 1.30;
                        quant2 += quantidade;
                    }
                    break;
                case 102:
                    if (verifica3 == false) {
                        valor3 *= quantidade;
                        cod3 = codigo;
                        quant3 += quantidade;
                        verifica3 = true;
                    } else {
                        valor3 += quantidade * 1.50;
                        quant3 += quantidade;
                    }
                    break;
                case 103:
                    if (verifica4 == false) {
                        valor4 *= quantidade;
                        cod4 = codigo;
                        quant4 += quantidade;
                        verifica4 = true;
                    } else {
                        valor4 += quantidade * 1.20;
                        quant4 += quantidade;
                    }
                    break;
                case 104:
                    if (verifica5 == false) {
                        valor5 *= quantidade;
                        cod5 = codigo;
                        quant5 += quantidade;
                        verifica5 = true;
                    } else {
                        valor5 += quantidade * 1.30;
                        quant5 += quantidade;
                    }
                    break;
                case 105:
                    if (verifica6 == false) {
                        valor6 *= quantidade;
                        cod6 = codigo;
                        quant6 += quantidade;
                        verifica6 = true;
                    } else {
                        valor6 += quantidade * 1.00;
                        quant6 += quantidade;
                    }
                    break;

            }

            System.out.println("Deseja realizar mais pedidos? (s/n):");
            opcao = t.next();
            while (!opcao.equalsIgnoreCase("s") && !opcao.equalsIgnoreCase("n")) {
                System.err.println("Caractere inválido: Digite \"s\" para sim  ou \"n\" para não:");
                opcao = t.next();
            }

        } while (opcao.equalsIgnoreCase("s"));

        System.out.println("\tLanchonete + sabor ☺");

        if (verifica1 == true) {
            System.out.println("Código do produto " + cod1 + " \n " + quant1 + " X Cachorro Quente(1,20)  R$ " + f.format(valor1));
            valorTotal += valor1;
        }
        if (verifica2 == true) {
            System.out.println("Código do produto " + cod2 + " \n " + quant2 + " X Bauru Simples(1,30)    R$ " + f.format(valor2));
            valorTotal += valor2;
        }
        if (verifica3 == true) {
            System.out.println("Código do produto " + cod3 + " \n " + quant3 + " X Bauru com ovo(1,50)    R$ " + f.format(valor3));
            valorTotal += valor3;
        }
        if (verifica4 == true) {
            System.out.println("Código do produto " + cod4 + " \n " + quant4 + " X Hambúrguer(1,20)       R$ " + f.format(valor4));
            valorTotal += valor4;
        }
        if (verifica5 == true) {
            System.out.println("Código do produto " + cod5 + " \n " + quant5 + " X Cheeseburguer(1,30)    R$ " + f.format(valor5));
            valorTotal += valor5;
        }
        if (verifica6 == true) {
            System.out.println("Código do produto " + cod6 + " \n " + quant6 + " X Refrigerante(1,00)     R$ " + f.format(valor6));
            valorTotal += valor6;
        }
        System.out.printf("Valor total: %.2f\n", valorTotal);

    }

}
