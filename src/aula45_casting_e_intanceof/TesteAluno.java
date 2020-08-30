/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula45_casting_e_intanceof;

/**
 *
 * @author jsjef
 */
public class TesteAluno {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Object obj = aluno; // Upcasting

        // Fazer casting manual
        Object obj1 = new Aluno(); //Isso
        Object obj2 = (Object) new Aluno(); // É o mesmo que isso 

        Object obj3 = new Object();
        Aluno aluno1 = (Aluno) obj3; // Downcasting [erro em tempo de execução]

    }

}
