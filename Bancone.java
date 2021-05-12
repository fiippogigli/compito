/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main;

import java.util.concurrent.Semaphore;

/**
 *
 * @author informatica
 */
public class Bancone{
    
    //semafori istanziati a *Pieno* e *Vuoto*
    Semaphore vuoto = new Semaphore (0);
    Semaphore pieno = new Semaphore (1);
    
    
    //deposita
    public void deposita(int nPiatto){
        try{
            System.out.println("Il piatto n°"+ (nPiatto+1) +"è pronto");
 
            }catch(Exception e){
                
            }
        pieno.release();
    }
            
    //preleva
    public void preleva(int nPiatto){
        try{
            System.out.println("consumo: "+(nPiatto+1));
 
            }catch(Exception e){
                
            }
        vuoto.release();
    }
    
    
    //Costruttore bancone
    public Bancone() {
    }
        
    
    
    
}
