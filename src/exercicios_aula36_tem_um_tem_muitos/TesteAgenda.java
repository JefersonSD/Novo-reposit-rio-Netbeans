/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula36_tem_um_tem_muitos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class TesteAgenda {
//    1. Escreva  uma  classe  Agenda,  que  contém  vários  contatos  do  tipo  Contato.   Cada  contato  possui  nome,  
//       telefone  e  email.  A  Agenda  também  possui  um   nome.  Crie  um  programa  teste  que  peça  para  o  usuário  
//       entrar  com  o   nome  da  Agenda  e  em  seguida  3  contatos.  Crie  métodos  que  retornem   uma  String  com  
//       a  informação  de  cada  contato  e  também  de  todos  os   contatos  da  agenda. 

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Agenda agenda = new Agenda();
        List<Contato> listaContatos = new ArrayList();

        System.out.println("Informe o nome da Agenda:");
        agenda.setNome(t.next());
        System.out.println("Informe 3 contatos:");
        for (int i = 0; i < 3; i++) {
            Contato contato = new Contato();
            System.out.println("Informe o nome do " + (i + 1) + "º contato:");
            contato.setNome(t.next());
            System.out.println("Informe o telefone do " + (i + 1) + "º contato:");
            contato.setTelefone(t.next());
            System.out.println("Informe o email do " + (i + 1) + "º contato:");
            contato.setEmail(t.next());
            listaContatos.add(contato);
        }
        int opcao;
        agenda.setContatos(listaContatos);
        do {
            System.out.println("O que deseja fazer a seguir?");
            System.out.println("1 - Consulta geral");
            System.out.println("2 - Consulta específica de um contato");
            System.out.println("3 - Sair da agenda");
            opcao = t.nextInt();
            while (opcao != 1 && opcao != 2 && opcao != 3) {
                System.out.println("Opção inválida!");
                System.out.println("O que deseja fazer a seguir?");
                System.out.println("1 - Consulta geral");
                System.out.println("2 - Consulta específica de um contato");
                System.out.println("3 - Sair da agenda");
                opcao = t.nextInt();
            }
            int cont = 0;
            String nomeContato;
            boolean encontrou = false;
            switch (opcao) {
                case 1:
                    for (Contato c : agenda.getContatos()) {
                        System.out.print(c.getNome() + " ");
                        System.out.print(c.getTelefone() + " ");
                        System.out.print(c.getEmail());
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Informe o nome do contato para pesquisa:");
                    nomeContato = t.next();
                    for (Contato c : agenda.getContatos()) {
                        if (agenda.getContatos().get(cont).getNome().equalsIgnoreCase(nomeContato)) {
                            System.out.print(c.getNome() + " ");
                            System.out.print(c.getTelefone() + " ");
                            System.out.print(c.getEmail());
                            System.out.println();
                            encontrou = true;
                            break;
                        } else {
                            cont++;
                        }
                    }
                    if (!encontrou) {
                        System.out.println("Contato não encontrado!");
                    }
                    cont = 0;
                    break;
            }
        } while (opcao != 3);
        System.out.println("Fim");
    }

}
