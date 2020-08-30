/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula46_interface_e_heranca;

/**
 *
 * @author jsjef
 */
public interface SqlDDL {
    
    void create (String query);
    void drop (String query);
    void alter (String query);
}
