/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula96_number_format;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

/**
 *
 * @author jsjef
 */
public class TesteNumberFormat {
    
    public static void main (String [] args) throws ParseException{
        
        //Imprimindo valor com o format dos USA
        
        Locale en = Locale.US;
        NumberFormat nf = NumberFormat.getInstance(en);
        String num = nf.format(100.99);
        System.out.println(num);
        
        //Imprimindo valor com o format do BRAZIL
        
        Locale br = new Locale("pt", "Brazil");
        nf = NumberFormat.getInstance(br);
        num = nf.format(100.99);
        System.out.println(num);
        
        //MOEDA
        
        NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.getDefault());;
        String valor = moeda.format(100.99);
        System.out.println(valor);
        
        //Pega o objeto de moeda a partir do objeto de NumberFormat
        Currency currency = moeda.getCurrency();
        System.out.println(currency);
        
        //PORCENTAGEM

        //IDE COM PROBLEMAS PARA FORMATAÇÃO DOS NÚMEROS PARA pt_BR
        
        NumberFormat porcent = NumberFormat.getPercentInstance(Locale.getDefault());
        String porcentagem = porcent.format(99.987);
        System.out.println(porcentagem);
        
        porcent.setMaximumIntegerDigits(4);
        porcent.setMinimumIntegerDigits(6);
        
        porcent.setMaximumFractionDigits(3);
        porcent.setMinimumFractionDigits(4);
        
        porcentagem = porcent.format(99.987);
        System.out.println(porcentagem);
        
        //ARREDONDAMENTO
        
        nf = NumberFormat.getInstance(Locale.getDefault());
        nf.setRoundingMode(RoundingMode.UP);
        nf.setMaximumFractionDigits(0);
        nf.setMinimumFractionDigits(0);
        System.out.println(nf.format(99.50));
        
        Number num3 = nf.parse("100.55");
        System.out.println(num3);
        
    }
    
}
