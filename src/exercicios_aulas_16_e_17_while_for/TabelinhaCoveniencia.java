package exercicios_aulas_16_e_17_while_for;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TabelinhaCoveniencia {

    public static void main(String[] args) {

//	31 - O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora possui uma loja de conveniências. Faça 
//       um programa que implemente uma caixa registradora rudimentar. O programa deverá receber um número desconhecido de valores 
//       referentes aos preços das mercadorias. Um valor zero deve ser informado pelo operador para indicar o final da compra. O programa 
//       deve então mostrar o total da compra e perguntar o valor em dinheiro que o cliente forneceu, para então calcular e mostrar o valor
//       do troco. Após esta operação, o programa deverá voltar ao ponto inicial, para registrar a próxima compra. A saída deve ser 
//       conforme o exemplo abaixo:
//			Lojas Tabajara 
//			Produto 1: R$ 2.20
//			Produto 2: R$ 5.80
//			Produto 3: R$ 0
//			Total: R$ 9.00
//			Dinheiro: R$ 20.00
//			Troco: R$ 11.00
//			...
        Scanner t = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0,000.00");
        double vTotal = 0, valor;
        int contador = 0;
        List<Double> lista = new ArrayList();
        System.out.println("Informe os valores dos produtos e tecle 0 para finalizar a compra!:\n");
        do {
            System.out.println("Valor do produto " + (contador + 1) + ": [tecle 0 para finalizar a compra]");
            valor = t.nextDouble();
            if (valor != 0) {
                lista.add(valor);
                contador++;
            }

        } while (valor != 0);
        System.out.println("Lojas Tabajara");
        for (int i = 0; i < contador; i++) {
            vTotal += lista.get(i);
            System.out.println("Produto " + (i + 1) + ": R$ " + lista.get(i));

        }
        System.out.printf("Total: R$ %.2f\n", vTotal);
        System.out.println("Informe o valor pago pelo cliente:");
        valor = t.nextDouble();
        double diferenca;
        diferenca = vTotal - valor;

        if (valor < vTotal) {
            System.out.printf("Valor pago em dinheiro R$ %.2f\nFaltam R$ %.2f\n", valor, diferenca);
        } else if (valor == vTotal) {
            System.out.printf("Valor pago em dinheiro R$ %.2f\nTroco R$ %.2f\n", valor, (vTotal - valor));
        } else {
            System.out.printf("Valor pago em dinheiro R$ %.2f\nTroco R$ %.2f\n", valor, (valor - vTotal));
        }

    }

}
