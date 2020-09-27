/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula65_annotations_;

/**
 *
 * @author jsjef
 */
@interface  InformacaoAula {
    
    String autor();
    int aulaNumero();
    String blog() default "jeferson.blog";
    String site() default "loiane.training";
    
    
}
