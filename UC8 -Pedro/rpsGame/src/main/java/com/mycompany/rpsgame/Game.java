/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpsgame;
/**
 *
 * @author PEDROMACHADODASILVA
 */
public class Game {
    private  Maquina maquina;
    private  Player player;
    private  Validador validador;
    
    public Game(){
        this.player = new Player();
        this.maquina = new Maquina();
        this.validador = new Validador();
    }
    public void start(){
        player.setNome();
        System.out.println("Bem vindo ao pedra papel tesoura " +  player.getNome());
        boolean hasWon = false;
        
        
        while(!hasWon){
        System.out.println("digite 1 para pedra 2 para papel e 3 para tesoura");
        System.out.println("pedra ganha de tesoura");
        System.out.println("tesoura ganha de papel");
        System.out.println("papel ganha de pedra");
        hasWon = validador.validar(player.Escolher(),maquina.escolhaRobo());
        }
    }
}
