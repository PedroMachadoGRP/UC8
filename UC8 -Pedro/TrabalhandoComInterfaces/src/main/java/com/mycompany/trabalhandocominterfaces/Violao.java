/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhandocominterfaces;

/**
 *
 * @author PEDROMACHADODASILVA
 */
public class Violao implements InstrumentoMusical{

    private String marca = "Violão";
    
    
    
    
    @Override
    public void tocar() {
        System.out.println("O violão de marca " + this.marca + " está fazendo bleimbleinmblein");
    }

    @Override
    public void afinar() {
        System.out.println("O violão de marca " + this.marca + " está sendo afinado");

    }
    
    public void trocarCorda(){
        System.out.println("O violão de marca " + this.marca + "está tendo as cordas trocadas");

    }
}
