/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula91_dateformat_locale;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author jsjef
 */
public class TesteDateFormatLocale {

    public static void main(String[] args) {

        Date hoje = new Date();
        System.out.println(hoje);

        System.out.println("Com SimpleLocale");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy");
        System.out.println(sdf.format(hoje));

        System.out.println(Locale.getDefault());

        //Saída com locale padrão pt-BR
        String hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println("--" + hojeFormatado);

        //Alterando o locale padrão
        //Locale.setDefault(Locale.US);

        //Saída com locale alterado
        hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println(hojeFormatado);

        //Imprimindo somente a hora
        hojeFormatado = DateFormat.getTimeInstance().format(hoje);
        System.out.println(hojeFormatado);

        //Imprimindo somente a data
        hojeFormatado = DateFormat.getDateInstance().format(hoje);
        System.out.println(hojeFormatado);

        //Imprimindo Data e hora
        hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
        System.out.println(hojeFormatado);

        //É possível escolher o formato da data ou hora SHORT/MEDIUM/LONG 
        hojeFormatado = DateFormat.getDateInstance(DateFormat.SHORT).format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getDateInstance(DateFormat.MEDIUM).format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getDateInstance(DateFormat.LONG).format(hoje);
        System.out.println(hojeFormatado);

        //Alterando data e hora de uma vez só
        hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(hoje);
        System.out.println(hojeFormatado);

        //Transformando String em data
        String data = "24/09/2020 16:51";

        try {
            Date dataDate = DateFormat.getInstance().parse(data);
            System.out.println(dataDate);

            //Transformando o tipo dataDate em Calendar
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(dataDate);
            System.out.println(calendario);

        } catch (ParseException ex) {
            Logger.getLogger(TesteDateFormatLocale.class.getName()).log(Level.SEVERE, null, ex);
        }
     

    }
}
