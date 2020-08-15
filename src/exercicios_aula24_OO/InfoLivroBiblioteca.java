/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula24_OO;

import java.util.Date;

/**
 *
 * @author jsjef
 */
public class InfoLivroBiblioteca {
    public static void main(String[] args) {
        
        LivroBiblioteca livros  = new LivroBiblioteca();
        
        livros.ISBN = "9-8-5-822-558";
        livros.anoPublicacao = 1998;
        livros.genero = "Suspense";
        livros.devolveu = true;
        livros.dataEmprestimo = new Date();
       
    }
}
