
package exercicios_aula19_arrays;

import java.text.DecimalFormat;

/**
 *
 * @author jsjef
 */
public class CotacaoDolar {
    public static void main(String[] args) {
//        20.Implementar um programa que obtenha a cotação do dólar (U$) em relação ao real (R$) e a seguir armazene em vetor A com 20 
//        elementos as seguintes conversões: 
//        21.A[i] = cotação do dolar * i, para todo i variando de 1 até 20. 
        
        double [] A = new double[20];
        double cotacao = 4.96;
        for (int i = 0; i < A.length; i++) {
            A[i] = cotacao * (i+1);
        }
        DecimalFormat f = new DecimalFormat("##,##.##");
        System.out.println("VAlores no vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.println(" ["+f.format(A[i])+"] ");
            //System.out.println(" ["+(A[i])+"] ");
        }
        
    
    }
    
}
