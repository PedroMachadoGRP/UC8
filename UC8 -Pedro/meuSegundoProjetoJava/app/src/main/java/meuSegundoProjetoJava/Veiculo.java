/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meuSegundoProjetoJava;

/**
 *
 * @author PEDROMACHADODASILVA
 */
public class Veiculo {
    private int numeroRodas;
    private String marca;
    private double peso;
    
    
    public Veiculo(int numeroRodas, String marca, double peso){
        this.numeroRodas = numeroRodas;
        this.marca = marca;
        this.peso = peso;
    }
    
    public void andar(){
        System.out.println("O veiculo de marca " + marca + " está andando.");
    }
    public String getMarca(){
        return this.marca;
    }

    public void  setMarca(String novaMarca){
        this.marca = novaMarca;
    }
}