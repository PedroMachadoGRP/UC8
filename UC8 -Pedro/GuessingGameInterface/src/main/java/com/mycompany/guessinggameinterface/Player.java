/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessinggameinterface;

/**
 *
 * @author PEDROMACHADODASILVA
 */
public class Player {
    private String name;
    private int wins;
    private int errors;
    
    public Player(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    public int getWins(){
        return wins;
    }
        public int getErrors(){
        return errors;
    }
    
}
