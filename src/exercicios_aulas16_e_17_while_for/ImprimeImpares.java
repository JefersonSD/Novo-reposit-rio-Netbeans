package exercicios_aulas16_e_17_while_for;

public class ImprimeImpares {

    public static void main(String[] args) {
        // 9 - Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.

        for (int i = 0; i < 50; i++) {

            if (i % 2 != 0) {
                if (i == 1) {
                    System.out.println("Numéros ímpares entre 1 e 50:");
                }
                System.out.print("[" + i + "]");
            }
            
        }
        System.out.println();
    }

}
