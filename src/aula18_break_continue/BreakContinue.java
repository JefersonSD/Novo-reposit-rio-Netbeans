package aula18_break_continue;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class BreakContinue {

    public static void main(String[] args) {
        
        //Exemplo de Label

        /*for (int i = 0; i <= 4; i++) {

            rotulo1:{
                rotulo2:{
                    rotulo3:{
                        if (i == 1) {
                            break rotulo1;
                        }
                        if (i == 2) {
                            break rotulo2;
                        }
                        if (i == 3) {
                            break rotulo3;
                        }
                        System.out.println("Rótulo 3");
                    }
                    System.out.println("Rótulo 2");
                }
                System.out.println("Rótulo 1");
            }
            System.out.println(i);
        }*/
        
        // Exemplo de continue
        
        Scanner t = new Scanner(System.in);
        System.out.println("Entre com um valor:");
        int valor = t.nextInt();
        System.out.println("Entre com um valor máximo:");
        int valorMax = t.nextInt();
        
        for (int i = valor; i < valorMax; i++) {
            
            if(i%5 == 0){
                continue;
            }
            System.out.println("O valor de i é " + i);
        }
        
        

    }

}


    

