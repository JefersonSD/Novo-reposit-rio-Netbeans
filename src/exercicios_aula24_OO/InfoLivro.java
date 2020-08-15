/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula24_OO;

/**
 *
 * @author jsjef
 */
public class InfoLivro {
    public static void main (String [] args){
        
        Livro livros = new Livro();
        livros.ISBN = "10-64-85-87-89";
        livros.anoPublicacao = 1997;
        livros.autor = "Jhon Travolta";
        livros.editora = "São Paulo";
        livros.genero = "Romance";
         
        System.out.println("Genero do livro " + livros.genero);
        
        
        
        
    }
}
