/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prohousedesktop.arduino;

import classes.Equipamento;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;
import prohousedesktop.Banco;

/**
 *
 * @author cleyton
 */
public class AcessoArduino implements Runnable{
    
    private int status = 0;
    
    @Override
    public void run() {
        
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Verificando...");
                verifica();
            }
        }, 5000, 1000);
        
    }
    
    private void verifica(){
        // Iniciando conexao com o banco
        Banco.iniciar();
        
        Equipamento equipamento = Equipamento.findById(1);
        
        if(equipamento != null){
            // Verificando se é para ligar o equipamento
            if(this.status == 0 && equipamento.get("status").toString().equals("1")){
                this.status = 1;
                try {
                    
                    URL url = new URL("http://" + equipamento.get("ip").toString() + "/prohouse/?ligarEquipamento");
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(url.openStream()));
                    in.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }else if(this.status == 1 && equipamento.get("status").toString().equals("0")){
                this.status = 0;
                try {
                    
                    URL url = new URL("http://" + equipamento.get("ip").toString() + "/prohouse/?desligarEquipamento");
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(url.openStream()));
                    in.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            
        }
            
        Banco.fechar();
    }
    
}
