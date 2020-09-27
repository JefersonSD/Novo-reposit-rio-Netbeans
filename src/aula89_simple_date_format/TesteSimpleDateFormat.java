/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula89_simple_date_format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jsjef
 */
public class TesteSimpleDateFormat {
    
    public static void main(String[] args) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss  z");
        
        Calendar data = new GregorianCalendar(2010, 3, 4, 16, 11, 25);
        
        System.out.println(sdf.format(data.getTime()));
        
        //Também é possivel usar o date
        
        Date data_ = new Date();
        
        System.out.println(sdf.format(data_.getTime()));
        
        //Também é possível converter uma String em data
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String data1 = "11/03/2015";
        
        try {
            Date dataEmDate = sdf1.parse(data1);
            System.out.println(dataEmDate);
            System.out.println(sdf.format(dataEmDate));
        } catch (ParseException ex) {
            Logger.getLogger(TesteSimpleDateFormat.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
