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
public class TesteContaBancaria {
    public static void main(String[] args) {
        
        ContaPoupanca poupanca = new ContaPoupanca();
        ContaEspecial especial = new ContaEspecial();
        // Criando contas
        poupanca.setNomeCliente("José Augusto");
        poupanca.setNumConta("1033-6");
        poupanca.setSaldo(2500);
        
        especial.setNomeCliente("Bartolomeu Silva");
        especial.setNumConta("1533-2");
        especial.setSaldo(1599);
        
        //Testes poupança
        
        /*poupanca.calcularNovoSaldo(3);
        outPutPoupanca(poupanca.sacar(1000), poupanca);
        poupanca.depositar(300);
        System.out.println(poupanca);*/
        
        //Testes especial
        
        especial.depositar(50);
        outPutEspecial(especial.sacar(1700), especial);
        especial.depositar(90);
        especial.depositar(10);
        especial.depositar(100);
        outPutEspecial(especial.sacar(100), especial);
        outPutEspecial(especial.sacar(999), especial);
        especial.depositar(100);
        System.out.println(especial);  
    }
    
    static void outPutPoupanca(boolean status, ContaPoupanca poupanca){
        
        if(status){
            System.out.println("Saque efetuado com sucesso!\nSaldo: " + poupanca.getSaldo());
        }else{
            System.out.println("Você não possui saldo suficiente para saque!");
        }
    }
    
    static void outPutEspecial(boolean status, ContaEspecial especial){
        
        if(status){
            System.out.println("Saque efetuado com sucesso!");
            if(especial.getLimite()<1000){
                System.out.println("Saldo em conta: " + especial.getSaldo() + "\nSaldo + Limite: "
                        + (especial.getSaldo()+especial.getLimite()) + "\nCliente está utilizando cheque especial!");
            }else{
                System.out.println("Saldo em conta: " + especial.getSaldo() + "\nSaldo + Limite: "
                        + (especial.getSaldo()+especial.getLimite()));
            }
           
        }else{
            System.out.println("Você não possui saldo e limite suficientes para saque!");
        }
        
    }
    
}
