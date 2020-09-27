/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula94_diferenca_entre_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jsjef
 */
public class TesteDiferencaEntreDatas {

    public static void main(String[] args) {

        try {
            diferencaDataAteJava7();
        } catch (ParseException ex) {
            Logger.getLogger(TesteDiferencaEntreDatas.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("----------------");

        diferencaDataJava8();

        System.out.println("----------------");

        diferencaDataTimeJava8();

        System.out.println("----------------");

        diferencaDataTimeJava8ComOChronoUnit();

    }

    public static void diferencaDataAteJava7() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data1 = sdf.parse("01/01/2020");
        Date data2 = sdf.parse("01/02/2020");

        //Código mais moderno
        long diffEmMil = Math.abs(data1.getTime() - data2.getTime());
        long diff = TimeUnit.DAYS.convert(diffEmMil, TimeUnit.MILLISECONDS);
        System.out.println(diff);

        //Código mais antigo
        int dia = (int) (diffEmMil / 1000 / 60 / 60 / 24);
        System.out.println(dia);
    }

    public static void diferencaDataJava8() {
        LocalDate data1 = LocalDate.of(2020, 1, 01);
        LocalDate data2 = LocalDate.of(2020, 2, 01);

        Period periodo = Period.between(data1, data2);

        int dias = periodo.getDays();
        int meses = periodo.getMonths();

        System.out.println("Dias: " + dias);
        System.out.println("Meses: " + meses);

    }

    public static void diferencaDataTimeJava8() {
        LocalDateTime dataTime1 = LocalDateTime.of(2020, 1, 01, 6, 30);
        LocalDateTime dataTime2 = LocalDateTime.of(2020, 1, 01, 8, 30);

        Duration drc = Duration.between(dataTime1, dataTime2);
        long diff = drc.toHours();
        System.out.println(diff);

    }

    public static void diferencaDataTimeJava8ComOChronoUnit() {
        LocalDateTime dataTime1 = LocalDateTime.of(2020, 1, 01, 6, 30);
        LocalDateTime dataTime2 = LocalDateTime.of(2020, 1, 01, 8, 30);
        
        
        long diffHour = ChronoUnit.HOURS.between(dataTime1, dataTime2);
        System.out.println(diffHour);
        
        long diffDias = ChronoUnit.DAYS.between(dataTime1, dataTime2);
        System.out.println(diffDias);
    }
}
