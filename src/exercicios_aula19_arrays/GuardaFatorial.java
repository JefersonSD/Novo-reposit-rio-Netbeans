package exercicios_aula19_arrays;

/**
 *
 * @author jsjef
 */
public class GuardaFatorial {

    public static void main(String[] args) {
//         37.Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor B 
//         seja o fatorial do elemento correspondente em A.

        int[] A = new int[3];
        long[] B = new long[A.length];
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (1 + Math.random() * 19);
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = A[i] - 1; j > 1; j--) {
                if (j == A[i] - 1) {
                    B[i] = A[i];
                }
                B[i] *= j;
            }
        }
        System.out.print("Elementos do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("[" + A[i] + "]");
        }
        System.out.println();
        System.out.print("Elementos do vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print("[" + B[i] + "]");
        }
        System.out.println();

    }

}
