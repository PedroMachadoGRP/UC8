/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.konoha;

/**
 *
 * @author PEDROMACHADODASILVA
 */
public class Konoha {

    public static void main(String[] args) {
        ClaUchiha claUchiha = new ClaUchiha("Uchiha","Sasuke","Sharingan ");
        claUchiha.exibirDetalhes();
        claUchiha.habilidadeEspecial();
        
        ClaHyuga claHyuga = new ClaHyuga("Hyuga","Hiashi","Byakugan ");
        claHyuga.exibirDetalhes();
        claHyuga.habilidadeEspecial();
        
        ClaNara claNara = new ClaNara("Nara","Shikamaru","manipulação de sombras");
        claNara.exibirDetalhes();
        claNara.habilidadeEspecial();
        
        ClaAkimichi claAkimichi = new ClaAkimichi("Akimichi", "Choza","ampliação corporal");
        claAkimichi.exibirDetalhes();
        claAkimichi.habilidadeEspecial();
    }
}
