/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prohousedesktop;

import org.javalite.activejdbc.Base;

/**
 *
 * @author a1502549
 */
public class Banco {
    public static void iniciar(){
        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/prohouse", "root", "");
    }
    
    public static void fechar(){
        Base.close();
    }
}
