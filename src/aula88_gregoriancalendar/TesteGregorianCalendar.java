/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula88_gregoriancalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;



/**
 *
 * @author jsjef
 */
public class TesteGregorianCalendar {
    public static void main(String[] args) {
        
        GregorianCalendar hoje = new GregorianCalendar();
        
        retornaCalendar(hoje);
        
        //Saber se um ano é bisexto com a classe GregorianCalendar
        
        System.out.println(hoje.isLeapYear(2020));
        
        // Passando parâmetros para alguns construtores da classe GregorianCalendar
        
        GregorianCalendar hoje1 = new GregorianCalendar(2020, 9, 24); // Ano/Mês/Dia
        retornaCalendar(hoje1);
        
        GregorianCalendar hoje2 = new GregorianCalendar(2017, 0, 1,16,5,16); // Ano/Mês/Dia Hora/Minutos/Segundos
        retornaCalendar(hoje2);

    }
    
    private static void retornaCalendar(Calendar hoje){
        
        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia   = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR_OF_DAY);
        int minutos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);
        
         System.out.printf("Data: %02d/%02d/%d %02d:%02d:%02d\n" , dia,(mes+1),ano,hora,minutos,segundos);
    }
    
}
