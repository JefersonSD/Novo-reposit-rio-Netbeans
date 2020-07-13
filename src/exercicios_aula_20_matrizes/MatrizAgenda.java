/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula_20_matrizes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class MatrizAgenda {

    public static void main(String[] args) {

//        4. Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal. Cada dia do mês deve conter 24 horas, 
//           onde para cada uma destas podemos associar um tarefa específica (compromisso agendado). O programa deve ter um 
//           menu onde o usuário indica o dia do mês que deseja alterar e a hora, entrando em seguida com o compromisso, ou então, o 
//           usuário pode também consultar a agenda, fornecendo o dia e a hora para obter o compromisso armazenado.
        Scanner t = new Scanner(System.in);
        String[][] agenda = new String[32][24];
        List<String> consulta = new ArrayList();
        int opcao;
        String opcao1, compromisso;
        int diaMes = 0, hora = 0;
        System.out.println("Seja bem vindo a sua agenda de compromissos!");
        do {
            System.out.println("O que deseja fazer a seguir:");
            System.out.println("1 - Agendar um compromisso");
            System.out.println("2 - Alterar um compromisso");
            System.out.println("3 - Excluir um compromisso");
            System.out.println("4 - Consultar um compromisso");
            System.out.println("5 - Sair da agenda");
            opcao = t.nextInt();
            while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5) {
                System.out.println("Opção inválida!");
                System.out.println("O que deseja fazer a seguir:");
                System.out.println("1 - Agendar um compromisso");
                System.out.println("2 - Alterar um compromisso");
                System.out.println("3 - Excluir um compromisso");
                System.out.println("4 - Consultar um compromisso");
                System.out.println("5 - Sair da agenda");
                opcao = t.nextInt();
            }
            switch (opcao) {
                case 1:
                    System.out.println("Escolha o dia do mês para fazer o agendamento (1 a 31):");
                    diaMes = t.nextInt();
                    while (diaMes < 1 || diaMes > 31) {
                        System.out.println("Dia inválido!");
                        System.out.println("Escolha o dia do mês para fazer o agendamento (1 a 31):");
                        diaMes = t.nextInt();
                    }
                    System.out.println("Escolha o horário para o agendamento:");
                    hora = t.nextInt();
                    if (agenda[diaMes][hora] == null) {
                        System.out.println("Informe o compromisso:");
                        compromisso = t.next();
                        agenda[diaMes][hora] = compromisso;
                        consulta.clear();
                        for (String[] vetor : agenda) {
                            for (String valores : vetor) {
                                if (valores != null) {
                                    consulta.add(valores);
                                }
                            }
                        }
                        System.out.println("Compromisso registrado com sucesso!");
                    } else {
                        System.out.println("Já existe compromisso para essa data e hora!");
                    }

                    break;
                case 2:
                    System.out.println("Escolha o dia do mês que deseja fazer a alteração (1 a 31):");
                    diaMes = t.nextInt();
                    while (diaMes < 1 || diaMes > 31) {
                        System.out.println("Dia inválido!");
                        System.out.println("Escolha o dia do mês para fazer o agendamento (1 a 31):");
                        diaMes = t.nextInt();
                    }
                    System.out.println("Escolha o horário em que deseja fazer a alteração:");
                    hora = t.nextInt();
                    if (agenda[diaMes][hora] == null) {
                        System.out.println("Não existe agendamento para alteração na data e horário informados!");
                    } else {
                        System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                        System.out.println("\"" + agenda[diaMes][hora] + "\"");
                        System.out.println("Deseja prosseguir com a alteração? (s/n)");
                        opcao1 = t.next();
                        while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                            System.out.println("Opção inválida");
                            System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                            opcao1 = t.next();
                        }
                        if (opcao1.equalsIgnoreCase("s")) {
                            System.out.println("Insira a alteração:");
                            agenda[diaMes][hora] = t.next();
                            System.out.println("Alteração realizada com sucesso!");
                        }
                        consulta.clear();
                        for (String[] vetor : agenda) {
                            for (String valores : vetor) {
                                if (valores != null) {
                                    consulta.add(valores);
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Escolha o dia do mês que deseja fazer a exclusão do compromisso (1 a 31):");
                    diaMes = t.nextInt();
                    while (diaMes < 1 || diaMes > 31) {
                        System.out.println("Dia inválido!");
                        System.out.println("Escolha o dia do mês para fazer o agendamento (1 a 31):");
                        diaMes = t.nextInt();
                    }
                    System.out.println("Escolha o horário em que deseja fazer a exclusão:");
                    hora = t.nextInt();
                    if (agenda[diaMes][hora] == null) {
                        System.out.println("Não existe agendamento para exclusão na data e horário informados!");
                    } else {
                        System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                        System.out.println("\"" + agenda[diaMes][hora] + "\"");
                        System.out.println("Deseja prosseguir com a exclusão? (s/n)");
                        opcao1 = t.next();
                        while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                            System.out.println("Opção inválida");
                            System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                            opcao1 = t.next();
                        }
                        if (opcao1.equalsIgnoreCase("s")) {
                            agenda[diaMes][hora] = null;
                            System.out.println("Exclusão realizada com sucesso!");
                            consulta.clear();
                            for (String[] vetor : agenda) {
                                for (String valores : vetor) {
                                    if (valores != null) {
                                        consulta.add(valores);
                                    }
                                }
                            }
                        }
                    }

                    break;
                case 4:
                    System.out.println("Qual tipo de consulta deseja fazer:");
                    System.out.println("1 - geral");
                    System.out.println("2 - Específica");
                    opcao = t.nextInt();
                    switch (opcao) {
                        case 1:
                            if (consulta.isEmpty()) {
                                for (String[] vetor : agenda) {
                                    for (String valores : vetor) {
                                        if (valores != null) {
                                            consulta.add(valores);
                                        }
                                    }
                                }
                            }

                            int dia_ = 0,
                            hora_ = 0;
                            boolean verifica = false;
                            for (int i = 0; i < agenda.length; i++) {
                                if (verifica == true) {
                                    break;
                                }
                                for (int j = 0; j < agenda[i].length; j++) {
                                    if (verifica == true) {
                                        break;
                                    }
                                    if (agenda[i][j] != null) {
                                        dia_ = i;
                                        hora_ = j;
                                        if (!consulta.isEmpty()) {
                                            for (String valores : consulta) {
                                                System.out.println("Dia " + dia_ + " às " + hora_ + " hrs: " + valores);
                                                consulta.remove(valores);
                                                break;
                                            }
                                        } else {
                                            
                                            verifica = true;
                                        }
                                    }

                                }

                            }
                            for (String[] vetor : agenda) {
                                for (String valores : vetor) {
                                    if (valores != null) {
                                        consulta.add(valores);
                                    }
                                }
                            }
                            if (consulta.isEmpty()) {
                                System.out.println("Não existem compromissos para consulta!");
                            }
                            break;
                        case 2:
                            System.out.println("Informe o dia para consulta:");
                            diaMes = t.nextInt();
                            while (diaMes < 1 || diaMes > 31) {
                                System.out.println("Dia inválido!");
                                System.out.println("Escolha o dia do mês para fazer o agendamento (1 a 31):");
                                diaMes = t.nextInt();
                            }
                            System.out.println("Informe a horário para consulta no dia: " + diaMes);
                            hora = t.nextInt();
                            if (agenda[diaMes][hora] == null) {
                                System.out.println("Não existe agendamento para o dia e hora informados!");
                            } else {
                                System.out.println(agenda[diaMes][hora]);
                            }
                            break;
                    }

            }

        } while (opcao != 5);
        System.out.println("Programa Encerrado!");
    }

}
