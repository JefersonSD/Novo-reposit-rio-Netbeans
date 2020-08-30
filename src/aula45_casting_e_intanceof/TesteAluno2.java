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
public class TesteAluno2 {

    public static void main(String[] args) {

        // DownCastings permitidos
        
        Object obj = retornaString(); // funciona porque o obj é inicializado com uma String
        String s = (String) obj;
        
        Object obj2 = "Minha String"; // Já trata-se de um Upcasting
        String s1 = (String) obj2; // Funciona da mesma forma pelo mesmo motivo do exemplo anterior
        
        //Outro tipo de Downcasting não permitido
        
        Object obj3 = new Object();
        String s2 = (String) obj3; // Ocorre erro de execução porque o obj3 não faz referência a uma String

        Object Obj4 = retornaInt();
        String s3 = (String) Obj4; // Ocorre erro de execução porque o obj4 faz referência a um inteiro

    }

    static String retornaString() {

        return "minha String";
    }
    static int retornaInt() {

        return 1;
    }
}
