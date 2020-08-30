/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula48_multiplos_try_catch;

/**
 *
 * @author jsjef
 */
public class MultiplosTryCatch {

    public static void main(String[] args) {

        int[] arrayInt = {2, 8, 9, 6, 15, 16};
        int[] denom = {0, 3, 0, 4,};

        for (int i = 0; i < arrayInt.length; i++) {

//            try{
//                System.out.println(arrayInt[i] +"/" + denom[i] + "=" + arrayInt[i]/denom[i]);
//            }catch(ArithmeticException e){
//                System.out.println("Não é possível fazer divisão por 0!");
//            }catch(ArrayIndexOutOfBoundsException e){
//                System.out.println("Posição inválida no array!");
//            }
            try {
                System.out.println(arrayInt[i] + "/" + denom[i] + "=" + arrayInt[i] / denom[i]);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException a) {
                System.out.println("Ocorreu um erro!");
            } catch (Throwable a) {
                System.out.println("Erro!");
            }
        }

    }
}
