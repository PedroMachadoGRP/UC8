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
        System.out.println("Digite o primeiro n�mero para a soma");
        num1 = sc.nextDouble();
        
        System.out.println("Digite o segundo numero para a soma");
        num2 = sc.nextDouble();
        
        System.out.println("O resultado da soma � de " + (num1 + num2));
        
    }
        public void Subtracao(){
        System.out.println("Digite o primeiro n�mero para a subtracao");
        num1 = sc.nextDouble();
        
        System.out.println("Digite o segundo numero para a subtracao");
        num2 = sc.nextDouble();
        
        System.out.println("O resultado da subtracao � de " + (num1 - num2));
        
    }
        public void Multiplicacao(){
        System.out.println("Digite o primeiro n�mero para a multiplicacao");
        num1 = sc.nextDouble();
        
        System.out.println("Digite o segundo n�mero para a multiplicacao");
        num2 = sc.nextDouble();
        
        System.out.println("O resultado da multiplicacao � de " + (num1 * num2));
        
    }
        public void Divisao(){
        System.out.println("Digite o primeiro n�mero para a divis�o");
        num1 = sc.nextDouble();
        
        System.out.println("Digite o segundo n�mero para a divis�o");
        num2 = sc.nextDouble();
        
        System.out.println("O resultado da divis�o � de " + (num1 / num2));
        
    }
        
}
