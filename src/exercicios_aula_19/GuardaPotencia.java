
package exercicios_aula_19;

/**
 *
 * @author jsjef
 */
public class GuardaPotencia {
    public static void main(String[] args) {
//        36.Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que cada elemento do vetor A é formado pela potência de base 
//        2 elevado ao expoente igual a posição do respectivo elemento, ou seja: A[i] = 2i . Sugestão int A[11]; 
    
        double [] A = new double [11];
        for (int i = 0; i < A.length; i++) {
            A[i] = Math.pow(2, i);
        }
        System.out.print("Valores no vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.printf("[ %.0f ]", A[i]);
        }
        System.out.println();
    }
    
}
