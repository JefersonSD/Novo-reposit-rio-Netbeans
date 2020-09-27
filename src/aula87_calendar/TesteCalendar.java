/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula87_calendar;

import java.util.Calendar;

/**
 *
 * @author jsjef
 */
public class TesteCalendar {
    public static void main(String[] args) {
        
        // instância de calendar criada
        Calendar hoje = Calendar.getInstance();
        
        //toString calendar
        System.out.println(hoje);
        
        //Imprimindo o ano
        System.out.println(hoje.get(Calendar.YEAR));
        int ano = hoje.get(Calendar.YEAR);
        
        //Imprimindo o mês
        System.out.println(hoje.get(Calendar.MONTH));
        int mes = hoje.get(Calendar.MONTH);
        
        //Imprimindo o dia do mês
        System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
        int diaMes = hoje.get(Calendar.DAY_OF_MONTH);
        
        //Imprimindo a hora
        System.out.println(hoje.get(Calendar.HOUR_OF_DAY));
        int horaDia = hoje.get(Calendar.HOUR_OF_DAY);
        
        //Imprimindo os minutos
        System.out.println(hoje.get(Calendar.MINUTE));
        int minutos  = hoje.get(Calendar.MINUTE);
        
        //Imprimindo os segundos
        System.out.println(hoje.get(Calendar.SECOND));
        int segundos = hoje.get(Calendar.SECOND);
        
        // impprimindo com printf
        
        System.out.printf("Data: %d/%02d/%d %02d:%02d:%02d\n" , diaMes,(mes+1),ano,horaDia,minutos,segundos);
        
        //Adicionando dias com Calendar
        
        hoje.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
        
        //Subtraindo  dias com Calendar
        
        hoje.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
      
    }
    
}
