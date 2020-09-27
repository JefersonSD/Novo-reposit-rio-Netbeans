/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula97_decimal_format;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;


/**
 *
 * @author jsjef
 */
public class TesteDecimalFormat {
    public static void main(String[] args) {
        

        //Definindo o pattern para formatação de acordo com o Locale do computador
        String padrao = "###,###.##";
        DecimalFormat df = new DecimalFormat(padrao);
        System.out.println(df.format(12548735.3256));
        
        
        /*Obs importante: Se você definir no construtor da classe DecimalFormatSymbols o Locale, não é necessário
         a utilização dos métodos setGroupingSeparator e setDecimalSeparator, uma vez que o Locale já define
         o padrão para saída. Os métodos acima mencionados devem ser utilizados quando não se define o Locale
         no construtor da Classe DecimalFormatSymbols.*/
        
        //Definindo a saída através do Locale
        
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.US);
        
        //Usa-se quando não se define Locale no construtor da Classe DecimalFormatSymbols
//        dfs.setGroupingSeparator('.');
//        dfs.setDecimalSeparator(',');
//        String padrao2 = "###,###.##";
        
        df = new DecimalFormat(padrao, dfs);
        System.out.println(df.format(12548735.3256));
        
        //Definindo tamanho do grupo 
        
        String padrao2 = "###,###,###.##";
        df = new DecimalFormat(padrao2, dfs);
        df.setGroupingSize(4);
        System.out.println(df.format(12548735.3256));
        
        //Definindo quantidade de casas depois da , a serem impressas
        
        String padrao3 = "###,###,###.00";
        df = new DecimalFormat(padrao3, dfs);
        System.out.println(df.format(12548735.3));
        
        //Coloque o 0 para definir quais números serão impressos na saída   
        
        String padrao4 = "###,###,##0.00";
        df = new DecimalFormat(padrao4, dfs);
        System.out.println(df.format(0.1));
        
        //Porcentagem
        
        String padrao5 = "###,###,##0.00%";
        df = new DecimalFormat(padrao5, dfs);
        System.out.println(df.format(0.1));
        
        //Negativo ou positivo
        
        String padrao6 = "-###,###,##0.00";
        df = new DecimalFormat(padrao6, dfs);
        System.out.println(df.format(0.1));
        
        //Exibir como valor monetário
        
        String padrao7 = "\u00A4###,###,##0.00";
        df = new DecimalFormat(padrao7, dfs);
        System.out.println(df.format(0.1));
        
        
        
    }
    
}
