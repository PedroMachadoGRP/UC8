/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhandocominterfaces;

/**
 *
 * @author PEDROMACHADODASILVA
 */
public class TrabalhandoComInterfaces {

    public static void main(String[] args) {
        Violao meuviolao = new Violao();
        Bateria minhaBateria = new Bateria();
        Teclado meuTeclado = new Teclado();
        
        
        meuviolao.tocar();
        minhaBateria.tocar();
        meuTeclado.tocar();
    }
    
    
}
