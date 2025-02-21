/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodospagamentos;

/**
 *
 * @author PEDROMACHADODASILVA
 */
public class MetodosPagamentos {

    public static void main(String[] args) {
        CartaoCredito visa = new CartaoCredito();
        PayPal paypal = new PayPal();
        
        visa.processarPagamento(51.49);
        paypal.processarPagamento(45.31);
        
        System.out.println(visa.obterDetalhes());
        System.out.println(paypal.obterDetalhes());
    }
}
