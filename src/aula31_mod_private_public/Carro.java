/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula31_mod_private_public;

/**
 *
 * @author jsjef
 */

/*Se a classe for declarada sem o public [default] ela será visível somente dentro do pacote da aula 31
 O public na frente da classe faz com que ela seja vista em todos os pacotes do projeto
*/
 public class Carro {
 
/*
 1 - Com os atributos acontece o mesmo que acontece com a classe 
 2 - Se utilizado o modificador private antes de um atributo ele só poderá ser visto dentro
     da classe onde foi declarado. 
     
 */

    private String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    
    /*
    Para os métodos aplicam-se as mesmas regras das classes  e atributos
    */
    
    public void exibirAutonomia(){
        System.out.println("A autonomia do carro é " + this.capCombustivel * this.consumoCombustivel + "Km.");
    }

    public double obterAutonomia(){
        return this.capCombustivel*this.consumoCombustivel;
    }
    //Esse método não é visivel por mais nenhuma classe [É um método auxiliar para calculo do consumo de combustível]
    private double divideKmPorConsumoCombustivel(double km){
        return km/this.consumoCombustivel;
    }
    //Esse método (que pode ser visto por qualquer classe)  retorna o calculo feito pelo método acima
     public double calcularCombustivel(double km){
         return this.divideKmPorConsumoCombustivel(km);
     }
     
}
