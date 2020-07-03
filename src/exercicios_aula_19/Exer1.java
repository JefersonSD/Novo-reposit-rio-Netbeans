package exercicios_aula_19;

/**
 *
 * @author jsjef
 */
public class Exer1 {

    public static void main(String[] args) {

//     1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os "mesmos" elementos do vetor A,
//     ou seja, B[i] = A[i].
        int[] A = {1, 2, 3, 4, 5};
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {

            B[i] = A[i];

        }
        System.out.print("Números no vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(" [ " + A[i] + " ] ");
        }
        System.out.println();
        System.out.print("Números no vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print(" [ " + B[i] + " ] ");
        }
        System.out.println();
    }

}
