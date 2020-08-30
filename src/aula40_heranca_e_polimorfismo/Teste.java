/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula40_heranca_e_polimorfismo;
/**
 *
 * @author jsjef
 */
public class Teste {
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();
        Pessoa p1 = new Aluno();
        Pessoa p2 = new Professor();
        
        p.setEndereco("Rua 1, casa 1");
        p1.setEndereco("Rua 2, casa 2");
        p2.setEndereco("Rua 3, casa 3");
        
        System.out.println(p.obterEndereco());
        System.out.println(p1.obterEndereco());
        System.out.println(p2.obterEndereco());
    }
    
}
