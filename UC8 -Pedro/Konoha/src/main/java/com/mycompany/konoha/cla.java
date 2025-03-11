/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konoha;

/**
 *
 * @author PEDROMACHADODASILVA
 */
 abstract class Cla {
    
    
    protected  String nomeDoCla ;
    protected  String lider;
    protected String habilidade;
    
    public Cla(String nomeDoCla, String lider,String habilidade){
        this.nomeDoCla = nomeDoCla;
        this.lider = lider;
        this.habilidade = habilidade;
    }
    
    public abstract void habilidadeEspecial();
    
    
    public void exibirDetalhes(){
        
    }
}




