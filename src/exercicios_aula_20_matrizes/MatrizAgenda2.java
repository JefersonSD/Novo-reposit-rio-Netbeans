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
public class MatrizAgenda2 {

    public static void main(String[] args) {

//        5. Modifique o programa anterior de maneira a guardar os compromissos de todo o ano, organizados por mês, dia e hora 
//           (só 8 horas por dia).
        Scanner t = new Scanner(System.in);
        String[][][] agenda = new String[13][32][9];
        List<String> consulta = new ArrayList();
        int opcao;
        String opcao1, compromisso;
        int mes = 0, dia = 0, hora = 0;
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
                    System.out.println("Escolha o mês de agendamento:\n1 - Janeiro\n2 - Fevereiro\n3 - Março\n4 - Abril\n5 - Maio\n6 - "
                            + "Junho\n7 - Julho\n8 - Agosto\n9 - Setembro\n10 - Outubro\n11 - Novembro\n12 - Dezembro");
                    mes = t.nextInt();
                    while (mes < 1 || mes > 12) {
                        System.out.println("Opção inválida:");
                        System.out.println("Escolha o mês de agendamento:\n1 - Janeiro\n2 - Fevereiro\n3 - Março\n4 - Abril\n5 - Maio\n6 - "
                                + "Junho\n7 - Julho\n8 - Agosto\n9 - Setembro\n10 - Outubro\n11 - Novembro\n12 - Dezembro");
                        mes = t.nextInt();
                    }

                    switch (mes) {
                        case 1:
                            System.out.println("Escolha o dia do mês para fazer o agendamento:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 31) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer o agendamento:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para o agendamento:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para o agendamento:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Informe o compromisso:");
                                compromisso = t.next();
                                agenda[mes][dia][hora] = compromisso;
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                                System.out.println("Compromisso registrado com sucesso!");
                            } else {
                                System.out.println("Já existe compromisso para essa data e hora!");
                            }

                            break;
                        case 2:
                            System.out.println("Escolha o dia do mês para fazer o agendamento:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 28) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer o agendamento:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para o agendamento:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para o agendamento:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Informe o compromisso:");
                                compromisso = t.next();
                                agenda[mes][dia][hora] = compromisso;
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                                System.out.println("Compromisso registrado com sucesso!");
                            } else {
                                System.out.println("Já existe compromisso para essa data e hora!");
                            }

