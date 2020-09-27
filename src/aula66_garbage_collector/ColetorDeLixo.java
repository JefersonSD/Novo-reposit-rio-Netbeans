/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula66_garbage_collector;

/**
 *
 * @author jsjef
 */
public class ColetorDeLixo {
    
    //Em projetos java esse tipo de código não é utilizado
    
    public static void obterMemoriaUsada(){
        
        final int MB = 1024 * 1024;
        
        Runtime runtime = Runtime.getRuntime(); // singleton
        
        System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB);
    }

    public static void main(String[] args) {

        Contato[] contatos = new Contato[10 ];

        Contato contato;

        for (int i = 0; i < contatos.length; i++) {

            contato = new Contato("Jeferson" + i, "Qualquer" + i, "jeferson@email");
             
            contatos[i] = contato;
            

        }
        
         obterMemoriaUsada();
        System.out.println("Contatos Criados");
        
        contatos = null;
        
        Runtime.getRuntime().runFinalization();  // Marcação do objeto com o método runFinalization para o garbage coletar
        Runtime.getRuntime().gc(); // Forçando execução do garbage collector [Sem garantia de execução]
        
        System.out.println("Contatos excluídos da memória");
        obterMemoriaUsada();
    }

}
