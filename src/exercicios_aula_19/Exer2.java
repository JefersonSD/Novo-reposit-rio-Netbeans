package exercicios_aula_19;

/**
 *
 * @author jsjef
 */
public class Exer2 {

    public static void main(String[] args) {

//        2. Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os elementos do vetor A 
//        multiplicados por 2, ou seja: B[i] = A[i] * 2.
        int[] A = {5, 8, 9, 11, 2, 6, 18, 74};
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {

            B[i] = A[i] * 2;

        }
        System.out.print("Elementos no vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(" " + A[i] + " ");
        }
        System.out.println();
        System.out.print("Elementos no vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print(" " + B[i] + " ");
        }
        System.out.println();
    }

}
