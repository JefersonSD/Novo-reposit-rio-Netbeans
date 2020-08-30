/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula37_heranca;

/**
 *
 * @author jsjef
 */
public class Teste {
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
       // usando a herança ambos os objetos tem acesso aos atrbutos da super classe Pessoa
       aluno.setNome("Alessandro");
       professor.setNome("Genivaldo");
       
       //Estanciando um objeto aluno do tipo da super classe
       Pessoa aluno1 = new Aluno();
       
       // com isso o objeto aluno1 não terá acesso aos atributos específicos da classe aluno somente aos da super classe Pessoa
       aluno1.setCpf("5847");
       
       
    }
}
