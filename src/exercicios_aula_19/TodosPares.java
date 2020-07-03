package exercicios_aula_19;

/**
 *
 * @author jsjef
 */
public class TodosPares {

    public static void main(String[] args) {
//        23.Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique se "todos" os elementos do vetor A 
//        são pares. Se pelo menos um elemento do vetor não for par o processo de repetição para percorrer os elementos do vetor 
//        deve ser encerrado, como sugestão: utilize uma variável do tipo flag para atingir este propósito.

        int[] A = new int[10];
        boolean flag = false;
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (1 + Math.random() * 10);
        }
        System.out.println();

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) {
                flag = true;
                System.out.print("Encontrado elemento impar:");
                System.out.print(" [" + A[i] + "] ");
                break;
            }
        }

        if (flag == false) {
            System.out.print("Todos os elementos do vetor A são pares:");
            for (int i = 0; i < A.length; i++) {
                System.out.print(" [" + A[i] + "] ");
            }
        }
        System.out.println();
    }

}
