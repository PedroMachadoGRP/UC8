/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meuSegundoProjetoJava;

/**
 *
 * @author PEDROMACHADODASILVA
 */
public class Carro extends Veiculo {
    
    int qtdPortas;
    
    public Carro(String marcaCarro, double pesoCarro,int portasCarro){
        super(4,marcaCarro,pesoCarro);
        qtdPortas = portasCarro; 
    }
    
    public void  cavalinhoDePau(){
        System.out.println("IIIIIIIIIIIRRRRRRRRRRRRRRRR");
    }
    
    @Override
     public void andar(){
        System.out.println("O Carro de marca " + this.getMarca() + " está andando.");
    }
     
}
