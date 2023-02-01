/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_gerenciamentocontas;

/**
 *
 * @author stefani.januario
 */
public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void Depositar() {
    }

    @Override
    public void Sacar() {
    }

    @Override
    public void Transferir() {
    }
}
