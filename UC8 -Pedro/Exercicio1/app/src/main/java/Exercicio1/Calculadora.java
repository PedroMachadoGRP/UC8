/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;
import java.util.Scanner;
/**
 *
 * @author PEDROMACHADODASILVA
 */
public class Calculadora {
    Scanner sc = new Scanner(System.in);
    double num1;
    double num2;
    
    public void Soma(){
        System.out.println("Digite o primeiro número para a soma");
        num1 = sc.nextDouble();
        
        System.out.println("Digite o segundo numero para a soma");
        num2 = sc.nextDouble();
        
        System.out.println("O resultado da soma é de " + (num1 + num2));
        
    }
        public void Subtracao(){
        System.out.println("Digite o primeiro número para a subtracao");
        num1 = sc.nextDouble();
        
        System.out.println("Digite o segundo numero para a subtracao");
        num2 = sc.nextDouble();
        
        System.out.println("O resultado da subtracao é de " + (num1 - num2));
        
    }
        public void Multiplicacao(){
        System.out.println("Digite o primeiro número para a multiplicacao");
        num1 = sc.nextDouble();
        
        System.out.println("Digite o segundo número para a multiplicacao");
        num2 = sc.nextDouble();
        
        System.out.println("O resultado da multiplicacao é de " + (num1 * num2));
        
    }
        public void Divisao(){
        System.out.println("Digite o primeiro número para a divisão");
        num1 = sc.nextDouble();
        
        System.out.println("Digite o segundo número para a divisão");
        num2 = sc.nextDouble();
        
        System.out.println("O resultado da divisão é de " + (num1 / num2));
        
    }
        
}
