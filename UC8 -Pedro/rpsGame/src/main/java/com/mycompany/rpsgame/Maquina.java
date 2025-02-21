/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpsgame;

/**
 *
 * @author PEDROMACHADODASILVA
 */
public class Maquina {
    
    
    private int pontos;
    
    public int getPontos(){
        return pontos;
    }
    public int ganharPonto(){
        return pontos++;
    }
    
    public int escolhaRobo(){
        int num = (int) (Math.random() * 3) + 1;
        return num;
    }
    
}
