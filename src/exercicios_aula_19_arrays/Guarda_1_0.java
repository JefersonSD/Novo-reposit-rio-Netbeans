package exercicios_aula_19_arrays;

/**
 *
 * @author jsjef
 */
public class Guarda_1_0 {

    public static void main(String[] args) {
//       26.Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C de mesmo tipo e tamanho, obedecendo as 
//       seguintes regras de formação: 
//            a) C[i] deverá receber 1 quando A[i] for maior que B[i]; 
//            b) C[i] deverá receber 0 quando A[i] for igual a B[i]; 
//            c) C[i] deverá receber -1 quando A[i] for menor que B[i]. 

        int[] A = new int[10];
        int[] B = new int[A.length];
        int[] C = new int[B.length];
        for (int i = 0; i < A.length; i++) {

            A[i] = (int) (1 + Math.random() * 99);
            B[i] = (int) (1 + Math.random() * 99);
        }
        for (int i = 0; i < C.length; i++) {
            if (A[i] > B[i]) {
                C[i] = 1;
            } else if (A[i] == B[i]) {
                C[i] = 0;
            } else {
                C[i] = -1;
            }
        }
        System.out.println("Valores do vetores A, B e C:");
        System.out.print("A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(" [" + A[i] + "] ");
        }
        System.out.println();
        System.out.print("B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print(" [" + B[i] + "] ");
        }
        System.out.println();
        System.out.print("C:");
        for (int i = 0; i < C.length; i++) {
            System.out.print(" [" + C[i] + "] ");
        }
        System.out.println();
    }

}
