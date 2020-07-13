/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula_20_matrizes;

/**
 *
 * @author jsjef
 */
public class Teste {
    public static void main(String[] args) {
      int [][] teste = new int [3][3];
      
      teste[0][0] = 200;
      teste[0][1] = 300;
      teste[0][2] = 400;
      teste[1][0] = 500;
      teste[1][1] = 600;
      teste[1][2] = 700;
      teste[2][0] = 800;
      teste[2][1] = 900;
      teste[2][2] = 1000;
        for (int i = 0; i < teste.length; i++) {
            for (int j = 0; j < teste[i].length; j++) {
                System.out.println(teste[j][i]);
                
            }
            
        }
    }
    
}
