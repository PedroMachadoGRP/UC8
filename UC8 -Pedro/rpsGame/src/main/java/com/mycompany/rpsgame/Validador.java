/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpsgame;

/**
 *
 * @author PEDROMACHADODASILVA
 */
public class Validador { 
    private Player player;
    private Maquina bot;

    public Validador(){
        this.player = new Player();
        this.bot = new Maquina();
    }
    public boolean validar(int jogador, int maquina){
        if(jogador == 1 && maquina == 1){
            System.out.println("O resultado foi um empate, tente novamente a pontuação atual é de  " + player.getPontos() + " pontos para o jogador e " + bot.getPontos() + " para maquina " );
            return false;
        }else if(player.getPontos() == 2 && bot.getPontos() == 0){
            System.out.println("Parabéns você ganhou no pedra,papel e tesoura");    
            return true;
        }else if(player.getPontos() == 0 && bot.getPontos() == 2){
            System.out.println("Você perdeu no pedra,papel e tesoura tente novamente");
            return true;
        }else if(player.getPontos() == 3 && bot.getPontos() == 1){
            System.out.println("Parabéns você ganhou no pedra,papel e tesoura");  
            return true;
        }else if(player.getPontos() == 3 && bot.getPontos() == 2){
            System.out.println("Parabéns você ganhou no pedra,papel e tesoura");  
            return true;
        }else if(player.getPontos() == 2 && bot.getPontos() == 3){
            System.out.println("Você perdeu no pedra,papel e tesoura tente novamente");
            return true;
        }else if(player.getPontos() == 1 && bot.getPontos() == 3){
            System.out.println("Você perdeu no pedra,papel e tesoura tente novamente");
            return true;
        }else if(jogador == 2 && maquina == 2){
            System.out.println("O resultado foi um empate, tente novamente a pontuação atual é de  " + player.getPontos() + " pontos para o jogador e " + bot.getPontos() + " para maquina " );
            return false;
        }else if(jogador == 3 && maquina == 3){
            System.out.println("O resultado foi um empate, tente novamente a pontuação atual é de  " + player.getPontos() + " pontos para o jogador e " + bot.getPontos() + " para maquina " );
            return false;
        }else if(jogador == 1 && maquina == 2){
            bot.ganharPonto();
            System.out.println("Você perdeu a pontuação atual é de  " + player.getPontos() + " pontos para o jogador e " + bot.getPontos() + " para maquina " );
            
            return false;
        }else if(jogador == 2 && maquina == 3){
            bot.ganharPonto();
            System.out.println("Você perdeu a pontuação atual é de  " + player.getPontos() + " pontos para o jogador e " + bot.getPontos() + " para maquina " );
            
            return false;
        }else if(jogador == 3 && maquina == 1){
            bot.ganharPonto();
            System.out.println("Você perdeu a pontuação atual é de  " + player.getPontos() + " pontos para o jogador e " + bot.getPontos() + " para maquina " );
            
            return false;
        }else if(jogador == 1 && maquina == 3){
            player.ganharPonto();
            System.out.println("Você ganhou a pontuação atual é de  " + player.getPontos() + " pontos para o jogador e " + bot.getPontos() + " para maquina " );
            
            return false;
        }else if(jogador == 2 && maquina == 1){
            player.ganharPonto();
            System.out.println("Você ganhou a pontuação atual é de  " + player.getPontos() + " pontos para o jogador e " + bot.getPontos() + " para maquina " );
            
            return false;
        }else if(jogador == 3 && maquina == 2){
            player.ganharPonto();
            System.out.println("Você ganhou a pontuação atual é de  " + player.getPontos() + " pontos para o jogador e " + bot.getPontos() + " para maquina " );
            
            return false;
        }else{
          System.out.println("Ação incorreta a pontuação atual é de  " + player.getPontos() + " pontos para o jogador e " + bot.getPontos() + " para maquina " );  
          return false;
        }

    }
}
