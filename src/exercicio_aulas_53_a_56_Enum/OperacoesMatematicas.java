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
public enum OperacoesMatematicas {

    SOMAR("+") {
        @Override
        public double executarOperacao(double x, double y) {
            return x + y;
        }
    }, SUBTRAIR("-") {
        @Override
        public double executarOperacao(double x, double y) {
            return x - y;
        }
    }, MULTIPLICAR("*") {
        @Override
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    }, DIVIDIR("/") {
        @Override
        public double executarOperacao(double x, double y) {
            return x / y;
        }
    };

    String symbol;

    OperacoesMatematicas(String symbol) {

        this.symbol = symbol;

    }

    public abstract double executarOperacao(double x, double y);

    @Override
    public String toString() {
        return this.symbol;
    }

}
