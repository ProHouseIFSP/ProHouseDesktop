/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prohousedesktop.arduino;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author a1502727
 */
public class MainArduino {
    public static void main(String[] args) {
        try {
            URL oracle = new URL("http://localhost/prohouse/");
            BufferedReader in = new BufferedReader(
            new InputStreamReader(oracle.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null){
                System.out.println("i");
                System.out.println(inputLine);
            }
            in.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        // nome (nome do equipamento), tipo (tipo do equipamento), status
        
    }
}
