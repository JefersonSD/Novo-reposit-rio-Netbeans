/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula34_static;

/**
 *
 * @author jsjef
 */
public class ConversaoDeUnidadesDeTempo {
    
//    6. Escreva  a  classe  ConversaoDeUnidadesDeTempo  com  métodos  estáticos   para  conversão  aproximada  das  unidades  de  
//       velocidade  segundo  a  lista   abaixo.     
//            • 1  minuto  =  60  segundos      
//            • 1  hora  =  60  minutos
//            • 1  dia  =  24  horas       
//            • 1  semana  =  7  dias       
//            • 1  mês  =  30  dias       
//            • 1  ano  =  365.25  dias  
    
    public static int converteMinutosEmSegundos(int minuto){
        return minuto * 60;
    }
    public static int converteHorasEmMinutos(int hora){
        return hora * 60;
    }
    public static int converteDiasEmHoras(int dia){
        return dia * 24;
    }
    public static int converteSemanaEmDias(int semana){
        return semana * 7;
    }
    public static int converteMesEmDias(int mes){
        return mes * 30;
    }
    public static double converteAnoEmDias(int ano){
        return ano * 365.25;
    }
    
 
}
