package exercicios_aula_19_arrays;

/**
 *
 * @author jsjef
 */
public class GuardaVogais {

    public static void main(String[] args) {
//        27.Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, obedecendo as seguintes regras de 
//        formação: 
//            a) B[i] deverá receber 'a' quando A[i] for menor que 7; 
//            b) B[i] deverá receber 'b' quando A[i] for igual a 7; 
//            c) B[i] deverá receber 'c' quando A[i] for maior que 7 e menor que 10; 
//            d) B[i] deverá receber 'd' quando A[i] for igual a 10; e 
//            e) B[i] deverá receber'e' quando A[i] for maior que 10. 
//            Sugestão: char B[10];

        int[] A = new int[10];
        char[] B = new char[A.length];
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (1 + Math.random() * 15);
            if (A[i] < 7) {
                B[i] = 'a';
            } else if (A[i] == 7) {
                B[i] = 'b';
            } else if (A[i] > 7 && A[i] < 10) {
                B[i] = 'c';
            } else if (A[i] == 10) {
                B[i] = 'd';
            } else {
                B[i] = 'e';
            }
        }
        System.out.print("Valores do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(" {" + A[i] + "} ");
        }
        System.out.println();
        System.out.print("Caracteres do vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print(" {" + B[i] + "} ");
        }
        System.out.println();

    }

}
