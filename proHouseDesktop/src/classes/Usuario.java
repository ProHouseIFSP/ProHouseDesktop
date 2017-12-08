/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;


/**
 *
 * @author a1502549
 */
@Table("usuario")
public class Usuario extends Model {
    Usuario u = Usuario.findById(this);
    
    static {
        validatePresenceOf("usuario").message("Por favor, insira usuário");
        validatePresenceOf("senha").message("Por favor, insira senha");
       
    }
    
}
