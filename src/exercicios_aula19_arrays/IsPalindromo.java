package exercicios_aula19_arrays;

/**
 *
 * @author jsjef
 */
public class IsPalindromo {

    public static void main(String[] args) {

//        24.Números palíndromos são aqueles que escritos da direita para a esquerda têm o mesmo valor quando escritos da esquerda 
//        para a direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um programa que verifique se um dado vetor A de 10 
//        elementos inteiros é um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao último, se o segundo elemento do 
//        vetor é igual ao penúltimo e assim por diante até verificar todos os elementos ou chegar a conclusão que o vetor não é um 
//        palíndromo. 
        int[] A = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        //int [] A = {2,5,9,7,3,8,11,12,15};
        int contador = 0;
        for (int i = 0, j = A.length - 1; i < A.length / 2; i++, j--) {
            if (A[i] == A[j]) {
                contador++;
            }else{
                break;
            }
        }
        if (contador == A.length / 2) {
            System.out.print("O vetor contém elementos palíndromos: ");
            for (int i = 0; i < A.length; i++) {
                System.out.print(A[i]);
            }
            System.out.println();
        } else {
            System.out.print("O vetor não contém elementos palíndromos: ");
            for (int i = 0; i < A.length; i++) {
                System.out.print(A[i]);
            }
            System.out.println();
        }
    }

}
