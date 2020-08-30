/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula43_classe_object;

/**
 *
 * @author jsjef
 */
public class Teste {
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno();
        
        double notas [] = {10, 8, 9, 10};
        aluno.setNotas(notas);
        
        String cursos [] = {"Matemática, Portugues"};
        aluno.setCursos(cursos);
        
        double notas2 [] = {10, 9, 11, 5};
        aluno2.setNotas(notas2);
        
        String cursos2 [] = {"Matemática, Inglês"};
        aluno2.setCursos(cursos2);
        
        //System.out.println(aluno);
        
        String a = "sdefrt";
        String b = "sdefrT";
        
        //System.out.println(a.equalsIgnoreCase(b));
        System.out.println(aluno.equals(aluno2));
        
    }
    
}
