package exercicios_aula_19_arrays;

/**
 *
 * @author jsjef
 */
public class JuntaVetores {

    public static void main(String[] args) {
//        29.Ler dois vetores A e B com 10 elementos cada. Construir um vetor C, sendo este a junção dos dois outros vetores. Os primeiros 
//        10 elementos de C deverão receber os elementos de A e os últimos elementos C deverão receber os elementos de B. Desta forma, C 
//        deverá ter o dobro de elementos de A e B, ou seja, 20 elementos. 

        int[] A = new int[10];
        int[] B = new int[A.length];
        int[] C = new int[A.length + B.length];
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (1 + Math.random() * 9);
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = (int) (11 + Math.random() * 9);
        }
        for (int i = 0, j = C.length - 10; i < C.length / 2; i++, j++) {
            C[i] = A[i];
            C[j] = B[i];
        }
        System.out.print("Elementos do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(" [" + A[i] + "] ");
        }
        System.out.println();
        System.out.print("Elementos do vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print(" [" + B[i] + "] ");
        }
        System.out.println();
        System.out.print("Elementos do vetor C:");
        for (int i = 0; i < C.length; i++) {
            System.out.print(" [" + C[i] + "] ");
        }
        System.out.println();
    }

}
