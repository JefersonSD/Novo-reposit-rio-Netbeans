package exercicios_aulas_16_e_17_while_for;

import java.util.ArrayList;
import java.util.List;

public class AcidentesTransito {

    public static void main(String[] args) {
//		40 - Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito. Foram 
//              obtidos os seguintes dados:
//				a - Código da cidade;
//				b - Número de veículos de passeio (em 1999);
//				c - Número de acidentes de trânsito com vítimas (em 1999). Deseja-se saber:
//				d - Qual o maior e menor índice de acidentes de transito e a que cidade pertence;
//				e - Qual a média de veículos nas cinco cidades juntas;
//				f - Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.
        List<Double> lista = new ArrayList();
        String cidade1 = "", cidade2 = "", cidade3 = "", cidade4 = "", cidade5 = "";
        double quant1 = 0, quant2 = 0, quant3 = 0, quant4 = 0, quant5 = 0;
        double acidentes1 = 0, acidentes2 = 0, acidentes3 = 0, acidentes4 = 0, acidentes5 = 0;
        double maior = 0, menor = 0, mediaGeral = 0, mediaMenos_2000 = 0;
        int contador = 0;
        for (int i = 1; i <= 5; i++) {
            switch (i) {
                case 1:
                    cidade1 = "BH";
                    break;
                case 2:
                    cidade2 = "SP";
                    break;
                case 3:
                    cidade3 = "RJ";
                    break;
                case 4:
                    cidade4 = "MG";
                    break;
                case 5:
                    cidade5 = "RN";
                    break;
            }
        }

        do {
            contador++;
            int quantidade = (int) (500 + Math.random() * 2500);
            switch (contador) {
                case 1:
                    quant1 = quantidade;
                    break;
                case 2:
                    quant2 = quantidade;
                    break;
                case 3:
                    quant3 = quantidade;
                    break;
                case 4:
                    quant4 = quantidade;
                    break;
                default:
                    quant5 = quantidade;
                    break;
            }

        } while (contador < 5);

        if (quant1 >= 500 && quant1 <= 1500) {
            acidentes1 += (quant1 / 100) * 9;
            lista.add(acidentes1);
            menor = acidentes1;
        } else if (quant1 > 1500 && quant1 <= 2500) {
            acidentes1 += (quant1 / 100) * 10;
            lista.add(acidentes1);
            menor = acidentes1;
        } else {
            acidentes1 += (quant1 / 100) * 11;
            lista.add(acidentes1);
            menor = acidentes1;
        }
        if (quant2 >= 500 && quant2 <= 1500) {
            acidentes2 += (quant2 / 100) * 9;
            lista.add(acidentes2);
        } else if (quant2 > 1500 && quant2 <= 2500) {
            acidentes2 += (quant2 / 100) * 10;
            lista.add(acidentes2);
        } else {
            acidentes2 += (quant2 / 100) * 11;
            lista.add(acidentes2);
        }
        if (quant3 >= 500 && quant3 <= 1500) {
            acidentes3 += (quant3 / 100) * 9;
            lista.add(acidentes3);
        } else if (quant3 > 1500 && quant3 <= 2500) {
            acidentes3 += (quant3 / 100) * 10;
            lista.add(acidentes3);
        } else {
            acidentes3 += (quant3 / 100) * 11;
            lista.add(acidentes3);
        }
        if (quant4 >= 500 && quant4 <= 1500) {
            acidentes4 += (quant4 / 100) * 9;
            lista.add(acidentes4);
        } else if (quant4 > 1500 && quant4 <= 2500) {
            acidentes4 += (quant4 / 100) * 10;
            lista.add(acidentes4);
        } else {
            acidentes4 += (quant4 / 100) * 11;
            lista.add(acidentes4);
        }
        if (quant5 >= 500 && quant5 <= 1500) {
            acidentes5 += (quant5 / 100) * 9;
            lista.add(acidentes5);
        } else if (quant5 > 1500 && quant5 <= 2500) {
            acidentes5 += (quant5 / 100) * 10;
            lista.add(acidentes5);
        } else {
            acidentes5 += (quant5 / 100) * 11;
            lista.add(acidentes5);
        }
        contador = 0;
        int aux1 = 0, aux2 = 0;
        String cidadeMais = "", cidadeMenos = "";
        for (double maiorMenor : lista) {
            contador++;
            if (maiorMenor >= maior) {
                maior = maiorMenor;
                aux1 = contador;
            }
            if (maiorMenor <= menor) {
                menor = maiorMenor;
                aux2 = contador;
            }
        }

        switch (aux1) {
            case 1:
                cidadeMais = cidade1;
                break;
            case 2:
                cidadeMais = cidade2;
                break;
            case 3:
                cidadeMais = cidade3;
                break;
            case 4:
                cidadeMais = cidade4;
                break;
            case 5:
                cidadeMais = cidade5;
                break;
        }

        switch (aux2) {
            case 1:
                cidadeMenos = cidade1;
                break;
            case 2:
                cidadeMenos = cidade2;
                break;
            case 3:
                cidadeMenos = cidade3;
                break;
            case 4:
                cidadeMenos = cidade4;
                break;
            case 5:
                cidadeMenos = cidade5;
                break;
        }
        contador = 0;
        if (quant1 < 2000) {
            mediaMenos_2000 += acidentes1;
            contador++;
        }
        if (quant2 < 2000) {
            mediaMenos_2000 += acidentes2;
            contador++;
        }
        if (quant3 < 2000) {
            mediaMenos_2000 += acidentes3;
            contador++;
        }
        if (quant4 < 2000) {
            mediaMenos_2000 += acidentes4;
            contador++;
        }
        if (quant5 < 2000) {
            mediaMenos_2000 += acidentes5;
            contador++;
        }

        mediaGeral = (quant1 + quant2 + quant3 + quant4 + quant5) / 5;
        mediaMenos_2000 /= contador;

        System.out.printf("Maior índice de acidentes: %.0f\nCidade: %s\n\nMenor índice de acidentes: %.0f\nCidade: %s\n\nMédia geral "
                + "de veículos nas 5 cidades: %.2f\n\nMédia de acidentes de trânsito nas cidades com menos de 2.000 veículos "
                + "de passeio: %.2f\n", maior, cidadeMais, menor, cidadeMenos, mediaGeral, mediaMenos_2000);
    }

}
