/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula_24_OO;

/**
 *
 * @author jsjef
 */
public class ContaBancaria2 {

//    2. Cria  uma  classe  para  representar  uma  conta  corrente  que  possui  um   número,  um  saldo,  um  status  
//       que  informa  se  ela  é  especial  ou  não,  um   limite. Desenvolva  métodos  para  realizar  saque  (verificando
//       se  o  cliente   pode  realizar  saques),  despositar  dinheiro,  consultar  saldo  e  verificar  se  o   cliente 
//       está  usando  cheque  especial  ou  não.  Desenvolva  um  programa   para  testar  essa  classe.
    int agencia;
    int conta;
    double saldo;
    String status;
    double limite;
   

    void saque(double valorSaque) {
        if (valorSaque > saldo + limite) {
            System.out.println("Você não possui saldo suficiente para saque do valor informado!");
        } else if (valorSaque > saldo) {
            System.out.println("Saque realizado!");
            saldo -= valorSaque;
            limite += saldo;
            saldo = 0;
        } else {
            System.out.println("Saque realizado!");
            System.out.println();
            saldo -= valorSaque;

        }

    }

    void deposito(double valor) {
        double chequeEspecial;
        if (limite < 1000) {
            chequeEspecial = limite - 1000;
            if ((valor + chequeEspecial) >= 0) {
                limite = 1000;
                valor += chequeEspecial;
                saldo += valor;
            }else{
                limite += valor;
            }

        } else {
            saldo += valor;
          
        }
        System.out.println("Depósito realizado!");

    }

    void consultaSaldo() {
        System.out.print("Agência: " + agencia + " Conta : " + conta + "\n");
        System.out.println("O saldo em conta é de " + saldo);
        System.out.println("Saldo + Limite " + (saldo + limite));
        
    }

}
