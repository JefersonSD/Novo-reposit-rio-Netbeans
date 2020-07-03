package exercicios_aula_19;

/**
 *
 * @author jsjef
 */
public class Exer32 {

    public static void main(String[] args) {
//        32.Criar um vetor A com 5 elementos inteiros. Escreva um programa que imprima a tabuada de cada um dos elementos do vetor A

        int[] A = {2, 8, 9, 10, 4};
        for (int i = 0; i < A.length; i++) {
            System.out.println("");
            System.out.println("Tabuada de " + A[i]);
            for (int j = 1; j <= 10; j++) {
                System.out.println(A[i] + " X " + j + " = " + A[i] * j);
            }
        }
        // Tentativa de imprimir lado a lado sem sucesso
        /* int[] A = {2, 8, 9, 10, 4};
        String[][] matriz = new String[11][5];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    matriz[j][i] = "Tabuada de " + A[i] + "\t";
                }
                    matriz[j + 1][i] = A[i] + " X " + (j + 1) + " = " + A[i] * (j + 1)+ "\n";
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    System.out.print(matriz[j][i] + "\n");
                }
                System.out.print(matriz[j + 1][i]);

            }

        }*/
    }

}
