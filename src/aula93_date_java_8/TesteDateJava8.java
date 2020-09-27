/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula93_date_java_8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

/**
 *
 * @author jsjef
 */
public class TesteDateJava8 {
    public static void main(String[] args) {
        
        //*********TRABALHANDO COM DATAS*********
        
        //Imprimindo a data atual
        LocalDate agora = LocalDate.now();
        System.out.println(agora); // output 2020-09-24 [Padrão ISO]
        
        //Formatando String  em LocalDate
        
        System.out.println(LocalDate.of(2020,9, 24));
        System.out.println(LocalDate.parse("2020-09-24"));
        
        //Adicionar dias semanas e anos
        
//        System.out.println(agora.plusYears(1));
//        System.out.println(agora.plusMonths(1));
//        System.out.println(agora.plusDays(1));
        
        //Voltando no tempo
        
        System.out.println(agora.minusDays(30));
        System.out.println(agora.minus(1, ChronoUnit.MONTHS));
        
        //Saber qual dia da semana/mês/ano
        
        System.out.println(agora.getDayOfWeek());
        System.out.println(agora.getDayOfMonth());
        System.out.println(agora.getDayOfYear());
        
        //Verificar se o ano é bissexto
        
        System.out.println(agora.isLeapYear());
        System.out.println(LocalDate.parse("2021-02-25").isLeapYear());
        
        //*********TRABALHANDO COM HORAS*********
        
        LocalTime hAgora = LocalTime.now();
        System.out.println(hAgora);
        
        //formatando o print do horário
        
        System.out.println(LocalTime.of(20,05));
        
        //Fazendo o parse da String 
        
        System.out.println(LocalTime.parse("20:55:03"));
        
        //Adicionando e retirando horas minutos e segundos
        
        System.out.println(hAgora.plus(10, ChronoUnit.MINUTES));
        System.out.println(hAgora.minus(20  , ChronoUnit.MINUTES));
        
        //Buscando hora minuto segundo
        
        System.out.println(hAgora.getHour());
        System.out.println(hAgora.getMinute());
        
        
        //********* TRABALHANDO COM DATA E HORA *********
        
        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);
        
        //Também é possível adicionar e diminuir horas dias meses segundos ...
        
        System.out.println(dataHora.plus(15, ChronoUnit.DAYS));
        
        //Formatando a saída LocalDateTime
        
        System.out.println(LocalDateTime.of(2023, 9, 15, 13, 59));
        
        //Fazendo o parse com LocalDateTime
        
        System.out.println(LocalDateTime.parse("2020-09-24T20:23:07.868"));
        
        
        //********* FUSO HORÁRIO  *********
        
        ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso);
        
        Set<String> fusos = ZoneId.getAvailableZoneIds();
//        for(String imprimeFusos : fusos){
//            System.out.println(imprimeFusos);
//        }

        
        ZoneId isr = ZoneId.of("Israel");
        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2020-09-24T20:23:07.868"), isr);
        System.out.println(zdt);
        System.out.println(ZonedDateTime.parse("2020-09-24T20:23:07.868+03:00[Israel]"));
        
        //Também é possível adicinar + horas 
        
        ZoneOffset offset = ZoneOffset.of("+02:00");
        
        //Data calculada adicionando o offset [Uma data em que é possível aplicar a diferença de fusos horários]
        
        OffsetDateTime offsetdt = OffsetDateTime.of(dataHora, offset);
        System.out.println(offsetdt);
        
        //Convertendo um objeto date ou calendar para a API mais recente
        
        
        Date data = new Date();
        Calendar calendario = Calendar.getInstance();
        LocalDateTime ldt = LocalDateTime.ofInstant(data.toInstant(), isr);
        System.out.println(ldt);
        LocalDateTime ldt1 = LocalDateTime.ofInstant(calendario.toInstant(), isr);
        System.out.println(ldt1);
        
    }
    
    
}
