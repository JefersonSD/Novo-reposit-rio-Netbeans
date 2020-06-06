package exercicios_aula_19;
/**
 *
 * @author jsjef
 */
public class Exer31 {

    public static void main(String[] args) {
//        31.Ler um vetor A com 20 elementos. Separar os elementos pares e ímpares de A utilizando apenas um vetor extra B. Sugestão: 
//        no início do vetor B armazene os elementos pares de A e nas posições restantes do vetor B armazene os elementos de A que são 
//        ímpares.

        int[] A = new int[20];
        int[] B = new int[20];
        int contPar = 0, contImpar = 0;
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (1 + Math.random() * 9);
            if (A[i] % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }
        contImpar = contPar;
        contPar = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                B[contPar] = A[i];
                contPar++;
            } else {
                B[contImpar] = A[i];
                contImpar++;
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
