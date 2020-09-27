/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula92_time_zone;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author jsjef
 */
public class TesteTimeZone {

    public static void main(String[] args) {

        //Imprimindo o time Zone da máquina
//        Calendar calendario = Calendar.getInstance();
//        TimeZone tz = calendario.getTimeZone();
//        System.out.println(tz);
        //Imprimundo listas Fusos horários
        String[] fuso = TimeZone.getAvailableIDs();
        for (String fusos : fuso) {
            System.out.println(fusos);
        }

        //Configurar um fuso horário padrão
        
        TimeZone tzBA = TimeZone.getTimeZone("America/Bahia");
//        System.out.println(tzBA.getDisplayName());
//        System.out.println(tzBA.getID());

        //Convertendo datas e salvando
        Calendar agora = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
        System.out.println(sdf.format(agora.getTime()));

        Calendar agoraBA = Calendar.getInstance(tzBA);
        System.out.println(agoraBA.getTimeZone());
        System.out.println(sdf.format(agoraBA.getTime()));

        agoraBA.add(Calendar.HOUR_OF_DAY, (tzBA.getOffset(System.currentTimeMillis()) / 1000 / 60/ 60) * -1);
        System.out.println(sdf.format(agoraBA.getTime()));
    }

}
