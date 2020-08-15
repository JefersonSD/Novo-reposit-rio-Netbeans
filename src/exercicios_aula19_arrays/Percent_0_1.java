package exercicios_aula19_arrays;

/**
 *
 * @author jsjef
 */
public class Percent_0_1 {

    public static void main(String[] args) {

//        22.Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1, sugestão: A[i] = 
//        (int)Math.round(Math.random() * 1); Pede-se para implementar um programa que determine o percentual 
//        de números 0's e 1's existentes no vetor A.
        int[] A = new int[10];
        int cont0 = 0, cont1 = 0;
        double percent0 = 0, percent1 = 0;
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) Math.round(Math.random() * 1);
            //A[i] = (int) (10 + Math.random() * 12);
            if (A[i] == 1) {
                cont1++;
            } else {
                cont0++;
            }
        }
        for (double i = 0.01; i <= 1; i += 0.01) {
            percent0 = 10 * i;
            if (percent0 >= cont0) {
                percent0 = i * 100;
                break;
            }
        }
        for (double i = 0.01; i <= 1; i += 0.01) {
            percent1 = 10 * i;
            if (percent1 >= cont1) {
                percent1 = i * 100;
                break;
            }
        }
        System.out.print("Valores do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("["+A[i]+"]");
        }
        System.out.println();
        System.out.println("Porcentagem de números 0 no vetor A: " + Math.floor(percent0) + "%");
        System.out.println("Porcentagem de números 1 no vetor A: " + Math.floor(percent1) + "%");

    }

}
