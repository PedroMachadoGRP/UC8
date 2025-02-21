/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhandocominterfaces;

/**
 *
 * @author PEDROMACHADODASILVA
 */
public class Teclado implements InstrumentoMusical {

    private String marca = "Yamaha";
    
    @Override
    public void tocar() {
        System.out.println("O teclado de marca " + this.marca + " está fazendo tectectec");
    }

    @Override
    public void afinar() {
        System.out.println("O teclado de marca " + this.marca + "está tendo suas teclas afinadas");
    }
    
}
