package exercicios_aula_19_arrays;

/**
 *
 * @author jsjef
 */
public class GuardaSubtracao {

    public static void main(String[] args) {

//         7. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a subtração 
//            dos respectivos elementos em A e B, ou seja: C[i] = A[i] – B[i].
        int[] A = {11, 2, 9, 65, 14, 15, 12, 17, 19, 87};
        int[] B = {10, 4, 1, 68, 19, 12, 18, 15, 11, 81};
        int[] C = new int[B.length];

        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] - B[i];
        }
        System.out.print("Números no vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("[" + A[i] + "]");
        }
        System.out.println();
        System.out.print("Números no vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print("[" + B[i] + "]");
        }
        System.out.println();
        System.out.print("Números no vetor C:");
        for (int i = 0; i < C.length; i++) {
            System.out.print("[" + C[i] + "]");
        }
        System.out.println();

    }

}
