/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prohousedesktop;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import prohousedesktop.arduino.AcessoArduino;

/**
 *
 * @author a1502549
 */
public class ProHouseDesktop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
//        JFrame frame = new JFrame("MyPanel");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.getContentPane().add(new Lista2());
//        frame.pack();
//        frame.setVisible(true);
        AcessoArduino acesso = new AcessoArduino();
        acesso.run();

        new Lista().setVisible(true);
    }

}
