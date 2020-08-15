/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula36_tem_um_tem_muitos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jsjef
 */
public class Agenda {

//    1. Escreva  uma  classe  Agenda,  que  contém  vários  contatos  do  tipo  Contato.   Cada  contato  possui  nome,  
//       telefone  e  email.  A  Agenda  também  possui  um   nome.  Crie  um  programa  teste  que  peça  para  o  usuário  
//       entrar  com  o   nome  da  Agenda  e  em  seguida  3  contatos.  Crie  métodos  que  retornem   uma  String  com  
//       a  informação  de  cada  contato  e  também  de  todos  os   contatos  da  agenda. 
    private String nome;
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }



}
