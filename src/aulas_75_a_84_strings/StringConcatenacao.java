/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas_75_a_84_strings;

/**
 *
 * @author jsjef
 */
public class StringConcatenacao {

    public static void main(String[] args) {

        String curso = "Curso ";  // Concatenação de Strings
        String java = "Java";

        String cursoJava = curso + java;
        System.out.println(cursoJava);

        String resultadoDe2Com2 = "Resultado de 2 + 2 = " + (2 + 2);
        System.out.println(resultadoDe2Com2); // Concatenação com outros tipos na String

        String um = String.valueOf(1);
        System.out.println(um);

        String loreIpsum = "is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been "
                + "the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley "
                + "of type and scrambled it to make a type specimen book. It has survived not only five centuries, "
                + "but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised "
                + "in";
        
        String loreIpsum1 = "is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been ";
               loreIpsum1 += "the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley ";
               loreIpsum1 += "of type and scrambled it to make a type specimen book. It has survived not only five centuries, ";
               loreIpsum1 += "but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised ";
               
               System.out.println(loreIpsum1);
    }

}
