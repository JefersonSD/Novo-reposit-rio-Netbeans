package exercicios_aulas_16_e_17_while_for;

import java.util.Scanner;

public class ValidaAtributos {

    public static void main(String[] args) {
//		3 -Faça um programa que leia e valide as seguintes informações:
//			♦ - Nome: maior que 3 caracteres;
//			♦ - Idade: entre 0 e 150;
//			♦ - Salário: maior que zero;
//			♦ - Sexo: 'f' ou 'm';
//			♦ - Estado Civil: 's', 'c', 'v', 'd';

        Scanner t = new Scanner(System.in);
        boolean nome_, idade_, salario_, sexo_, estadoCivil = true;
        nome_ = idade_ = salario_ = sexo_ = estadoCivil;
        int count = 0, idade = 0;
        String nome = "", sexo = "", EstCivil = "";
        double salario = 0.0;

        do {

            if (nome_ != true || count == 0) {

                System.out.println(" Informe um nome com mais de 3 caracteres:");
                nome = t.next();
                nome_ = true;
                if (nome.length() <= 3) {
                    nome_ = false;
                }
            }
            if (idade_ != true || count == 0) {

                System.out.println(" Informe uma idade entre 0 e 150:");
                idade = t.nextInt();
                idade_ = true;
                if (idade < 0 || idade > 150) {
                    idade_ = false;
                }
            }
            if (salario_ != true || count == 0) {

                System.out.println(" Informe um salário maior que 0:");
                salario = t.nextDouble();
                salario_ = true;
                if (salario < 0) {
                    salario_ = false;
                }
            }
            if (sexo_ != true || count == 0) {

                System.out.println(" Informe o sexo \"f\" ou \"m\":");
                sexo = t.next();
                sexo_ = true;
                if (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
                    sexo_ = false;
                }

            }
            if (estadoCivil != true || count == 0) {

                System.out.println(" Informe o Estado Civil Digite: ('s' ou 'c' ou 'v' ou 'd')");
                EstCivil = t.next();
                estadoCivil = true;
                if (!EstCivil.equalsIgnoreCase("s") && !EstCivil.equalsIgnoreCase("c")
                        && !EstCivil.equalsIgnoreCase("v") && !EstCivil.equalsIgnoreCase("d")) {
                    estadoCivil = false;
                }

            }

            if (nome_ == false || idade_ == false || salario_ == false || sexo_ == false || estadoCivil == false) {
                System.out.println("Os dados abaixo estão incorretos. Preencha conforme as orientações:");
                if (nome_ == false) {
                    System.out.println("Nome");
                }
                if (idade_ == false) {
                    System.out.println("Idade");
                }
                if (salario_ == false) {
                    System.out.println("Salário");
                }
                if (sexo_ == false) {
                    System.out.println("Sexo");
                }
                if (estadoCivil == false) {
                    System.out.println("Estado Civil");
                }

            }

            count++;

        } while (nome_ != true || idade_ != true || salario_ != true || sexo_ != true || estadoCivil != true);

        System.out.println("Nome: [" + nome + "]");
        System.out.println("Idade: [" + idade + "]");
        System.out.println("Salário: [" + salario + "]");
        System.out.println("Sexo: [" + sexo + "]");
        System.out.println("Estado: [" + EstCivil + "]");

    }

}
