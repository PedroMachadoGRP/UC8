/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodospagamentos;

/**
 *
 * @author PEDROMACHADODASILVA
 */
public class PayPal implements Pagamento {
    String email = "JorgedoCapa2050@hotmail.com";

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processo completo, pagamento de R$ "+ valor +" processado via PayPal");
    }

    @Override
    public String obterDetalhes() {
        return email;
    }
}
