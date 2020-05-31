package aula17_exercicios_aula_16_e_17;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
//		3 -Faça um programa que leia e valide as seguintes informações:
//			♦ - Nome: maior que 3 caracteres;
//			♦ - Idade: entre 0 e 150;
//			♦ - Salário: maior que zero;
//			♦ - Sexo: 'f' ou 'm';
//			♦ - Estado Civil: 's', 'c', 'v', 'd';

		Scanner t = new Scanner(System.in);
		boolean filtro, no, id, sa, se, es = true;
		filtro = no = id = sa = se = es;
		int count = 0, idade = 0;
		String nome = "", sexo = "", EstCivil = "";
		double salario = 0.0;

		do {

			if (no != true || count == 0) {
				if (count != 0) {
					System.out.println(" Informe um nome com até 3 caracteres:");
				} else {
					System.out.println(" Informe um nome com até 3 caracteres:");
				}
				nome = t.next();
				no = true;
				if (nome.length() > 3) {
					no = false;
				}
			}
			if (id != true || count == 0) {
				if (count != 0) {
					System.out.println(" Informe uma idade entre 0 e 150:");
				} else {
					System.out.println(" Informe uma idade entre 0 e 150:");
				}
				idade = t.nextInt();
				id = true;
				if (idade < 0 || idade > 150) {
					id = false;
				}
			}
			if (sa != true || count == 0) {
				if (count != 0) {
					System.out.println(" Informe um salário maior que 0:");
				} else {
					System.out.println(" Informe um salário maior que 0:");
				}
				salario = t.nextDouble();
				sa = true;
				if (salario < 0) {
					sa = false;
				}
			}
			if (se != true || count == 0) {
				if (count != 0) {
					System.out.println(" Informe o sexo \"f\" ou \"m\":");
				} else {
					System.out.println(" Informe o sexo \"f\" ou \"m\":");
				}
				sexo = t.next();
				se = true;
				if (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
					se = false;
				}

			}
			if (es != true || count == 0) {
				if (count != 0) {
					System.out.println(" Informe o Estado Civil Digite: ('s' ou 'c' ou 'v' ou 'd')");
				} else {
					System.out.println(" Informe o Estado Civil Digite: ('s' ou 'c' ou 'v' ou 'd')");
				}
				EstCivil = t.next();
				es = true;
				if (!EstCivil.equalsIgnoreCase("s") && !EstCivil.equalsIgnoreCase("c")
						&& !EstCivil.equalsIgnoreCase("v") && !EstCivil.equalsIgnoreCase("d")) {
					es = false;
				}

			}

			if (no == false || id == false || sa == false || se == false || es == false) {
				System.out.println("Os dados abaixo estão incorretos. Preencha conforme as orientações:");
				if(no == false ) {
					System.out.println("Nome");
				}if(id == false ) {
					System.out.println("Idade");
				}if(sa == false) {
					System.out.println("Salário");
				}if(se == false ) {
					System.out.println("Sexo");
				}if(es == false ) {
					System.out.println("Estado Civil");
				}

			}

			count++;

		} while (no != true || id != true || sa != true || se != true || es != true);

		System.out.println("Nome: [" + nome + "]");
		System.out.println("Idade: [" + idade + "]");
		System.out.println("Salário: [" + salario + "]");
		System.out.println("Sexo: [" + sexo + "]");
		System.out.println("Estado: [" + EstCivil + "]");

	}

}

