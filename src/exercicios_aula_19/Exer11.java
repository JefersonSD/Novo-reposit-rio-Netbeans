package exercicios_aula_19;

/**
 *
 * @author jsjef
 */
public class Exer11 {

    public static void main(String[] args) {

//        11.Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a quantidade de elementos armazenados
//           neste vetor que são pares. 
        int[] A = new int[10];
        int contador = 0;
        boolean flag;
        do {
            flag = false;
            int preencheVetor = (int) (1 + Math.random() * 99);
            for (int i = 0; i < A.length; i++) {
                if (preencheVetor == A[i]) {
                    flag = true;
                    break;
                } else if (A[i] == 0) {
                    A[i] = preencheVetor;
                    flag = true;
                    break;
                }
            }
        } while (flag == true);
        System.out.print("Números do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(" " + A[i] + " ");
            if (A[i] % 2 == 0) {
                contador++;
            }
        }
        System.out.println();
        System.out.println("Quantidade de números pares no vetor A: " + contador);
    }

}
