/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancocominterface;

/**
 *
 * @author stefani.januario
 */
public class ContaPoupanca extends Conta implements Movimentacao{

    @Override
    public void depositar(double valor) {
        this.setSaldo(this.getSaldo()+valor);
    }

    @Override
    public void sacar(double valor) {
        if (this.getSaldo()>=valor);
        this.setSaldo(this.getSaldo()-valor);
    }
    
}
