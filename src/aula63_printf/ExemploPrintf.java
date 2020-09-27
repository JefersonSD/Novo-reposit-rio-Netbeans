/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula63_printf;

/**
 *
 * @author jsjef
 */
public class ExemploPrintf {
    
    public static void main(String[] args) {
        
        //formatando Strings
        
        System.out.printf("Hello world %s", "Será?"); // parâmetro String 
        System.out.println();
        System.out.printf("Hello world %S", "Será?"); // parâmetro String em caixa alta
        System.out.println();
        
        //formatando Caracters
        
        System.out.printf("%c", 'c'); // parâmetro Char 
        System.out.println();
        System.out.printf("%C", 'c'); // parâmetro Char em caixa alta
        System.out.printf("%n"); // para pular uma linha com o printf
        
        //formatando Inteiros
        
        int inteiro = -12458787;
        System.out.printf("%d",inteiro);
        System.out.printf("%n");
        
        //formatando Ponto flutuante
        
        double double_ = 3.145874;
        System.out.printf("%f",double_);
        System.out.printf("%n");
        
        String olaMundo = "Olá Mundo";
        System.out.printf("%20s", olaMundo); //limitação de saída [quantidade de campos] com o printf
        System.out.printf("%n");
        System.out.printf("%-20s", olaMundo); //posicionar o valor a esquerda
        System.out.printf("%n");
        
        System.out.printf("%+d", inteiro); // O + faz aparecer o sinal a esquerda do número ( - ou +)
        System.out.printf("%n");
        
        System.out.printf("%015d", inteiro); // Limita a 15 posições e as posições não preenchidas são preenchidas com 0
        System.out.printf("%n");
        
        
        System.out.printf("%,d", inteiro); // Separa as milhagens com ,.
        System.out.printf("%n");
        
        int inteiro2 = 85478;
        System.out.printf("% d", inteiro2);/* Faz com o sinl negativo apareça [Quando o número é negativo, se o número for positivo
                                     somente é dado um espaçamento*/
        System.out.printf("%n");
        
        System.out.printf("%.3f", double_); // Limita a n casas decimais
        System.out.printf("%n");
        
        
        System.out.printf("R$%10.2f", double_); // Limita a n casas decimais
        System.out.printf("%n");
        
        testeMaisCompleto();
    }
    
    private static void testeMaisCompleto(){
        
        double [] precos = {1, 12.254, 154.8745, 1, 10000};
        
        
        for (int i = 0; i < precos.length; i++) {
            
            System.out.printf("%s %02d total de: R$%,10.2f%n", "Item", i+1, precos[i]);
            
        }
    
    }
}
