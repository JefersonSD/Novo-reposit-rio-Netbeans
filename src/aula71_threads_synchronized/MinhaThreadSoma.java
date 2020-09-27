/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula71_threads_synchronized;

/**
 *
 * @author jsjef
 */
public class MinhaThreadSoma implements Runnable {
    
    private String nome;
    private int[]nums;
    private static Calculadora calc = new Calculadora();
    
    public MinhaThreadSoma(String nome, int [] nums){
        
        this.nome = nome;
        this.nums = nums;
        new Thread(this,nome).start();
    }

    @Override
    public void run() {
        
        System.out.println(this.nome + " iniciada! ");
        
        int soma = calc.somaArray(this.nums);
        System.out.println("O Resultado da soma para a thread " + this.nome + "é igual a: " + soma);
        
        System.out.println(this.nome + " terminada! ");
    }
        
}
