/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula24_OO;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class TesteContatosAgenda {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        
        ContatosAgenda contato1 = new ContatosAgenda();
        contato1.nome = "Sebastião";
        contato1.endereco = "EQNP 15 Casa 03 Conjunto 07";
        contato1.email = "sebastiaosilveira@gmail.com";
        contato1.telefones = new String[2];
        for (int i = 0; i < contato1.telefones.length; i++) {
            System.out.println("Informe o  " + (i+1) + "º contato:");
            contato1.telefones[i] = t.next();
            
        }
        System.out.println("Informações do " + contato1.nome + ":");
        System.out.println("End: " + contato1.endereco);
        System.out.println("Email: " + contato1.email);
        System.out.println("Telefones: ");
        for (int i = 0; i < contato1.telefones.length; i++) {
            System.out.println(contato1.telefones[i]);
            
        }
    }
    
}
