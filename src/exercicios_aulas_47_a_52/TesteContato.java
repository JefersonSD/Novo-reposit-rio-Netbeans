/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aulas_47_a_52;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jsjef
 */
//     1. Escreva  uma  classe  Contato  que  contenha  nome,  telefone  e  um   identificador.  Esse  identificador  deve  
//        ser  gerado  automaticamente  pela   classe  através  de  um  contador  (cada  vez  que  um  Contato  é  criado  
//        o   contador  é  incrementado  e  atribuído  ao  identificador).  Crie  uma  classe   Agenda  que  irá  funcionar  
//        para  gerenciar  os  Contatos.  Essa  classe  precisa   de  ter  um  método  para  adicionar  um  Contato  e  também  
//        para  consultar.   Crie  uma  classe  Teste  que  informe  um  menu  ao  usuário:  1-­‐  para  consultar   um  contato 
//        da  agenda  e  2  –  para  adicionar  um  contato  na  agenda.   Se  o  contato  não  existir,  o  programa  deve  
//        lançar  uma  exceção  de   ContatoNaoExisteException.  Caso  a  agenda  esteja  cheia  quando  o  usuário   quiser  
//        adicionar  um  novo  contato,  o  programa  deve  lançar  uma  exceção   AgendaCheiaExeption.  Trate  também  as  
//        exceções  de  tipo  de  dados  (caso  o   usuário  entre  com  um  tipo  de  dado  invalido.   
public class TesteContato {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        List<Contato> listaContatos = new ArrayList();
        Agenda agenda = new Agenda();
        String opcao = "";
        String nome;
        int op;

        System.out.println("Cadastro de contatos na agenda telefônica");
        do {
            op = OpcoesMenu(t, opcao);
            switch (op) {
                case 1:
                    System.out.println("Informe o nome do contato para a consulta:");
                    nome = t.next();
                    Contato cont = agenda.consultarContato(nome);
                    if (cont == null && !agenda.isVerifica()) {
                        System.out.println("A agenda ainda não possui contatos cadastrados!");
                    }
                    if (cont != null) {
                        System.out.println(cont);
                    }
                    break;
                case 2: {
                    cont = agenda.adicionarContato(t);
                    if (cont != null) {
                        listaContatos.add(cont);
                    }
                }
                agenda.setLista(listaContatos);
                break;
            }
        } while (op != 3);

    }

    static int OpcoesMenu(Scanner t, String num) {
        boolean verifica = false;
        int entradaUsuario = 0;
        while (!verifica) {
            System.out.println("O que deseja fazer a seguir\n1 - Consultar "
                    + "um contato\n2 - Cadastrar contato\n3 - Sair");
            try {
                num = t.next();
                entradaUsuario = Integer.parseInt(num);
                if (entradaUsuario != 1 && entradaUsuario != 2 && entradaUsuario != 3) {
                    throw new Exception("Entrada inválida");
                } else {
                    verifica = true;
                }
            } catch (Exception ex) {
                System.out.println("Dados inválidos!");
            }
        }
        return entradaUsuario;
    }

}
