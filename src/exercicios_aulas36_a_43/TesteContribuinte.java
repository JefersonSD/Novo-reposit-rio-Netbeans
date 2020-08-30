/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aulas36_a_43;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class TesteContribuinte {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        List<Contribuinte> listaContribuintes = new ArrayList();
        int opcao, contadorPf = 0, contadorPj = 0;
        Contribuinte contribuinte = new Contribuinte();
        

        System.out.println("Cadastro de contribuintes:");
        System.out.println("Cadastre 3 contribuinte PJ e 3 contribuintes PF");
        do {
            if (contadorPf < 3 && contadorPj < 3) {
                System.out.println("Informe o tipo de contribuinte:\n1 - Pessoa Física\n2 - Pessoa Jurídica");
                opcao = t.nextInt();
                validaEntrada(opcao, t);
            } else if (contadorPf < 3 && contadorPj == 3) {
                System.out.println("Cadastro obrigatório de contribuinte pessoa Física");
                opcao = 1;
            } else {
                System.out.println("Cadastro obrigatório de contribuinte pessoa Jurídica");
                opcao = 2;
            }
            switch (opcao) {
                case 1:
                    contadorPf++;
                    PessoaFisica PF = new PessoaFisica();
                    PF.setTipoContribuinte("Pessoa Física");
                    System.out.println("Informe o nome do contribuinte:");
                    PF.setNome(t.next());
                    System.out.println("Informe o salário bruto do contribuinte:");
                    PF.setRendaBruta(t.nextDouble());
                    listaContribuintes.add(PF);
                    break;
                case 2:
                    contadorPj++;
                    PessoaJuridica PJ = new PessoaJuridica();
                    PJ.setTipoContribuinte("Pessoa Jurídica");
                    System.out.println("Informe o nome do contribuinte:");
                    PJ.setNome(t.next());
                    System.out.println("Informe a renda bruta da empresa:");
                    PJ.setRendaBruta(t.nextDouble());
                    listaContribuintes.add(PJ);
                    break;
            }
        } while (contadorPf < 3 || contadorPj < 3);
        contribuinte.setLista(listaContribuintes);
        for (Contribuinte c : contribuinte.getLista()) {
            if (c.getTipoContribuinte().equalsIgnoreCase("Pessoa Jurídica")) {
                System.out.println(c);
                System.out.printf("Imposto a ser pago: R$%.2f\n\n", c.calculoImpostoIr(10));
            } else if (c.getRendaBruta() < 1400.01) {
                System.out.println(c);
                System.out.println("Imposto a ser pago: R$ 0,00 \n ");
            } else if (c.getRendaBruta() >= 1400.01 && c.getRendaBruta() <= 2100) {
                System.out.println(c);
                System.out.printf("Imposto a ser pago: R$%.2f\n\n", c.calculoImpostoIr(10,100));
            } else if (c.getRendaBruta() >= 2100.01 && c.getRendaBruta() <= 2800) {
                System.out.println(c);
                System.out.printf("Imposto a ser pago: R$%.2f\n\n", c.calculoImpostoIr(15,270));
            } else if (c.getRendaBruta() >= 2800.01 && c.getRendaBruta() <= 3600) {
                System.out.println(c);
                System.out.printf("Imposto a ser pago: R$%.2f\n\n", c.calculoImpostoIr(25,500));
            } else if (c.getRendaBruta() > 3600.01) {
                System.out.println(c);
                System.out.printf("Imposto a ser pago: R$%.2f\n\n", c.calculoImpostoIr(30,700));
            }
        }
    }

    static int validaEntrada(int opcao, Scanner s) {

        return Contribuinte.validaEntrada(opcao, s);
    }

}
