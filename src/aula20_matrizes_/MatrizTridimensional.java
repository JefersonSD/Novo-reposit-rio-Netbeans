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
public class MatrizTridimensional {
    public static void main(String[] args) {
        
        int [][][] matrizTridimensional = new int [3][3][3];
        int soma = 0, somaPares = 0, somaImpares = 0;
        for(int i = 0; i <  matrizTridimensional.length; i++){
            for (int j = 0; j < matrizTridimensional[i].length; j++) {
                for (int k = 0; k < matrizTridimensional[i][j].length; k++) {
                    
                    soma += matrizTridimensional[i][j][k] = i+j+k;
                    
                    if(matrizTridimensional[i][j][k] % 2 == 0){
                        somaPares += matrizTridimensional[i][j][k];
                    }else{
                        somaImpares += matrizTridimensional[i][j][k];
                    }
                }
                
            }
        }
        System.out.println("Soma dos valores da matriz tridimensional: " +soma);
        System.out.println("Soma dos valores pares da matriz tridimensional: " +somaPares);
        System.out.println("Soma dos valores ímpares da matriz tridimensional: " +somaImpares);
    }
    
}
