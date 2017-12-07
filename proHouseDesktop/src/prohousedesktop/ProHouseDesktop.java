/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prohousedesktop;

import classes.Equipamento;
import java.util.ArrayList;
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
        
        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/test", "the_user", "the_password");

        Equipamento E = new Equipamento();
        ArrayList<Equipamento> lista = new ArrayList<>();
        
        E.setId(1);
        E.setNome("CAFETEIRA");
        E.setIp("10.10.117.117");
        lista.add(E);
        
        lista.forEach(System.out::println);
    }
    
}
