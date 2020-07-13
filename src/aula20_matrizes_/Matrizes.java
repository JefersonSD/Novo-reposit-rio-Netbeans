/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20_matrizes_;

/**
 *
 * @author jsjef
 */
public class Matrizes {
    public static void main(String[] args) {
        
        double [][] notasAlunos = new double [3][4];
        
        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;
        
        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;
        
        notasAlunos[2][0] = 10;
        notasAlunos[2][1] = 7;
        notasAlunos[2][2] = 9;
        notasAlunos[2][3] = 9.5;
        
    //imprimindo a matriz
    
        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j]+" ");
            }
            System.out.println("");
        }
    //alterando valor da matriz
    
         notasAlunos[0][3] = 15;
         System.out.println("");
        
          for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j]+" ");
            }
            System.out.println("");
        }
     //Calculando a média de cada aluno
     
        System.out.println("Calculando a média de cada aluno:");
        double soma;
        int cont;
        for (int i = 0; i < notasAlunos.length; i++) {
            soma = 0;
            cont = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
                cont++;
            }
            System.out.println("A média do " + (i+1) + "° aluno é " + (soma/cont));
        }
        
        //Inicializando uma matriz com valores
        
        double [][] matriz = {{0,1,2},{0,1,2}};
    }
    
}
