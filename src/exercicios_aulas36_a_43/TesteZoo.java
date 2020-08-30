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
public class TesteZoo {
    public static void main(String[] args) {
        
        //Criando um peixe 
        Peixe peixe = new Peixe();
        peixe.setNome("Tucunaré");
        peixe.setComprimento(1.20);
        peixe.setQuantidadePatas(0);
        peixe.setVelocidade("0,40m/s");
        peixe.setCaracteristicas("Tem escamas, corpo alongado, Possui manchas pretas verticais e é rapido forte e agressivo.");
        System.out.println(peixe);
        System.out.println();
        //Criando um camelo
        Mamifero camelo = new Mamifero();
        camelo.setNome("Camelo");
        camelo.setComprimento(3);
        camelo.setVelocidade("18,05 m/s");
        camelo.setCor("Amarelo");
        camelo.setAlimento("Arbustos e grama seca");
        System.out.println(camelo);
        System.out.println();
        //Criando um urso-do-canadá
        Mamifero urso = new Mamifero();
        urso.setNome("Urso-do-canadá");
        urso.setComprimento(1.70);
        urso.setVelocidade("13,33 m/s");
        urso.setCor("Vermelho");
        urso.setAlimento("Mel");
        System.out.println(urso);
    }
    
}
