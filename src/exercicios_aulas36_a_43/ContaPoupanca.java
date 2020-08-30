/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aulas36_a_43;

/**
 *
 * @author jsjef
 */
public class ContaPoupanca extends ContaBancaria {

    private int diaRendimento;

    public ContaPoupanca() {
        this.diaRendimento = 1;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(double taxaRendimento) {
        if (this.diaRendimento == 1) {
            double rendimento = (taxaRendimento / 100) * super.getSaldo();
            System.out.println("Atenção cliente!\nRendimento de " + taxaRendimento + "%\nSaldo anterior: " + super.getSaldo());
            super.setSaldo(super.getSaldo() + rendimento);
            System.out.println("Saldo atualizado " + super.getSaldo());
        }
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > super.getSaldo()) {
            return false;
        }
        super.setSaldo(super.getSaldo() - valor);
        return true;

    }

    @Override
    public void depositar(double valor) {

        super.setSaldo(super.getSaldo() + valor);
        System.out.println("Depósito efetuado com sucesso!\nSaldo: " + super.getSaldo());
    }

    @Override
    public String toString() {
        return "Nome do Cliente: " + super.getNomeCliente() + "\n" + "Número da conta: " + super.getNumConta() + "\n"
                + "Saldo atual em conta: " + super.getSaldo();
    }

}
