/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meuProjetoJava;

/**
 *
 * @author PEDROMACHADODASILVA
 */
public class Pessoa {
    String nome;
    int idade;
    
    //O construtor, em Java, � um METODO que N�o tem retorno e tem o mesmo nome da class
    public Pessoa(String meuNome, int minhaIdade){
        nome = meuNome;
        idade = minhaIdade;
        
    }
    public void caminhar(){
        System.out.println(nome + " est� caminhando");
    }
}
