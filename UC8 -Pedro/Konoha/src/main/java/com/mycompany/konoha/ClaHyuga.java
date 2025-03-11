/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konoha;

/**
 *
 * @author PEDROMACHADODASILVA
 */
public class ClaHyuga extends Cla {

     public ClaHyuga(String nomeDoCla, String lider, String habilidade){
         super(nomeDoCla,lider,habilidade);
     }

    @Override
    public void habilidadeEspecial() {
        System.out.println("habilidade especial do cla " + this.nomeDoCla +  " e o : " + this.habilidade + " .");
    }
     @Override
    public void exibirDetalhes(){
         System.out.println("O lider do cla "+ this.nomeDoCla +  " e o : " + this.lider + " .");
    }
     
     

}

