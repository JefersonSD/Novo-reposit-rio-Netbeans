package exercicios_aula_16_e_17;

import java.util.Scanner;

public class CalculaVotos {

    public static void main(String[] args) {
        /*
		 * 26 - Numa eleição existem três candidatos. Faça um programa que peça o número
		 * total de eleitores. Peça para cada eleitor votar e ao final mostrar o número
		 * de votos de cada candidato.
         */

        Scanner t = new Scanner(System.in);
        System.out.println("Informe o número de eleitores:");
        int nEleitores = t.nextInt(), contador = 0;
        int cand1 = 41, cand2 = 42, cand3 = 43, voto;
        double votosCand1 = 0, votosCand2 = 0, votosCand3 = 0;
        for (int i = 1; i <= nEleitores; i++) {
            contador++;
            System.out.println("Voto do " + contador + "º eleitor:\n (41 - José  42 - Floriano ou 43 - Adalberto)");
            voto = t.nextInt();
            while (voto != 41 && voto != 42 && voto != 43) {

                System.out.println("Candidato inválido!\n Vote (41 - José 42 - Floriano ou 43 - Adalberto):");
                voto = t.nextInt();
            }
            switch (voto) {
                case 41:
                    votosCand1++;
                    break;
                case 42:
                    votosCand2++;
                    break;
                default:
                    votosCand3++;
                    break;
            }
        }
        System.out.println("Número de votos do candidato José: " + votosCand1);
        System.out.println("Número de votos do candidato Floriano: " + votosCand2);
        System.out.println("Número de votos do candidato Adalberto: " + votosCand3);
    }

}