                            break;
                        case 3:
                            System.out.println("Escolha o dia do mês para fazer o agendamento:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 31) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer o agendamento:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para o agendamento:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para o agendamento:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Informe o compromisso:");
                                compromisso = t.next();
                                agenda[mes][dia][hora] = compromisso;
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                                System.out.println("Compromisso registrado com sucesso!");
                            } else {
                                System.out.println("Já existe compromisso para essa data e hora!");
                            }

                            break;
                        case 4:
                            System.out.println("Escolha o dia do mês para fazer o agendamento:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 30) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer o agendamento:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para o agendamento:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para o agendamento:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Informe o compromisso:");
                                compromisso = t.next();
                                agenda[mes][dia][hora] = compromisso;
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                                System.out.println("Compromisso registrado com sucesso!");
                            } else {
                                System.out.println("Já existe compromisso para essa data e hora!");
                            }

                            break;
                        case 5:
                            System.out.println("Escolha o dia do mês para fazer o agendamento:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 31) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer o agendamento:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para o agendamento:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para o agendamento:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Informe o compromisso:");
                                compromisso = t.next();
                                agenda[mes][dia][hora] = compromisso;
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                                System.out.println("Compromisso registrado com sucesso!");
                            } else {
                                System.out.println("Já existe compromisso para essa data e hora!");
                            }

                            break;
                        case 6:
                            System.out.println("Escolha o dia do mês para fazer o agendamento:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 30) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer o agendamento:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para o agendamento:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para o agendamento:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Informe o compromisso:");
                                compromisso = t.next();
                                agenda[mes][dia][hora] = compromisso;
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                                System.out.println("Compromisso registrado com sucesso!");
                            } else {
                                System.out.println("Já existe compromisso para essa data e hora!");
                            }

                            break;
                        case 7:
                            System.out.println("Escolha o dia do mês para fazer o agendamento:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 31) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer o agendamento:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para o agendamento:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para o agendamento:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Informe o compromisso:");
                                compromisso = t.next();
                                agenda[mes][dia][hora] = compromisso;
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                                System.out.println("Compromisso registrado com sucesso!");
                            } else {
                                System.out.println("Já existe compromisso para essa data e hora!");
                            }

                            break;
                        case 8:
                            System.out.println("Escolha o dia do mês para fazer o agendamento:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 31) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer o agendamento:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para o agendamento:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para o agendamento:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Informe o compromisso:");
                                compromisso = t.next();
                                agenda[mes][dia][hora] = compromisso;
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                                System.out.println("Compromisso registrado com sucesso!");
                            } else {
                                System.out.println("Já existe compromisso para essa data e hora!");
                            }

                            break;
                        case 9:
                            System.out.println("Escolha o dia do mês para fazer o agendamento:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 30) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer o agendamento:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para o agendamento:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para o agendamento:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Informe o compromisso:");
                                compromisso = t.next();
                                agenda[mes][dia][hora] = compromisso;
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                                System.out.println("Compromisso registrado com sucesso!");
                            } else {
                                System.out.println("Já existe compromisso para essa data e hora!");
                            }

                            break;
                        case 10:
                            System.out.println("Escolha o dia do mês para fazer o agendamento:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 31) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer o agendamento:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para o agendamento:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para o agendamento:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Informe o compromisso:");
                                compromisso = t.next();
                                agenda[mes][dia][hora] = compromisso;
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                                System.out.println("Compromisso registrado com sucesso!");
                            } else {
                                System.out.println("Já existe compromisso para essa data e hora!");
                            }

                            break;
                        case 11:
                            System.out.println("Escolha o dia do mês para fazer o agendamento:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 30) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer o agendamento:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para o agendamento:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para o agendamento:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Informe o compromisso:");
                                compromisso = t.next();
                                agenda[mes][dia][hora] = compromisso;
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                                System.out.println("Compromisso registrado com sucesso!");
                            } else {
                                System.out.println("Já existe compromisso para essa data e hora!");
                            }

                            break;
                        case 12:
                            System.out.println("Escolha o dia do mês para fazer o agendamento:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 31) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer o agendamento:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para o agendamento:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para o agendamento:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Informe o compromisso:");
                                compromisso = t.next();
                                agenda[mes][dia][hora] = compromisso;
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                                System.out.println("Compromisso registrado com sucesso!");
                            } else {
                                System.out.println("Já existe compromisso para essa data e hora!");
                            }

                            break;
                    }
                    break;
                case 2:
                    System.out.println("Escolha o mês para fazer a alteração:\n1 - Janeiro\n2 - Fevereiro\n3 - Março\n4 - Abril\n5 - "
                            + "Maio\n6 - Junho\n7 - Julho\n8 - Agosto\n9 - Setembro\n10 - Outubro\n11 - Novembro\n12 - Dezembro");
                    mes = t.nextInt();
                    while (mes != 1 && mes != 2 && mes != 3 && mes != 4 && mes != 5 && mes != 6 && mes != 7 && mes != 8 && mes != 9
                            && mes != 10 && mes != 11 && mes != 12) {
                        System.out.println("Opção inválida:");
                        System.out.println("Escolha o mês de agendamento:\n1 - Janeiro\n2 - Fevereiro\n3 - Março\n4 - Abril\n5 - Maio\n6 - "
                                + "Junho\n7 - Julho\n8 - Agosto\n9 - Setembro\n10 - Outubro\n11 - Novembro\n12 - Dezembro");
                        mes = t.nextInt();
                    }
                    switch (mes) {
                        case 1:
                            System.out.println("Escolha o dia do mês para fazer a alteração:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 31) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer a alteração:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para fazer a alteração:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para a alteração:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Não existe agendamento para alteração na data e horário informados!");
                            } else {
                                System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                                System.out.println("\"" + agenda[mes][dia][hora] + "\"");
                                System.out.println("Deseja prosseguir com a alteração? (s/n)");
                                opcao1 = t.next();
                                while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                                    System.out.println("Opção inválida");
                                    System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                                    opcao1 = t.next();
                                }
                                if (opcao1.equalsIgnoreCase("s")) {
                                    System.out.println("Insira a alteração:");
                                    agenda[mes][dia][hora] = t.next();
                                    System.out.println("Alteração realizada com sucesso!");
                                }
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Escolha o dia do mês para fazer a alteração:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 28) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer a alteração:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para fazer a alteração:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para a alteração:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Não existe agendamento para alteração na data e horário informados!");
                            } else {
                                System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                                System.out.println("\"" + agenda[mes][dia][hora] + "\"");
                                System.out.println("Deseja prosseguir com a alteração? (s/n)");
                                opcao1 = t.next();
                                while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                                    System.out.println("Opção inválida");
                                    System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                                    opcao1 = t.next();
                                }
                                if (opcao1.equalsIgnoreCase("s")) {
                                    System.out.println("Insira a alteração:");
                                    agenda[mes][dia][hora] = t.next();
                                    System.out.println("Alteração realizada com sucesso!");
                                }
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Escolha o dia do mês para fazer a alteração:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 31) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer a alteração:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para fazer a alteração:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para a alteração:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Não existe agendamento para alteração na data e horário informados!");
                            } else {
                                System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                                System.out.println("\"" + agenda[mes][dia][hora] + "\"");
                                System.out.println("Deseja prosseguir com a alteração? (s/n)");
                                opcao1 = t.next();
                                while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                                    System.out.println("Opção inválida");
                                    System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                                    opcao1 = t.next();
                                }
                                if (opcao1.equalsIgnoreCase("s")) {
                                    System.out.println("Insira a alteração:");
                                    agenda[mes][dia][hora] = t.next();
                                    System.out.println("Alteração realizada com sucesso!");
                                }
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 4:
                            System.out.println("Escolha o dia do mês para fazer a alteração:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 30) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer a alteração:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para fazer a alteração:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para a alteração:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Não existe agendamento para alteração na data e horário informados!");
                            } else {
                                System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                                System.out.println("\"" + agenda[mes][dia][hora] + "\"");
                                System.out.println("Deseja prosseguir com a alteração? (s/n)");
                                opcao1 = t.next();
                                while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                                    System.out.println("Opção inválida");
                                    System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                                    opcao1 = t.next();
                                }
                                if (opcao1.equalsIgnoreCase("s")) {
                                    System.out.println("Insira a alteração:");
                                    agenda[mes][dia][hora] = t.next();
                                    System.out.println("Alteração realizada com sucesso!");
                                }
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 5:
                            System.out.println("Escolha o dia do mês para fazer a alteração:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 31) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer a alteração:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para fazer a alteração:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para a alteração:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Não existe agendamento para alteração na data e horário informados!");
                            } else {
                                System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                                System.out.println("\"" + agenda[mes][dia][hora] + "\"");
                                System.out.println("Deseja prosseguir com a alteração? (s/n)");
                                opcao1 = t.next();
                                while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                                    System.out.println("Opção inválida");
                                    System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                                    opcao1 = t.next();
                                }
                                if (opcao1.equalsIgnoreCase("s")) {
                                    System.out.println("Insira a alteração:");
                                    agenda[mes][dia][hora] = t.next();
                                    System.out.println("Alteração realizada com sucesso!");
                                }
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 6:
                            System.out.println("Escolha o dia do mês para fazer a alteração:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 30) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer a alteração:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para fazer a alteração:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para a alteração:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Não existe agendamento para alteração na data e horário informados!");
                            } else {
                                System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                                System.out.println("\"" + agenda[mes][dia][hora] + "\"");
                                System.out.println("Deseja prosseguir com a alteração? (s/n)");
                                opcao1 = t.next();
                                while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                                    System.out.println("Opção inválida");
                                    System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                                    opcao1 = t.next();
                                }
                                if (opcao1.equalsIgnoreCase("s")) {
                                    System.out.println("Insira a alteração:");
                                    agenda[mes][dia][hora] = t.next();
                                    System.out.println("Alteração realizada com sucesso!");
                                }
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 7:
                            System.out.println("Escolha o dia do mês para fazer a alteração:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 31) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer a alteração:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para fazer a alteração:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para a alteração:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Não existe agendamento para alteração na data e horário informados!");
                            } else {
                                System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                                System.out.println("\"" + agenda[mes][dia][hora] + "\"");
                                System.out.println("Deseja prosseguir com a alteração? (s/n)");
                                opcao1 = t.next();
                                while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                                    System.out.println("Opção inválida");
                                    System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                                    opcao1 = t.next();
                                }
                                if (opcao1.equalsIgnoreCase("s")) {
                                    System.out.println("Insira a alteração:");
                                    agenda[mes][dia][hora] = t.next();
                                    System.out.println("Alteração realizada com sucesso!");
                                }
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 8:
                            System.out.println("Escolha o dia do mês para fazer a alteração:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 31) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer a alteração:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para fazer a alteração:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para a alteração:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Não existe agendamento para alteração na data e horário informados!");
                            } else {
                                System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                                System.out.println("\"" + agenda[mes][dia][hora] + "\"");
                                System.out.println("Deseja prosseguir com a alteração? (s/n)");
                                opcao1 = t.next();
                                while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                                    System.out.println("Opção inválida");
                                    System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                                    opcao1 = t.next();
                                }
                                if (opcao1.equalsIgnoreCase("s")) {
                                    System.out.println("Insira a alteração:");
                                    agenda[mes][dia][hora] = t.next();
                                    System.out.println("Alteração realizada com sucesso!");
                                }
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 9:
                            System.out.println("Escolha o dia do mês para fazer a alteração:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 30) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer a alteração:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para fazer a alteração:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para a alteração:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Não existe agendamento para alteração na data e horário informados!");
                            } else {
                                System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                                System.out.println("\"" + agenda[mes][dia][hora] + "\"");
                                System.out.println("Deseja prosseguir com a alteração? (s/n)");
                                opcao1 = t.next();
                                while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                                    System.out.println("Opção inválida");
                                    System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                                    opcao1 = t.next();
                                }
                                if (opcao1.equalsIgnoreCase("s")) {
                                    System.out.println("Insira a alteração:");
                                    agenda[mes][dia][hora] = t.next();
                                    System.out.println("Alteração realizada com sucesso!");
                                }
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 10:
                            System.out.println("Escolha o dia do mês para fazer a alteração:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 31) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer a alteração:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para fazer a alteração:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para a alteração:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Não existe agendamento para alteração na data e horário informados!");
                            } else {
                                System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                                System.out.println("\"" + agenda[mes][dia][hora] + "\"");
                                System.out.println("Deseja prosseguir com a alteração? (s/n)");
                                opcao1 = t.next();
                                while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                                    System.out.println("Opção inválida");
                                    System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                                    opcao1 = t.next();
                                }
                                if (opcao1.equalsIgnoreCase("s")) {
                                    System.out.println("Insira a alteração:");
                                    agenda[mes][dia][hora] = t.next();
                                    System.out.println("Alteração realizada com sucesso!");
                                }
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 11:
                            System.out.println("Escolha o dia do mês para fazer a alteração:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 30) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer a alteração:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para fazer a alteração:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para a alteração:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Não existe agendamento para alteração na data e horário informados!");
                            } else {
                                System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                                System.out.println("\"" + agenda[mes][dia][hora] + "\"");
                                System.out.println("Deseja prosseguir com a alteração? (s/n)");
                                opcao1 = t.next();
                                while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                                    System.out.println("Opção inválida");
                                    System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                                    opcao1 = t.next();
                                }
                                if (opcao1.equalsIgnoreCase("s")) {
                                    System.out.println("Insira a alteração:");
                                    agenda[mes][dia][hora] = t.next();
                                    System.out.println("Alteração realizada com sucesso!");
                                }
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 12:
                            System.out.println("Escolha o dia do mês para fazer a alteração:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 31) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer a alteração:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para fazer a alteração:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para a alteração:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Não existe agendamento para alteração na data e horário informados!");
                            } else {
                                System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                                System.out.println("\"" + agenda[mes][dia][hora] + "\"");
                                System.out.println("Deseja prosseguir com a alteração? (s/n)");
                                opcao1 = t.next();
                                while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                                    System.out.println("Opção inválida");
                                    System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                                    opcao1 = t.next();
                                }
                                if (opcao1.equalsIgnoreCase("s")) {
                                    System.out.println("Insira a alteração:");
                                    agenda[mes][dia][hora] = t.next();
                                    System.out.println("Alteração realizada com sucesso!");
                                }
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                    }

                    break;

                case 3:
                    System.out.println("Escolha o mês para fazer a exclusão:\n1 - Janeiro\n2 - Fevereiro\n3 - Março\n4 - Abril\n5 - "
                            + "Maio\n6 - Junho\n7 - Julho\n8 - Agosto\n9 - Setembro\n10 - Outubro\n11 - Novembro\n12 - Dezembro");
                    mes = t.nextInt();
                    while (mes != 1 && mes != 2 && mes != 3 && mes != 4 && mes != 5 && mes != 6 && mes != 7 && mes != 8 && mes != 9
                            && mes != 10 && mes != 11 && mes != 12) {
                        System.out.println("Opção inválida:");
                        System.out.println("Escolha o mês de agendamento:\n1 - Janeiro\n2 - Fevereiro\n3 - Março\n4 - Abril\n5 - Maio\n6 - "
                                + "Junho\n7 - Julho\n8 - Agosto\n9 - Setembro\n10 - Outubro\n11 - Novembro\n12 - Dezembro");
                        mes = t.nextInt();
                    }
                    switch (mes) {
                        case 1:
                            System.out.println("Escolha o dia do mês para fazer a exclusão:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 31) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer a exclusão:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para fazer a exclusão:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para a exclusão:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Não existe agendamento para exclusão na data e horário informados!");
                            } else {
                                System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                                System.out.println("\"" + agenda[mes][dia][hora] + "\"");
                                System.out.println("Deseja prosseguir com a exclusão? (s/n)");
                                opcao1 = t.next();
                                while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                                    System.out.println("Opção inválida");
                                    System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                                    opcao1 = t.next();
                                }
                                if (opcao1.equalsIgnoreCase("s")) {
                                    agenda[mes][dia][hora] = null;
                                    System.out.println("Exclusão realizada com sucesso!");
                                }
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Escolha o dia do mês para fazer a exclusão:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 28) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer a exclusão:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para fazer a exclusão:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para a exclusão:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Não existe agendamento para exclusão na data e horário informados!");
                            } else {
                                System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                                System.out.println("\"" + agenda[mes][dia][hora] + "\"");
                                System.out.println("Deseja prosseguir com a exclusão? (s/n)");
                                opcao1 = t.next();
                                while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                                    System.out.println("Opção inválida");
                                    System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                                    opcao1 = t.next();
                                }
                                if (opcao1.equalsIgnoreCase("s")) {
                                    agenda[mes][dia][hora] = null;
                                    System.out.println("Exclusão realizada com sucesso!");
                                }
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Escolha o dia do mês para fazer a exclusão:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 31) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer a exclusão:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para fazer a exclusão:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para a exclusão:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Não existe agendamento para exclusão na data e horário informados!");
                            } else {
                                System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                                System.out.println("\"" + agenda[mes][dia][hora] + "\"");
                                System.out.println("Deseja prosseguir com a exclusão? (s/n)");
                                opcao1 = t.next();
                                while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                                    System.out.println("Opção inválida");
                                    System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                                    opcao1 = t.next();
                                }
                                if (opcao1.equalsIgnoreCase("s")) {
                                    agenda[mes][dia][hora] = null;
                                    System.out.println("Exclusão realizada com sucesso!");
                                }
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 4:
                            System.out.println("Escolha o dia do mês para fazer a exclusão:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 30) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer a exclusão:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para fazer a exclusão:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para a exclusão:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Não existe agendamento para exclusão na data e horário informados!");
                            } else {
                                System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                                System.out.println("\"" + agenda[mes][dia][hora] + "\"");
                                System.out.println("Deseja prosseguir com a exclusão? (s/n)");
                                opcao1 = t.next();
                                while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                                    System.out.println("Opção inválida");
                                    System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                                    opcao1 = t.next();
                                }
                                if (opcao1.equalsIgnoreCase("s")) {
                                    agenda[mes][dia][hora] = null;
                                    System.out.println("Exclusão realizada com sucesso!");
                                }
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 5:
                            System.out.println("Escolha o dia do mês para fazer a exclusão:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 31) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer a exclusão:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para fazer a exclusão:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para a exclusão:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Não existe agendamento para exclusão na data e horário informados!");
                            } else {
                                System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                                System.out.println("\"" + agenda[mes][dia][hora] + "\"");
                                System.out.println("Deseja prosseguir com a exclusão? (s/n)");
                                opcao1 = t.next();
                                while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                                    System.out.println("Opção inválida");
                                    System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                                    opcao1 = t.next();
                                }
                                if (opcao1.equalsIgnoreCase("s")) {
                                    agenda[mes][dia][hora] = null;
                                    System.out.println("Exclusão realizada com sucesso!");
                                }
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 6:
                            System.out.println("Escolha o dia do mês para fazer a exclusão:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 30) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer a exclusão:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para fazer a exclusão:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para a exclusão:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Não existe agendamento para exclusão na data e horário informados!");
                            } else {
                                System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                                System.out.println("\"" + agenda[mes][dia][hora] + "\"");
                                System.out.println("Deseja prosseguir com a exclusão? (s/n)");
                                opcao1 = t.next();
                                while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                                    System.out.println("Opção inválida");
                                    System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                                    opcao1 = t.next();
                                }
                                if (opcao1.equalsIgnoreCase("s")) {
                                    agenda[mes][dia][hora] = null;
                                    System.out.println("Exclusão realizada com sucesso!");
                                }
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 7:
                            System.out.println("Escolha o dia do mês para fazer a exclusão:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 31) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer a exclusão:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para fazer a exclusão:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para a exclusão:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Não existe agendamento para exclusão na data e horário informados!");
                            } else {
                                System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                                System.out.println("\"" + agenda[mes][dia][hora] + "\"");
                                System.out.println("Deseja prosseguir com a exclusão? (s/n)");
                                opcao1 = t.next();
                                while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                                    System.out.println("Opção inválida");
                                    System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                                    opcao1 = t.next();
                                }
                                if (opcao1.equalsIgnoreCase("s")) {
                                    agenda[mes][dia][hora] = null;
                                    System.out.println("Exclusão realizada com sucesso!");
                                }
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 8:
                            System.out.println("Escolha o dia do mês para fazer a exclusão:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 31) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer a exclusão:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para fazer a exclusão:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para a exclusão:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Não existe agendamento para exclusão na data e horário informados!");
                            } else {
                                System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                                System.out.println("\"" + agenda[mes][dia][hora] + "\"");
                                System.out.println("Deseja prosseguir com a exclusão? (s/n)");
                                opcao1 = t.next();
                                while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                                    System.out.println("Opção inválida");
                                    System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                                    opcao1 = t.next();
                                }
                                if (opcao1.equalsIgnoreCase("s")) {
                                    agenda[mes][dia][hora] = null;
                                    System.out.println("Exclusão realizada com sucesso!");
                                }
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 9:
                            System.out.println("Escolha o dia do mês para fazer a exclusão:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 30) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer a exclusão:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para fazer a exclusão:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para a exclusão:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Não existe agendamento para exclusão na data e horário informados!");
                            } else {
                                System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                                System.out.println("\"" + agenda[mes][dia][hora] + "\"");
                                System.out.println("Deseja prosseguir com a exclusão? (s/n)");
                                opcao1 = t.next();
                                while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                                    System.out.println("Opção inválida");
                                    System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                                    opcao1 = t.next();
                                }
                                if (opcao1.equalsIgnoreCase("s")) {
                                    agenda[mes][dia][hora] = null;
                                    System.out.println("Exclusão realizada com sucesso!");
                                }
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 10:
                            System.out.println("Escolha o dia do mês para fazer a exclusão:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 31) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer a exclusão:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para fazer a exclusão:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para a exclusão:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Não existe agendamento para exclusão na data e horário informados!");
                            } else {
                                System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                                System.out.println("\"" + agenda[mes][dia][hora] + "\"");
                                System.out.println("Deseja prosseguir com a exclusão? (s/n)");
                                opcao1 = t.next();
                                while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                                    System.out.println("Opção inválida");
                                    System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                                    opcao1 = t.next();
                                }
                                if (opcao1.equalsIgnoreCase("s")) {
                                    agenda[mes][dia][hora] = null;
                                    System.out.println("Exclusão realizada com sucesso!");
                                }
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 11:
                            System.out.println("Escolha o dia do mês para fazer a exclusão:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 30) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer a exclusão:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para fazer a exclusão:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para a exclusão:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Não existe agendamento para exclusão na data e horário informados!");
                            } else {
                                System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                                System.out.println("\"" + agenda[mes][dia][hora] + "\"");
                                System.out.println("Deseja prosseguir com a exclusão? (s/n)");
                                opcao1 = t.next();
                                while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                                    System.out.println("Opção inválida");
                                    System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                                    opcao1 = t.next();
                                }
                                if (opcao1.equalsIgnoreCase("s")) {
                                    agenda[mes][dia][hora] = null;
                                    System.out.println("Exclusão realizada com sucesso!");
                                }
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 12:
                            System.out.println("Escolha o dia do mês para fazer a exclusão:");
                            dia = t.nextInt();
                            while (dia < 1 || dia > 31) {
                                System.out.println("Dia inválido");
                                System.out.println("Escolha o dia do mês para fazer a exclusão:");
                                dia = t.nextInt();
                            }
                            System.out.println("Escolha o horário para fazer a exclusão:");
                            hora = t.nextInt();
                            while (hora < 1 || hora > 8) {
                                if (hora < 1) {
                                    System.out.println("Informe um horário entre 1 e 8 hrs:");
                                    hora = t.nextInt();
                                }
                                if (hora > 8) {
                                    System.out.println("Somente 8 horas diárias");
                                    System.out.println("Escolha o horário para a exclusão:");
                                    hora = t.nextInt();
                                }
                            }
                            if (agenda[mes][dia][hora] == null) {
                                System.out.println("Não existe agendamento para exclusão na data e horário informados!");
                            } else {
                                System.out.println("No dia e horário selecionados contém o seguinte compromisso:");
                                System.out.println("\"" + agenda[mes][dia][hora] + "\"");
                                System.out.println("Deseja prosseguir com a exclusão? (s/n)");
                                opcao1 = t.next();
                                while (!opcao1.equalsIgnoreCase("s") && !opcao1.equalsIgnoreCase("n")) {
                                    System.out.println("Opção inválida");
                                    System.out.println("Digite \"s\" para sim ou \"n\" para não:");
                                    opcao1 = t.next();
                                }
                                if (opcao1.equalsIgnoreCase("s")) {
                                    agenda[mes][dia][hora] = null;
                                    System.out.println("Exclusão realizada com sucesso!");
                                }
                                consulta.clear();
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
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
                                for (String[][] mes_ : agenda) {
                                    for (String[] dias : mes_) {
                                        for (String horas : dias) {

                                            if (horas != null) {
                                                consulta.add(horas);
                                            }
                                        }
                                    }
                                }
                            }

                            mes = 0;
                            dia = 0;
                            hora = 0;
                            String meses = "";
                            boolean verifica = false;
                            for (int i = 0; i < agenda.length; i++) {
                                if (verifica == true) {
                                    break;
                                }
                                for (int j = 0; j < agenda[i].length; j++) {
                                    if (verifica == true) {
                                        break;
                                    }
                                    for (int k = 0; k < agenda[i][j].length; k++) {

                                        if (agenda[i][j][k] != null) {
                                            mes = i;
                                            dia = j;
                                            hora = k;
                                            if (!consulta.isEmpty()) {
                                                for (String valores : consulta) {
                                                    switch (mes) {
                                                        case 1:
                                                            meses = "Janeiro";
                                                            break;
                                                        case 2:
                                                            meses = "Fevereiro";
                                                            break;
                                                        case 3:
                                                            meses = "Março";
                                                            break;
                                                        case 4:
                                                            meses = "Abril";
                                                            break;
                                                        case 5:
                                                            meses = "Maio";
                                                            break;
                                                        case 6:
                                                            meses = "Junho";
                                                            break;
                                                        case 7:
                                                            meses = "Julho";
                                                            break;
                                                        case 8:
                                                            meses = "Agosto";
                                                            break;
                                                        case 9:
                                                            meses = "Setembro";
                                                            break;
                                                        case 10:
                                                            meses = "Outubro";
                                                            break;
                                                        case 11:
                                                            meses = "Novembro";
                                                            break;
                                                        case 12:
                                                            meses = "Dezembro";
                                                            break;

                                                    }
                                                    System.out.println("Dia " + dia + " de " + meses + " às " + hora + " hrs : " + valores);
                                                    consulta.remove(valores);
                                                    break;
                                                }
                                            } else {
                                                verifica = true;
                                            }
                                        }
                                    }

                                }

                            }
                            for (String[][] mes_ : agenda) {
                                for (String[] dias : mes_) {
                                    for (String horas : dias) {

                                        if (horas != null) {
                                            consulta.add(horas);
                                        }
                                    }
                                }
                            }
                             if (consulta.isEmpty()) {
                                System.out.println("Não existem compromissos para consulta!");
                            }
                            break;
                        case 2:
                            System.out.println("Escolha o mês para consulta:\n1 - Janeiro\n2 - Fevereiro\n3 - Março\n4 - Abril\n5 - "
                                    + "Maio\n6 - Junho\n7 - Julho\n8 - Agosto\n9 - Setembro\n10 - Outubro\n11 - Novembro\n12 - Dezembro");
                            mes = t.nextInt();
                            while (mes != 1 && mes != 2 && mes != 3 && mes != 4 && mes != 5 && mes != 6 && mes != 7 && mes != 8 && mes != 9
                                    && mes != 10 && mes != 11 && mes != 12) {
                                System.out.println("Opção inválida:");
                                System.out.println("Escolha o mês para consulta:\n1 - Janeiro\n2 - Fevereiro\n3 - Março\n4 - Abril\n5 - Maio\n6 - "
                                        + "Junho\n7 - Julho\n8 - Agosto\n9 - Setembro\n10 - Outubro\n11 - Novembro\n12 - Dezembro");
                                mes = t.nextInt();
                            }
                            switch (mes) {
                                case 1:
                                    System.out.println("Escolha o dia do mês para a consulta:");
                                    dia = t.nextInt();
                                    while (dia < 1 || dia > 31) {
                                        System.out.println("Dia inválido");
                                        System.out.println("Escolha o dia do mês para fazer a consulta:");
                                        dia = t.nextInt();
                                    }
                                    System.out.println("Escolha o horário para fazer a consulta:");
                                    hora = t.nextInt();
                                    while (hora < 1 || hora > 8) {
                                        if (hora < 1) {
                                            System.out.println("Informe um horário entre 1 e 8 hrs:");
                                            hora = t.nextInt();
                                        }
                                        if (hora > 8) {
                                            System.out.println("Somente 8 horas diárias");
                                            System.out.println("Escolha o horário para a consulta:");
                                            hora = t.nextInt();
                                        }
                                    }
                                    if (agenda[mes][dia][hora] == null) {
                                        System.out.println("Não existe agendamento para o dia e hora informados!");
                                    } else {
                                        System.out.println(agenda[mes][dia][hora]);
                                    }
                                    break;
                                case 2:
                                    System.out.println("Escolha o dia do mês para a consulta:");
                                    dia = t.nextInt();
                                    while (dia < 1 || dia > 28) {
                                        System.out.println("Dia inválido");
                                        System.out.println("Escolha o dia do mês para fazer a consulta:");
                                        dia = t.nextInt();
                                    }
                                    System.out.println("Escolha o horário para fazer a consulta:");
                                    hora = t.nextInt();
                                    while (hora < 1 || hora > 8) {
                                        if (hora < 1) {
                                            System.out.println("Informe um horário entre 1 e 8 hrs:");
                                            hora = t.nextInt();
                                        }
                                        if (hora > 8) {
                                            System.out.println("Somente 8 horas diárias");
                                            System.out.println("Escolha o horário para a consulta:");
                                            hora = t.nextInt();
                                        }
                                    }
                                    if (agenda[mes][dia][hora] == null) {
                                        System.out.println("Não existe agendamento para o dia e hora informados!");
                                    } else {
                                        System.out.println(agenda[mes][dia][hora]);
                                    }
                                    break;
                                case 3:
                                    System.out.println("Escolha o dia do mês para a consulta:");
                                    dia = t.nextInt();
                                    while (dia < 1 || dia > 31) {
                                        System.out.println("Dia inválido");
                                        System.out.println("Escolha o dia do mês para fazer a consulta:");
                                        dia = t.nextInt();
                                    }
                                    System.out.println("Escolha o horário para fazer a consulta:");
                                    hora = t.nextInt();
                                    while (hora < 1 || hora > 8) {
                                        if (hora < 1) {
                                            System.out.println("Informe um horário entre 1 e 8 hrs:");
                                            hora = t.nextInt();
                                        }
                                        if (hora > 8) {
                                            System.out.println("Somente 8 horas diárias");
                                            System.out.println("Escolha o horário para a consulta:");
                                            hora = t.nextInt();
                                        }
                                    }
                                    if (agenda[mes][dia][hora] == null) {
                                        System.out.println("Não existe agendamento para o dia e hora informados!");
                                    } else {
                                        System.out.println(agenda[mes][dia][hora]);
                                    }
                                    break;
                                case 4:
                                    System.out.println("Escolha o dia do mês para a consulta:");
                                    dia = t.nextInt();
                                    while (dia < 1 || dia > 30) {
                                        System.out.println("Dia inválido");
                                        System.out.println("Escolha o dia do mês para fazer a consulta:");
                                        dia = t.nextInt();
                                    }
                                    System.out.println("Escolha o horário para fazer a consulta:");
                                    hora = t.nextInt();
                                    while (hora < 1 || hora > 8) {
                                        if (hora < 1) {
                                            System.out.println("Informe um horário entre 1 e 8 hrs:");
                                            hora = t.nextInt();
                                        }
                                        if (hora > 8) {
                                            System.out.println("Somente 8 horas diárias");
                                            System.out.println("Escolha o horário para a consulta:");
                                            hora = t.nextInt();
                                        }
                                    }
                                    if (agenda[mes][dia][hora] == null) {
                                        System.out.println("Não existe agendamento para o dia e hora informados!");
                                    } else {
                                        System.out.println(agenda[mes][dia][hora]);
                                    }
                                    break;
                                case 5:
                                    System.out.println("Escolha o dia do mês para a consulta:");
                                    dia = t.nextInt();
                                    while (dia < 1 || dia > 31) {
                                        System.out.println("Dia inválido");
                                        System.out.println("Escolha o dia do mês para fazer a consulta:");
                                        dia = t.nextInt();
                                    }
                                    System.out.println("Escolha o horário para fazer a consulta:");
                                    hora = t.nextInt();
                                    while (hora < 1 || hora > 8) {
                                        if (hora < 1) {
                                            System.out.println("Informe um horário entre 1 e 8 hrs:");
                                            hora = t.nextInt();
                                        }
                                        if (hora > 8) {
                                            System.out.println("Somente 8 horas diárias");
                                            System.out.println("Escolha o horário para a consulta:");
                                            hora = t.nextInt();
                                        }
                                    }
                                    if (agenda[mes][dia][hora] == null) {
                                        System.out.println("Não existe agendamento para o dia e hora informados!");
                                    } else {
                                        System.out.println(agenda[mes][dia][hora]);
                                    }
                                    break;
                                case 6:
                                    System.out.println("Escolha o dia do mês para a consulta:");
                                    dia = t.nextInt();
                                    while (dia < 1 || dia > 30) {
                                        System.out.println("Dia inválido");
                                        System.out.println("Escolha o dia do mês para fazer a consulta:");
                                        dia = t.nextInt();
                                    }
                                    System.out.println("Escolha o horário para fazer a consulta:");
                                    hora = t.nextInt();
                                    while (hora < 1 || hora > 8) {
                                        if (hora < 1) {
                                            System.out.println("Informe um horário entre 1 e 8 hrs:");
                                            hora = t.nextInt();
                                        }
                                        if (hora > 8) {
                                            System.out.println("Somente 8 horas diárias");
                                            System.out.println("Escolha o horário para a consulta:");
                                            hora = t.nextInt();
                                        }
                                    }
                                    if (agenda[mes][dia][hora] == null) {
                                        System.out.println("Não existe agendamento para o dia e hora informados!");
                                    } else {
                                        System.out.println(agenda[mes][dia][hora]);
                                    }
                                    break;
                                case 7:
                                    System.out.println("Escolha o dia do mês para a consulta:");
                                    dia = t.nextInt();
                                    while (dia < 1 || dia > 31) {
                                        System.out.println("Dia inválido");
                                        System.out.println("Escolha o dia do mês para fazer a consulta:");
                                        dia = t.nextInt();
                                    }
                                    System.out.println("Escolha o horário para fazer a consulta:");
                                    hora = t.nextInt();
                                    while (hora < 1 || hora > 8) {
                                        if (hora < 1) {
                                            System.out.println("Informe um horário entre 1 e 8 hrs:");
                                            hora = t.nextInt();
                                        }
                                        if (hora > 8) {
                                            System.out.println("Somente 8 horas diárias");
                                            System.out.println("Escolha o horário para a consulta:");
                                            hora = t.nextInt();
                                        }
                                    }
                                    if (agenda[mes][dia][hora] == null) {
                                        System.out.println("Não existe agendamento para o dia e hora informados!");
                                    } else {
                                        System.out.println(agenda[mes][dia][hora]);
                                    }
                                    break;
                                case 8:
                                    System.out.println("Escolha o dia do mês para a consulta:");
                                    dia = t.nextInt();
                                    while (dia < 1 || dia > 31) {
                                        System.out.println("Dia inválido");
                                        System.out.println("Escolha o dia do mês para fazer a consulta:");
                                        dia = t.nextInt();
                                    }
                                    System.out.println("Escolha o horário para fazer a consulta:");
                                    hora = t.nextInt();
                                    while (hora < 1 || hora > 8) {
                                        if (hora < 1) {
                                            System.out.println("Informe um horário entre 1 e 8 hrs:");
                                            hora = t.nextInt();
                                        }
                                        if (hora > 8) {
                                            System.out.println("Somente 8 horas diárias");
                                            System.out.println("Escolha o horário para a consulta:");
                                            hora = t.nextInt();
                                        }
                                    }
                                    if (agenda[mes][dia][hora] == null) {
                                        System.out.println("Não existe agendamento para o dia e hora informados!");
                                    } else {
                                        System.out.println(agenda[mes][dia][hora]);
                                    }
                                    break;
                                case 9:
                                    System.out.println("Escolha o dia do mês para a consulta:");
                                    dia = t.nextInt();
                                    while (dia < 1 || dia > 30) {
                                        System.out.println("Dia inválido");
                                        System.out.println("Escolha o dia do mês para fazer a consulta:");
                                        dia = t.nextInt();
                                    }
                                    System.out.println("Escolha o horário para fazer a consulta:");
                                    hora = t.nextInt();
                                    while (hora < 1 || hora > 8) {
                                        if (hora < 1) {
                                            System.out.println("Informe um horário entre 1 e 8 hrs:");
                                            hora = t.nextInt();
                                        }
                                        if (hora > 8) {
                                            System.out.println("Somente 8 horas diárias");
                                            System.out.println("Escolha o horário para a consulta:");
                                            hora = t.nextInt();
                                        }
                                    }
                                    if (agenda[mes][dia][hora] == null) {
                                        System.out.println("Não existe agendamento para o dia e hora informados!");
                                    } else {
                                        System.out.println(agenda[mes][dia][hora]);
                                    }
                                    break;
                                case 10:
                                    System.out.println("Escolha o dia do mês para a consulta:");
                                    dia = t.nextInt();
                                    while (dia < 1 || dia > 31) {
                                        System.out.println("Dia inválido");
                                        System.out.println("Escolha o dia do mês para fazer a consulta:");
                                        dia = t.nextInt();
                                    }
                                    System.out.println("Escolha o horário para fazer a consulta:");
                                    hora = t.nextInt();
                                    while (hora < 1 || hora > 8) {
                                        if (hora < 1) {
                                            System.out.println("Informe um horário entre 1 e 8 hrs:");
                                            hora = t.nextInt();
                                        }
                                        if (hora > 8) {
                                            System.out.println("Somente 8 horas diárias");
                                            System.out.println("Escolha o horário para a consulta:");
                                            hora = t.nextInt();
                                        }
                                    }
                                    if (agenda[mes][dia][hora] == null) {
                                        System.out.println("Não existe agendamento para o dia e hora informados!");
                                    } else {
                                        System.out.println(agenda[mes][dia][hora]);
                                    }
                                    break;
                                case 11:
                                    System.out.println("Escolha o dia do mês para a consulta:");
                                    dia = t.nextInt();
                                    while (dia < 1 || dia > 30) {
                                        System.out.println("Dia inválido");
                                        System.out.println("Escolha o dia do mês para fazer a consulta:");
                                        dia = t.nextInt();
                                    }
                                    System.out.println("Escolha o horário para fazer a consulta:");
                                    hora = t.nextInt();
                                    while (hora < 1 || hora > 8) {
                                        if (hora < 1) {
                                            System.out.println("Informe um horário entre 1 e 8 hrs:");
                                            hora = t.nextInt();
                                        }
                                        if (hora > 8) {
                                            System.out.println("Somente 8 horas diárias");
                                            System.out.println("Escolha o horário para a consulta:");
                                            hora = t.nextInt();
                                        }
                                    }
                                    if (agenda[mes][dia][hora] == null) {
                                        System.out.println("Não existe agendamento para o dia e hora informados!");
                                    } else {
                                        System.out.println(agenda[mes][dia][hora]);
                                    }
                                    break;
                                case 12:
                                    System.out.println("Escolha o dia do mês para a consulta:");
                                    dia = t.nextInt();
                                    while (dia < 1 || dia > 31) {
                                        System.out.println("Dia inválido");
                                        System.out.println("Escolha o dia do mês para fazer a consulta:");
                                        dia = t.nextInt();
                                    }
                                    System.out.println("Escolha o horário para fazer a consulta:");
                                    hora = t.nextInt();
                                    while (hora < 1 || hora > 8) {
                                        if (hora < 1) {
                                            System.out.println("Informe um horário entre 1 e 8 hrs:");
                                            hora = t.nextInt();
                                        }
                                        if (hora > 8) {
                                            System.out.println("Somente 8 horas diárias");
                                            System.out.println("Escolha o horário para a consulta:");
                                            hora = t.nextInt();
                                        }
                                    }
                                    if (agenda[mes][dia][hora] == null) {
                                        System.out.println("Não existe agendamento para o dia e hora informados!");
                                    } else {
                                        System.out.println(agenda[mes][dia][hora]);
                                    }
                                    break;
                            }

                    }

            }

        } while (opcao != 5);
        System.out.println("Programa Encerrado!");

    }

}
