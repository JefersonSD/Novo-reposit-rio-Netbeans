/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula90_locale;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author jsjef
 */
public class TesteLocale {
    public static void main(String[] args) {
        
        //Imprimindo o format de data no meu pc
        
        Locale locale = Locale.getDefault();
        System.out.println(locale);
        
        //Mostrando uma lista de Locails 
        
        Locale [] locais = locale.getAvailableLocales();
        
        for(Locale l : locais){
//            System.out.println("Nome: " +l.getDisplayName());
//            System.out.println("Cód da língua: " +l.getLanguage());
//            System.out.println("Nome: " +l.getDisplayLanguage());
//            System.out.println("Cód do país: " +l.getCountry());
//            System.out.println("País: " +l.getDisplayCountry());
            
            System.out.println(l);
            System.out.println("***********");
        }
        
        //Forçando o locale no sistema
        
//        Locale br = new Locale("br","Brazil");
//        System.out.println(br);
//        
//        Locale.setDefault(br);
//        
//        System.out.println(Locale.getDefault());
        
        //Algumas situações para utilização do locale
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(5000000));
        
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf1.format(5000000d));
        
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.ITALY);
        System.out.println(nf2.format(5000000d));

    }
    
}
