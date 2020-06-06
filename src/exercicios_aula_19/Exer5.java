
package exercicios_aula_19;

/**
 *
 * @author jsjef
 */
public class Exer5 {
    public static void main(String[] args) {
        
//        5. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B 
//           deverá ser o respectivo elemento de A multiplicado por sua posição (ou índice), ou seja: B[i] = A[i] * i.
    
        int[] A = {11, 2, 9, 65, 14, 15, 12, 17, 19, 87};
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * (i+1);
        }
          System.out.print("Números no vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("[" + A[i] + "]");
        }
        System.out.println();
        System.out.print("Números no vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print("["+ B[i] + "]");
        }
        System.out.println();
    }
    
}
