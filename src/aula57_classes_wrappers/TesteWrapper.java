/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula57_classes_wrappers;

/**
 *
 * @author jsjef
 */
public class TesteWrapper {

    public static void main(String[] args) {
        
        //tipos primitivos java
        
        byte num = 1;
        short num1 = 2;
        int num2 =  3;
        long num3 = 5l;
        float num4 = 6.6f;
        double num5 = 2.8;
        boolean flag = true;
        char caractere = 'c';
        
        //Classes wrappers dos tipos primitivos
        
        Short num6 = new Short((short)1); // Casting do numero 1 para short
        Byte num7 = new Byte((byte)3);    // Casting do numero 3 para byte
        Long num8 = new Long(100);
        Integer num9 = new Integer(895);
        Float num10 = new Float(3.5);
        Double num11 = new Double(3.5555);
        Boolean flag2 = new Boolean(true);
        Character char_ = new Character('f');
        
        Integer inteiro = new Integer("10");// pode disparar exeção NumberFormatException
        Double doubl = new Double("3.8");
        
        // É possível também fazer conversões entre tipos pelos objetos das classes wrappers
        
        System.out.println(inteiro.byteValue());
        System.out.println(inteiro.longValue());
        
        // É possível também converter Strings através de alguns métodos das classes wrappers
        
        int i = Integer.parseInt("200");
        double j = Double.parseDouble("50.69");
        
        //O valueof também pode ser utilizado nas classes wrappers
        
        Integer o = Integer.valueOf("1373");
        System.out.println(o);
    
        // para classes wrappers não se aplica a comparação com == por se tratar de uma classe
        
        System.out.println(num9.equals(num9));
    }

}
