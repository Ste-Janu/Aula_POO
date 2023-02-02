/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancocominterface;

/**
 *
 * @author stefani.januario
 */
public class ContaEspecial extends Conta implements ControlaCredito, Movimentacao {

    private double limite;

    @Override
    public boolean verificaCredito(double valorRequirido) {
        return (this.getSaldo() + this.getLimite() >= valorRequirido);
    }

    @Override
    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    @Override
    public void sacar(double valor) {
        if (verificaCredito(valor)) {
            this.setSaldo(this.getSaldo() - valor);
        } else {
            System.out.println("Você não tem credito");
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}
