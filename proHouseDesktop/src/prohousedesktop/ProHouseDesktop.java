/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prohousedesktop;

import classes.Equipamento;
import org.javalite.activejdbc.Base;

/**
 *
 * @author a1502549
 */
public class ProHouseDesktop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/prohouse", "root", "");
        Equipamento.findAll().dump();
        
        Equipamento E = new Equipamento();
        E.set("nome", "Cafeteira");
        E.set("ip", "10.0.0.3");
       
        E.saveIt();
        
        Base.close();
    }

}
