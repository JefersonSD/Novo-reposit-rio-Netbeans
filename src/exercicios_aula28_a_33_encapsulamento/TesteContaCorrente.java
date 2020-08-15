/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula28_a_33_encapsulamento;

/**
 *
 * @author jsjef
 */
public class TesteContaCorrente {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        boolean saqueEfetuado;
        conta.depositarMoney(1000);
        saqueEfetuado = conta.sacarMoney(2100);
        if (saqueEfetuado) {
            System.out.println("Saque realizado com sucesso!");
            conta.consultaSaldo();
            if (conta.getLimite() < 1000) {
                System.out.println("Cliente está usando cheque especial!");
            }

        } else {
            System.out.println("Você não possui saldo suficiente em conta!");
            conta.consultaSaldo();

        }

    }

}
