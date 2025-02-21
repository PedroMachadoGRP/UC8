/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meuProjetoJava;

/**
 *
 * @author PEDROMACHADODASILVA
 */
public class Produto {
    private String nome;
    private double preco;
    
    
    public Produto(String nomeProduto, double precoProduto){
        nome = nomeProduto;
        preco = precoProduto;
    }
    public String getNome(){
        return nome;
   }
    
    public double getPreco(){
        return preco;
   }
    
}
