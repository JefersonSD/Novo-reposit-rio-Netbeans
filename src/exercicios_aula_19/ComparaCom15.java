package exercicios_aula_19;

/**
 *
 * @author jsjef
 */
public class ComparaCom15 {

    public static void main(String[] args) {
//        16.Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e escreva: 
//             a) a soma de elementos armazenados neste vetor que são inferiores a 15; 
//             b) a quantidade de elementos armazenados no vetor que são iguais a 15; e
//             c) a média dos elementos armazenados no vetor que são superiores a 15.
        int somaMenor15 = 0, iguaisA15 = 0, mediaSuperiorA15 = 0;
        int[] A = {10, 48, 2, 45, 15, 4, 9, 7, 13, 14};
        double contador = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 15) {
                somaMenor15 += A[i];
            } else if (A[i] == 15) {
                iguaisA15++;
            } else {
                mediaSuperiorA15 += A[i];
                contador++;
            }
        }
        System.out.print("Elementos do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(" [" + A[i] + "] ");
        }
        System.out.println();
        System.out.println("Soma dos elementos armazenados no vetor A que são inferiores a 15: " + somaMenor15);
        System.out.println("Quantidade de elementos armazenados no vetor A que são iguais a 15: " + iguaisA15);
        System.out.printf("Média dos elementos armazenados no vetor A que são superiores a 15: %.2f\n", mediaSuperiorA15 / contador);

    }
}
