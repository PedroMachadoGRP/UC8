/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpsgame;
import java.util.Scanner;
/**
 *
 * @author PEDROMACHADODASILVA
 */
public class Player {
    private String nome;
    private int pontos;
    Scanner scanner = new Scanner(System.in);
    
    public Player(){
        this.nome = nome; 
    }
    
    public String getNome(){
        return nome;
    }
    
    public String setNome(){
        System.out.println("Qual o seu nome");
        nome = scanner.nextLine();
        return nome;
        
    }
    
    public int getPontos(){
        return pontos;
    }
    
    public int ganharPonto(){
        return pontos++;
    }
    public  int Escolher(){
        System.out.println("Digite o número");
        int num = scanner.nextInt();
        return num ;
    }
}
