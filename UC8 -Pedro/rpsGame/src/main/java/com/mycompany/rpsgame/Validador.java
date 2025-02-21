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
    

    public Validador(){
       
    }
    public boolean validar(int jogador, int maquina, Player play, Maquina maq){
        if(jogador == 1 && maquina == 1){
            System.out.println("O resultado foi um empate, tente novamente a pontuação atual é de  " + play.getPontos() + " pontos para o jogador e " + maq.getPontos() + " para maquina " );
            return false;
        }else if(play.getPontos() == 2 && maq.getPontos() == 0){
            System.out.println("Parabéns você ganhou no pedra,papel e tesoura");    
            return true;
        }else if(play.getPontos() == 0 && maq.getPontos() == 2){
            System.out.println("Você perdeu no pedra,papel e tesoura tente novamente");
            return true;
        }else if(play.getPontos() == 3 && maq.getPontos() == 1){
            System.out.println("Parabéns você ganhou no pedra,papel e tesoura");  
            return true;
        }else if(play.getPontos() == 3 && maq.getPontos() == 2){
            System.out.println("Parabéns você ganhou no pedra,papel e tesoura");  
            return true;
        }else if(play.getPontos() == 2 && maq.getPontos() == 3){
            System.out.println("Você perdeu no pedra,papel e tesoura tente novamente");
            return true;
        }else if(play.getPontos() == 1 && maq.getPontos() == 3){
            System.out.println("Você perdeu no pedra,papel e tesoura tente novamente");
            return true;
        }else if(jogador == 2 && maquina == 2){
            System.out.println("O resultado foi um empate, tente novamente a pontuação atual é de  " + play.getPontos() + " pontos para o jogador e " + maq.getPontos() + " para maquina " );
            return false;
        }else if(jogador == 3 && maquina == 3){
            System.out.println("O resultado foi um empate, tente novamente a pontuação atual é de  " + play.getPontos() + " pontos para o jogador e " + maq.getPontos() + " para maquina " );
            return false;
        }else if(jogador == 1 && maquina == 2){
            maq.ganharPonto();
            System.out.println("Você perdeu a pontuação atual é de  " + play.getPontos() + " pontos para o jogador e " + maq.getPontos() + " para maquina " );
            
            return false;
        }else if(jogador == 2 && maquina == 3){
            maq.ganharPonto();
            System.out.println("Você perdeu a pontuação atual é de  " + play.getPontos() + " pontos para o jogador e " + maq.getPontos() + " para maquina " );
            
            return false;
        }else if(jogador == 3 && maquina == 1){
            maq.ganharPonto();
            System.out.println("Você perdeu a pontuação atual é de  " + play.getPontos() + " pontos para o jogador e " + maq.getPontos() + " para maquina " );
            
            return false;
        }else if(jogador == 1 && maquina == 3){
            play.ganharPonto();
            System.out.println("Você ganhou a pontuação atual é de  " + play.getPontos() + " pontos para o jogador e " + maq.getPontos() + " para maquina " );
            
            return false;
        }else if(jogador == 2 && maquina == 1){
            play.ganharPonto();
            System.out.println("Você ganhou a pontuação atual é de  " + play.getPontos() + " pontos para o jogador e " + maq.getPontos() + " para maquina " );
            
            return false;
        }else if(jogador == 3 && maquina == 2){
            
            System.out.println("Você ganhou a pontuação atual é de  " + play.getPontos() + " pontos para o jogador e " + maq.getPontos() + " para maquina " );
            
            return false;
        }else{
          System.out.println("Ação incorreta a pontuação atual é de  " + play.getPontos() + " pontos para o jogador e " + maq.getPontos() + " para maquina " );  
          return false;
        }

    }
}
