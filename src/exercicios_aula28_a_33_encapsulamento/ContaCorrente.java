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
public class ContaCorrente {

//    Crie  uma  classe  para  representar  uma  conta  corrente  que  possui  um   número,  um  saldo,  um  status  que  informa  se 
//    ela  é  especial  ou  não,  um   limite. Desenvolva  métodos  para  realizar  saque  (verificando  se  o  cliente   pode  realizar  
//    saques),  despositar  dinheiro,  consultar  saldo  e  verificar  se  o   cliente  está  usando  cheque  especial  ou  não.  
//    Desenvolva  um  programa   para  testar  essa  classe.
    private int agencia;
    private int conta;
    private double saldo;
    private boolean especial;
    private double limite;

    public ContaCorrente() {
        this.agencia = 2269;
        this.conta = 258748;
        this.saldo = 0;
        this.especial = true;
        this.limite = 1000;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    private boolean verificaSePodeSacar(double valor) {
        if (valor > saldo + limite) {
            return false;
        } else if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        saldo -= valor;
        limite += saldo;
        saldo = 0;
        return true;
    }

     public boolean sacarMoney(double valor) {
        return this.verificaSePodeSacar(valor);
    }

    public void depositarMoney(double valor) {

        if (limite < 1000) {
            if (valor < 1000 - limite) {
                limite += valor;
            } else {
                valor -= 1000 - limite;
                limite = 1000;
                saldo += valor;
            }

        } else {
            saldo += valor;
        }
        System.out.println("Depósito realizado com sucesso!" + "+"+valor);
        
    }

    public void consultaSaldo() {
        System.out.print("Saldo em conta: ");
        System.out.println(saldo);
        System.out.print("Saldo + limite: ");
        System.out.println(saldo + limite);
    }

}
