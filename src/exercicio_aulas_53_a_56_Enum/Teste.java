/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_aulas_53_a_56_Enum;

/**
 *
 * @author jsjef
 */
public class Teste {

    public static void main(String[] args) {

        double x = 6;
        double y = 3;

        for (OperacoesMatematicas operacoes : OperacoesMatematicas.values()) {
//            
//            System.out.println("Operação:" + "(" + operacoes + ")"
//                               + " " + "Resultado: " + operacoes.executarOperacao(x, y));

            System.out.println(x + " " + operacoes + " " + y + " = " + operacoes.executarOperacao(x, y));

        }

    }

}
