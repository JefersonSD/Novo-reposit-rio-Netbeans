/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula50_stacktrace_e_throws;

/**
 *
 * @author jsjef
 */
public class StacktraceThrows {
    
    public static void main(String[] args) {

        int[] arrayInt = {2, 8, 9, 6, 15, 16};
        int[] denom = {0, 3, 0, 4,};

        for (int i = 0; i < arrayInt.length; i++) {

            try{
                System.out.println(arrayInt[i] +"/" + denom[i] + "=" + arrayInt[i]/denom[i]);
            }catch(Exception e){
                System.out.println(e.getMessage());
                //e.printStackTrace();
            }
            
        }

    }
    
}
