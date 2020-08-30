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
public class ContaEspecial extends ContaBancaria {

    private double limite;

    public ContaEspecial() {
        this.limite = 1000;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        double calculo;
        if (valor > super.getSaldo() + this.limite) {
            return false;
        } else if (valor > super.getSaldo()) {
            calculo = super.getSaldo() - valor;
            this.limite += calculo;
            super.setSaldo(0);
            return true;
        }

        super.setSaldo(super.getSaldo() - valor);
        return true;

    }

    @Override
    public void depositar(double valor) {
        double calculo;
        if (super.getSaldo() == 0) {
            if (valor > 1000 - this.limite) {
                calculo = this.limite - 1000;
                this.limite = 1000;
                super.setSaldo(valor + calculo);
            } else {
                this.limite += valor;
            }
        } else {
            super.setSaldo(super.getSaldo() + valor);
        }
        System.out.println("Depósito realizado!\nSaldo em conta: " + super.getSaldo() + "\n"
                + "Limite: " + this.limite + "\nSaldo + Limite: " + (super.getSaldo() + this.limite));
    }

    @Override
    public String toString() {
        return "Nome do Cliente: " + super.getNomeCliente() + "\n" + "Número da conta: " + super.getNumConta() + "\n"
                + "Saldo atual em conta: " + super.getSaldo() + "\n" + "Limite disponível para saque: " + this.limite + "\n"
                + "Saldo + Limite: " + (super.getSaldo() + this.limite);
    }
}
