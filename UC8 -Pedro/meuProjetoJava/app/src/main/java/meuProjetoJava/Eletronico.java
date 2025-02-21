/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meuProjetoJava;

/**
 *
 * @author PEDROMACHADODASILVA
 */
public class Eletronico  extends Produto{
    
    int tensao;
    public Eletronico(String meuNome,double meuPreco,int voltagem){
        super(meuNome,meuPreco);
        tensao = voltagem;
    }
    
    public int getTensao(){
        return tensao;
    }
}
