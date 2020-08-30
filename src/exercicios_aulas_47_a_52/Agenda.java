/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aulas_47_a_52;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class Agenda {

    private List<Contato> lista = new ArrayList();
    private boolean verifica = false;

    public List<Contato> getLista() {
        return lista;
    }

    public void setLista(List<Contato> lista) {
        this.lista = lista;
    }

    public boolean isVerifica() {
        return verifica;
    }

    public void setVerifica(boolean verifica) {
        this.verifica = verifica;
    }

    public Contato adicionarContato(Scanner info) {
        try {
            Contato contato = new Contato();
            if (contato.getIdentificador() <= 5) {
                System.out.println("Informe o nome do contato:");
                contato.setNome(info.next());
                System.out.println("Informe o número de telefone:");
                contato.setTelefone(info.next());
                return contato;
            } else {
                throw new AgendaCheiaExeption(contato.getIdentificador());
            }

        } catch (AgendaCheiaExeption e) {
            System.out.println(e.toString());
        }

        return null;
    }

    public Contato consultarContato(String nome) {
        try {
            for (int i = 0; i <= this.lista.size() - 1; i++) {
                if (!this.lista.isEmpty()) {
                    if (this.lista.get(i).getNome().equalsIgnoreCase(nome)) {
                        return this.lista.get(i);
                    } else if (i == this.lista.size() - 1) {
                        throw new ContatoNaoExisteException();
                    }
                } else {
                    break;
                }
            }

        } catch (ContatoNaoExisteException e) {
            verifica = true;
            System.out.println(e.toString());
        }

        return null;
    }

}
