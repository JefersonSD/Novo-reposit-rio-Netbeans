package exercicios_aula_19;

/**
 *
 * @author jsjef
 */
public class Exer30 {

    public static void main(String[] args) {
//        30.Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo que nos vetores B e C serão armazenados os valores 
//        pares e ímpares de A, respectivamente.

        int[] A = new int[20];
        int[] B = null;
        int[] C = null;
        int contPar = 0, contImpar = 0;
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (1 + Math.random() * 19);
            if (A[i] % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }
        if(contPar != 0){
            B = new int[contPar];
        }
        if(contImpar != 0){
             C = new int[contImpar];
        }
        int contadorB = 0, contadorC = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                B[contadorB] = A[i];
                contadorB++;
            } else {
                C[contadorC] = A[i];
                contadorC++;
            }
        }
        System.out.print("Elementos do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("[" + A[i] +"]");
        }
        System.out.println();
        System.out.print("Elementos do vetor B (Pares):");
        for (int i = 0; i < B.length; i++) {
            System.out.print("[" + B[i] + "]");
        }
        System.out.println();
        System.out.print("Elementos do vetor C (Impares):");
        for (int i = 0; i < C.length; i++) {
            System.out.print("[" + C[i] + "]");
        }
        System.out.println();
    }

}
