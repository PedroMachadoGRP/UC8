/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhandocominterfaces;

/**
 *
 * @author PEDROMACHADODASILVA
 */
public class Bateria  implements InstrumentoMusical{

    private String marca = "Duracell";

    
    @Override
    public void tocar() {
        System.out.println("A bateria de marca " + this.marca + " está fazendo zaaaap");
    }

    @Override
    public void afinar() {
        
    }
    
}
